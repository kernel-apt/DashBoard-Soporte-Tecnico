package dashboard;

import dao.UserDAO;

public class Main 
{
    public static void main(String[] args) 
    {
        try 
        {
            UserDAO userDAO = new UserDAO();
            
            String rolName = userDAO.validateUser
            (
                "agent@uacm.edu.mx", 
                "agent123456"
            );

            System.out.println("Usuario actual = " + rolName);
        } 
        catch (Exception e) 
        {
            System.err.println("ERROR AL CREAR OBJETO UserDAO");
            System.err.println(e.getMessage());
        }
    }
}