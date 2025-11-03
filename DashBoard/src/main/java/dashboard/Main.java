package dashboard;

import dao.UserDAO;

public class Main 
{
    public static void main(String[] args) 
    {
        //codigo nuevo
        try 
        {
            UserDAO userDAO = new UserDAO();
        } 
        catch (ClassNotFoundException e) 
        {

        } 
    }
}