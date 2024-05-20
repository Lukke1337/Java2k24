package com.example;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Student extends PersonBase {
    String indexNumber;


    public String getIndex() {
    }

    public void printDetails(){
        super.printPersonDetails();
    }
    System.out.println(indexNumber);

}
