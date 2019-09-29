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

    private static void programName(int population, int chromosome, int gen){
        System.out.println("..:: Algortima Genetik ::..");
        System.out.println(LINE_VIEW);
        System.out.println("Muhammad Faisal Amir");
        System.out.println("1301198497");
        System.out.println("IFX-43-02");
        System.out.println(LINE_VIEW);
        System.out.println("Jumlah Populasi \t\t: " + population + " " + POPULATION);
        System.out.println("1 Makhluk Memiliki \t\t: " + chromosome + " " + CHROMOSOME);
        System.out.println("1 Kromosom Memiliki \t: " + gen + " " + GEN);
        System.out.println(LINE_VIEW);
        System.out.println();
    }

    public static void main (String[] args) {
        PopulationAlgo populationAlgo = new PopulationAlgo();
        programName(SUM_POPULATION, SUM_CHROMOSOME, SUM_GEN);
        populationAlgo.declarePopulation();
        populationAlgo.getPopulation();

    }

}