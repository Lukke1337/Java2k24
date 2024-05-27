package com.example;

import java.util.Random;

public class DictionaryCacheRefresher extends Thread {
    public void run() {
        for (int i=1;i<=60;i++){
            try {
                Thread.sleep(new Random().nextInt(10)*500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

    }

}
