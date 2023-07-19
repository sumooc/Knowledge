package com.xiwei;

/**
 * 电影票类：环境类
 */
public class MovieTicket {
    private double price;
    private Discount discount;

    public double getPrice() {
        // 调用折扣类的折扣价计算方法
        return discount.calculate(this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
