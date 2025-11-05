package dao;

import data_base.DataBaseConnection;
import java.sql.SQLException;

/**
 * Esta clase manejará las operaciones relacionadas con la persistencia de datos
 * Clase de acceso a datos para la entidad Usuario.
 */
public class UserDAO extends DAO
{
    public UserDAO() throws SQLException, ClassNotFoundException 
    {
        super();
    }

    // Aquí puedes agregar métodos específicos para 
    //manejar operaciones relacionadas con los usuarios
    public String validateUser(String email, String password) throws SQLException, ClassNotFoundException
    {
        statement = DataBaseConnection.GetConnection().createStatement();
        resultSet = statement.executeQuery
        (
            "SELECT * FROM Users WHERE email = " + " ' " + email
            + " ' " + "AND" + " password = " + " ' " + password + " ';"
        );

        if (resultSet != null) 
        {
            resultSet.next();
            return resultSet.getString("rol");
        }
        return null;
    }   
}