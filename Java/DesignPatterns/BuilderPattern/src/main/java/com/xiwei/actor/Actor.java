package com.xiwei.actor;

/**
 * Actor角色类：复杂产品。
 */
public class Actor {
    private String Type; //角色类型
    private String sex;//性别
    private String face;//脸型
    private String costume;//服装
    private String hairstyle;//发型

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }
}
