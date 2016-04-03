package view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.MediaException;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import model.Button;
import model.Data;

import java.io.File;
import java.util.ArrayList;

/**
 * Class: MainGUI
 * @author Mike Deiters
 * @version 1.0
 * March 23, 2016
 * ITEC 3860-01
 *
 * Description: Gui Interface for Blackwing Sy_ths
 *
 * Purpose: Create a javafx application
 */

public class MainGUI extends Application {

    private final double WIDTH = 800;
    private final double HEIGHT = 350;
    private final double BUTTON_WIDTH = 50;
    private final double BUTTON_HEIGHT = 50;
    private Scene primaryScene;
    private Stage mainStage;
    private BorderPane pane;
    private GridPane btnGrid;
    private Data data;
    private ArrayList<Button> btns;
    private Label error;

    /**
     * start
     * @param primaryStage Stage
     * @throws Exception
     * start the application
     */
    public void start( Stage primaryStage ) throws Exception {

        this.pane = new BorderPane();
        this.primaryScene = new Scene(this.pane, this.WIDTH, this.HEIGHT);
        this.mainStage = new Stage();
        this.mainStage.setTitle("Blackwing Sy_ths");
        this.mainStage.getIcons().add(new Image("/Icon.png"));
        this.mainStage.setScene(this.primaryScene);
        setup();
        btnActions();
        keyActions();
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
        this.pane.setPadding(new Insets(50, 100, 50, 100));
    }

    /**
     * buildGrid
     * Build the grid
     */
    public void buildGrid() {

        this.btnGrid.add(this.data.N1btn, 0, 0);
        this.btnGrid.add(this.data.N2btn, 1, 0);
        this.btnGrid.add(this.data.N3btn, 2, 0);
        this.btnGrid.add(this.data.N4btn, 3, 0);
        this.btnGrid.add(this.data.N5btn, 4, 0);
        this.btnGrid.add(this.data.N6btn, 5, 0);
        this.btnGrid.add(this.data.N7btn, 6, 0);
        this.btnGrid.add(this.data.N8btn, 7, 0);
        this.btnGrid.add(this.data.N9btn, 8, 0);
        this.btnGrid.add(this.data.N0btn, 9, 0);
        this.btnGrid.add(this.data.Qbtn, 0, 1);
        this.btnGrid.add(this.data.Wbtn, 1, 1);
        this.btnGrid.add(this.data.Ebtn, 2, 1);
        this.btnGrid.add(this.data.Rbtn, 3, 1);
        this.btnGrid.add(this.data.Tbtn, 4, 1);
        this.btnGrid.add(this.data.Ybtn, 5, 1);
        this.btnGrid.add(this.data.Ubtn, 6, 1);
        this.btnGrid.add(this.data.Ibtn, 7, 1);
        this.btnGrid.add(this.data.Obtn, 8, 1);
        this.btnGrid.add(this.data.Pbtn, 9, 1);
        this.btnGrid.add(this.data.Abtn, 0, 2);
        this.btnGrid.add(this.data.Sbtn, 1, 2);
        this.btnGrid.add(this.data.Dbtn, 2, 2);
        this.btnGrid.add(this.data.Fbtn, 3, 2);
        this.btnGrid.add(this.data.Gbtn, 4, 2);
        this.btnGrid.add(this.data.Hbtn, 5, 2);
        this.btnGrid.add(this.data.Jbtn, 6, 2);
        this.btnGrid.add(this.data.Kbtn, 7, 2);
        this.btnGrid.add(this.data.Lbtn, 8, 2);
        this.btnGrid.add(this.data.Zbtn, 1, 3);
        this.btnGrid.add(this.data.Xbtn, 2, 3);
        this.btnGrid.add(this.data.Cbtn, 3, 3);
        this.btnGrid.add(this.data.Vbtn, 4, 3);
        this.btnGrid.add(this.data.Bbtn, 5, 3);
        this.btnGrid.add(this.data.Nbtn, 6, 3);
        this.btnGrid.add(this.data.Mbtn, 7, 3);
    }

    /**
     * collectBtns
     * Populate the btns arraylist
     */
    public void collectBtns() {

        this.btns.add(this.data.N1btn);
        this.btns.add(this.data.N2btn);
        this.btns.add(this.data.N3btn);
        this.btns.add(this.data.N4btn);
        this.btns.add(this.data.N5btn);
        this.btns.add(this.data.N6btn);
        this.btns.add(this.data.N7btn);
        this.btns.add(this.data.N8btn);
        this.btns.add(this.data.N9btn);
        this.btns.add(this.data.N0btn);
        this.btns.add(this.data.Qbtn);
        this.btns.add(this.data.Wbtn);
        this.btns.add(this.data.Ebtn);
        this.btns.add(this.data.Rbtn);
        this.btns.add(this.data.Tbtn);
        this.btns.add(this.data.Ybtn);
        this.btns.add(this.data.Ubtn);
        this.btns.add(this.data.Ibtn);
        this.btns.add(this.data.Obtn);
        this.btns.add(this.data.Pbtn);
        this.btns.add(this.data.Abtn);
        this.btns.add(this.data.Sbtn);
        this.btns.add(this.data.Dbtn);
        this.btns.add(this.data.Fbtn);
        this.btns.add(this.data.Gbtn);
        this.btns.add(this.data.Hbtn);
        this.btns.add(this.data.Jbtn);
        this.btns.add(this.data.Kbtn);
        this.btns.add(this.data.Lbtn);
        this.btns.add(this.data.Zbtn);
        this.btns.add(this.data.Xbtn);
        this.btns.add(this.data.Cbtn);
        this.btns.add(this.data.Vbtn);
        this.btns.add(this.data.Bbtn);
        this.btns.add(this.data.Nbtn);
        this.btns.add(this.data.Mbtn);
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

    /**
     * keyActions
     * create the key event handlers
     */
    public void keyActions() {

        this.primaryScene.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
			@Override
            public void handle( KeyEvent event ) {

                switch ( event.getCode() ) {

                    case NUMPAD1: data.N1btn.playSound(); break;
                    case NUMPAD2: data.N2btn.playSound(); break;
                    case NUMPAD3: data.N3btn.playSound(); break;
                    case NUMPAD4: data.N4btn.playSound(); break;
                    case NUMPAD5: data.N5btn.playSound(); break;
                    case NUMPAD6: data.N6btn.playSound(); break;
                    case NUMPAD7: data.N7btn.playSound(); break;
                    case NUMPAD8: data.N8btn.playSound(); break;
                    case NUMPAD9: data.N9btn.playSound(); break;
                    case NUMPAD0: data.N0btn.playSound(); break;
                    case Q: data.Qbtn.playSound(); break;
                    case W: data.Wbtn.playSound(); break;
                    case E: data.Ebtn.playSound(); break;
                    case R: data.Rbtn.playSound(); break;
                    case T: data.Tbtn.playSound(); break;
                    case Y: data.Ybtn.playSound(); break;
                    case U: data.Ubtn.playSound(); break;
                    case I: data.Ibtn.playSound(); break;
                    case O: data.Obtn.playSound(); break;
                    case P: data.Pbtn.playSound(); break;
                    case A: data.Abtn.playSound(); break;
                    case S: data.Sbtn.playSound(); break;
                    case D: data.Dbtn.playSound(); break;
                    case F: data.Fbtn.playSound(); break;
                    case G: data.Gbtn.playSound(); break;
                    case H: data.Hbtn.playSound(); break;
                    case J: data.Jbtn.playSound(); break;
                    case K: data.Kbtn.playSound(); break;
                    case L: data.Lbtn.playSound(); break;
                    case Z: data.Zbtn.playSound(); break;
                    case X: data.Xbtn.playSound(); break;
                    case C: data.Cbtn.playSound(); break;
                    case V: data.Vbtn.playSound(); break;
                    case B: data.Bbtn.playSound(); break;
                    case N: data.Nbtn.playSound(); break;
                    case M: data.Mbtn.playSound(); break;
                    default: break;
                }
            }
        });
        this.primaryScene.setOnKeyReleased(new EventHandler<KeyEvent>()
        {
			@Override
            public void handle( KeyEvent event ) {

                switch ( event.getCode() ) {

                    case NUMPAD1: data.N1btn.stopSound(); break;
                    case NUMPAD2: data.N2btn.stopSound(); break;
                    case NUMPAD3: data.N3btn.stopSound(); break;
                    case NUMPAD4: data.N4btn.stopSound(); break;
                    case NUMPAD5: data.N5btn.stopSound(); break;
                    case NUMPAD6: data.N6btn.stopSound(); break;
                    case NUMPAD7: data.N7btn.stopSound(); break;
                    case NUMPAD8: data.N8btn.stopSound(); break;
                    case NUMPAD9: data.N9btn.stopSound(); break;
                    case NUMPAD0: data.N0btn.stopSound(); break;
                    case Q: data.Qbtn.stopSound(); break;
                    case W: data.Wbtn.stopSound(); break;
                    case E: data.Ebtn.stopSound(); break;
                    case R: data.Rbtn.stopSound(); break;
                    case T: data.Tbtn.stopSound(); break;
                    case Y: data.Ybtn.stopSound(); break;
                    case U: data.Ubtn.stopSound(); break;
                    case I: data.Ibtn.stopSound(); break;
                    case O: data.Obtn.stopSound(); break;
                    case P: data.Pbtn.stopSound(); break;
                    case A: data.Abtn.stopSound(); break;
                    case S: data.Sbtn.stopSound(); break;
                    case D: data.Dbtn.stopSound(); break;
                    case F: data.Fbtn.stopSound(); break;
                    case G: data.Gbtn.stopSound(); break;
                    case H: data.Hbtn.stopSound(); break;
                    case J: data.Jbtn.stopSound(); break;
                    case K: data.Kbtn.stopSound(); break;
                    case L: data.Lbtn.stopSound(); break;
                    case Z: data.Zbtn.stopSound(); break;
                    case X: data.Xbtn.stopSound(); break;
                    case C: data.Cbtn.stopSound(); break;
                    case V: data.Vbtn.stopSound(); break;
                    case B: data.Bbtn.stopSound(); break;
                    case N: data.Nbtn.stopSound(); break;
                    case M: data.Mbtn.stopSound(); break;
                    default: break;
                }
            }

        });
    }

    /**
     * selectFile
     * @param btn model.Button
     * select the music file to assign to button
     */
    private void selectFile( Button btn ) {

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
