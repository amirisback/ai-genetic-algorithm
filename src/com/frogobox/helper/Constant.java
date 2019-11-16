package com.frogobox.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

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
public class Constant {

    public Constant() {
    }

    public static final class Variable {
        public static String PATH_RAW_CSV_DATA_UJI_OPSI_1 = "src/com/frogobox/raw/test/data_uji_opsi_1.csv";
        public static String PATH_RAW_CSV_DATA_UJI_OPSI_2 = "src/com/frogobox/raw/test/data_uji_opsi_2.csv";

        public static String PATH_RAW_CSV_DATA_LATIH_OPSI_1 = "src/com/frogobox/raw/practice/data_latih_opsi_1.csv";
        public static String PATH_RAW_CSV_DATA_LATIH_OPSI_2 = "src/com/frogobox/raw/practice/data_latih_opsi_2.csv";

        public static String PATH_RAW_CSV_TARGET_LATIH_OPSI_1 = "src/com/frogobox/raw/target/target_latih_opsi_2.csv";
        public static String PATH_RAW_CSV_TARGET_LATIH_OPSI_2 = "src/com/frogobox/raw/target/target_latih_opsi_2.csv";
    }


    public String getDateNow(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return simpleDateFormat.format(new Date());
    }

    public String getTimeNow(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        return simpleDateFormat.format(new Date());
    }

}
