package com.xiwei.actor;

/**
 * 游戏角色创建控制器：指挥者
 */
public class ActorDirector {
    public Actor construct(ActorBuilder actorBuilder) {
        // Director类用于指导具体建造者如何构建产品，它按一定次序调用Builder的buildPartX（）方法，
        // 控制调用的先后次序，并向客户端返回一个完整的产品对象。
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        // 通过钩子方法来控制产品构建
        if (!actorBuilder.isBareheaded()) {
            actorBuilder.buildHairstyle();
        }
        Actor actor = actorBuilder.createActor();
        return actor;
    }
}
