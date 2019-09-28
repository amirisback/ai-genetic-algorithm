package com.frogobox.base;

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
public class BaseModel {

    protected int randomNumber(int range){
        return new Random().nextInt(range);
    }

    protected double randomNumber(double min, double max){
        return min + (max - min) * new Random().nextDouble();
    }

}
