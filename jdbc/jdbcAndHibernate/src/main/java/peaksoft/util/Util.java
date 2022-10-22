package peaksoft.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import peaksoft.model.User;

import java.util.Properties;

public class Util {
    // реализуйте настройку соеденения с БД

    //    public static SessionFactory getSessionFactory() {
//        Properties settings = new Properties();
//        settings.put(Environment.DRIVER, "org.postgresql.Driver");
//        settings.put(Environment.URL, "jdbc:postgresql://localhost:2022/postgres");
//        settings.put(Environment.USER, "postgres");
//        settings.put(Environment.PASS, "081262");
//        settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
//        settings.put(Environment.SHOW_SQL, "true");
//        settings.put(Environment.HBM2DDL_AUTO, "create");//validate //create
//
//
//        Configuration configuration = new Configuration();
//        configuration.addProperties(settings);
//        configuration.addAnnotatedClass(User.class);
//
//        return configuration.buildSessionFactory();
//    }
//
//    public static EntityManagerFactory entityManagerFactory() {
//        return Persistence.createEntityManagerFactory("peaksoft");
//    }
    private static final SessionFactory sessionFactory = createsessionFactory();

    public static SessionFactory createsessionFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "org.postgresql.Driver");
        properties.put(Environment.URL, "jdbc:postgresql://localhost:2022/postgres");
        properties.put(Environment.USER, "postgres");
        properties.put(Environment.PASS, "081262");
        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        properties.put(Environment.SHOW_SQL, "true");

        Configuration configuration = new Configuration();
        configuration.addProperties(properties);
        configuration.addAnnotatedClass(User.class);

        return configuration.buildSessionFactory();
    }

    public static EntityManagerFactory createEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("peaksoft");
    }
}