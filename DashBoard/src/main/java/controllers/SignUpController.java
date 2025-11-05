package controllers;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import dao.UserDAO;
import dashboard.DashBoard;
import data_base.DataBaseConnection;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * controlador de la vista SignUp que realiza
 * la validacion para inicio de sesion
 */
public class SignUpController implements Initializable
{
    @FXML private Pane pane;

    @FXML private Label lblTitle;
    @FXML private Label lblUser;
    @FXML private Label lblPasskey;

    @FXML private TextField txtUser;
    @FXML private TextField txtPasskey;

    @FXML private ToggleButton btnSignIn;

    public static String passkey = "";
    public static String email = "";

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private String query;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        try 
        {
            connection = DataBaseConnection.GetConnection();
        } 
        catch (SQLException | ClassNotFoundException e) 
        {
            ShowAlert
            (
                "Error en al establecer conexion con el servidor!!!", 
                "Se presento un problema interno...", 
                "Problema detectado", AlertType.ERROR
            );
        }
    }

    public void SignIn() throws SQLException, ClassNotFoundException, IOException
    {
        // DashBoard.setRoot
        // (
        //     "Home", 
        //     "Bienvenido ", 
        //     Screen.getPrimary().getVisualBounds().getWidth(), 
        //     Screen.getPrimary().getVisualBounds().getHeight() 
        // );

        if (txtUser.getText().equals("") || txtPasskey.getText().equals("")) 
        {
            ShowAlert
            (
                "No has ingresado alguno de los campos obligatorio...",
                "Mensaje Importante!!!",
                "Atencion!!!",
                AlertType.ERROR
            );
            return;
        }

        if (connection != null) 
        {   
            passkey = txtPasskey.getText();
            email = txtUser.getText();

            //usa objeto dao para separar la logica de datos de la de negocio
            UserDAO userDAO = new UserDAO();
            String rolName = userDAO.validateUser(email, passkey);
            
            if (rolName != null)
            {
                DashBoard.setRoot
                (
                    "Home", 
                    "Bienvenido ", 
                    1600.0, 
                    1200.0
                );
            }
        }         
    }
    
    private void ShowAlert(String content, String header, String title, AlertType type)
    {
        Alert alert = new Alert(type);
        alert.setContentText(content);
        alert.setHeaderText(header);
        alert.setTitle(title);
        alert.showAndWait();
    }
}