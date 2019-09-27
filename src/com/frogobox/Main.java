package com.frogobox;

import com.frogobox.algorithm.PopulationAlgo;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * GeneticAlgorithm
 * Copyright (C) 27/09/2019.
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
public class Main {

    private static void programName(int population, int chromosome){
        System.out.println("..:: Algortima Genetik ::..");
        System.out.println("---------------------------");
        System.out.println("Muhammad Faisal Amir");
        System.out.println("1301198497");
        System.out.println("IFX-43-02");
        System.out.println("---------------------------");
        System.out.println("Jumlah Populasi \t: " + population );
        System.out.println("1 Makhluk Memiliki \t: " + chromosome + " Kromosom");
        System.out.println("---------------------------");
    }

    public static void main (String[] args) {
        PopulationAlgo populationAlgo = new PopulationAlgo();
        programName(populationAlgo.SUM_POPULATION, populationAlgo.SUM_CHROMOSOME);
        populationAlgo.declarePopulation();
        populationAlgo.getPopulation();
    }

}