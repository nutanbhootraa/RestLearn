package com.Nutan.RestLearn.dog;

public class Temp {
    public static void main(String args[]){
        DogDAO dd=new DogDAO();
        System.out.println(dd.getAllDogs().get(0).getId());
        System.out.println(dd.getAllDogs().get(0).getName());
        System.out.println(dd.getAllDogs().get(0).getBreed());
        System.out.println(dd.getAllDogs().get(0).getActiveRate());
        System.out.println(dd.getAllDogs().get(0).getDOB());
        System.out.println(dd.getAllDogs().get(0).getKnowsHumanLanguage());

    }
}
