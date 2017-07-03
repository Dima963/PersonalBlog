package net.blog.dao.PostgreImpl;

import net.blog.dao.AbstractJDBC;
import net.blog.dao.UserDAO;
import net.blog.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

class PostgreUserDAO extends AbstractJDBC<User,Integer> implements UserDAO {


    public String getCreateQuery() {

        return "INSERT INTO users(firstname, lastname, email, password) VALUES(?,?,?,?)" ;
    }

    public String getDeleteQuery() {
        return null;
    }

    public String getUpdateQuery() {
        return null;
    }

    public String getListQuery() {
        return null;
    }

    protected List<User> parseResultSet(ResultSet rs) {
        return null;
    }

    protected void preparedStatementForInsert(PreparedStatement statement, User object) throws SQLException {

        statement.setString(1, object.getName());
        statement.setString(2, object.getSurname());
        statement.setString(3, object.getEmail());
        statement.setString(4, object.getPassword());


    }

    protected void preparedStatementForDelete(PreparedStatement statement, User object) {

    }

    protected void preparedStatementForUpdate(PreparedStatement statement, User object) {

    }
}
