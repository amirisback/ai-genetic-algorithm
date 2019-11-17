package com.frogobox;

import com.frogobox.algorithm.RegenerationAlgo;

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
public class Main {

    public static void main(String[] args) {
        new Main().programCreator();
//        new Main().programGeneticAlgorithm();
        new Main().programDecissionTree();

    }

    private void programCreator(){
        System.out.println(LINE_VIEW);
        System.out.println("Muhammad Faisal Amir");
        System.out.println("1301198497");
        System.out.println("IFX-43-02");
        System.out.println(LINE_VIEW);
        System.out.println();
    }

    private void programDecissionTree(){
        System.out.println(LINE_VIEW);
        System.out.println("..:: Decission Tree ::..");
        System.out.println(LINE_VIEW);
        System.out.println("Ditanya : ");
        System.out.println("1. Kromosom Terbaik");
        System.out.println("2. Hasil Rule Decission Tree");
        System.out.println(LINE_VIEW);
        System.out.println("Solusi : ");
        System.out.println();
        // -------------------------------------------------------------------------------------------------------------
        // Logic Here
    }

    private void programGeneticAlgorithm() {
        System.out.println(LINE_VIEW);
        System.out.println("..:: Algortima Genetik ::..");
        System.out.println(LINE_VIEW);
        System.out.println("Diketahui : ");
        System.out.println("Jumlah Populasi \t\t: " + SUM_POPULATION + " " + POPULATION);
        System.out.println("1 Makhluk Memiliki \t\t: " + SUM_CHROMOSOME + " " + CHROMOSOME);
        System.out.println("1 Kromosom Memiliki \t: " + SUM_GEN + " " + GEN);
        System.out.println(LINE_VIEW);
        System.out.println("Ditanya : ");
        System.out.println("1. Kromosom Terbaik ?");
        System.out.println("2. Nilai x1, x2 ?");
        System.out.println("3. Decode Kromosom Terbaik ?");
        System.out.println(LINE_VIEW);
        System.out.println("Solusi : ");
        System.out.println();
        // -------------------------------------------------------------------------------------------------------------
        // Logic Here
        new RegenerationAlgo().startGeneticAlgorithm();
        System.out.println();
    }
}