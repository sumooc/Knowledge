package com.xiwei.dynamicproxy;

/**
 * 具体UserDAO：真实角色
 */
public class DocumentDAO implements AbstractDocumentDAO {
    @Override
    public Boolean deleteDocumentById(String documentId) {
        if (documentId.equalsIgnoreCase("D1")) {
            System.out.println("删除ID为" + documentId + "的文档信息成功！");
            return true;
        } else {
            System.out.println("删除ID为" + documentId + "的文档信息失败！");
            return false;
        }
    }
}
