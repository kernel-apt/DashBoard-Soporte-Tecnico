package dao;

import data_base.DataBaseConnection;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Clase padre de los Dao
 * @author Cruz Sanchez Manuel
 */
public class Dao
{
     protected Connection linkToDataBase;
     protected ResultSet resultSet;

     /**
      * Constructor de la clase Dao
      * @throws ClassNotFoundException
      * @throws SQLException 
      */
     public Dao() throws SQLException, ClassNotFoundException
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