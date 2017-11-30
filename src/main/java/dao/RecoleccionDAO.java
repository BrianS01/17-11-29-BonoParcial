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
import vo.Recoleccion;

public class RecoleccionDAO
{
    private Connection connection;

    public RecoleccionDAO()
    {
        connection = DbUtil.getConnection();
    }

    public void addUser(Recoleccion user)
    {
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into colmena(nombre) values (?)");
            preparedStatement.setInt(1, user.getIdRecolector());
            preparedStatement.setInt(2, user.getIdCol());
            preparedStatement.setString(3, user.getFecha());
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

    public void updateUser(Recoleccion user)
    {
        try 
        {
            PreparedStatement preparedStatement = connection.prepareStatement("update colmena set nombre=?" + "where idCol=?");
            preparedStatement.setInt(1, user.getIdRecolector());
            preparedStatement.setInt(2, user.getIdCol());
            preparedStatement.setString(3, user.getFecha());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public List<Recoleccion> getAllUsers()
    {
        List<Recoleccion> users = new ArrayList<Recoleccion>();
        
        try
        {
            System.out.println("Llegue hasta aca");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from colmena");
            
            while (rs.next())
            {
                Recoleccion user = new Recoleccion();
                user.setIdRecolector(rs.getInt("idColMadre"));
                user.setIdCol(rs.getInt("idApiario"));
                user.setFecha(rs.getString("calidad"));
                users.add(user);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return users;
    }

    public Recoleccion getUserById(int idCol)
    {
        Recoleccion user = new Recoleccion();
        
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from colmena where idCol=?");
            preparedStatement.setInt(1, idCol);
            ResultSet rs = preparedStatement.executeQuery();
            
            if (rs.next())
            {
                user.setIdRecolector(rs.getInt("idColMadre"));
                user.setIdCol(rs.getInt("idApiario"));
                user.setFecha(rs.getString("calidad"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return user;
    }
}