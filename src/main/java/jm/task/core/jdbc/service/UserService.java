package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserService {
    UserDao userDaoHibernate = new UserDao() {
        @Override
        public void createUsersTable() {

        }

        @Override
        public void dropUsersTable() {

        }

        @Override
        public void saveUser(String name, String lastName, byte age) {

        }

        @Override
        public void removeUserById(long id) {

        }

        @Override
        public List<User> getAllUsers() {
            return List.of();
        }

        @Override
        public void cleanUsersTable() {

        }
    };
    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
