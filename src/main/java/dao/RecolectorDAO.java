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
import vo.Recolector;

public class RecolectorDAO
{
    private Connection connection;

    public RecolectorDAO()
    {
        connection = DbUtil.getConnection();
    }

    public void addUser(Recolector user)
    {
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into recolector(nombre, fabrica) values (?, ?)");
            preparedStatement.setString(1, user.getNombre());
            preparedStatement.setString(2, user.getFabrica());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void deleteUser(int idRecolector)
    {
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from recolector where idRecolector=?");
            preparedStatement.setInt(1, idRecolector);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void updateUser(Recolector user)
    {
        try 
        {
            PreparedStatement preparedStatement = connection.prepareStatement("update recolector set nombre=?, fabrica=?" + "where idRecolector=?");
            preparedStatement.setString(1, user.getNombre());
            preparedStatement.setString(2, user.getFabrica());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public List<Recolector> getAllUsers()
    {
        List<Recolector> users = new ArrayList<Recolector>();
        
        try
        {
            System.out.println("Llegue hasta aca");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from recolector");
            
            while (rs.next())
            {
                Recolector user = new Recolector();
                user.setNombre(rs.getString("calidad"));
                user.setFabrica(rs.getString("reina"));
                users.add(user);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return users;
    }

    public Recolector getUserById(int idRecolector)
    {
        Recolector user = new Recolector();
        
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from recolector where idRecolector=?");
            preparedStatement.setInt(1, idRecolector);
            ResultSet rs = preparedStatement.executeQuery();
            
            if (rs.next())
            {
                user.setNombre(rs.getString("calidad"));
                user.setFabrica(rs.getString("reina"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return user;
    }
}