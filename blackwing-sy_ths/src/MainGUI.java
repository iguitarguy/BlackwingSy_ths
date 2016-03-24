import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

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

    private double WIDTH = 1000;
    private double HEIGHT = 500;
    private double BUTTON_WIDTH = 100;
    private double BUTTON_HEIGHT = 100;
    private Scene primaryScene;
    private Stage mainStage;
    private BorderPane pane;
    private GridPane btnGrid;
    private Data data;
    private BindPopUp bind;
    private ArrayList< Button > btns;

    public void start( Stage args ) {

        this.pane = new BorderPane();
        this.primaryScene = new Scene(this.pane, this.WIDTH, this.HEIGHT);
        this.mainStage = new Stage();
        this.mainStage.setTitle("Blackwing Sy_ths");
        this.mainStage.setScene(this.primaryScene);
        setup();
        btnActions();
        this.mainStage.show();
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
        this.bind = new BindPopUp();

        buildGrid();
        collectBtns();

        for ( int i = 0; i < this.btns.size(); i++ ) {

            this.btns.get(i).setMaxWidth(this.BUTTON_WIDTH);
            this.btns.get(i).setMaxHeight(this.BUTTON_HEIGHT);
        }

        this.pane.setCenter(btnGrid);
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

            btn.setOnMouseClicked(new EventHandler< MouseEvent >() {
                @Override
                public void handle( MouseEvent event ) {

                    bindMusic(btn);
                }
            });
        }
    }

    /**
     * bindMusic
     * @param btn Button
     * Set up the eventhandler for the button
     */
    private void bindMusic(Button btn) {

        String key = btn.getText();

        this.bind.setKey(key);
        this.bind.setBtn(btn);

        Stage bind = new Stage();
        bind.show();

        bind.setOnCloseRequest(new EventHandler< WindowEvent >() {
            @Override
            public void handle( WindowEvent event ) {
                bind.close();
            }
        });
    }

}
