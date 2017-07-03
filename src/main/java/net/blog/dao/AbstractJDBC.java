package net.blog.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class AbstractJDBC<T, K> implements GenericDAO<T, K> {

    private Connection connection;

    public abstract String getCreateQuery();

    public abstract String getDeleteQuery();

    public abstract String getUpdateQuery();

    public abstract String getListQuery();

    protected abstract List<T> parseResultSet(ResultSet rs);

    protected abstract void  preparedStatementForInsert( PreparedStatement statement, T object) throws SQLException;

    protected abstract void  preparedStatementForDelete(PreparedStatement statement, T object);

    protected abstract void  preparedStatementForUpdate(PreparedStatement statement, T object);


    public void insert(T object) throws IOException, ClassNotFoundException {


        String sql = getCreateQuery();
        try {

            connection = ConnectDB.getConnnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            preparedStatementForInsert(statement, object);
            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void delete(T object) throws IOException, ClassNotFoundException {

        String sql = getDeleteQuery();
        try {
            connection = ConnectDB.getConnnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            preparedStatementForDelete(statement, object);
            statement.execute();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void update(T object) throws IOException, ClassNotFoundException {

        String sql = getUpdateQuery();

        try {
            connection = ConnectDB.getConnnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            preparedStatementForUpdate(statement, object);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public T getK(K id) {
        return null;
    }

    public List<T> getAll() throws IOException, ClassNotFoundException {
        List<T> list = null;
        String sql = getListQuery();
        try{
            connection = ConnectDB.getConnnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            list  = parseResultSet(rs);


        }catch(SQLException e) {
            e.printStackTrace();
        }
        
        return list;
}


}
