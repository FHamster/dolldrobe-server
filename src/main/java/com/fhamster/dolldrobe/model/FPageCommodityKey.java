package com.fhamster.dolldrobe.model;

public class FPageCommodityKey {
    private String cNum;

    private String uAccountnumber;

    public FPageCommodityKey(String cNum, String uAccountnumber) {
        this.cNum = cNum;
        this.uAccountnumber = uAccountnumber;
    }

    public FPageCommodityKey() {
        super();
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum == null ? null : cNum.trim();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }
}