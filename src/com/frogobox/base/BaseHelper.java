package com.frogobox.base;

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
 * com.frogobox.base
 */
public class BaseHelper {

    // -----------------------------------------------------------------------------------------------------------------
    public static final String LINE_VIEW  = "--------------------------------------------";
    public static final String POPULATION = "Makhluk";
    public static final String CHROMOSOME = "Kromosom";
    public static final String GEN = "Gen";
    // -----------------------------------------------------------------------------------------------------------------
    // Setting
    public static final int SUM_POPULATION = 6;
    public static final int SUM_GEN = 8;
    public static final int SUM_CHROMOSOME = 2;
    // -----------------------------------------------------------------------------------------------------------------
    public static final int RANDOM_RANGE = 2;
    public static final int RANDOM_RANGE_MIN = -2;
    public static final int RANDOM_RANGE_MAX = 2;
    // -----------------------------------------------------------------------------------------------------------------
    public static final double X_MAX = SUM_GEN * (RANDOM_RANGE_MAX-1);
    public static final double X_MIN = SUM_GEN * (RANDOM_RANGE_MIN+1);
    // -----------------------------------------------------------------------------------------------------------------
    public static int randomNumber(int range){
        return new Random().nextInt(range);
    }
    public static int randomNumber(int min, int max){ return min + (max - min) * new Random().nextInt(); }
    public static double randomNumber(double min, double max){
        return min + (max - min) * new Random().nextDouble();
    }

}
