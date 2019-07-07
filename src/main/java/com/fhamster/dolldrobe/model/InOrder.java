package com.fhamster.dolldrobe.model;

import java.util.Date;

public class InOrder {
    private String iId;

    private Float iTotalmoney;

    private String iGroup;

    private String iPay;

    private Date iBegintime;

    private Date iCanceltime;

    private Date iTranstime;

    public InOrder(String iId, Float iTotalmoney, String iGroup, String iPay, Date iBegintime, Date iCanceltime, Date iTranstime) {
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

    public String getiGroup() {
        return iGroup;
    }

    public void setiGroup(String iGroup) {
        this.iGroup = iGroup == null ? null : iGroup.trim();
    }

    public String getiPay() {
        return iPay;
    }

    public void setiPay(String iPay) {
        this.iPay = iPay == null ? null : iPay.trim();
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