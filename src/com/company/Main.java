package com.company;

public class Main {

    public static void main(String[] args) {

        SolarSystem andromeda = new SolarSystem();

        andromeda.Sun = 1;
        andromeda.planet= 2;
        andromeda.moon= 4;


        featureSun sun = new featureSun();
        sun.color = "Yellow";
        sun.heat = "6000000000000";
        sun.temp = "5000000 cius";
        sun.radius = "0.009";
        sun.maritalStatus = "single";

    }
}
