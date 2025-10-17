package com.mycompany.soporte;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RecordController implements Initializable {

    @FXML private TextField txt_suario;
    @FXML private PasswordField txt_clave;
    @FXML private PasswordField txt_confirmar_clave;

    private UsuarioDao usuarioDao;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         try {
            usuarioDao = new UsuarioDao();
        } catch (Exception e) {
            mostrarAlerta("Error Crítico", "No se pudo inicializar la conexión con la base de datos.");
            e.printStackTrace();
        }
    }

    @FXML
    private void registrarUsuario(ActionEvent event) {
        String nombreUsuario = txt_suario.getText().trim();
        String clave = txt_clave.getText();
        String confirmarClave = txt_confirmar_clave.getText();
        
        if (nombreUsuario.isEmpty() || clave.isEmpty() || confirmarClave.isEmpty()) {
            mostrarAlerta("Error", "Todos los campos son obligatorios.");
            return;
        }
        
        if (clave.length() < 4) {
            mostrarAlerta("Contraseña Inválida", "La contraseña debe tener al menos 4 caracteres.");
            return;
        }
        
        if (!clave.equals(confirmarClave)) {
            mostrarAlerta("Error", "Las contraseñas no coinciden.");
            return;
        }

        try {
            if (usuarioDao.existeUsuario(nombreUsuario)) {
                mostrarAlerta("Usuario Existente", "El nombre de usuario '" + nombreUsuario + "' ya está en uso.");
            } else {
                if (usuarioDao.altaUsuario(nombreUsuario, clave)) {
                    mostrarAlerta("Éxito", "Usuario registrado correctamente. Ahora puedes iniciar sesión.");
                    irALogin(event);
                } else {
                    mostrarAlerta("Error", "No se pudo registrar el usuario.");
                }
            }
        } catch (Exception e) {
            mostrarAlerta("Error de Sistema", "Ocurrió un error durante el registro.");
            e.printStackTrace();
        }
    }

    @FXML
    private void irALogin(ActionEvent event) throws IOException {
        Parent loginView = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loginView));
        stage.setTitle("Iniciar Sesión");
        stage.centerOnScreen();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}