package com.xiwei.actor;

/**
 * 角色建造器：抽象建造者
 */
abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    /**
     * 钩子方法的返回类型通常为boolean类型，方法名一般为is×××（）。钩子方法定义在抽象建造者类中
     */
    public boolean isBareheaded() {
        // todo
        return false;
    }

    //工厂方法，返回一个完整的游戏角色对象
    public Actor createActor() {
        return actor;
    }
}