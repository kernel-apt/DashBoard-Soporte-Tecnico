package controllers;

import dashboard.DashBoard;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import org.controlsfx.control.ToggleSwitch;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.control.TextField;
import com.gluonhq.charm.glisten.control.TextArea;

public class AccountDetailController implements Initializable
{
    @FXML private Pane pane;

    @FXML private ImageView imgViewLogo;
    
    @FXML private AppBar appBarDash;
 
    @FXML private Label lblAppBar;
    @FXML private TextField txtSearch;
 
    @FXML private ToggleButton toggleBtnSearch;

    @FXML private ToggleSwitch toggleDarkMode;

    @FXML private Hyperlink hyperLink;

    @FXML private ImageView imgViewRegistry;

    @FXML private Pane paneTicket;
    
    @FXML private Label lblArea;
    @FXML private Label lblService;
    @FXML private Label lblIssue;
    @FXML private Label lblSolution;

    @FXML private SplitMenuButton spMenuAreas;
    @FXML private SplitMenuButton spMenuServices;
    @FXML private SplitMenuButton spMenuIssues;
    @FXML private SplitMenuButton spMenuSolutions;

    @FXML private TextArea txtTicketDescription;
    
    @FXML private MFXButton btnRegister;

    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        toggleDarkMode.setOnMouseClicked
        (
            e ->
            {
                if (toggleDarkMode.isSelected()) 
                {
                    pane.getStylesheets().add(getClass().getResource
                    (
                        "/css/darkmode.css").toExternalForm()
                    );
                    DashBoard.dark = true;
                }
                else
                {
                    pane.getStylesheets().clear();
                    pane.getStylesheets().add(getClass().getResource
                    (
                        "/css/account.css").toExternalForm()
                    );
                    DashBoard.dark = false;
                }
            }
        );
    }

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