package com.fhamster.dolldrobe.model;

public class ShoppingCart extends ShoppingCartKey {
    private Integer scNum;

    public ShoppingCart(String skuId, String uAccountnumber, Integer scNum) {
        super(skuId, uAccountnumber);
        this.scNum = scNum;
    }

    public ShoppingCart() {
        super();
    }

    public Integer getScNum() {
        return scNum;
    }

    public void setScNum(Integer scNum) {
        this.scNum = scNum;
    }
}