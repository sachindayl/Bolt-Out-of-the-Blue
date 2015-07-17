package com.nfhackathon.botb.rpt.operations;

import java.util.HashMap;

/**
 * Created by pthakkar9 on 7/17/2015.
 * This class is a Plain Old Java Object (POJO) to represent Client Data.
 */
public class InvestmentModels {
    public String[] invModels = {"Conservative",
            "Moderately Conservative",
            "Moderate",
            "Moderately Aggressive",
            "Aggressive"};

    private HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    public int[] getConsAlloc(){
        return new int[]{5, 5, 10, 40, 25, 15};
    }

    public int[] getModConsAlloc(){
        return new int[]{10, 10, 20, 35, 15, 10};
    }

    public int[] getModAlloc(){
        return new int[]{15, 15, 30, 25, 10, 5};
    }

    public int[] getModAggAlloc(){
        return new int[]{25, 20, 35, 15, 5, 0};
    }

    public int[] getAggAlloc(){
        return new int[]{30, 25, 40, 5, 0, 0};
    }




}
