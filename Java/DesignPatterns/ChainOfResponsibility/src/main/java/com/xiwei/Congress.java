package com.xiwei;

/**
 * 董事会类：具体处理者
 */
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    // 具体请求处理方法
    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + name + "审批采购单：" + request.getNumber() + "，金额："
                + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");
    }
}
