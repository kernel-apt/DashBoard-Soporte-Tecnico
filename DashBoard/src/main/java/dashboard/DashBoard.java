package dashboard;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;  
import javafx.stage.Stage;

public class DashBoard extends Application
{
    public static Boolean dark = false;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException 
    {
        scene = new Scene(loadFXML("SignUp"), 550, 600);
        stage.setTitle("Iniciar Sesion");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }

    /**
     * cambia la escena actual por la que se le pase por parametro
     * @throws IOException regresa una excepcion si no halla la vista
     * @param fxml nombre de la vista
     * @param title titulo de la ventana
     * @param width ancho de la ventana
     * @param height alto de la ventana
     */
    public static void setRoot(String fxml, String title, double width, double height) throws IOException 
    {
        ((Stage) scene.getWindow()).setTitle(title);
        scene.getWindow().setWidth(width);
        scene.getWindow().setHeight(height);
        scene.getWindow().centerOnScreen();
        ((Stage) scene.getWindow()).setResizable(false);
        scene.setRoot(loadFXML(fxml));
    }
    
    /**
     * cambia la escena actual por la que se le pase por parametro
     * @throws IOException regresa una excepcion si no halla la vista
     * @param fxml nombre de la vista
     * @param title titulo de la ventana
     */
    public static void setRoot(String fxml, String title) throws IOException 
    {
        ((Stage) scene.getWindow()).setTitle(title);
        scene.getWindow().centerOnScreen();
        ((Stage) scene.getWindow()).setResizable(false);
        scene.setRoot(loadFXML(fxml));
    }
    
    /**
     * cambia la escena actual por la que se le pase por parametro
     * @throws IOException regresa una excepcion si no halla la vista
     * @param fxml nombre de la vista
     */
    public static void setRoot(String fxml) throws IOException 
    {
        scene.getWindow().centerOnScreen();
        ((Stage) scene.getWindow()).setResizable(false);
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException 
    {
        FXMLLoader fxmlLoader = new FXMLLoader(
            
        DashBoard.class.getResource("/views/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    public static void main(String[] args) 
    {
        launch();
    }
}