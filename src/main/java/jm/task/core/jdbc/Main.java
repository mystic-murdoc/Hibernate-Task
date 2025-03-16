package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        // Создание таблицы
        userService.createUsersTable();
        // Добавление 4 пользователей
        userService.saveUser("Иван", "Иванов", (byte) 25);
        System.out.println("User с именем – Иван добавлен в базу данных");
        userService.saveUser("Мария", "Петрова", (byte) 30);
        System.out.println("User с именем – Мария добавлен в базу данных");
        userService.saveUser("Алексей", "Сидоров", (byte) 22);
        System.out.println("User с именем – Алексей добавлен в базу данных");
        userService.saveUser("Ольга", "Смирнова", (byte) 28);
        System.out.println("User с именем – Ольга добавлен в базу данных");

        // Получение всех пользователей и вывод
        for (User u : userService.getAllUsers()) {
            System.out.println(u);
        }
        // Очистка таблицы
        userService.cleanUsersTable();

        // Удаление таблицы
        userService.dropUsersTable();
    }
}