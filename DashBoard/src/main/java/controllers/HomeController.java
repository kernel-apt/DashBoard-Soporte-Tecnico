package com.mycompany.soporte;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class HomeController implements Initializable {

    // Asegúrate de que tu Home.fxml tenga un Label con fx:id="lbl_nombre_tec"
    @FXML
    private Label lbl_nombre_tec;

    private Usuario usuarioActual;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    /**
     * Recibe el objeto Usuario desde el controlador de login.
     * @param usuario El usuario que ha iniciado sesión.
     */
    public void inicializarDatos(Usuario usuario) {
        this.usuarioActual = usuario;
        
        // Actualizamos la etiqueta de bienvenida
        if (usuarioActual != null && lbl_nombre_tec != null) {
            lbl_nombre_tec.setText("Bienvenido, " + usuarioActual.getNombreUsuario() + " || Soporte Técnico");
        }
    }
}