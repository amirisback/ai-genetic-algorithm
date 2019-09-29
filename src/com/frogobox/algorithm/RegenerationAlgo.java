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

    private PopulationAlgo populationAlgo;

    public RegenerationAlgo() {
        populationAlgo = new PopulationAlgo(this);
        populationAlgo.showPopulationDeclare();
    }

    public void getChromosomeSelectionParent(ArrayList<Chromosome> chromosomes){
        for (int j = 0; j < chromosomes.size(); j++) {
            String genChromosome = chromosomes.get(j).getElement().toString();
            System.out.println(CHROMOSOME + " ke " + (j+1) + "\t: " + genChromosome);
        }
    }

    public void steadyState(){

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
