package com.frogobox.algorithm;

import com.frogobox.base.BaseModel;
import com.frogobox.model.Chromosome;
import com.frogobox.model.Population;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.frogobox.view.PopulationView;
import com.frogobox.view.RegenerationView;

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
    private ChromosomeAlgo chromosomeAlgo;
    private RegenerationView regenerationView;

    public PopulationAlgo(RegenerationView regenerationView) {
        this.chromosomeAlgo = new ChromosomeAlgo();
        this.regenerationView = regenerationView;
        chromosomeAlgo.setPopulationView(this);
    }

    public ArrayList<Population> getPopulations() {
        return populations;
    }

    public void showPopulationDeclare(){
        viewTitlePopulation();
        declarePopulation();
        getPopulation();
        sortFitnessPopulation(populations);
        selectParent();
    }

    // Deklarasi bahwa setiap makhluk mempunyai kromosom
    private Population initPopulation(){
        Population population = new Population();
        for (int i = 0; i<SUM_CHROMOSOME; i++) {
            Chromosome chromosome = new Chromosome();
            chromosome.initElement(SUM_GEN);
            population.getElement().add(chromosome);
        }
        return population;
    }

    private void declarePopulation() {
        for (int i = 0; i < SUM_POPULATION; i++) {
            populations.add(initPopulation());
        }
    }

    private void getPopulation() {

        for (int i = 0; i < populations.size(); i++) {
            System.out.println(POPULATION + " - " + (i + 1));
            chromosomeAlgo.getChromosome(populations.get(i), populations.get(i).getElement());
            System.out.println(LINE_VIEW);
        }

    }

    private void sortFitnessPopulation(ArrayList<Population> populations){
        Collections.sort(populations, new Comparator<Population>() {
            @Override
            public int compare(Population lhs, Population rhs) {
                // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                return Double.compare(rhs.getFitnessPoint(), lhs.getFitnessPoint());
            }
        });
    }

    private void selectParent(){
        Population parent1 = populations.get(0);
        Population parent2 = populations.get(1);
        regenerationView.selectionParent(parent1, parent2);
    }

    private void viewTitlePopulation(){
        System.out.println("Detail Populasi");
        System.out.println(LINE_VIEW);
        System.out.println("Formula Fitness Point : ");
        System.out.println("(4-2*1*x1^2+x1^4/3)*x1^2 + x1*x2 + (-4+4*x2^2)*x2^2");
        System.out.println(LINE_VIEW);
    }

    @Override
    public void chromosomeArrangement(int order, String genChromosome) {
        System.out.println(CHROMOSOME + " ke " + order + "\t: " + genChromosome);
    }

    @Override
    public void fitnessPointViewResult(double x1, double x2, double countFitnessPoint) {
        System.out.println("Nilai x1 \t\t: " + x1);
        System.out.println("Nilai x2 \t\t: " + x2);
        System.out.println("Fitness Point \t: " + countFitnessPoint);

    }

}
