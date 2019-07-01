package com.fhamster.dolldrobe.model;

import java.util.Date;

public class FPageCommodity {
    private String uAccountnumber;

    private String cNum;

    private Date fgDate;

    public FPageCommodity(String uAccountnumber, String cNum, Date fgDate) {
        this.uAccountnumber = uAccountnumber;
        this.cNum = cNum;
        this.fgDate = fgDate;
    }

    public FPageCommodity() {
        super();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum == null ? null : cNum.trim();
    }

    public Date getFgDate() {
        return fgDate;
    }

    public void setFgDate(Date fgDate) {
        this.fgDate = fgDate;
    }
}