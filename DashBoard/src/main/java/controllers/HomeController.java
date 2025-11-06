package controllers;

import java.io.IOException;
import com.gluonhq.charm.glisten.control.AppBar;
import dashboard.DashBoard;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 * aqui va toda la logica del dashboard
 */
public class HomeController 
{
    @FXML private Pane pane;

    @FXML private ImageView imgViewDash;
    @FXML private ImageView imgViewLogo;
    
    @FXML private AppBar appBarDash;
 
    @FXML private Label lblAppBar;
    @FXML private Label lblSearch;
 
    @FXML private ToggleButton toggleBtnSearch;
    @FXML private Hyperlink hyperLink;
    
    public void CloseWindow() throws IOException
    {
        DashBoard.setRoot
        (
            "SignUp", 
            "Iniciar Sesion", 
            550, 
            600
        );
    }

    public void SearchForAccount() throws IOException
    {
        DashBoard.setRoot
        (
            "AccountDetail", 
            "Detalles del Cliente", 
            1700, 
            1030
        );
    }
}