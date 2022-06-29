package com.hibernate.controllers;

import com.hibernate.models.User;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Log
public class CreateUserTable {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
     //   User uone = new User();
        t.commit();

        log.info("successfully created user table");
        factory.close();
        session.close();
        log.info("in test branch");

    }

}
