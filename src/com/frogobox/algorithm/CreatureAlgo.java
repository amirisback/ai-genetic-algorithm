package com.frogobox.algorithm;

import com.frogobox.model.Chromosome;
import com.frogobox.model.Creature;

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
 * com.frogobox.algorithm
 */
public class CreatureAlgo {

    // Deklarasi bahwa setiap makhluk mempunyai kromosom
    public Creature creature(int valueGen, int valueChromosome){
        Creature creature = new Creature();
        for (int i = 0; i<valueChromosome; i++) {
            Chromosome chromosome = new Chromosome();
            chromosome.initElement(valueGen);
            creature.getElement().add(chromosome);
        }
        return creature;
    }

}
