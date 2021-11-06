package com.company;

public class Main {

    public static void main(String[] args) {

        SolarSystem andromeda = new SolarSystem();

        andromeda.Sun = 1;
        andromeda.planet= 2;
        andromeda.moon= 4;


        featureSun sun = new featureSun();
        sun.color = "Red";
        sun.heat = "80000";
        sun.temp = "8987987 cius";
        sun.radius = 150;
        sun.maritalStatus = "double";

    }
}
