package com.fhamster.dolldrobe.model;

import java.util.Date;

public class Commodity {
    private String cNum;

    private String sNum;

    private String skeSNum;

    private String cName;

    private Date cEndtime;

    private Integer cMaxmoney;

    public Commodity(String cNum, String sNum, String skeSNum, String cName, Date cEndtime, Integer cMaxmoney) {
        this.cNum = cNum;
        this.sNum = sNum;
        this.skeSNum = skeSNum;
        this.cName = cName;
        this.cEndtime = cEndtime;
        this.cMaxmoney = cMaxmoney;
    }

    public Commodity() {
        super();
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum == null ? null : cNum.trim();
    }

    public String getsNum() {
        return sNum;
    }

    public void setsNum(String sNum) {
        this.sNum = sNum == null ? null : sNum.trim();
    }

    public String getSkeSNum() {
        return skeSNum;
    }

    public void setSkeSNum(String skeSNum) {
        this.skeSNum = skeSNum == null ? null : skeSNum.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Date getcEndtime() {
        return cEndtime;
    }

    public void setcEndtime(Date cEndtime) {
        this.cEndtime = cEndtime;
    }

    public Integer getcMaxmoney() {
        return cMaxmoney;
    }

    public void setcMaxmoney(Integer cMaxmoney) {
        this.cMaxmoney = cMaxmoney;
    }
}