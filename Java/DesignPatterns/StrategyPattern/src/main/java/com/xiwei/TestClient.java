package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        double originalPrice = 60.0;
        mt.setPrice(originalPrice);
        System.out.println("原始票价为：" + originalPrice);
        System.out.println("---------------------------");

        Discount studentDiscount = new StudentDiscount();
        mt.setDiscount(studentDiscount);
        System.out.println("学生票价：" + mt.getPrice() + "\n");

        Discount childrenDiscount = new ChildrenDiscount();
        mt.setDiscount(childrenDiscount);
        System.out.println("儿童票价：" + mt.getPrice() + "\n");

        Discount vipDiscount = new VIPDiscount();
        mt.setDiscount(vipDiscount);
        System.out.println("VIP票价：" + mt.getPrice());
    }
}
