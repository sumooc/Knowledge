package com.xiwei.animal;

/**
 * IAnimalFactory抽象工厂的实现类
 */
public class BlackAnimalFactory implements IAnimalFactory{
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
}
