package com.satenra;

public class House {

    private String cleaningType;

    public House(String cleaningType){
        this.cleaningType = cleaningType;
    }

    public void doCleaning(){
        System.out.println("cleaning performed: "+cleaningType);
    }
}
