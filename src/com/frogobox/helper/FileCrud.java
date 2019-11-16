package com.frogobox.helper;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * GeneticAlgorithm
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
public class FileCrud {

    // Deklarasi data path hasil program -------------------------------------------------------------------------------

    private final static String EXTENSION_TXT = ".txt";
    private final static String PATH_OUTPUT_DATA = "result";
    private final static String PATH_ROOT_PROJECT = "Folder Output : [root_project]/";

    private String dateNow = new Constant().getDateNow();

    private String PATH_FILE_TIME = "#" + dateNow + EXTENSION_TXT;


    // -----------------------------------------------------------------------------------------------------------------

    private String getPathOutputFolder(String fileName){
        return PATH_OUTPUT_DATA + "/" + fileName + PATH_FILE_TIME;
    }

    public void createFolderOutPut(){
        try {
            File outputDir = new File(PATH_OUTPUT_DATA);
            if (!outputDir.exists()) {
                outputDir.mkdir();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void createFileTxt(String fileName) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {

            File file = new File(getPathOutputFolder(fileName));
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(PATH_ROOT_PROJECT + getPathOutputFolder(fileName));
            bufferedWriter.newLine();

        } catch (IOException e) {
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
                Desktop.getDesktop().open(new File(getPathOutputFolder(fileName)));
            } catch (IOException ex) {
            }
        }

    }

    public void outputMain(String fileName){
        createFolderOutPut();
        createFileTxt(fileName);
    }

}
