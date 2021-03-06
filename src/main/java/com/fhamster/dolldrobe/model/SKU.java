package com.fhamster.dolldrobe.model;

public class SKU {
    private String skuId;

    private String cNum;

    private String cSpecification;

    private Float cPrice;

    private Integer cInventory;

    private String skuImg;

    public SKU(String skuId, String cNum, String cSpecification, Float cPrice, Integer cInventory, String skuImg) {
        this.skuId = skuId;
        this.cNum = cNum;
        this.cSpecification = cSpecification;
        this.cPrice = cPrice;
        this.cInventory = cInventory;
        this.skuImg = skuImg;
    }

    public SKU() {
        super();
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId == null ? null : skuId.trim();
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum == null ? null : cNum.trim();
    }

    public String getcSpecification() {
        return cSpecification;
    }

    public void setcSpecification(String cSpecification) {
        this.cSpecification = cSpecification == null ? null : cSpecification.trim();
    }

    public Float getcPrice() {
        return cPrice;
    }

    public void setcPrice(Float cPrice) {
        this.cPrice = cPrice;
    }

    public Integer getcInventory() {
        return cInventory;
    }

    public void setcInventory(Integer cInventory) {
        this.cInventory = cInventory;
    }

    public String getSkuImg() {
        return skuImg;
    }

    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg == null ? null : skuImg.trim();
    }
}