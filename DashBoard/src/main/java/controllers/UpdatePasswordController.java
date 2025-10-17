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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class UpdatePasswordController implements Initializable {

    @FXML private TextField txtUsuarioRecuperar;
    @FXML private PasswordField txtNuevaClave;
    @FXML private PasswordField txtConfirmarClave;
    @FXML private Button btnActualizar;
    @FXML private Button btnActualizar1;
    @FXML private ImageView img_info;

    private UsuarioDao dao;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            dao = new UsuarioDao();
        } catch (Exception e) {
            mostrarAlerta("Error Crítico", "No se pudo conectar con la base de datos.");
            e.printStackTrace();
        }
    }

    @FXML
    private void actualizarClave(ActionEvent event) {
        String nombreUsuario = txtUsuarioRecuperar.getText().trim();
        String nuevaClave = txtNuevaClave.getText();
        String confirmarClave = txtConfirmarClave.getText();

        if (nombreUsuario.isEmpty() || nuevaClave.isEmpty() || confirmarClave.isEmpty()) {
            mostrarAlerta("Campos Vacíos", "Por favor, rellene todos los campos.");
            return;
        }

        if (nuevaClave.length() < 4) {
            mostrarAlerta("Contraseña Inválida", "La contraseña debe tener al menos 4 caracteres.");
            return;
        }

        if (!nuevaClave.equals(confirmarClave)) {
            mostrarAlerta("Error", "Las nuevas contraseñas no coinciden.");
            return;
        }

        try {
            if (dao.existeUsuario(nombreUsuario)) {
                if (dao.actualizarClave(nombreUsuario, nuevaClave)) {
                    mostrarAlerta("Éxito", "Tu contraseña ha sido actualizada. Ya puedes iniciar sesión.");
                    irALogin(event);
                } else {
                    mostrarAlerta("Error", "No se pudo actualizar la contraseña.");
                }
            } else {
                mostrarAlerta("Usuario no Encontrado", "El nombre de usuario ingresado no existe.");
            }
        } catch (Exception e) {
            mostrarAlerta("Error de Sistema", "Ocurrió un error inesperado.");
            e.printStackTrace();
        }
    }

    @FXML
    private void irAInicio(ActionEvent event) {
        try {
            Parent loginView = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loginView));
            stage.setTitle("Iniciar Sesión");
            stage.centerOnScreen();
        } catch (IOException e) {
            mostrarAlerta("Error", "No se pudo cargar la pantalla de inicio.");
            e.printStackTrace();
        }
    }

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