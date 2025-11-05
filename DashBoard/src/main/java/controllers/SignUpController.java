package controllers;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        
    }

    public void SignIn() throws SQLException, ClassNotFoundException, IOException
    {
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

        if (DataBaseConnection.GetConnection() != null) 
        {   
            String passkey = txtPasskey.getText();
            String email = txtUser.getText();

            //usa objeto dao para separar la logica de datos de la de negocio
            UserDAO userDAO = new UserDAO();
            String rolName = userDAO.validateUser(email, passkey);
            
            if (rolName != null)
            {
                DashBoard.setRoot
                (
                    "Home", 
                    "Bienvenido ", 
                    1700.0, 
                    1100.0
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