package com.hibernate.controllers;

import com.hibernate.models.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class FindingUser {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
    //    User u1 = new User("ammu nair","ammugn@gmail.com","ammupwd",30,70000,"mill creek");
    //   session.persist(u1);
        int id = 2;
        User u = session.get(User.class, id);
      //  User u=session.get()
        System.out.println("Fullname: " + u.getFullName());
        System.out.println("Email: " + u.getEmail());
        System.out.println("password: " + u.getPassword());

        //Close resources
        tx.commit();
        factory.close();
        session.close();
    }

}
