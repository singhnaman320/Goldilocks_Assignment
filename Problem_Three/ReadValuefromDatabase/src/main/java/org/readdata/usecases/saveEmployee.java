package org.readdata.usecases;

import org.readdata.dao.EmployeeDao;
import org.readdata.dao.EmployeeDaoImpl;
import org.readdata.entity.Employee;

import java.util.Scanner;

public class saveEmployee {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter employee Id: ");
        int id = scanner.nextInt();

        System.out.println("Please enter employee name: ");
        String name= scanner.next();

        System.out.println("Please enter employee age: ");
        int age = scanner.nextInt();

        EmployeeDao dao= new EmployeeDaoImpl();

        Employee employees= new Employee(id, name,age);

        dao.saveEmployee(employees);

        System.out.println("Inserted successfully");

    }
}