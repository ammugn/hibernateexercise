package com.hibernate.controllers;

import com.hibernate.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import java.util.List;

public class CreatingUser {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session s = factory.openSession();

        Transaction t = s.beginTransaction();

        User u1 = new User("ammu nair","ammugn@gmail.com","ammupwd",30,70000,"mill creek");
        User u2 = new User("manu avinash","manuavinash@gmail.com","manupwd",32,90000,"bothell");
        User u3 = new User("arjun avinash","arjunavinash@gmail.com","arjunpwd",27,50000,"mill creek");
        User u4 = new User("rohan avinash","rohanavinash@gmail.com","rohanpwd",21,50000,"bothell");
        s.persist(u1);//equivalent to s.save
        s.persist(u2);
        s.persist(u3);
        s.persist(u4);

        t.commit();
        List<User> u = s.createQuery("from User").list();//query("hql",User.class);

        System.out.println("Added to user_details following data rows");
        System.out.println(u);
    }
}
