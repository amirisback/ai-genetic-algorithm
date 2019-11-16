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

    public String getDateNow(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return simpleDateFormat.format(new Date());
    }

    public String getTimeNow(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        return simpleDateFormat.format(new Date());
    }

}
