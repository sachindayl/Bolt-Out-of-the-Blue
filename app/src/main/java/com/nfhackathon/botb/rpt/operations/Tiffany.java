package com.nfhackathon.botb.rpt.operations;

/**
 * Created by pthakkar9 on 7/16/2015.
 * This class is a Plain Old Java Object (POJO) to represent Client Data.
 * As our Persona's name was Tiffany, I went with Tiffany as class' name for fun.
 * Can be changed later.
 *
 */
public class Tiffany {

    private int age;

    private long targetRetAmount;

    //TODO add more properties for life decisions
    // e.g. hasKids, wantsKids, howManyKids etc

    public Tiffany(int age, long targetRetAmount){

        this.age = age;
        this.targetRetAmount = targetRetAmount;
    }

    //TODO add getters and setters for properties

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTargetRetAmount() {
        return targetRetAmount;
    }

    public void setTargetRetAmount(long targetRetAmount) {
        this.targetRetAmount = targetRetAmount;
    }
}
