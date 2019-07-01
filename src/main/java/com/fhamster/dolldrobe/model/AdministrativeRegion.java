package com.fhamster.dolldrobe.model;

public class AdministrativeRegion {
    private String arNum;

    private String arName;

    private Byte arIsuse;

    public AdministrativeRegion(String arNum, String arName, Byte arIsuse) {
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

    public Byte getArIsuse() {
        return arIsuse;
    }

    public void setArIsuse(Byte arIsuse) {
        this.arIsuse = arIsuse;
    }
}