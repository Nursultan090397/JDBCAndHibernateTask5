package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        //   userDao.createUsersTable();
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
       userDaoHibernate.createUsersTable();

        userDaoHibernate.saveUser("Nursultan", "Osorov", (byte)25);
       userDaoHibernate.saveUser("Bekzad", "Sarybaev", (byte) 30);
      userDaoHibernate.saveUser("Nurgazy", "Baetov", (byte) 29);
      userDaoHibernate.saveUser("Mederbek", "Baitov", (byte) 35);

    /* System.out.println(userService.getAllUsers());*/

     //userService.cleanUsersTable();

        //userService.dropUsersTable();
    }
}