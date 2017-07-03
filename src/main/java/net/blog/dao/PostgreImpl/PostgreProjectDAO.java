package net.blog.dao.PostgreImpl;

import net.blog.dao.AbstractJDBC;
import net.blog.dao.ProjectDAO;
import net.blog.model.Project;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class PostgreProjectDAO extends AbstractJDBC<Project,Integer> implements ProjectDAO {

    public String getCreateQuery() {
        return "INSERT INTO projects(name, description) VALUES(?,?)" ;

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

    protected List<Project> parseResultSet(ResultSet rs) {
        LinkedList<Project> result = new LinkedList<Project>();
        try {
            while (rs.next()) {
                Project project = new Project(); // точка подмены реализации Group
                project.setId(rs.getInt("ID"));
                project.setName(rs.getString("NAME"));
                project.setDescription(rs.getString("DESCRIPTION"));
                result.add(project);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    protected void preparedStatementForInsert(PreparedStatement statement, Project object) throws SQLException {

        statement.setString(1, object.getName());
        statement.setString(2, object.getDescription());

    }

    protected void preparedStatementForDelete(PreparedStatement statement, Project object) {

    }

    protected void preparedStatementForUpdate(PreparedStatement statement, Project object) {

    }
}
