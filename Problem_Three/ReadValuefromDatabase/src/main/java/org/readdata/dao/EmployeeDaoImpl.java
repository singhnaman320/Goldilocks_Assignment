package org.readdata.dao;

import jakarta.persistence.EntityManager;
import org.readdata.EMUtility.EMUtil;
import org.readdata.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void saveEmployee(Employee emp) {


        EntityManager entityManager= EMUtil.provideEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(emp);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void getDetailsOfEmployee(int empId) {

        EntityManager entityManager= EMUtil.provideEntityManager();

        Employee employee= entityManager.find(Employee.class,empId);

        if(employee != null){

            System.out.println(employee.getEmployeeName());
            System.out.println(employee.getEmployeeAge());

        }else{

            System.out.println("Sorry...! Unable to find any details with this employee Id..");
            entityManager.close();
        }
    }

    @Override
    public void updateEmployee(int empId, int age) {

        EntityManager entityManager= EMUtil.provideEntityManager();

        Employee employee= entityManager.find(Employee.class, empId);

        if(employee == null){

            System.out.println("Bonus not provided yet..!");

        }else{

            entityManager.getTransaction().begin();

            employee.setEmployeeAge(employee.getEmployeeAge()+age);

            entityManager.getTransaction().commit();

            System.out.println("Your updated age is: "+employee.getEmployeeAge());

        }
        entityManager.close();
    }

    @Override
    public boolean deleteEmployee(int empId) {

        boolean value= false;

        EntityManager entityManager= EMUtil.provideEntityManager();

        Employee employee= entityManager.find(Employee.class, empId);

        if(employee != null){

            value= true;

            entityManager.getTransaction().begin();

            entityManager.remove(employee);

            entityManager.getTransaction().commit();

            System.out.println("Successfully deleted all the details with given Id: ");

        }else{

            System.out.println("Sorry..! Unable to delete employee with given Id or check if given Id is present or not..! ");
            entityManager.close();
        }
        return value;
    }
}
