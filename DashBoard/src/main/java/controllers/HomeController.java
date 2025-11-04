package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.control.Avatar;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 * aqui va toda la logica del dashboard
 */
public class HomeController implements Initializable 
{
    @FXML private Pane pane;

    @FXML private ImageView imgViewDash;
    @FXML private ImageView imgViewLogo;
    
    @FXML private AppBar appBarDash;
 
    @FXML private Label lblAppBar;
    @FXML private Label lblSearch;
 
    @FXML private ToggleButton toggleBtnSearch;
    
    @FXML private Avatar avatar;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        
    }
}