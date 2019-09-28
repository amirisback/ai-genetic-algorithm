package com.frogobox.algorithm;

import com.frogobox.base.BaseModel;
import com.frogobox.model.Chromosome;
import com.frogobox.model.Population;

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

    // -----------------------------------------------------------------------------------------------------------------
    public final int SUM_POPULATION = 6;
    public final int SUM_GEN = 8;
    public final int SUM_CHROMOSOME = 2;
    // -----------------------------------------------------------------------------------------------------------------

    private ArrayList<Population> populations = new ArrayList<>();

    // Deklarasi bahwa setiap makhluk mempunyai kromosom
    public Population initPopulation(int valueGen, int valueChromosome){
        Population population = new Population();
        for (int i = 0; i<valueChromosome; i++) {
            Chromosome chromosome = new Chromosome();
            chromosome.initElement(valueGen);
            population.getElement().add(chromosome);
        }
        return population;
    }

    public void declarePopulation() {
        for (int i = 0; i < SUM_POPULATION; i++) {
            populations.add(initPopulation(SUM_GEN, SUM_CHROMOSOME));
        }
    }

    public void getPopulation() {
        System.out.println("Susunan Kromosom");
        for (int i = 0; i < populations.size(); i++) {
            System.out.println("Makhluk - " + (i + 1));
            new ChromosomeAlgo().getChromosome(populations.get(i).getElement());
            System.out.println(BaseHelper.LINE_VIEW);
        }
    }

    public void generationReplacement() {

    }


}
