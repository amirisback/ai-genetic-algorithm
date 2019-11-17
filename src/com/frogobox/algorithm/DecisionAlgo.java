package com.frogobox.algorithm;

import com.frogobox.model.Population;

import java.util.ArrayList;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Artificial-intelligence-genetic-algorithm
 * Copyright (C) 17/11/2019.
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
public class DecisionAlgo {

    private RegenerationAlgo regenerationAlgo;
    private ArrayList<Population> decissionPopulation;

    public DecisionAlgo() {
        decissionPopulation = new ArrayList<>();
        regenerationAlgo = new RegenerationAlgo();
        regenerationAlgo.createMutation();
        getBestDecission();
    }

    public void getBestDecission() {
        int j = 0;
        for (int i = 0; i < regenerationAlgo.getMutationPopulation().size(); i = i + 8) {
            decissionPopulation.add(regenerationAlgo.getMutationPopulation().get(j));
            j++;
        }
    }

    public void showDecision() {
        for (Population population : decissionPopulation) {
            for (int j = 0; j < population.getElement().size(); j++) {
                System.out.println(population.getElement().get(j).getElement().toString());
            }
        }
    }


}
