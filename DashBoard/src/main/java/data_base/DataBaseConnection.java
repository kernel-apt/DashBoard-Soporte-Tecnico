package data_base;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Properties;

/**
 * Clase para la conexion a la base de datos
 * @author Cruz Sanchez Manuel
 */
public class DataBaseConnection 
{     
      //el objeto properties para almacenar las propiedades de la conexion    
      private static Properties properties = new Properties();
      // el objeto dbConnection almacena la conexion a la base de datos
      public static Connection dbConnection = null;

      /**
       * Metodo para obtener la conexion a la base de datos
       * @return la conexion a la base de datos
       * @throws ClassNotFoundException
       * @throws SQLException
       */
      public static Connection GetConnection() throws ClassNotFoundException, SQLException
      {
            properties.setProperty("url", "jdbc:mysql://localhost:3306/db_tech_support");
            properties.setProperty("password", "xml123456");
            properties.setProperty("user", "root");

            try
            {     
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  
                  dbConnection = DriverManager.getConnection
                  (
                        properties.getProperty("password"),
                        properties.getProperty("user"),
                        properties.getProperty("url")
                  );
            } 
            catch (Exception e)
            {     
                  System.out.println(e.getMessage());
            }

            return dbConnection;
      }
}