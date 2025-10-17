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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SignUpController implements Initializable {

    @FXML private TextField txt_suario;
    @FXML private PasswordField txt_clave;

    private UsuarioDao usuarioDao;
    @FXML
    private Pane pan_sing;
    @FXML
    private Label lbl_titulo;
    @FXML
    private Label lbl_usuario;
    @FXML
    private Label lbl_passkey;
    @FXML
    private Button btn_sesion;
    @FXML
    private ImageView img_info;
    @FXML
    private Button btn_registro;
    @FXML
    private Button btn_actualizar;

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
    private void iniciarSesion(ActionEvent event) {
        String nombreUsuario = txt_suario.getText().trim();
        String clave = txt_clave.getText();

        if (nombreUsuario.isEmpty() || clave.isEmpty()) {
            mostrarAlerta("Campos Vacíos", "Por favor, ingrese su usuario y contraseña.");
            return;
        }

        try {
            boolean esValido = usuarioDao.autenticar(nombreUsuario, clave);
            if (esValido) {
                mostrarAlerta("Éxito", "Inicio de sesión correcto.");
                navegarAHome(event);
            } else {
                mostrarAlerta("Acceso Denegado", "El usuario o la contraseña son incorrectos.");
            }
        } catch (Exception e) {
            mostrarAlerta("Error de Sistema", "Ocurrió un error al intentar iniciar sesión.");
            e.printStackTrace();
        }
    }

    @FXML
    private void irARegistro(ActionEvent event) throws IOException {
        cambiarEscena("Record.fxml", "Registro de Usuario", event);
    }

    @FXML
    private void irARecuperarClave(ActionEvent event) throws IOException {
        cambiarEscena("UpdatePassword.fxml", "Recuperar Contraseña", event);
    }

    private void navegarAHome(ActionEvent event) throws IOException {
        cambiarEscena("Home.fxml", "Dashboard Principal", event);
    }

    private void cambiarEscena(String fxml, String titulo, ActionEvent event) throws IOException {
        Parent nuevaVista = FXMLLoader.load(getClass().getResource(fxml));
        Scene nuevaEscena = new Scene(nuevaVista);
        Stage escenario = (Stage) ((Node) event.getSource()).getScene().getWindow();
        escenario.setTitle(titulo);
        escenario.setScene(nuevaEscena);
        escenario.centerOnScreen();
        escenario.show();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}