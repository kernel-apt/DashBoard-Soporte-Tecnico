package com.mycompany.soporte;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class HomeController implements Initializable {

    @FXML
    private AnchorPane anchorp_home;
    @FXML
    private Pane pan_buscar;
    @FXML
    private ToggleButton togle_mode;
    @FXML
    private Label lbl_nombre_tec;
    @FXML
    private Label lbl_dark;
    @FXML
    private Label lbl_dash;
    @FXML
    private Button btn_buscar;
    @FXML
    private TextField txt_cliente;
    @FXML
    private ImageView img_dash_board;
    @FXML
    private ImageView img_dash;
    @FXML
    private ImageView img_soprote;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Pantalla Home cargada exitosamente!");
    }    
}