package com.frogobox.algorithm;

import com.frogobox.base.BaseModel;
import com.frogobox.model.Creature;

import java.util.ArrayList;
import com.frogobox.base.BaseHelper;

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
public class PopulationAlgo extends BaseModel {

    public final int SUM_POPULATION = 6;
    public final int SUM_GEN = 8;
    public final int SUM_CHROMOSOME = 5;

    private ArrayList<Creature> population = new ArrayList<>();

    public void declarePopulation() {
        for (int i = 0; i < SUM_POPULATION; i++) {
            population.add(new CreatureAlgo().creature(SUM_GEN, SUM_CHROMOSOME));
        }
    }

    public void getPopulation() {
        System.out.println("Susunan Kromosom");
        for (int i = 0; i < population.size(); i++) {
            System.out.println("Makhluk - " + (i + 1));
            for (int j = 0; j < population.get(i).getElement().size(); j++) {
                String lineChromosome = population.get(i).getElement().get(j).getElement().toString();
                System.out.println("Kromosom ke " + (j + 1) + " : " + lineChromosome);
            }
        }
        System.out.println(BaseHelper.LINE_VIEW);
    }

    public void generationReplacement() {

    }


}
