package com.frogobox.algorithm;

import com.frogobox.model.Chromosome;
import com.frogobox.model.Population;
import com.frogobox.view.RegenerationView;

import java.util.ArrayList;

import static com.frogobox.base.BaseHelper.*;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * GeneticAlgorithm
 * Copyright (C) 29/09/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.algorithm
 */
public class RegenerationAlgo implements RegenerationView {

    private ArrayList<Population> newPopulation = new ArrayList<>();
    private PopulationAlgo populationAlgo;

    public RegenerationAlgo() {
        populationAlgo = new PopulationAlgo(this);
        populationAlgo.showPopulationDeclare();
    }

    private void getChromosomeSelectionParent(ArrayList<Chromosome> chromosomes){
        for (int j = 0; j < chromosomes.size(); j++) {
            String genChromosome = chromosomes.get(j).getElement().toString();
            System.out.println(CHROMOSOME + " ke " + (j+1) + "\t: " + genChromosome);
        }
    }

    public void steadyState(){
        int pointChromosome1 = 0;
        int pointChromosome2 = 0;

        Population parent1 = populationAlgo.getPopulations().get(randomNumber(SUM_POPULATION));
        Population parent2 = populationAlgo.getPopulations().get(randomNumber(SUM_POPULATION));

        Chromosome chromosomeParent1 = parent2.getElement().get(randomNumber(SUM_CHROMOSOME));
        Chromosome chromosomeParent2 = parent1.getElement().get(randomNumber(SUM_CHROMOSOME));

        for (int i = 0; i<SUM_GEN; i++){
            pointChromosome1 = pointChromosome1 + chromosomeParent1.getElement().get(i);
            pointChromosome2 = pointChromosome2 + chromosomeParent2.getElement().get(i);
        }

        while (pointChromosome1 == X_MAX) {
            new ChromosomeAlgo().crossOverChromosome(chromosomeParent1, chromosomeParent2);

        }


    }

    public void generationReplacement() {

    }


    @Override
    public void selectionParent(Population parent1, Population parent2) {
        System.out.println();
        System.out.println("Hasil Seleksi Orang Tua");
        System.out.println(LINE_VIEW);
        System.out.println("Parent 1 : ");
        getChromosomeSelectionParent(parent1.getElement());
        System.out.println("Fitness Point \t: " + parent1.getFitnessPoint());
        System.out.println(LINE_VIEW);
        System.out.println("Parent 2 : ");
        getChromosomeSelectionParent(parent2.getElement());
        System.out.println("Fitness Point \t: " + parent2.getFitnessPoint());
        System.out.println(LINE_VIEW);
        System.out.println();
    }
}
