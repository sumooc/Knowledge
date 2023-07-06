package com.xiwei;

/**
 * 列表框类：具体同事类
 */
public class ListBox extends Component {
    public void update() {
        System.out.println("列表框增加一项：张三");
    }

    public void select() {
        System.out.println("列表框选中项：李四");
    }
}
