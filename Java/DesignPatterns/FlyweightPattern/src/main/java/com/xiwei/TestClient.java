package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        IgoChessman black1, black2, black3, black4, white1, white2, white3;
        // 获取享元工厂对象
        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
        // 通过享元工厂获取4颗黑子
        black1 = factory.getIgoChessman("black");
        black2 = factory.getIgoChessman("black");
        black3 = factory.getIgoChessman("black");
        black4 = factory.getIgoChessman("black");
        System.out.println("判断两黑子是否相同(black1和black2)：" + (black1 == black2));
        System.out.println("判断两黑子是否相同(black1和black4)：" + (black1 == black4));

        // 通过享元工厂获取3颗白子
        white1 = factory.getIgoChessman("white");
        white2 = factory.getIgoChessman("white");
        white3 = factory.getIgoChessman("white");
        System.out.println("判断两白子是否相同(white1和white2)：" + (white1 == white2));
        System.out.println("判断两白子是否相同(white2和white3)：" + (white3 == white2));

        //显示棋子
        black1.display(new Coordinates(1, 2));
        black2.display(new Coordinates(1, 3));
        black3.display(new Coordinates(2, 3));
        black4.display(new Coordinates(3, 4));
        white1.display(new Coordinates(3, 6));
        white2.display(new Coordinates(1, 5));
        white3.display(new Coordinates(3, 3));
    }
}
