/*
 *  PARCIAL TERCER CORTE
 *      Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DbUtil;
import vo.Revision;

public class RevisionDAO
{
    private Connection connection;

    public RevisionDAO()
    {
        connection = DbUtil.getConnection();
    }

    public void addUser(Revision user)
    {
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into colmena(nombre) values (?)");
            preparedStatement.setString(1, user.getFecha());
            preparedStatement.setString(2, user.getDescripcion());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void deleteUser(int idCol)
    {
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from colmena where idCol=?");
            preparedStatement.setInt(1, idCol);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void updateUser(Revision user)
    {
        try 
        {
            PreparedStatement preparedStatement = connection.prepareStatement("update colmena set nombre=?" + "where idCol=?");
            preparedStatement.setString(1, user.getFecha());
            preparedStatement.setString(2, user.getDescripcion());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public List<Revision> getAllUsers()
    {
        List<Revision> users = new ArrayList<Revision>();
        
        try
        {
            System.out.println("Llegue hasta aca");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from colmena");
            
            while (rs.next())
            {
                Revision user = new Revision();
                user.setFecha(rs.getString("calidad"));
                user.setDescripcion(rs.getString("reina"));
                users.add(user);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return users;
    }

    public Revision getUserById(int idCol)
    {
        Revision user = new Revision();
        
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from colmena where idCol=?");
            preparedStatement.setInt(1, idCol);
            ResultSet rs = preparedStatement.executeQuery();
            
            if (rs.next())
            {
                user.setFecha(rs.getString("calidad"));
                user.setDescripcion(rs.getString("reina"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return user;
    }
}