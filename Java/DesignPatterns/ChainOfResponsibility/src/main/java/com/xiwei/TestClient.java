package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        Approver director = new Director("张三(主任)");
        Approver viccePresident = new ViccePresident("李四(副董事长)");
        Approver president = new President("王五(董事长)");
        Approver congress = new Congress("董事会");

        // 创建职责链
        director.setSuccessor(viccePresident);
        viccePresident.setSuccessor(president);
        president.setSuccessor(congress);

        //创建采购单
        PurchaseRequest request1 = new PurchaseRequest(45000, 10001, "买咸鱼");
        director.processRequest(request1);

        //创建采购单
        PurchaseRequest request2 = new PurchaseRequest(60000, 10002, "买棒槌");
        director.processRequest(request2);

        //创建采购单
        PurchaseRequest request3 = new PurchaseRequest(160000, 10003, "买螺丝");
        director.processRequest(request3);

        //创建采购单
        PurchaseRequest request4 = new PurchaseRequest(800000, 10004, "买榔头");
        director.processRequest(request4);
    }
}
