package com.fhamster.dolldrobe.model;

public class DetailIOrderKey {
    private String skuId;

    private String oNum;

    public DetailIOrderKey(String skuId, String oNum) {
        this.skuId = skuId;
        this.oNum = oNum;
    }

    public DetailIOrderKey() {
        super();
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId == null ? null : skuId.trim();
    }

    public String getoNum() {
        return oNum;
    }

    public void setoNum(String oNum) {
        this.oNum = oNum == null ? null : oNum.trim();
    }
}