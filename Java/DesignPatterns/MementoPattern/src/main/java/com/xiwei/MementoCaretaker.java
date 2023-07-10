package com.xiwei;

import java.util.ArrayList;
import java.util.List;

/**
 * 象棋棋子备忘录管理类：负责人
 */
public class MementoCaretaker {
    private ChessmanMemento memento;

    public ChessmanMemento getMemento() {
        return memento;
    }

    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }

    // 存储多个备忘录
    private List<ChessmanMemento> mementos = new ArrayList<>();

    public ChessmanMemento getMementos(int i) {
        return mementos.get(i);
    }

    public void setMementos(ChessmanMemento memento) {
        mementos.add(memento);
    }
}
