package org.readdata.usecases;

import org.readdata.dao.EmployeeDao;
import org.readdata.dao.EmployeeDaoImpl;

import java.util.Scanner;

public class updateEmployee {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter employee Id: ");
        int empId= scanner.nextInt();

        System.out.println("Please enter age to be updated: ");
        int age= scanner.nextInt();

        EmployeeDao dao= new EmployeeDaoImpl();

        dao.updateEmployee(empId, age);
    }
}
