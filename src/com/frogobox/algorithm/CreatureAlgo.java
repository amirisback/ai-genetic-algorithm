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

    // Deklarasi bahwa setiap makhluk mempunyai 2 Kromosom
    public Creature creature(int value){
        Chromosome chromosome1 = new Chromosome();
        Chromosome chromosome2 = new Chromosome();

        chromosome1.initElement(value);
        chromosome2.initElement(value);

        Creature creature = new Creature();
        creature.getElement().add(chromosome1);
        creature.getElement().add(chromosome2);

        return creature;
    }

}
