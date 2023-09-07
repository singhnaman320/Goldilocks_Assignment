package org.readdata.EMUtility;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {

    private static EntityManagerFactory entityManagerFactory;

    static{

        entityManagerFactory= Persistence.createEntityManagerFactory("Employee");
    }

    public static EntityManager provideEntityManager(){

        EntityManager entityManager= entityManagerFactory.createEntityManager();

        return entityManager;
    }
}
