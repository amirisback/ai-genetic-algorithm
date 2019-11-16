package com.frogobox.helper;

import com.frogobox.model.Test;

import java.io.*;
import java.util.ArrayList;

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

    private ArrayList<Test> preLoadRaw(String sourceRaw) {
        int count = 0;
        String line;
        ArrayList<Test> mTest = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(sourceRaw)));

            do {
                line = reader.readLine();
                String[] splitstr = line.split("\t");
                Test mmTest = new Test(splitstr[0], splitstr[1], splitstr[2], splitstr[3], splitstr[4]);
                mTest.add(mmTest);
                count++;
            } while (true);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mTest;
    }

}
