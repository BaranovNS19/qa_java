package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public boolean Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
            return hasMane;

        } else if ("Самка".equals(sex)) {
            hasMane = false;
            return hasMane;

        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    Feline feline;
    public Lion(){
        this.feline = feline;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
