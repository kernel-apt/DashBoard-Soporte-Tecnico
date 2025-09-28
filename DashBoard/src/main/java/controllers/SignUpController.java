package com.mycompany.soporte;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controlador para la vista SignUp.fxml.
 * <p>
 * Gestiona la lógica de la interfaz de usuario para el inicio de sesión y el registro.
 * Captura la entrada del usuario, se comunica con el {@link UsuarioDao} para las
 * operaciones de base de datos y maneja la navegación a la siguiente pantalla.
 *
 * @author javis
 */
public class SignUpController implements Initializable {

    @FXML
    private TextField txt_suario;
    @FXML
    private TextField txt_clave;
    @FXML
    private Button btn_sesion;

    /**
     * Inicializa el controlador. Este método es llamado automáticamente
     * después de que el archivo FXML ha sido cargado.
     *
     * @param url La ubicación utilizada para resolver rutas relativas.
     * @param rb Los recursos utilizados para localizar el objeto raíz.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    /**
     * Maneja el evento del botón "Iniciar Sesión".
     * Valida las credenciales del usuario y navega a la pantalla principal si son correctas.
     *
     * @param event El evento de acción generado por el clic del botón.
     */
    @FXML
    private void iniciarSesion(ActionEvent event) {
        String nombreUsuario = txt_suario.getText();
        String clave = txt_clave.getText();

        if (nombreUsuario.isEmpty() || clave.isEmpty()) {
            mostrarAlerta("Campos Vacíos", "Por favor, ingrese usuario y contraseña.");
            return;
        }

        try {
            UsuarioDao dao = new UsuarioDao();
            Usuario usuarioAutenticado = dao.autenticar(nombreUsuario, clave);

            if (usuarioAutenticado != null) {
                usuarioAutenticado.setPassword(clave);
                System.out.println("Login exitoso: " + usuarioAutenticado);
                navegarAHome(usuarioAutenticado);
            } else {
                mostrarAlerta("Acceso Denegado", "Usuario o contraseña incorrectos.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            mostrarAlerta("Error de Sistema", "No se pudo conectar a la base de datos.");
        }
    }

    /**
     * Maneja el evento del botón para registrar un nuevo usuario.
     * Crea un nuevo registro en la base de datos con los datos proporcionados.
     *
     * @param event El evento de acción generado por el clic del botón.
     */
    @FXML
    private void registrarNuevoUsuario(ActionEvent event) {
        String nombreUsuario = txt_suario.getText();
        String clave = txt_clave.getText();

        if (nombreUsuario.isEmpty() || clave.isEmpty()) {
            mostrarAlerta("Campos Vacíos", "Para registrar, ingrese un nuevo usuario y contraseña.");
            return;
        }

        try {
            UsuarioDao dao = new UsuarioDao();
            if (dao.altaUsuario(nombreUsuario, clave)) {
                mostrarAlerta("Registro Exitoso", "El usuario '" + nombreUsuario + "' ha sido creado.");
            } else {
                mostrarAlerta("Error de Registro", "No se pudo crear el usuario.");
            }
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) { // Código de error MySQL para "Entrada duplicada"
                mostrarAlerta("Usuario Existente", "El nombre de usuario '" + nombreUsuario + "' ya está en uso.");
            } else {
                e.printStackTrace();
                mostrarAlerta("Error de Base de Datos", "Ocurrió un error al registrar.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            mostrarAlerta("Error de Sistema", "Error crítico en la conexión.");
        }
    }

    /**
     * Navega a la pantalla principal (Home.fxml) después de un inicio de sesión exitoso.
     * Carga la nueva vista, obtiene su controlador y le pasa el objeto del usuario autenticado.
     *
     * @param usuario El objeto {@link Usuario} que ha sido autenticado.
     */
    private void navegarAHome(Usuario usuario) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
            Parent homeView = loader.load();

            HomeController homeController = loader.getController();
            homeController.inicializarDatos(usuario);

            Stage stage = (Stage) btn_sesion.getScene().getWindow();
            stage.setScene(new Scene(homeView));
            stage.setTitle("Dashboard Principal");
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlerta("Error de Carga", "No se pudo cargar la pantalla principal.");
        }
    }

    /**
     * Muestra un cuadro de diálogo de alerta genérico.
     *
     * @param titulo El título de la ventana de alerta.
     * @param mensaje El contenido del mensaje de alerta.
     */
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}