package com.fhamster.dolldrobe.model;

public class DetailIOrder {
    private String oNum;

    private String skuId;

    private Integer doNum;

    private Float doDiscountamount;

    public DetailIOrder(String oNum, String skuId, Integer doNum, Float doDiscountamount) {
        this.oNum = oNum;
        this.skuId = skuId;
        this.doNum = doNum;
        this.doDiscountamount = doDiscountamount;
    }

    public DetailIOrder() {
        super();
    }

    public String getoNum() {
        return oNum;
    }

    public void setoNum(String oNum) {
        this.oNum = oNum == null ? null : oNum.trim();
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId == null ? null : skuId.trim();
    }

    public Integer getDoNum() {
        return doNum;
    }

    public void setDoNum(Integer doNum) {
        this.doNum = doNum;
    }

    public Float getDoDiscountamount() {
        return doDiscountamount;
    }

    public void setDoDiscountamount(Float doDiscountamount) {
        this.doDiscountamount = doDiscountamount;
    }
}