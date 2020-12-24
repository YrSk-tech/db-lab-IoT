package com.syvak;

import com.syvak.view.View;
import com.syvak.util.HibernateUtil;
import org.hibernate.Session;

public class Application {
    public static void main(String[] args) {
        try (Session SESSION = HibernateUtil.getSession()) {
            System.out.println("Test session established. ");
            new View().show();
        } catch (Throwable ex) {
            System.err.println("Test session failed.");
            ex.printStackTrace();
        }
    }
}
