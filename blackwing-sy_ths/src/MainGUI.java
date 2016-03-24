import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.MediaException;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.File;
import java.util.ArrayList;

/**
 * Class: MainGUI
 * @author Mike Deiters
 * @version 1.0
 * March 23, 2016
 * ITEC 3860-01
 *
 * Description: TODO
 *
 * Purpose: TODO
 */

public class MainGUI extends Application {

    private final double WIDTH = 600;
    private final double HEIGHT = 400;
    private final double BUTTON_WIDTH = 50;
    private final double BUTTON_HEIGHT = 50;
    private Scene primaryScene;
    private Stage mainStage;
    private BorderPane pane;
    private GridPane btnGrid;
    private Data data;
    private ArrayList<Button> btns;
    private Label error;

    public void start( Stage primaryStage ) throws Exception {

        this.pane = new BorderPane();
        this.primaryScene = new Scene(this.pane, this.WIDTH, this.HEIGHT);
        this.mainStage = new Stage();
        this.mainStage.setTitle("Blackwing Sy_ths");
        this.mainStage.setScene(this.primaryScene);
        setup();
        btnActions();
        this.mainStage.show();

        this.mainStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle( WindowEvent event ) {

                mainStage.close();
            }
        });
    }

    /**
     * setup
     * Design and set up the ui
     */
    public void setup() {

        this.data = new Data();
        this.btnGrid = new GridPane();
        this.btnGrid.setHgap(10);
        this.btnGrid.setVgap(10);
        this.btns = new ArrayList<>();
        this.error = new Label();

        buildGrid();
        collectBtns();

        for ( int i = 0; i < this.btns.size(); i++ ) {

            this.btns.get(i).setMinWidth(this.BUTTON_WIDTH);
            this.btns.get(i).setMinHeight(this.BUTTON_HEIGHT);
        }

        this.pane.setCenter(this.btnGrid);
        this.pane.setBottom(this.error);
        this.pane.setPadding(new Insets(100, 200, 100, 200));
    }

    /**
     * buildGrid
     * Build the grid
     */
    public void buildGrid() {

        this.btnGrid.add(this.data.Qbtn, 0, 0);
        this.btnGrid.add(this.data.Wbtn, 0, 1);
        this.btnGrid.add(this.data.Ebtn, 0, 2);
        this.btnGrid.add(this.data.Abtn, 1, 0);
        this.btnGrid.add(this.data.Sbtn, 1, 1);
        this.btnGrid.add(this.data.Dbtn, 1, 2);
        this.btnGrid.add(this.data.Zbtn, 2, 0);
        this.btnGrid.add(this.data.Xbtn, 2, 1);
        this.btnGrid.add(this.data.Cbtn, 2, 2);
    }

    /**
     * collectBtns
     * Populate the btns arraylist
     */
    public void collectBtns() {

        this.btns.add(this.data.Qbtn);
        this.btns.add(this.data.Wbtn);
        this.btns.add(this.data.Ebtn);
        this.btns.add(this.data.Abtn);
        this.btns.add(this.data.Sbtn);
        this.btns.add(this.data.Dbtn);
        this.btns.add(this.data.Zbtn);
        this.btns.add(this.data.Xbtn);
        this.btns.add(this.data.Cbtn);
    }

    /**
     * btnActions
     * Add a event listeners to each of the buttons
     */
    public void btnActions() {

        for ( int i = 0; i < this.btns.size(); i++ ) {

            Button btn = this.btns.get(i);

            btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle( MouseEvent event ) {

                    selectFile(btn);
                }
            });
        }
    }

    private void selectFile(Button btn) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        fileChooser.setTitle("Select Music Bite");

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Music", "*.*"),
                new FileChooser.ExtensionFilter("MP3", "*.mp3"));

        try {
            File file = fileChooser.showOpenDialog(mainStage);
            btn.setSound(file);
            this.error.setText("");
        }
        catch ( NullPointerException npe ) {
            this.error.setText("No File Selected");
        }
        catch ( MediaException me ) {
            this.error.setText("Unsupported File Type");
        }
    }
}
