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
public class Chromosome extends BaseModel {

    private ArrayList<Integer> element;

    public Chromosome() {
        this.element = new ArrayList<>();
    }

    public ArrayList<Integer> getElement() {
        return element;
    }

    // Decode Kromosom
    // Dengan cara mengisi Kromosom dengam bilangan bulat
    // Setiap bilangan real yang di hasilkan secara random dari 0-9
    // Setiap kromomosom dibatasi panjangnya
    public void initElement(int value){
        for (int i = 0; i<value; i++){
            element.add(randomNumber());
        }
    }
}
