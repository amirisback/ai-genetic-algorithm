package com.frogobox.algorithm;

import com.frogobox.base.BaseHelper;
import com.frogobox.model.Chromosome;
import com.frogobox.model.Population;
import com.frogobox.view.RegenerationView;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static com.frogobox.base.BaseHelper.*;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * GeneticAlgorithm
 * Copyright (C) 29/09/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.algorithm
 */
public class RegenerationAlgo implements RegenerationView {

    private ArrayList<Population> newPopulationGeneration = new ArrayList<>();
    private PopulationAlgo populationAlgo;
    private ArrayList<Population> mutationPopulation = new ArrayList<>();
    private int urutan = 0;

    public RegenerationAlgo() {
        populationAlgo = new PopulationAlgo(this);
    }

    public void startGeneticAlgorithm() {
        populationAlgo.showPopulationDeclare();
        steadyState();
        generationReplacement();
    }

    private void getChromosomeLine(ArrayList<Chromosome> chromosomes) {
        for (int j = 0; j < chromosomes.size(); j++) {
            String genChromosome = chromosomes.get(j).getElement().toString();
            System.out.println(CHROMOSOME + " ke " + (j + 1) + "\t: " + genChromosome);
        }
    }

    private void getChromosomeLine(ArrayList<Chromosome> chromosomes, BufferedWriter bufferedWriter) {
        for (int j = 0; j < chromosomes.size(); j++) {
            String genChromosome = chromosomes.get(j).getElement().toString();
            try {
                bufferedWriter.write("Result - " + (urutan + 1) + "\t" + randomNumber(2));
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            urutan++;
        }
    }

    private void steadyState() {

        int i = 0;
        int checkerPointChromosome1 = 0;
        int checkerPointChromosome2 = 0;

        // Crossver
        System.out.println("Hasil Steady State");
        System.out.println(LINE_VIEW);
        do {

            int pointChromosome1 = 0;
            int pointChromosome2 = 0;

            for (int j = 0; j < SUM_GEN; j++) {
                Population parent1 = populationAlgo.getPopulations().get(0);
                Population parent2 = populationAlgo.getPopulations().get(1);

                Chromosome chromosomeParent1 = parent1.getElement().get(i);
                Chromosome chromosomeParent2 = parent2.getElement().get(i);

                pointChromosome1 = pointChromosome1 + chromosomeParent1.getElement().get(j);
                pointChromosome2 = pointChromosome2 + chromosomeParent2.getElement().get(j);

                checkerPointChromosome1 = checkerPointChromosome1 + chromosomeParent1.getElement().get(j);
                ;
                checkerPointChromosome2 = checkerPointChromosome2 + +chromosomeParent2.getElement().get(j);

                newPopulationGeneration.add(new ChromosomeAlgo().crossOverChromosome(chromosomeParent1, chromosomeParent2));
            }

            System.out.println("Generasi ke \t: " + (i + 1));
            getChromosomeLine(newPopulationGeneration.get(i).getElement());
            System.out.println("x1 \t\t\t\t: " + pointChromosome1);
            System.out.println("x2 \t\t\t\t: " + pointChromosome2);
            System.out.println("Fitness Point \t: " + newPopulationGeneration.get(i).getFitnessPoint());
            System.out.println(LINE_VIEW);

            pointChromosome1 = 0;
            pointChromosome2 = 0;
            i++;

        } while (checkerPointChromosome1 < X_MAX && checkerPointChromosome2 < X_MAX);

        // Best Result CrossOver
        int pointBestCrossover = 0;
        System.out.println("Generasi ke \t: " + (i + 1) + " (Best Fitness Point) - Crossover");
        getChromosomeLine(newPopulationGeneration.get(i).getElement());
        for (int j = 0; j < SUM_CHROMOSOME; j++) {
            for (int k = 0; k < SUM_GEN; k++) {
                pointBestCrossover = pointBestCrossover + newPopulationGeneration.get(i).getElement().get(j).getElement().get(0);
            }
            System.out.println("x" + (j + 1) + " \t\t\t\t: " + pointBestCrossover);
            pointBestCrossover = 0;
        }
        System.out.println("Fitness Point \t: " + newPopulationGeneration.get(i).getFitnessPoint());
        System.out.println(LINE_VIEW);

    }

    public void createMutation() {
        for (Population population : populationAlgo.getPopulations()) {
            Population populationMutate;
            for (int j = 0; j < population.getElement().size(); j = j + 2) {
                Chromosome chromosome1 = population.getElement().get(j);
                Chromosome chromosome2 = population.getElement().get(j + 1);
                populationMutate = new ChromosomeAlgo().mutationChromosome(chromosome1, chromosome2);
                mutationPopulation.add(populationMutate);
            }
        }
    }

    private void generationReplacement() {

        System.out.println("Hasil Mutasi");
        System.out.println(LINE_VIEW);

        createMutation();

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {

            File file = new File(new BaseHelper().getPathOutputFolder(FILENAME));
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(PATH_ROOT_PROJECT + new BaseHelper().getPathOutputFolder(FILENAME));
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("Result Prediction Decission Tree berurtan dari ");
            bufferedWriter.newLine();
            bufferedWriter.newLine();


            int j = 0;
            for (int i = 0; i < mutationPopulation.size(); i = i + 8) {
                System.out.println("Mutasi ke makhluk ke - " + (j + 1));
                getChromosomeLine(mutationPopulation.get(j + 1).getElement());
                getChromosomeLine(mutationPopulation.get(j + 1).getElement(), bufferedWriter);
                System.out.println("Fitness Point \t: " + mutationPopulation.get(j + 1).getFitnessPoint());
                System.out.println(LINE_VIEW);
                j++;
            }


            bufferedWriter.newLine();

        } catch (IOException e) {
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
                Desktop.getDesktop().open(new File(new BaseHelper().getPathOutputFolder(FILENAME)));
            } catch (IOException ex) {
            }
        }


    }


    public ArrayList<Population> getMutationPopulation() {
        return mutationPopulation;
    }

    @Override
    public void selectionParent(Population parent1, Population parent2) {
        System.out.println();
        System.out.println("Hasil Seleksi Orang Tua");
        System.out.println(LINE_VIEW);
        System.out.println("Parent 1 : ");
        getChromosomeLine(parent1.getElement());
        System.out.println("Fitness Point \t: " + parent1.getFitnessPoint());
        System.out.println(LINE_VIEW);
        System.out.println("Parent 2 : ");
        getChromosomeLine(parent2.getElement());
        System.out.println("Fitness Point \t: " + parent2.getFitnessPoint());
        System.out.println(LINE_VIEW);
        System.out.println();
    }


}
