package com.frogobox;

import com.frogobox.algorithm.PopulationAlgo;

import static com.frogobox.base.BaseHelper.*;

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

    public static void main (String[] args) {
        new Main().programName();

        PopulationAlgo populationAlgo = new PopulationAlgo();
        populationAlgo.declarePopulation();
        populationAlgo.getPopulation();
    }

    private void programName() {
        System.out.println("..:: Algortima Genetik ::..");
        System.out.println(LINE_VIEW);
        System.out.println("Muhammad Faisal Amir");
        System.out.println("1301198497");
        System.out.println("IFX-43-02");
        System.out.println(LINE_VIEW);
        System.out.println("Jumlah Populasi \t\t: " + SUM_POPULATION + " " + POPULATION);
        System.out.println("1 Makhluk Memiliki \t\t: " + SUM_GEN + " " + CHROMOSOME);
        System.out.println("1 Kromosom Memiliki \t: " + SUM_CHROMOSOME + " " + GEN);
        System.out.println(LINE_VIEW);
        System.out.println();
    }
}