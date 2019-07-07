package com.fhamster.dolldrobe.model;

public class AdministrativeRegion {
    private String arNum;

    private String arName;

    private String arIsuse;

    public AdministrativeRegion(String arNum, String arName, String arIsuse) {
        this.arNum = arNum;
        this.arName = arName;
        this.arIsuse = arIsuse;
    }

    public AdministrativeRegion() {
        super();
    }

    public String getArNum() {
        return arNum;
    }

    public void setArNum(String arNum) {
        this.arNum = arNum == null ? null : arNum.trim();
    }

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName == null ? null : arName.trim();
    }

    public String getArIsuse() {
        return arIsuse;
    }

    public void setArIsuse(String arIsuse) {
        this.arIsuse = arIsuse == null ? null : arIsuse.trim();
    }
}