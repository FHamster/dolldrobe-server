package com.fhamster.dolldrobe.model;

import java.util.Date;

public class InOrder {
    private String iId;

    private Float iTotalmoney;

    private Byte iGroup;

    private Byte iPay;

    private Date iBegintime;

    private Date iCanceltime;

    private Date iTranstime;

    public InOrder(String iId, Float iTotalmoney, Byte iGroup, Byte iPay, Date iBegintime, Date iCanceltime, Date iTranstime) {
        this.iId = iId;
        this.iTotalmoney = iTotalmoney;
        this.iGroup = iGroup;
        this.iPay = iPay;
        this.iBegintime = iBegintime;
        this.iCanceltime = iCanceltime;
        this.iTranstime = iTranstime;
    }

    public InOrder() {
        super();
    }

    public String getiId() {
        return iId;
    }

    public void setiId(String iId) {
        this.iId = iId == null ? null : iId.trim();
    }

    public Float getiTotalmoney() {
        return iTotalmoney;
    }

    public void setiTotalmoney(Float iTotalmoney) {
        this.iTotalmoney = iTotalmoney;
    }

    public Byte getiGroup() {
        return iGroup;
    }

    public void setiGroup(Byte iGroup) {
        this.iGroup = iGroup;
    }

    public Byte getiPay() {
        return iPay;
    }

    public void setiPay(Byte iPay) {
        this.iPay = iPay;
    }

    public Date getiBegintime() {
        return iBegintime;
    }

    public void setiBegintime(Date iBegintime) {
        this.iBegintime = iBegintime;
    }

    public Date getiCanceltime() {
        return iCanceltime;
    }

    public void setiCanceltime(Date iCanceltime) {
        this.iCanceltime = iCanceltime;
    }

    public Date getiTranstime() {
        return iTranstime;
    }

    public void setiTranstime(Date iTranstime) {
        this.iTranstime = iTranstime;
    }
}