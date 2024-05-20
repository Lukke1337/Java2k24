package com.example;

import java.time.LocalDate;

public class PersonBase {
    protected String name;
    protected String surname;
    protected LocalDate dob;


    public void setName(String jan) {
    }
    public void setSurname(String kowalski) {
    }
    public void setIndex(String s00001) {
    }

    enum gender{
    };

    public String getName(){
        return this.name;
    }
    public String getSurname() {
    }
    public String getGender() {
    }

    public String getDateOfBirth() {
    }

    public abstract void printPersonDetails();
}
