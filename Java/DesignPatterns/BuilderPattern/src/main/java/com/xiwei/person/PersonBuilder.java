package com.xiwei.person;

/**
 * Builder
 */
public interface PersonBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
