package dashboard;

import java.sql.Connection;

import dao.UserDAO;
import data_base.DataBaseConnection;

public class Main 
{
    public static void main(String[] args) 
    {
        try 
        {
            Connection connection = DataBaseConnection.GetConnection();
            // UserDAO userDAO = new UserDAO();
            // String rolName = userDAO.validateUser("agent@uacm.edu.mx", "agent123456");
            // System.out.println("\n Usuario actual = " + rolName);
        } 
        catch (Exception e) 
        {
            System.err.println("ERROR AL CREAR OBJETO UserDAO");
            System.err.println(e.getMessage());
        }
    }
}