package com.frogobox.algorithm;

import com.frogobox.helper.RawHelper;
import com.frogobox.model.Practice;
import com.frogobox.model.Test;

import java.util.ArrayList;

import static com.frogobox.helper.Constant.Variable.*;

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
public class FetchDataAlgo {

    private ArrayList<Test> dataSetTestOne;
    private ArrayList<Test> dataSetTestTwo;
    private ArrayList<Practice> dataSetPracticeOne;
    private ArrayList<Practice> dataSetPracticeTwo;
    private ArrayList<String> dataSetTargetOne;
    private ArrayList<String> dataSetTargetTwo;

    public FetchDataAlgo() {
        RawHelper rawHelper = new RawHelper();
        dataSetTestOne = rawHelper.fetchTestData(PATH_RAW_CSV_DATA_UJI_OPSI_1);
        dataSetTestTwo = rawHelper.fetchTestData(PATH_RAW_CSV_DATA_UJI_OPSI_2);
        dataSetPracticeOne = rawHelper.fetchPracticeData(PATH_RAW_CSV_DATA_LATIH_OPSI_1);
        dataSetPracticeTwo = rawHelper.fetchPracticeData(PATH_RAW_CSV_DATA_LATIH_OPSI_2);
        dataSetTargetOne = rawHelper.fetchTargetData(PATH_RAW_CSV_TARGET_LATIH_OPSI_1);
        dataSetTargetTwo = rawHelper.fetchTargetData(PATH_RAW_CSV_TARGET_LATIH_OPSI_2);
    }

    public ArrayList<Test> getDataSetTestOne() {
        return dataSetTestOne;
    }

    public void setDataSetTestOne(ArrayList<Test> dataSetTestOne) {
        this.dataSetTestOne = dataSetTestOne;
    }

    public ArrayList<Test> getDataSetTestTwo() {
        return dataSetTestTwo;
    }

    public void setDataSetTestTwo(ArrayList<Test> dataSetTestTwo) {
        this.dataSetTestTwo = dataSetTestTwo;
    }

    public ArrayList<Practice> getDataSetPracticeOne() {
        return dataSetPracticeOne;
    }

    public void setDataSetPracticeOne(ArrayList<Practice> dataSetPracticeOne) {
        this.dataSetPracticeOne = dataSetPracticeOne;
    }

    public ArrayList<Practice> getDataSetPracticeTwo() {
        return dataSetPracticeTwo;
    }

    public void setDataSetPracticeTwo(ArrayList<Practice> dataSetPracticeTwo) {
        this.dataSetPracticeTwo = dataSetPracticeTwo;
    }

    public ArrayList<String> getDataSetTargetOne() {
        return dataSetTargetOne;
    }

    public void setDataSetTargetOne(ArrayList<String> dataSetTargetOne) {
        this.dataSetTargetOne = dataSetTargetOne;
    }

    public ArrayList<String> getDataSetTargetTwo() {
        return dataSetTargetTwo;
    }

    public void setDataSetTargetTwo(ArrayList<String> dataSetTargetTwo) {
        this.dataSetTargetTwo = dataSetTargetTwo;
    }

    public void showDataSetTestOne() {
        System.out.println("Raw data from data_uji_opsi_1");
        for (int i = 0; i < dataSetTestOne.size(); i++) {
            System.out.println(dataSetTestOne.get(i).toString());
        }
        System.out.println();
    }

    public void showDataSetTestTwo() {
        System.out.println("Raw data from data_uji_opsi_2");
        for (int i = 0; i < dataSetTestTwo.size(); i++) {
            System.out.println(dataSetTestTwo.get(i).toString());
        }
    }

    public void showDataSetPracticeOne() {
        System.out.println("Raw data from data_latih_opsi_1");
        for (int i = 0; i < dataSetPracticeOne.size(); i++) {
            System.out.println(dataSetPracticeOne.get(i).toString());
        }
        System.out.println();
    }

    public void showDataSetPracticeTwo() {
        System.out.println("Raw data from data_latih_opsi_2");
        for (int i = 0; i < dataSetPracticeTwo.size(); i++) {
            System.out.println(dataSetPracticeTwo.get(i).toString());
        }
        System.out.println();
    }

    public void showDataSetTargetOne() {
        System.out.println("Raw data from target_latih_opsi_1");
        for (int i = 0; i < dataSetTargetOne.size(); i++) {
            System.out.println("Result : " + dataSetTargetOne.get(i));
        }
        System.out.println();
    }

    public void showDataSetTargetTwo() {
        System.out.println("Raw data from target_latih_opsi_1");
        for (int i = 0; i < dataSetTargetTwo.size(); i++) {
            System.out.println("Result : " + dataSetTargetTwo.get(i));
        }
        System.out.println();
    }

}
