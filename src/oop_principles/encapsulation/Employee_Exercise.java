package oop_principles.encapsulation;

import java.util.ArrayList;

public class Employee_Exercise {
    public static void main(String[] args) {
        Company company1 = new Company("Tesla", "California", "123");
        Company company2 = new Company("US Bank", "Minnesota", "000");
        Company company3 = new Company("Verizon", "Texas", "111");

        Employee emp1 = new Employee("Andrii","Developer", 25, company1);
        Employee emp2 = new Employee("Yildiz", "System Architect", 23, company2);
        Employee emp3 = new Employee("Malek","Developer", 30, company3);
        Employee emp4 = new Employee("Saeed", "Manager", 35, company3);
        Employee emp5 = new Employee("Samir","Tester", 20, company2);
        Employee emp6 = new Employee("Viktoriya","Designer", 30,company2);
        Employee emp7 = new Employee("Ibrahim", "Designer", 2, company2);
        Employee emp8 = new Employee("Jeremiah","Scrum Master", 21, company2);
        Employee emp9 = new Employee("Olena","Tester", 29,company3);
        Employee emp10 = new Employee("Yoanna", "Tester", 23, company1);

        ArrayList <Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);
        employees.add(emp9);
        employees.add(emp10);
    }
}
