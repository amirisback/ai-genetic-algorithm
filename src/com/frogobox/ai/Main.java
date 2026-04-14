package com.frogobox.ai;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Genetic Algorithm specifically for minimizing the provided function.");
        System.out.println("Function: f(x1, x2) = (4 - 2.1*x1^2 + x1^4/3)*x1^2 + x1*x2 + (-4 + 4*x2^2)*x2^2");
        System.out.println("Constraints: -3 <= x1 <= 3 and -2 <= x2 <= 2\n");

        // Parameters
        int populationSize = 50;
        int chromosomeLength = 32; // 16 bits for x1, 16 bits for x2
        double crossoverProbability = 0.8;
        double mutationProbability = 0.05;
        int tournamentSize = 5;
        int maxGenerations = 100;

        System.out.println("Parameters:");
        System.out.println("Population Size: " + populationSize);
        System.out.println("Chromosome Length: " + chromosomeLength + " (" + chromosomeLength / 2 + " bits per variable)");
        System.out.println("Crossover Probability (Pc): " + crossoverProbability);
        System.out.println("Mutation Probability (Pm): " + mutationProbability);
        System.out.println("Tournament Size: " + tournamentSize);
        System.out.println("Max Generations: " + maxGenerations + "\n");

        GeneticAlgorithm ga = new GeneticAlgorithm(
                populationSize,
                chromosomeLength,
                crossoverProbability,
                mutationProbability,
                tournamentSize
        );

        // Process: Dekode kromosom, Perhitungan fitness, DLL (inside ga)
        List<Chromosome> population = ga.initializePopulation();

        Chromosome bestOverall = ga.getBestChromosome(population);

        for (int i = 1; i <= maxGenerations; i++) {
            population = ga.createNextGeneration(population);
            Chromosome bestGeneration = ga.getBestChromosome(population);

            if (bestGeneration.getFitness() > bestOverall.getFitness()) {
                bestOverall = bestGeneration;
            }

            if (i % 10 == 0 || i == 1) {
                System.out.printf("Generation %3d | Best f(x1,x2): %.6f | x1: % .6f | x2: % .6f\n",
                        i, bestGeneration.getFunctionValue(), bestGeneration.getX1(), bestGeneration.getX2());
            }
        }

        System.out.println("\n=======================================================");
        System.out.println("Optimization Finished!");
        System.out.println("Best Chromosome Detail:");
        System.out.println("Genes (32-bit):");
        for (int b : bestOverall.getGenes()) System.out.print(b);
        System.out.println();
        System.out.printf("Decoded x1 Value: %.6f\n", bestOverall.getX1());
        System.out.printf("Decoded x2 Value: %.6f\n", bestOverall.getX2());
        System.out.printf("Fitness Score:    %.6f\n", bestOverall.getFitness());
        System.out.printf("Minimum f(x1,x2): %.6f\n", bestOverall.getFunctionValue());
        System.out.println("=======================================================");
    }
}