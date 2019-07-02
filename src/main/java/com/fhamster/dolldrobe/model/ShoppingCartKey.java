package com.fhamster.dolldrobe.model;

public class ShoppingCartKey {
    private String skuId;

    private String uAccountnumber;

    public ShoppingCartKey(String skuId, String uAccountnumber) {
        this.skuId = skuId;
        this.uAccountnumber = uAccountnumber;
    }

    public ShoppingCartKey() {
        super();
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId == null ? null : skuId.trim();
    }

    public String getuAccountnumber() {
        return uAccountnumber;
    }

    public void setuAccountnumber(String uAccountnumber) {
        this.uAccountnumber = uAccountnumber == null ? null : uAccountnumber.trim();
    }
}