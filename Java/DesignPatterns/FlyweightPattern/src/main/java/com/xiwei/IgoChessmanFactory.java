package com.xiwei;

import java.util.Hashtable;

/**
 * 围棋棋子工厂类：享元工厂类，使用单例模式进行设计
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    // 使用Hashtable来存储享元对象，充当享元池
    private static Hashtable hashtable;

    private IgoChessmanFactory() {
        hashtable = new Hashtable<>();
        BlackIgoChessman blackIgoChessman = new BlackIgoChessman();
        hashtable.put("black", blackIgoChessman);
        WhiteIgoChessman whiteIgoChessman = new WhiteIgoChessman();
        hashtable.put("white", whiteIgoChessman);
    }

    // 返回享元工厂类的唯一实例
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    // 通过key来获取存储在Hashtable中的享元对象
    public IgoChessman getIgoChessman(String color) {
        return (IgoChessman) hashtable.get(color);
    }
}
