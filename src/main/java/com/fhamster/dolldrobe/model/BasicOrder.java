package com.fhamster.dolldrobe.model;

import java.util.Date;

public class BasicOrder {
    private String oNum;

    private String uAccountnumber;

    private Date oFtime;

    private Date oStime;

    private Date oEtime;

    private Date oRtime;

    private Date oPtime;

    private Date oCtime;

    private Float tpmoney;

    private String totalpayment;

    public BasicOrder(String oNum, String uAccountnumber, Date oFtime, Date oStime, Date oEtime, Date oRtime, Date oPtime, Date oCtime, Float tpmoney, String totalpayment) {
        this.oNum = oNum;
        this.uAccountnumber = uAccountnumber;
        this.oFtime = oFtime;
        this.oStime = oStime;
        this.oEtime = oEtime;
        this.oRtime = oRtime;
        this.oPtime = oPtime;
        this.oCtime = oCtime;
        this.tpmoney = tpmoney;
        this.totalpayment = totalpayment;
    }

    public BasicOrder() {
        super();
    }

    public String getoNum() {
        return oNum;
    }

    public void setoNum(String oNum) {
        this.oNum = oNum == null ? null : oNum.trim();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }

    public Date getoFtime() {
        return oFtime;
    }

    public void setoFtime(Date oFtime) {
        this.oFtime = oFtime;
    }

    public Date getoStime() {
        return oStime;
    }

    public void setoStime(Date oStime) {
        this.oStime = oStime;
    }

    public Date getoEtime() {
        return oEtime;
    }

    public void setoEtime(Date oEtime) {
        this.oEtime = oEtime;
    }

    public Date getoRtime() {
        return oRtime;
    }

    public void setoRtime(Date oRtime) {
        this.oRtime = oRtime;
    }

    public Date getoPtime() {
        return oPtime;
    }

    public void setoPtime(Date oPtime) {
        this.oPtime = oPtime;
    }

    public Date getoCtime() {
        return oCtime;
    }

    public void setoCtime(Date oCtime) {
        this.oCtime = oCtime;
    }

    public Float getTpmoney() {
        return tpmoney;
    }

    public void setTpmoney(Float tpmoney) {
        this.tpmoney = tpmoney;
    }

    public String getTotalpayment() {
        return totalpayment;
    }

    public void setTotalpayment(String totalpayment) {
        this.totalpayment = totalpayment == null ? null : totalpayment.trim();
    }
}