package view;

import controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Main
 * @author Mike Deiters
 * @version 1.0
 *
 * Description: FX application
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("blackwing.fxml"));
        Parent root = loader.load();
        Controller ctrl = loader.<Controller>getController();
        ctrl.setHostServices(this.getHostServices());
        primaryStage.setTitle("Blackwing");
        primaryStage.getIcons().add(new Image("/img/Icon.png"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


}