package com.fhamster.dolldrobe.model;

public class ShoppingCart {
    private String uAccountnumber;

    private String skuId;

    private Integer scNum;

    public ShoppingCart(String uAccountnumber, String skuId, Integer scNum) {
        this.uAccountnumber = uAccountnumber;
        this.skuId = skuId;
        this.scNum = scNum;
    }

    public ShoppingCart() {
        super();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId == null ? null : skuId.trim();
    }

    public Integer getScNum() {
        return scNum;
    }

    public void setScNum(Integer scNum) {
        this.scNum = scNum;
    }
}