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
import vo.Colmena;

public class ColmenaDAO
{
    private Connection connection;

    public ColmenaDAO()
    {
        connection = DbUtil.getConnection();
    }

    public void addUser(Colmena user)
    {
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into colmena(idColMadre, idApiario, cantidad, calidad, reina, proMiel, panAlimento, panCera, panCria, panVacio) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, user.getIdColMadre());
            preparedStatement.setInt(2, user.getIdApiario());
            preparedStatement.setInt(3, user.getCantidad());
            preparedStatement.setString(4, user.getCalidad());
            preparedStatement.setString(5, user.getReina());
            preparedStatement.setInt(6, user.getProMiel());
            preparedStatement.setInt(7, user.getPanAlimento());
            preparedStatement.setInt(8, user.getPanCera());
            preparedStatement.setInt(9, user.getPanCria());
            preparedStatement.setInt(10, user.getPanVacio());
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

    public void updateUser(Colmena user)
    {
        try 
        {
            PreparedStatement preparedStatement = connection.prepareStatement("update colmena set idColMadre=?, idApiario=?, cantidad=?, calidad=?, reina=?, proMiel=?, panAlimento=?, panCera=?, panCria=?, panVacio=?" + "where idCol=?");
            preparedStatement.setInt(1, user.getIdColMadre());
            preparedStatement.setInt(2, user.getIdApiario());
            preparedStatement.setInt(2, user.getIdSede());
            preparedStatement.setInt(3, user.getCantidad());
            preparedStatement.setString(4, user.getCalidad());
            preparedStatement.setString(5, user.getReina());
            preparedStatement.setInt(6, user.getProMiel());
            preparedStatement.setInt(7, user.getPanAlimento());
            preparedStatement.setInt(8, user.getPanCera());
            preparedStatement.setInt(9, user.getPanCria());
            preparedStatement.setInt(10, user.getPanVacio());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public List<Colmena> getAllUsers()
    {
        List<Colmena> users = new ArrayList<Colmena>();
        
        try
        {
            System.out.println("Llegue hasta aca");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from colmena");
            
            while (rs.next())
            {
                Colmena user = new Colmena();
                user.setIdColMadre(rs.getInt("idColMadre"));
                user.setIdApiario(rs.getInt("idApiario"));
                user.setCantidad(rs.getInt("cantidad"));
                user.setCalidad(rs.getString("calidad"));
                user.setReina(rs.getString("reina"));
                user.setIdApiario(rs.getInt("proMiel"));
                user.setIdApiario(rs.getInt("panAlimento"));
                user.setIdApiario(rs.getInt("panCera"));
                user.setIdApiario(rs.getInt("panCria"));
                user.setIdApiario(rs.getInt("panVacio"));
                users.add(user);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return users;
    }

    public Colmena getUserById(int idCol)
    {
        Colmena user = new Colmena();
        
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from colmena where idCol=?");
            preparedStatement.setInt(1, idCol);
            ResultSet rs = preparedStatement.executeQuery();
            
            if (rs.next())
            {
                user.setIdColMadre(rs.getInt("idColMadre"));
                user.setIdApiario(rs.getInt("idApiario"));
                user.setCantidad(rs.getInt("cantidad"));
                user.setCalidad(rs.getString("calidad"));
                user.setReina(rs.getString("reina"));
                user.setIdApiario(rs.getInt("proMiel"));
                user.setIdApiario(rs.getInt("panAlimento"));
                user.setIdApiario(rs.getInt("panCera"));
                user.setIdApiario(rs.getInt("panCria"));
                user.setIdApiario(rs.getInt("panVacio"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return user;
    }
}