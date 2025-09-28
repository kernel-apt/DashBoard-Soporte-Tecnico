/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.soporte;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author javij
 */
public class IncidencesController implements Initializable {

    @FXML
    private AnchorPane anchorp_incidencias;
    @FXML
    private Pane pan_incidencias;
    @FXML
    private Label lbl_soporte;
    @FXML
    private Button btn_busqueda;
    @FXML
    private TableView<?> table_visitas;
    @FXML
    private ImageView img_lupa;
    @FXML
    private TableView<?> table_telefonia;
    @FXML
    private TableView<?> table_internet;
    @FXML
    private TableView<?> table_television;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
