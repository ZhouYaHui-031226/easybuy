package com.buy.utils;

import com.buy.entity.EasybuyProduct;

import java.io.Serializable;

/**
 * 购物车商品分组类
 */
public class ShoppingCartItem implements Serializable {
    public ShoppingCartItem(EasybuyProduct product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
        this.cost = (float)product.getPrice()*quantity;
    }

    //商品对象
    private EasybuyProduct product;
    //商品的数量
    private Integer quantity;
    //商品的价格
    private float cost;

    public EasybuyProduct getProduct() {
        return product;
    }

    public void setProduct(EasybuyProduct product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
