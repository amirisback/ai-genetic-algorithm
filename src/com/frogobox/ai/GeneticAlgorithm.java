package com.frogobox.ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneticAlgorithm {

    private final int populationSize;
    private final int chromosomeLength; // Total length. Assumption 16 bits per variable. Length = 32
    private final double pc;
    private final double pm;
    private final int tournamentSize;
    private final Random random;

    // Bounds for x1 and x2
    private final double minX1 = -3.0;
    private final double maxX1 = 3.0;
    private final double minX2 = -2.0;
    private final double maxX2 = 2.0;

    public GeneticAlgorithm(int populationSize, int chromosomeLength, double pc, double pm, int tournamentSize) {
        this.populationSize = populationSize;
        this.chromosomeLength = chromosomeLength;
        this.pc = pc;
        this.pm = pm;
        this.tournamentSize = tournamentSize;
        this.random = new Random();
    }

    public List<Chromosome> initializePopulation() {
        List<Chromosome> population = new ArrayList<>();
        for (int i = 0; i < populationSize; i++) {
            Chromosome c = new Chromosome(chromosomeLength);
            int[] genes = new int[chromosomeLength];
            for (int j = 0; j < chromosomeLength; j++) {
                genes[j] = random.nextInt(2); // 0 or 1
            }
            c.setGenes(genes);
            evaluateChromosome(c);
            population.add(c);
        }
        return population;
    }

    private void evaluateChromosome(Chromosome c) {
        int halfLength = chromosomeLength / 2;
        int[] part1 = new int[halfLength];
        int[] part2 = new int[halfLength];
        
        System.arraycopy(c.getGenes(), 0, part1, 0, halfLength);
        System.arraycopy(c.getGenes(), halfLength, part2, 0, halfLength);
        
        double x1 = decodeChromosome(minX1, maxX1, part1);
        double x2 = decodeChromosome(minX2, maxX2, part2);
        
        c.setX1(x1);
        c.setX2(x2);
        c.setFunctionValue(f(x1, x2));
        
        // We want to minimize the function, so fitness can be the inverse or negative of function value.
        // Using -f makes it a maximization problem for the GA.
        c.setFitness(-f(x1, x2));
    }

    private double decodeChromosome(double min, double max, int[] binaryArr) {
        int decimalValue = 0;
        int length = binaryArr.length;
        for (int i = 0; i < length; i++) {
            decimalValue += binaryArr[i] * Math.pow(2, length - 1 - i);
        }
        return min + ((max - min) / (Math.pow(2, length) - 1)) * decimalValue;
    }

    private double f(double x1, double x2) {
        double term1 = (4 - 2.1 * Math.pow(x1, 2) + Math.pow(x1, 4) / 3.0) * Math.pow(x1, 2);
        double term2 = x1 * x2;
        double term3 = (-4 + 4 * Math.pow(x2, 2)) * Math.pow(x2, 2);
        return term1 + term2 + term3;
    }

    private Chromosome selectParentTournament(List<Chromosome> population) {
        Chromosome best = null;
        for (int i = 0; i < tournamentSize; i++) {
            Chromosome randomIndividual = population.get(random.nextInt(populationSize));
            if (best == null || randomIndividual.getFitness() > best.getFitness()) {
                best = randomIndividual;
            }
        }
        return best;
    }

    private Chromosome[] crossover(Chromosome parent1, Chromosome parent2) {
        Chromosome child1 = new Chromosome(chromosomeLength);
        Chromosome child2 = new Chromosome(chromosomeLength);

        if (random.nextDouble() < pc) {
            int crossoverPoint = random.nextInt(chromosomeLength - 1) + 1; // 1 to length-1
            int[] genes1 = new int[chromosomeLength];
            int[] genes2 = new int[chromosomeLength];

            for (int i = 0; i < chromosomeLength; i++) {
                if (i < crossoverPoint) {
                    genes1[i] = parent1.getGenes()[i];
                    genes2[i] = parent2.getGenes()[i];
                } else {
                    genes1[i] = parent2.getGenes()[i];
                    genes2[i] = parent1.getGenes()[i];
                }
            }
            child1.setGenes(genes1);
            child2.setGenes(genes2);
        } else {
            // No crossover, clone parents
            child1.setGenes(parent1.getGenes().clone());
            child2.setGenes(parent2.getGenes().clone());
        }

        return new Chromosome[]{child1, child2};
    }

    private void mutate(Chromosome c) {
        int[] genes = c.getGenes();
        for (int i = 0; i < chromosomeLength; i++) {
            if (random.nextDouble() < pm) {
                genes[i] = genes[i] == 0 ? 1 : 0; // Flip bit
            }
        }
    }

    public List<Chromosome> createNextGeneration(List<Chromosome> currentPopulation) {
        List<Chromosome> nextGeneration = new ArrayList<>();

        // Elitism: Keep the best individual
        Chromosome bestIndividual = currentPopulation.get(0);
        for (Chromosome c : currentPopulation) {
            if (c.getFitness() > bestIndividual.getFitness()) {
                bestIndividual = c;
            }
        }
        nextGeneration.add(new Chromosome(bestIndividual.getGenes()));
        evaluateChromosome(nextGeneration.get(0));


        while (nextGeneration.size() < populationSize) {
            Chromosome parent1 = selectParentTournament(currentPopulation);
            Chromosome parent2 = selectParentTournament(currentPopulation);

            Chromosome[] children = crossover(parent1, parent2);

            mutate(children[0]);
            evaluateChromosome(children[0]);
            nextGeneration.add(children[0]);

            if (nextGeneration.size() < populationSize) {
                mutate(children[1]);
                evaluateChromosome(children[1]);
                nextGeneration.add(children[1]);
            }
        }

        return nextGeneration;
    }

    public Chromosome getBestChromosome(List<Chromosome> population) {
        Chromosome best = population.get(0);
        for (Chromosome c : population) {
            if (c.getFitness() > best.getFitness()) {
                best = c;
            }
        }
        return best;
    }
}
