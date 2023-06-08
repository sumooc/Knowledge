package com.xiwei.animal;

/**
 * IAnimalFactory抽象工厂的实现类
 */
public class WhiteAnimalFactory implements IAnimalFactory{
    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
}
