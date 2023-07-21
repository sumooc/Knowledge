package com.xiwei;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工列表类：对象结构
 */
public class EmployeeList {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // 遍历访问员工集合中的每一个员工对象
    public void accept(Department handler) {
        for (Employee employee : employees) {
            employee.accept(handler);
        }
    }
}
