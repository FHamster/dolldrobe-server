package com.fhamster.dolldrobe.model;

public class AdministrativeRegion {
    private String arNum;

    private String arPrentNum;

    private String arName;

    private String arIsuse;

    private Integer arType;

    public AdministrativeRegion(String arNum, String arPrentNum, String arName, String arIsuse, Integer arType) {
        this.arNum = arNum;
        this.arPrentNum = arPrentNum;
        this.arName = arName;
        this.arIsuse = arIsuse;
        this.arType = arType;
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

    public String getArPrentNum() {
        return arPrentNum;
    }

    public void setArPrentNum(String arPrentNum) {
        this.arPrentNum = arPrentNum == null ? null : arPrentNum.trim();
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

    public Integer getArType() {
        return arType;
    }

    public void setArType(Integer arType) {
        this.arType = arType;
    }
}