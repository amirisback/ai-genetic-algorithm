package com.frogobox.algorithm;

import com.frogobox.model.Chromosome;
import com.frogobox.model.Population;
import com.frogobox.view.PopulationView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * GeneticAlgorithm
 * Copyright (C) 28/09/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox
 */
public class ChromosomeAlgo {

    private PopulationView populationView;

    public ChromosomeAlgo(PopulationView populationView) {
        this.populationView = populationView;
    }

    public double getChromosomePoint(Chromosome chromosome){
        int value = 0;
        for (int i = 0; i<chromosome.getElement().size(); i++) {
            value = value + chromosome.getElement().get(i);
        }
        return (double) value;
    }

    public void getChromosome(Population population, ArrayList<Chromosome> chromosomes){
        ArrayList<Double> fitness = new ArrayList<>();
        for (int j = 0; j < chromosomes.size(); j++) {
            String genChromosome = chromosomes.get(j).getElement().toString();
            double chromosomePoint = getChromosomePoint(chromosomes.get(j));
            fitness.add(chromosomePoint);
            // ---------------------------------------------------------------------------------------------------------
            populationView.chromosomeArrangement((j+1), genChromosome, chromosomePoint);
            // ---------------------------------------------------------------------------------------------------------
        }
        // -------------------------------------------------------------------------------------------------------------
        getFitnessPopulation(population, fitness);
        // -------------------------------------------------------------------------------------------------------------
    }

    public void getFitnessPopulation(Population population, ArrayList<Double> chromosomePoint){
        double x1 = 0;
        double x2 = 0;
        for (int i = 0; i<chromosomePoint.size(); i++) {
            if (i < (chromosomePoint.size()/2)) {
                x1 = x1 + chromosomePoint.get(i);
            } else {
                x2 = x2 + chromosomePoint.get(i);
            }
        }
        population.setFitnessPoint(countFitnessPoint(x1,x2));
        populationView.fitnessPointViewResult(x1, x2, countFitnessPoint(x1,x2));
    }

    public double countFitnessPoint(double x1, double x2){
        final double POW_2 = 2.0;
        final double POW_4 = 4.0;

        double x1Pow2 = Math.pow(x1, POW_2);
        double x1Pow4 = Math.pow(x1, POW_4);
        double x2Pow2 = Math.pow(x2, POW_4);

        return (4-2*1*x1Pow2+x1Pow4/3)*x1Pow2 + x1*x2 + (-4+4*x2Pow2)*x2Pow2;
    }

    public Chromosome mutationChromosome(Chromosome chromosome){
        int randomRow = new Random().nextInt(chromosome.getElement().size());
        int randomRowValue = chromosome.getElement().get(randomRow);
        int randomRowChromosome = new Random().nextInt(chromosome.getElement().size());
        chromosome.getElement().set(randomRowChromosome, randomRowValue);
        return chromosome;
    }


    public void crossOverChromosome(Chromosome chromosome1, Chromosome chromosome2){

        int randomRow1 = new Random().nextInt(chromosome1.getElement().size());
        int randomRowChromosome1 = new Random().nextInt(chromosome1.getElement().size());
        int randomRowValueChromosome1 = chromosome1.getElement().get(randomRow1);

        int randomRow2 = new Random().nextInt(chromosome2.getElement().size());
        int randomRowChromosome2 = new Random().nextInt(chromosome2.getElement().size());
        int randomRowValueChromosome2 = chromosome2.getElement().get(randomRow2);

        chromosome1.getElement().set(randomRowChromosome2, randomRowValueChromosome2);
        chromosome2.getElement().set(randomRowChromosome1, randomRowValueChromosome1);
    }

}
