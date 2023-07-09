package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        // 观察目标对象
        AllyControlCenter controlCenter = new ConcreteAllyControlCenter("超能陆战队");
        Observer player1, player2, player3, player4;

        player1 = new Player("张三");
        controlCenter.join(player1);

        player2 = new Player("李四");
        controlCenter.join(player2);

        player3 = new Player("王五");
        controlCenter.join(player3);

        player4 = new Player("杨六");
        controlCenter.join(player4);

        // 某成员遭受攻击
        player1.beAttacked(controlCenter);
    }
}
