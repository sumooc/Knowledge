package com.xiwei.actor;

public class TestClient {
    public static void main(String[] args) {
        ActorBuilder heroBuilder = new HeroBuilder();
        ActorDirector actorDirector = new ActorDirector();
        Actor heroActor = actorDirector.construct(heroBuilder);
        System.out.println(heroActor.toString());
    }
}
