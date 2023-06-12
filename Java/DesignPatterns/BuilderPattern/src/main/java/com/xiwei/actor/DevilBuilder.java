package com.xiwei.actor;

/**
 * 恶魔角色建造器：具体建造者
 */
class DevilBuilder extends ActorBuilder {

    public void buildType() {
        actor.setType("恶魔");
    }

    public void buildSex() {
        actor.setSex("妖");
    }

    public void buildFace() {
        actor.setFace("丑陋");
    }

    public void buildCostume() {
        actor.setCostume("黑披风");
    }

    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }

    /**
     * 无须构建头发部件，具体建造者DevilBuilder将覆盖isBareheaded（）方法
     */
    @Override
    public boolean isBareheaded() {
        return true;
    }
}