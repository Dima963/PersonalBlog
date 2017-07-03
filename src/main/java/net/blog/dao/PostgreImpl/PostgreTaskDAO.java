package net.blog.dao.PostgreImpl;

import net.blog.dao.AbstractJDBC;
import net.blog.dao.TaskDAO;
import net.blog.model.Task;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PostgreTaskDAO extends AbstractJDBC<Task, Integer> implements TaskDAO {

    public String getCreateQuery() {
        return "INSERT INTO task(title, name) VALUES(?,?)" ;
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

    protected List<Task> parseResultSet(ResultSet rs) {
        return null;
    }

    protected void preparedStatementForInsert(PreparedStatement statement, Task object) throws SQLException {

        statement.setString(1, object.getTitle());
        statement.setString(2, object.getName());

    }

    protected void preparedStatementForDelete(PreparedStatement statement, Task object) {

    }

    protected void preparedStatementForUpdate(PreparedStatement statement, Task object) {

    }
}
