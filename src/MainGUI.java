import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaException;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.File;
import java.util.ArrayList;

/**
 * Class: MainGUI
 * @author Mike Deiters, David Rivera
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
    String toggleOption;
    private Label toggleTestLabel;
    final ToggleGroup toggleGroup = new ToggleGroup();
    HBox toggleHBox = new HBox();
    VBox vToggleBox = new VBox();
    Label label = new Label ("Hold and Press Keys for music:");


    
    
    public void start( Stage primaryStage ) throws Exception {

        this.pane = new BorderPane();
        this.primaryScene = new Scene(this.pane, this.WIDTH, this.HEIGHT);
        this.mainStage = new Stage();
        this.mainStage.setTitle("Blackwing Sy_ths");
        this.mainStage.getIcons().add(new Image("/Icon.png"));
        this.mainStage.setScene(this.primaryScene);
        setup();
        btnActions();
        keyActions(toggleOption);
//        if (toggleOption == "on")
//        {
//        	keyActionsOnToggle();
//        }
//        if (toggleOption == "off")
//        {
//        	keyActionsOffToggle();
//        }
       
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
        this.toggleTestLabel = new Label(toggleOption);

        buildGrid();
        collectBtns();
        toggleGroup(primaryScene);

        for ( int i = 0; i < this.btns.size(); i++ ) {

            this.btns.get(i).setMinWidth(this.BUTTON_WIDTH);
            this.btns.get(i).setMinHeight(this.BUTTON_HEIGHT);
        }

        this.pane.setCenter(this.btnGrid);
        this.pane.setBottom(this.error);
        this.pane.setBottom(this.toggleTestLabel);
        this.pane.setTop(vToggleBox);
        this.pane.setPadding(new Insets(100, 200, 100, 200));
    }

    /**
     * buildGrid
     * Build the grid
     */
    public void buildGrid() {

        this.btnGrid.add(this.data.Qbtn, 0, 0);
        this.btnGrid.add(this.data.Wbtn, 1, 0);
        this.btnGrid.add(this.data.Ebtn, 2, 0);
        this.btnGrid.add(this.data.Abtn, 0, 1);
        this.btnGrid.add(this.data.Sbtn, 1, 1);
        this.btnGrid.add(this.data.Dbtn, 2, 1);
        this.btnGrid.add(this.data.Zbtn, 0, 2);
        this.btnGrid.add(this.data.Xbtn, 1, 2);
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
    
//    public void keyActionsOnToggle(String toggleOption) 
//    {
//    	
//    		this.primaryScene.setOnKeyPressed(new EventHandler<KeyEvent>()
//    		{
//    			@Override
//    			public void handle( KeyEvent event ) {
//
//    				Button eventBtn = null;
//
//    				switch ( event.getCode() ) {
//
//    				case Q: eventBtn = data.Qbtn; eventBtn.playSound(); break;
//    				case W: eventBtn = data.Wbtn; eventBtn.playSound(); break;
//    				case E: eventBtn = data.Ebtn; eventBtn.playSound(); break;
//    				case A: eventBtn = data.Abtn; eventBtn.playSound(); break;
//    				case S: eventBtn = data.Sbtn; eventBtn.playSound(); break;
//    				case D: eventBtn = data.Dbtn; eventBtn.playSound(); break;
//    				case Z: eventBtn = data.Zbtn; eventBtn.playSound(); break;
//    				case X: eventBtn = data.Xbtn; eventBtn.playSound(); break;
//    				case C: eventBtn = data.Cbtn; eventBtn.playSound(); break;
//    				default: break;
//    				}
//    			}
//
//    		});
//    		this.primaryScene.setOnKeyReleased(new EventHandler<KeyEvent>()
//    		{
//    			@Override
//    			public void handle( KeyEvent event ) {
//
//    				Button eventBtn = null;
//
//    				switch ( event.getCode() ) {
//
//    				case Q: eventBtn = data.Qbtn; eventBtn.stopSound(); break;
//    				case W: eventBtn = data.Wbtn; eventBtn.stopSound(); break;
//    				case E: eventBtn = data.Ebtn; eventBtn.stopSound(); break;
//    				case A: eventBtn = data.Abtn; eventBtn.stopSound(); break;
//    				case S: eventBtn = data.Sbtn; eventBtn.stopSound(); break;
//    				case D: eventBtn = data.Dbtn; eventBtn.stopSound(); break;
//    				case Z: eventBtn = data.Zbtn; eventBtn.stopSound(); break;
//    				case X: eventBtn = data.Xbtn; eventBtn.stopSound(); break;
//    				case C: eventBtn = data.Cbtn; eventBtn.stopSound(); break;
//    				default: break;
//    				}
//    			}
//    		}); 
//    }	
//    
//    public void keyActionsOffToggle()
//    {
//    	
//    		this.primaryScene.setOnKeyPressed(new EventHandler<KeyEvent>()
//    		{
//    			@Override
//    			public void handle( KeyEvent event ) {
//
//    				Button eventBtn = null;
//
//    				switch ( event.getCode() ) {
//
//    				case Q: eventBtn = data.Qbtn; eventBtn.playSound(); break;
//    				case W: eventBtn = data.Wbtn; eventBtn.playSound(); break;
//    				case E: eventBtn = data.Ebtn; eventBtn.playSound(); break;
//    				case A: eventBtn = data.Abtn; eventBtn.playSound(); break;
//    				case S: eventBtn = data.Sbtn; eventBtn.playSound(); break;
//    				case D: eventBtn = data.Dbtn; eventBtn.playSound(); break;
//    				case Z: eventBtn = data.Zbtn; eventBtn.playSound(); break;
//    				case X: eventBtn = data.Xbtn; eventBtn.playSound(); break;
//    				case C: eventBtn = data.Cbtn; eventBtn.playSound(); break;
//    				default: break;
//    				}
//    			}
//
//    		}); 
//    }
//    
    
    public void keyActions(String selectedOption) {
    	if (selectedOption == "on")
    	{
    		this.primaryScene.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			@Override
    			public void handle( KeyEvent event ) {

    				Button eventBtn = null;

    				switch ( event.getCode() ) {

    				case Q: eventBtn = data.Qbtn; eventBtn.playSound(); break;
    				case W: eventBtn = data.Wbtn; eventBtn.playSound(); break;
    				case E: eventBtn = data.Ebtn; eventBtn.playSound(); break;
    				case A: eventBtn = data.Abtn; eventBtn.playSound(); break;
    				case S: eventBtn = data.Sbtn; eventBtn.playSound(); break;
    				case D: eventBtn = data.Dbtn; eventBtn.playSound(); break;
    				case Z: eventBtn = data.Zbtn; eventBtn.playSound(); break;
    				case X: eventBtn = data.Xbtn; eventBtn.playSound(); break;
    				case C: eventBtn = data.Cbtn; eventBtn.playSound(); break;
    				default: break;
    				}
    			}

    		});
    		this.primaryScene.setOnKeyReleased(new EventHandler<KeyEvent>()
    		{
    			@Override
    			public void handle( KeyEvent event ) {

    				Button eventBtn = null;

    				switch ( event.getCode() ) {

    				case Q: eventBtn = data.Qbtn; eventBtn.stopSound(); break;
    				case W: eventBtn = data.Wbtn; eventBtn.stopSound(); break;
    				case E: eventBtn = data.Ebtn; eventBtn.stopSound(); break;
    				case A: eventBtn = data.Abtn; eventBtn.stopSound(); break;
    				case S: eventBtn = data.Sbtn; eventBtn.stopSound(); break;
    				case D: eventBtn = data.Dbtn; eventBtn.stopSound(); break;
    				case Z: eventBtn = data.Zbtn; eventBtn.stopSound(); break;
    				case X: eventBtn = data.Xbtn; eventBtn.stopSound(); break;
    				case C: eventBtn = data.Cbtn; eventBtn.stopSound(); break;
    				default: break;
    				}
    			}
    		}); 
    	} else
    	{
    		this.primaryScene.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			@Override
    			public void handle( KeyEvent event ) {

    				Button eventBtn = null;

    				switch ( event.getCode() ) {

    				case Q: eventBtn = data.Qbtn; eventBtn.playSound(); break;
    				case W: eventBtn = data.Wbtn; eventBtn.playSound(); break;
    				case E: eventBtn = data.Ebtn; eventBtn.playSound(); break;
    				case A: eventBtn = data.Abtn; eventBtn.playSound(); break;
    				case S: eventBtn = data.Sbtn; eventBtn.playSound(); break;
    				case D: eventBtn = data.Dbtn; eventBtn.playSound(); break;
    				case Z: eventBtn = data.Zbtn; eventBtn.playSound(); break;
    				case X: eventBtn = data.Xbtn; eventBtn.playSound(); break;
    				case C: eventBtn = data.Cbtn; eventBtn.playSound(); break;
    				default: break;
    				}
    			}

    		}); 
    	}
    }

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

    public void toggleGroup(Scene workScene)
    {
    	ToggleButton tb1 = new ToggleButton("On");
    	tb1.setToggleGroup(toggleGroup);
    	tb1.setUserData("on");
    	tb1.setSelected(true);
    	
    	ToggleButton tb2 = new ToggleButton("Off");
    	tb2.setToggleGroup(toggleGroup);
    	tb2.setUserData("off");
    	
    	this.toggleHBox.getChildren().add(tb1);
    	this.toggleHBox.getChildren().add(tb2);
    	
    	vToggleBox.getChildren().add(label);
    	vToggleBox.getChildren().add(toggleHBox);
    	
    	this.vToggleBox.setPadding(new Insets(20, 10, 10, 20));
    	
    	 toggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
         	public void changed(ObservableValue<? extends Toggle> ov,
         			Toggle toggle, Toggle new_toggle) {
         		if (new_toggle == null)
         		{
         			//Does nothing
         		} else {
         			toggleOption = (String) toggleGroup.getSelectedToggle().getUserData();
         			toggleTestLabel.setText((String) toggleGroup.getSelectedToggle().getUserData());
         			if (toggleOption == "on")
         	    	{
         	    		workScene.setOnKeyPressed(new EventHandler<KeyEvent>()
         	    		{
//         	    			@Override
         	    			public void handle( KeyEvent event ) {

         	    				Button eventBtn = null;

         	    				switch ( event.getCode() ) {

         	    				case Q: eventBtn = data.Qbtn; eventBtn.playSound(); break;
         	    				case W: eventBtn = data.Wbtn; eventBtn.playSound(); break;
         	    				case E: eventBtn = data.Ebtn; eventBtn.playSound(); break;
         	    				case A: eventBtn = data.Abtn; eventBtn.playSound(); break;
         	    				case S: eventBtn = data.Sbtn; eventBtn.playSound(); break;
         	    				case D: eventBtn = data.Dbtn; eventBtn.playSound(); break;
         	    				case Z: eventBtn = data.Zbtn; eventBtn.playSound(); break;
         	    				case X: eventBtn = data.Xbtn; eventBtn.playSound(); break;
         	    				case C: eventBtn = data.Cbtn; eventBtn.playSound(); break;
         	    				default: break;
         	    				}
         	    			}

         	    		});
         	    		workScene.setOnKeyReleased(new EventHandler<KeyEvent>()
         	    		{
//         	    			@Override
         	    			public void handle( KeyEvent event ) {

         	    				Button eventBtn = null;

         	    				switch ( event.getCode() ) {

         	    				case Q: eventBtn = data.Qbtn; eventBtn.stopSound(); break;
         	    				case W: eventBtn = data.Wbtn; eventBtn.stopSound(); break;
         	    				case E: eventBtn = data.Ebtn; eventBtn.stopSound(); break;
         	    				case A: eventBtn = data.Abtn; eventBtn.stopSound(); break;
         	    				case S: eventBtn = data.Sbtn; eventBtn.stopSound(); break;
         	    				case D: eventBtn = data.Dbtn; eventBtn.stopSound(); break;
         	    				case Z: eventBtn = data.Zbtn; eventBtn.stopSound(); break;
         	    				case X: eventBtn = data.Xbtn; eventBtn.stopSound(); break;
         	    				case C: eventBtn = data.Cbtn; eventBtn.stopSound(); break;
         	    				default: break;
         	    				}
         	    			}
         	    		}); 
         	    	} else
         	    	{
         	    		workScene.setOnKeyPressed(new EventHandler<KeyEvent>()
         	    		{
//         	    			@Override
         	    			public void handle( KeyEvent event2 ) {

         	    				Button eventBtn2 = null;

         	    				switch ( event2.getCode() ) {

         	    				case Q: eventBtn2 = data.Qbtn; eventBtn2.playSound(); break;
         	    				case W: eventBtn2 = data.Wbtn; eventBtn2.playSound(); break;
         	    				case E: eventBtn2 = data.Ebtn; eventBtn2.playSound(); break;
         	    				case A: eventBtn2 = data.Abtn; eventBtn2.playSound(); break;
         	    				case S: eventBtn2 = data.Sbtn; eventBtn2.playSound(); break;
         	    				case D: eventBtn2 = data.Dbtn; eventBtn2.playSound(); break;
         	    				case Z: eventBtn2 = data.Zbtn; eventBtn2.playSound(); break;
         	    				case X: eventBtn2 = data.Xbtn; eventBtn2.playSound(); break;
         	    				case C: eventBtn2 = data.Cbtn; eventBtn2.playSound(); break;
         	    				default: break;
         	    				}
         	    			}

         	    		}); 
         	    	}
         		}
         	}
         });
    }
    
    public Scene getScene()
    {
    	return primaryScene;
    }
}
