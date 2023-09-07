package org.readdata.dao;

import org.readdata.entity.Employee;

public interface EmployeeDao {

    public void saveEmployee(Employee emp);
    public void getDetailsOfEmployee(int empId);
    public void updateEmployee(int empId, int age);
    public boolean deleteEmployee(int empId);
}
