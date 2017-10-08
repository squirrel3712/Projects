package com.company;

import java.sql.*;
import java.util.List;

public class UserDAO extends AbstractDAO<Integer, User> {
    private static final String FIND_ALL = "SELECT * FROM user";
    private static final String FIND_BY_ID = "SELECT * FROM user WHERE id =?";
    private static final String DELETE_BY_ID = "DELETE FROM user WHERE id = ?";
    private static final String DELETE_BY_LOGIN = "DELETE FROM user WHERE login = ?";
    private static final String INSERT = "INSERT INTO user(password, login) VALUES(?,?)";
    private static final String UPDATE = "UPDATE  user set password =?,login=? WHERE id=?";

    @Override
    public List<User> findAll() {
        List<User> users = null;
        try (Connection connection = ConectorDB.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(FIND_ALL)) {
            while (resultSet.next()) {
                String password = resultSet.getString(1);
                String login = resultSet.getString(2);
                users.add(new User(password, login, new Bin()));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User findEntityById(Integer id) {
        List<User> users = null;
        try (Connection connection = ConectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(FIND_BY_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String password = rs.getString(1);
                String login = rs.getString(2);
                return new User(password, login, new Bin());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        try (Connection connection = ConectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            if (statement.executeUpdate(DELETE_BY_ID) == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(User entity) {
        try (Connection connection = ConectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            if (statement.executeUpdate(DELETE_BY_LOGIN) == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean create(User user) {
        try (Connection connection = ConectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setString(1, user.getPassword());
            statement.setString(2, user.getLogin());
            if (statement.execute()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User update(User entity, Integer id) {
        List<User> users = null;
        try (Connection connection = ConectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE)) {
            statement.setString(1, entity.getPassword());
            statement.setString(2, entity.getLogin());
            statement.setInt(3, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String password = rs.getString(1);
                String login = rs.getString(2);
                return new User(password, login, new Bin());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}
