package com.nfhackathon.botb.rpt.operations;

import java.util.HashMap;

/**
 * Created by pthakkar9 on 7/17/2015.
 * This class is a Plain Old Java Object (POJO) to represent Client Data.
 */
public class InvestmentModels {

    public InvestmentModels() {
    }

    public String[] invModels = {"Conservative",
            "Moderately Conservative",
            "Moderate",
            "Moderately Aggressive",
            "Aggressive"};

    private HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    public float[] getConsAlloc(){
        return new float[] {5, 5, 10, 40, 25, 15};
    }

    public float[] getModConsAlloc(){
        return new float[]{10, 10, 20, 35, 15, 10};
    }

    public float[] getModAlloc(){
        return new float[]{15, 15, 30, 25, 10, 5};
    }

    public float[] getModAggAlloc(){
        return new float[]{25, 20, 35, 15, 5, 0};
    }

    public float[] getAggAlloc(){
        return new float[]{30, 25, 40, 5, 0, 0};
    }




}
