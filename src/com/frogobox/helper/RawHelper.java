package com.frogobox.helper;

import com.frogobox.model.Practice;
import com.frogobox.model.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Artificial-intelligence-genetic-algorithm
 * Copyright (C) 16/11/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.helper
 */
public class RawHelper {

    public ArrayList<Test> fetchTestData(String sourceRaw) {
        ArrayList<Test> testArrayList = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(sourceRaw));
            String column;
            while ((column = reader.readLine()) != null) {
                String[] splitString = column.split(",");
                ArrayList<String> partTemp = new ArrayList<>();
                Collections.addAll(partTemp, splitString);
                Test mTest = new Test(partTemp.get(0), partTemp.get(1), partTemp.get(2), partTemp.get(3));
                testArrayList.add(mTest);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testArrayList;
    }

    public ArrayList<Practice> fetchPracticeData(String sourceRaw) {
        ArrayList<Practice> practiceArrayList = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(sourceRaw));
            String column;
            while ((column = reader.readLine()) != null) {
                String[] splitString = column.split(",");
                ArrayList<String> arrayTemp = new ArrayList<>();
                Collections.addAll(arrayTemp, splitString);
                Practice mPractice = new Practice(arrayTemp.get(0), arrayTemp.get(1), arrayTemp.get(2), arrayTemp.get(3), arrayTemp.get(4));
                practiceArrayList.add(mPractice);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return practiceArrayList;
    }


}
