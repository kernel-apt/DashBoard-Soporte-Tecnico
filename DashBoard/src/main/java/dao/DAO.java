package dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Clase padre de los Dao
 * @author Cruz Sanchez Manuel
 */
public abstract class DAO
{
     protected Connection linkToDataBase;
     protected Statement statement;
     protected ResultSet resultSet;

     /**
      * Constructor de la clase Dao
      * @throws ClassNotFoundException
      * @throws SQLException 
      */
     public DAO() throws SQLException, ClassNotFoundException
     {
          linkToDataBase = DataBaseConnection.GetConnection();
          
          System.out.println
          (
          linkToDataBase.isValid(1000) ? 
          "CONECTADO A LA BASE DE DATOS" : 
          " FALLO LA CONEXION"
          );
     }
}