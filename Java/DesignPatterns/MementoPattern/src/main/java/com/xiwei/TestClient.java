package com.xiwei;

public class TestClient {
    // 记录当前状态所在位置
    private static int index = -1;
    private static final MementoCaretaker caretaker = new MementoCaretaker();

    public static void main(String[] args) {

        Chessman chessman = new Chessman("车", 1, 1);
        /*display(chessman);
        // 保存状态
        caretaker.setMemento(chessman.save());
        chessman.setY(4);
        display(chessman);
        // 保存状态
        caretaker.setMemento(chessman.save());
        display(chessman);
        chessman.setX(5);
        display(chessman);
        System.out.println("************悔棋************");
        // 恢复装填
        chessman.restore(caretaker.getMemento());
        display(chessman);*/

        play(chessman);
        chessman.setY(4);
        play(chessman);
        chessman.setX(5);
        play(chessman);
        undo(chessman, index);
        undo(chessman, index);
        redo(chessman, index);
        redo(chessman, index);

    }

    public static void display(Chessman chessman) {
        System.out.println("棋子：" + chessman.getLabel() + "，位置：(" + chessman.getX() + "," + chessman.getY() + ")");
    }

    // 下棋
    public static void play(Chessman chess) {
        // 保存备忘录
        caretaker.setMementos(chess.save());
        index++;
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    // 悔棋
    public static void undo(Chessman chess, int i) {
        System.out.println("******悔棋******");
        index--;
        // 撤销到上一个备忘录
        chess.restore(caretaker.getMementos(i - 1));
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    // 撤销悔棋
    public static void redo(Chessman chess, int i) {
        System.out.println("******撤销悔棋******");
        index++;
        // 恢复到下一个备忘录
        chess.restore(caretaker.getMementos(i + 1));
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }
}
