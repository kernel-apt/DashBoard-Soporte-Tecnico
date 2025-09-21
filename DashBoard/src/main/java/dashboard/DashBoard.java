package dashboard;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DashBoard extends Application
{
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException 
    {
        scene = new Scene(loadFXML("login"), 500, 450);
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
     * @param heigh alto de la ventana
     */
    public static void setRoot(String fxml, String title, double width, double heigh) throws IOException 
    {
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
        scene.setRoot(loadFXML(fxml));
    }
    
    /**
     * cambia la escena actual por la que se le pase por parametro
     * @throws IOException regresa una excepcion si no halla la vista
     * @param fxml nombre de la vista
     */
    public static void setRoot(String fxml) throws IOException 
    {
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