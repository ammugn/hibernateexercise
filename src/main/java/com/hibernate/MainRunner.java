package com.hibernate;

import com.hibernate.controllers.CreateUserTable;
import com.hibernate.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.util.List;

public class MainRunner {
    private static SessionFactory factory;
    public static void main(String[] args) {

        // create session factory
        try {
            factory = new Configuration()
                    .configure(new File("src/main/resources/hibernate.cfg.xml"))
                    .buildSessionFactory();
        } catch (Throwable ex){
            ex.printStackTrace();
        }

        Session s = factory.openSession();
        Transaction t = s.beginTransaction();
        CreateUserTable tableCreation=new CreateUserTable();


        s.close();




    } // main method
}
