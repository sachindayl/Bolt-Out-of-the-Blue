package com.nfhackathon.botb.rpt.operations;

import java.util.HashMap;

/**
 * Created by pthakkar9 on 7/16/2015.
 * This class is a Plain Old Java Object (POJO) to represent Client Data.
 * As our Persona's name was Tiffany, I went with Tiffany as class' name for fun.
 * Can be changed later.
 */
public class Tiffany {

    //Assumptions
    private final int RETIREMENT_AGE = 65;

    private int age;

    private long targetRetAmount;

    private boolean isBuyingHouse = false;
    private int buyHouseYears = 0;

    private boolean isMarried = false;
    private int getMarriedYears = 0;

    private boolean isPlanningKids = false;
    private int planKidsYears = 0;

    private boolean isPlanningReloc = false;
    private int planRelocYears = 0;

    // a simple hashMap declaration with default size and load factor
    private HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    public String[] assetClasses = {"International Stocks",
            "Mid and Small Cap Stocks",
            "Large Cap Stocks",
            "Bonds",
            "Annuities",
            "Cash"};

    //Done add more properties for life decisions

    public Tiffany(int age, long targetRetAmount) {

        this.age = age;
        this.targetRetAmount = targetRetAmount;
        setHashValueAllAssets(0, 0, 0, 0, 0, 100);
    }

    //Done add getters and setters for properties

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


    public boolean isBuyingHouse() {
        return isBuyingHouse;
    }

    public void setIsBuyingHouse(boolean isBuyingHouse) {
        this.isBuyingHouse = isBuyingHouse;
    }

    public int getBuyHouseYears() {
        return buyHouseYears;
    }

    public void setBuyHouseYears(int buyHouseYears) {
        this.buyHouseYears = buyHouseYears;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public int getGetMarriedYears() {
        return getMarriedYears;
    }

    public void setGetMarriedYears(int getMarriedYears) {
        this.getMarriedYears = getMarriedYears;
    }

    public boolean isPlanningKids() {
        return isPlanningKids;
    }

    public void setIsPlanningKids(boolean isPlanningKids) {
        this.isPlanningKids = isPlanningKids;
    }

    public int getPlanKidsYears() {
        return planKidsYears;
    }

    public void setPlanKidsYears(int planKidsYears) {
        this.planKidsYears = planKidsYears;
    }

    public boolean isPlanningReloc() {
        return isPlanningReloc;
    }

    public void setIsPlanningReloc(boolean isPlanningReloc) {
        this.isPlanningReloc = isPlanningReloc;
    }

    public int getPlanRelocYears() {
        return planRelocYears;
    }

    public void setPlanRelocYears(int planRelocYears) {
        this.planRelocYears = planRelocYears;
    }

    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    public void setHashValueInternationalStocks(int v) {
        hashMap.put(assetClasses[0], v);
    }

    public void setHashValueMidandSmallCapStocks(int v) {
        hashMap.put(assetClasses[0], v);
    }

    public void setHashValueLargeCapStocks(int v) {
        hashMap.put(assetClasses[0], v);
    }

    public void setHashValueBonds(int v) {
        hashMap.put(assetClasses[0], v);
    }

    public void setHashValueAnnuities(int v) {
        hashMap.put(assetClasses[0], v);
    }

    public void setHashValueCash(int v) {
        hashMap.put(assetClasses[0], v);
    }

    public void setHashValueAllAssets(int v1, int v2, int v3, int v4, int v5, int v6) {

        hashMap.put(assetClasses[0], v1);
        hashMap.put(assetClasses[1], v2);
        hashMap.put(assetClasses[2], v3);
        hashMap.put(assetClasses[3], v4);
        hashMap.put(assetClasses[4], v5);
        hashMap.put(assetClasses[5], v6);

    }

}
