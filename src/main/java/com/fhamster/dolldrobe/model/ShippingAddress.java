package com.fhamster.dolldrobe.model;

public class ShippingAddress {
    private String saNum;

    private String arNum;

    private String uAccountnumber;

    private String saDetail;

    private String saDefault;

    public ShippingAddress(String saNum, String arNum, String uAccountnumber, String saDetail, String saDefault) {
        this.saNum = saNum;
        this.arNum = arNum;
        this.uAccountnumber = uAccountnumber;
        this.saDetail = saDetail;
        this.saDefault = saDefault;
    }

    public ShippingAddress() {
        super();
    }

    public String getSaNum() {
        return saNum;
    }

    public void setSaNum(String saNum) {
        this.saNum = saNum == null ? null : saNum.trim();
    }

    public String getArNum() {
        return arNum;
    }

    public void setArNum(String arNum) {
        this.arNum = arNum == null ? null : arNum.trim();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }

    public String getSaDetail() {
        return saDetail;
    }

    public void setSaDetail(String saDetail) {
        this.saDetail = saDetail == null ? null : saDetail.trim();
    }

    public String getSaDefault() {
        return saDefault;
    }

    public void setSaDefault(String saDefault) {
        this.saDefault = saDefault == null ? null : saDefault.trim();
    }
}