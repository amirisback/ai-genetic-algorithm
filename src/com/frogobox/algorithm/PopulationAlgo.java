package com.frogobox.algorithm;

import com.frogobox.base.BaseModel;
import com.frogobox.model.Chromosome;
import com.frogobox.model.Population;

import java.util.ArrayList;
import com.frogobox.view.PopulationView;

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
public class PopulationAlgo extends BaseModel implements PopulationView {

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
        System.out.println(LINE_VIEW);

        for (int i = 0; i < populations.size(); i++) {
            System.out.println(POPULATION + " - " + (i + 1));
            System.out.println(LINE_VIEW);
            new ChromosomeAlgo(this).getChromosome(populations.get(i), populations.get(i).getElement());
            System.out.println(LINE_VIEW);
        }

    }



    public void selectionParent(){

    }

    public void generationReplacement() {


    }

    @Override
    public void chromosomeArrangement(int order, String genChromosome, double chromosomePoint) {
        System.out.println(CHROMOSOME + " ke " + order + "\t: " + genChromosome);
        System.out.println("> Point  ke " + order + "\t: " + chromosomePoint);
    }

    @Override
    public void fitnessPointViewResult(double x1, double x2, double countFitnessPoint) {
        System.out.println(LINE_VIEW);
        System.out.println(">> x1 = " + x1 + ", x2 = " + x2);
        System.out.println(">> Fitness Point Individu = " + countFitnessPoint);

    }

}
