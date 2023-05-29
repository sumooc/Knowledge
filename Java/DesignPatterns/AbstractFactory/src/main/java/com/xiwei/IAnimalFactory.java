package com.xiwei;

/**
 * AbstractFactory抽象工厂
 */
public interface IAnimalFactory {

    /**
     * 定义创建ICat接口实例的方法
     *
     * @return
     */
    ICat createCat();

    /**
     * 定义创建IDog接口实例的方法
     *
     * @return
     */
    IDog createDog();
}
