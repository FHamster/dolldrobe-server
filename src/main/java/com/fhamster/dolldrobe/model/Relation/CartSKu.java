package com.fhamster.dolldrobe.model.Relation;

import com.fhamster.dolldrobe.model.SKU;
import com.fhamster.dolldrobe.model.ShoppingCart;

public class CartSKu {
    private ShoppingCart cart;
    private SKU sku;

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public SKU getSku() {
        return sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }

    public CartSKu(ShoppingCart cart, SKU sku) {
        this.cart = cart;
        this.sku = sku;
    }

    public CartSKu() {
    }
}
