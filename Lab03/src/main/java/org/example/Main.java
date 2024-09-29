package org.example;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        session = HibernateUtil.getSessionFactory("hibernate.properties");
    }
}