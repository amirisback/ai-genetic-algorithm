package com.frogobox.base;

import com.frogobox.algorithm.FetchDataAlgo;
import com.frogobox.helper.RawDataHelper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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
 * com.frogobox.base
 */
public class BaseHelper {

    public BaseHelper() {
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Path Raw
    public static final String EXTENSION_TXT = ".txt";
    public static final String EXTENSION_CSV = ".csv";
    public static final String PATH_OUTPUT_DATA = "result";
    public static final String PATH_ROOT_PROJECT = "Folder Output : [root_project]/";
    public String PATH_FILE_TIME = "#" + getDateNow() + EXTENSION_TXT;
    // -----------------------------------------------------------------------------------------------------------------
    // Path Raw Data
    public static final String BASE_PATH_RAW = "src/com/frogobox/raw";
    public static final String PATH_TYPE_TEST = "/test";
    public static final String PATH_TYPE_PRACTICE = "/practice";
    public static final String PATH_TYPE_TARGET = "/target";
    public static final String PATH_RAW_CSV_DATA_UJI_OPSI_1 = BASE_PATH_RAW + PATH_TYPE_TEST + "/data_uji_opsi_1.csv";
    public static final String PATH_RAW_CSV_DATA_UJI_OPSI_2 = BASE_PATH_RAW + PATH_TYPE_TEST + "/data_uji_opsi_2.csv";
    public static final String PATH_RAW_CSV_DATA_LATIH_OPSI_1 = BASE_PATH_RAW + PATH_TYPE_PRACTICE + "/data_latih_opsi_1.csv";
    public static final String PATH_RAW_CSV_DATA_LATIH_OPSI_2 = BASE_PATH_RAW + PATH_TYPE_PRACTICE + "/data_latih_opsi_2.csv";
    public static final String PATH_RAW_CSV_TARGET_LATIH_OPSI_1 = BASE_PATH_RAW + PATH_TYPE_TARGET + "/target_latih_opsi_2.csv";
    public static final String PATH_RAW_CSV_TARGET_LATIH_OPSI_2 = BASE_PATH_RAW + PATH_TYPE_TARGET + "/target_latih_opsi_2.csv";
    // -----------------------------------------------------------------------------------------------------------------
    public static final String LINE_VIEW = "--------------------------------------------";
    public static final String POPULATION = "Makhluk";
    public static final String CHROMOSOME = "Kromosom";
    public static final String GEN = "Gen";
    // -----------------------------------------------------------------------------------------------------------------
    // Setting
    public static final int SUM_POPULATION = new FetchDataAlgo().getDataSetPracticeTwo().size();
    public static final int SUM_GEN = new RawDataHelper().getSumFetchDataInLine(PATH_RAW_CSV_DATA_LATIH_OPSI_2);
    public static final int SUM_CHROMOSOME = 2;
    // -----------------------------------------------------------------------------------------------------------------
    public static final int RANDOM_RANGE = 2;
    public static final int RANDOM_RANGE_MIN = -2;
    public static final int RANDOM_RANGE_MAX = 2;
    // -----------------------------------------------------------------------------------------------------------------
    public static final double X_MAX = SUM_GEN * (RANDOM_RANGE_MAX - 1);
    public static final double X_MIN = SUM_GEN * (RANDOM_RANGE_MIN + 1);
    // -----------------------------------------------------------------------------------------------------------------

    public String getPathOutputFolder(String fileName) {
        return PATH_OUTPUT_DATA + "/" + fileName + PATH_FILE_TIME;
    }

    public static int randomNumber(int range) {
        return new Random().nextInt(range);
    }

    public static int randomNumber(int min, int max) {
        return min + (max - min) * new Random().nextInt();
    }

    public static double randomNumber(double min, double max) {
        return min + (max - min) * new Random().nextDouble();
    }

    public String getDateNow() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return simpleDateFormat.format(new Date());
    }

    public String getTimeNow() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        return simpleDateFormat.format(new Date());
    }

}
