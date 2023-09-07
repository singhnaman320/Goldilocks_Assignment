package org.readdata.usecases;

import org.readdata.dao.EmployeeDao;
import org.readdata.dao.EmployeeDaoImpl;

import java.util.Scanner;

public class getDetailsOfEmployee {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter employee Id to get details of given employee: ");
        int empId= scanner.nextInt();

        EmployeeDao dao= new EmployeeDaoImpl();
        dao.getDetailsOfEmployee(empId);
    }
}
