package com.fhamster.dolldrobe.model;

public class DetailIOrder extends DetailIOrderKey {
    private Integer doNum;

    private Float doDiscountamount;

    public DetailIOrder(String skuId, String oNum, Integer doNum, Float doDiscountamount) {
        super(skuId, oNum);
        this.doNum = doNum;
        this.doDiscountamount = doDiscountamount;
    }

    public DetailIOrder() {
        super();
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