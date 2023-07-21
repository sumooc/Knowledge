package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        Employee fulltimeEmployee1 = new FulltimeEmployee("张三", 3200.00, 45);
        Employee fulltimeEmployee2 = new FulltimeEmployee("李四", 2000.00, 40);
        Employee fulltimeEmployee3 = new FulltimeEmployee("王五", 2400.00, 38);
        Employee parttimeEmployee1 = new ParttimeEmployee("赵二", 80.00, 20);
        Employee parttimeEmployee2 = new ParttimeEmployee("刘一", 60.00, 18);

        EmployeeList employeeList=new EmployeeList();
        employeeList.addEmployee(fulltimeEmployee1);
        employeeList.addEmployee(fulltimeEmployee2);
        employeeList.addEmployee(fulltimeEmployee3);
        employeeList.addEmployee(parttimeEmployee1);
        employeeList.addEmployee(parttimeEmployee2);

        Department faDepartment = new FADepartment();
        employeeList.accept(faDepartment);
        System.out.println("---------------------------");

        Department hrDepartment = new HRDepartment();
        employeeList.accept(hrDepartment);
    }
}
