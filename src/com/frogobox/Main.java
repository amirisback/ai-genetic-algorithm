package com.frogobox;

import java.util.ArrayList;
import java.util.Random;

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
        Algorithm algorithm = new Algorithm();
        programName(algorithm.SUM_POPULATION, algorithm.SUM_CHROMOSOME);
        algorithm.declarePopulation();
        algorithm.showElementPopulation();
    }

}