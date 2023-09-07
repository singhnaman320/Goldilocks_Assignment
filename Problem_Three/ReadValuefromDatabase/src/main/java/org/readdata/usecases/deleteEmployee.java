package org.readdata.usecases;

import org.readdata.dao.EmployeeDao;
import org.readdata.dao.EmployeeDaoImpl;

import java.util.Scanner;

public class deleteEmployee {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter employee Id to delete the employee details: ");
        int empId= scanner.nextInt();

        EmployeeDao dao= new EmployeeDaoImpl();
        dao.deleteEmployee(empId);
    }
}
