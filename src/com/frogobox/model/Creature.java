package com.frogobox.model;

import com.frogobox.base.BaseModel;

import java.util.ArrayList;

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
public class Creature extends BaseModel {

    private ArrayList<Chromosome> element;

    public Creature() {
        this.element = new ArrayList<>();
    }

    public ArrayList<Chromosome> getElement() {
        return element;
    }

}
