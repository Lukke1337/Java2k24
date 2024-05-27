package com.example;

import java.io.File;
import java.util.Scanner;

public class DictionaryCache {
    private static DictionaryCache instance;

    public static synchronized DictionaryCache getInstance(){
        if(instance==null) instance = new DictionaryCache();
        return instance;

        Scanner memory = new Scanner(new File(""));
    }
}
