package controller;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaException;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import model.Button;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller
 * @author Mike Deiters
 * @version 1.0
 *
 * Description: FX Controls
 */
public class Controller implements Initializable {

    @FXML protected Label error;
    @FXML protected Button N1btn;
    @FXML protected Button N2btn;
    @FXML protected Button N3btn;
    @FXML protected Button N4btn;
    @FXML protected Button N5btn;
    @FXML protected Button N6btn;
    @FXML protected Button N7btn;
    @FXML protected Button N8btn;
    @FXML protected Button N9btn;
    @FXML protected Button N0btn;
    @FXML protected Button Qbtn;
    @FXML protected Button Wbtn;
    @FXML protected Button Ebtn;
    @FXML protected Button Rbtn;
    @FXML protected Button Tbtn;
    @FXML protected Button Ybtn;
    @FXML protected Button Ubtn;
    @FXML protected Button Ibtn;
    @FXML protected Button Obtn;
    @FXML protected Button Pbtn;
    @FXML protected Button Abtn;
    @FXML protected Button Sbtn;
    @FXML protected Button Dbtn;
    @FXML protected Button Fbtn;
    @FXML protected Button Gbtn;
    @FXML protected Button Hbtn;
    @FXML protected Button Jbtn;
    @FXML protected Button Kbtn;
    @FXML protected Button Lbtn;
    @FXML protected Button Zbtn;
    @FXML protected Button Xbtn;
    @FXML protected Button Cbtn;
    @FXML protected Button Vbtn;
    @FXML protected Button Bbtn;
    @FXML protected Button Nbtn;
    @FXML protected Button Mbtn;

    @FXML protected Pane gui;
    @FXML protected MenuItem playStopToggle;
    protected boolean tapHoldToggle;
    private final boolean TAP = true;
    private final boolean HOLD = false;
    private HostServices hostServices;

    @Override
    public void initialize( URL location, ResourceBundle resources ) {

        System.out.println("View is now loaded!");
        error.setText("Not all menu buttons are implemented yet.");
        this.tapHoldToggle = HOLD;

        setupContextMenu(N1btn);
        setupContextMenu(N2btn);
        setupContextMenu(N3btn);
        setupContextMenu(N4btn);
        setupContextMenu(N5btn);
        setupContextMenu(N6btn);
        setupContextMenu(N7btn);
        setupContextMenu(N8btn);
        setupContextMenu(N9btn);
        setupContextMenu(N0btn);
        setupContextMenu(Qbtn);
        setupContextMenu(Wbtn);
        setupContextMenu(Ebtn);
        setupContextMenu(Rbtn);
        setupContextMenu(Tbtn);
        setupContextMenu(Ybtn);
        setupContextMenu(Ubtn);
        setupContextMenu(Ibtn);
        setupContextMenu(Obtn);
        setupContextMenu(Pbtn);
        setupContextMenu(Abtn);
        setupContextMenu(Sbtn);
        setupContextMenu(Dbtn);
        setupContextMenu(Fbtn);
        setupContextMenu(Gbtn);
        setupContextMenu(Hbtn);
        setupContextMenu(Jbtn);
        setupContextMenu(Kbtn);
        setupContextMenu(Lbtn);
        setupContextMenu(Zbtn);
        setupContextMenu(Xbtn);
        setupContextMenu(Cbtn);
        setupContextMenu(Vbtn);
        setupContextMenu(Bbtn);
        setupContextMenu(Nbtn);
        setupContextMenu(Mbtn);
    }

    /**
     * setHostServices
     * @param hostServices HostServices
     */
    public void setHostServices( HostServices hostServices ) {
        this.hostServices = hostServices;
    }

    /**
     * assignMusic
     * @param event MouseEvent
     * select the music file to assign to button
     */
    @FXML
    protected void assignMusic( MouseEvent event ) {

        if ( event.getButton().equals(MouseButton.PRIMARY) ) {

            Button btn = (Button) event.getSource();

            FileChooser fileChooser = new FileChooser();
//        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
            fileChooser.setTitle("Select Music Bite");

            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("All Music", "*.*"),
                    new FileChooser.ExtensionFilter("MP3", "*.mp3"));

            try {
                File file = fileChooser.showOpenDialog(null);
                btn.setSound(file);
                btn.getStyleClass().add("light-bg");
                btn.getStyleClass().remove("medium-bg");
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

    /**
     * reset
     * reset the application
     */
    @FXML
    protected void reset( ActionEvent event ) {
        this.Qbtn.unbindSound();
        this.Wbtn.unbindSound();
        this.Ebtn.unbindSound();
        this.Rbtn.unbindSound();
        this.Tbtn.unbindSound();
        this.Ybtn.unbindSound();
        this.Ubtn.unbindSound();
        this.Ibtn.unbindSound();
        this.Obtn.unbindSound();
        this.Pbtn.unbindSound();
        this.Abtn.unbindSound();
        this.Sbtn.unbindSound();
        this.Dbtn.unbindSound();
        this.Fbtn.unbindSound();
        this.Gbtn.unbindSound();
        this.Hbtn.unbindSound();
        this.Jbtn.unbindSound();
        this.Kbtn.unbindSound();
        this.Lbtn.unbindSound();
        this.Zbtn.unbindSound();
        this.Xbtn.unbindSound();
        this.Cbtn.unbindSound();
        this.Vbtn.unbindSound();
        this.Bbtn.unbindSound();
        this.Nbtn.unbindSound();
        this.Mbtn.unbindSound();
        this.N0btn.unbindSound();
        this.N1btn.unbindSound();
        this.N2btn.unbindSound();
        this.N3btn.unbindSound();
        this.N4btn.unbindSound();
        this.N5btn.unbindSound();
        this.N6btn.unbindSound();
        this.N7btn.unbindSound();
        this.N8btn.unbindSound();
        this.N9btn.unbindSound();
        this.Qbtn.getStyleClass().remove(1, this.Qbtn.getStyleClass().size());
        this.Wbtn.getStyleClass().remove(1, this.Wbtn.getStyleClass().size());
        this.Ebtn.getStyleClass().remove(1, this.Ebtn.getStyleClass().size());
        this.Rbtn.getStyleClass().remove(1, this.Rbtn.getStyleClass().size());
        this.Tbtn.getStyleClass().remove(1, this.Tbtn.getStyleClass().size());
        this.Ybtn.getStyleClass().remove(1, this.Ybtn.getStyleClass().size());
        this.Ubtn.getStyleClass().remove(1, this.Ubtn.getStyleClass().size());
        this.Ibtn.getStyleClass().remove(1, this.Ibtn.getStyleClass().size());
        this.Obtn.getStyleClass().remove(1, this.Obtn.getStyleClass().size());
        this.Pbtn.getStyleClass().remove(1, this.Pbtn.getStyleClass().size());
        this.Abtn.getStyleClass().remove(1, this.Abtn.getStyleClass().size());
        this.Sbtn.getStyleClass().remove(1, this.Sbtn.getStyleClass().size());
        this.Dbtn.getStyleClass().remove(1, this.Dbtn.getStyleClass().size());
        this.Fbtn.getStyleClass().remove(1, this.Fbtn.getStyleClass().size());
        this.Gbtn.getStyleClass().remove(1, this.Gbtn.getStyleClass().size());
        this.Hbtn.getStyleClass().remove(1, this.Hbtn.getStyleClass().size());
        this.Jbtn.getStyleClass().remove(1, this.Jbtn.getStyleClass().size());
        this.Kbtn.getStyleClass().remove(1, this.Kbtn.getStyleClass().size());
        this.Lbtn.getStyleClass().remove(1, this.Lbtn.getStyleClass().size());
        this.Zbtn.getStyleClass().remove(1, this.Zbtn.getStyleClass().size());
        this.Xbtn.getStyleClass().remove(1, this.Xbtn.getStyleClass().size());
        this.Cbtn.getStyleClass().remove(1, this.Cbtn.getStyleClass().size());
        this.Vbtn.getStyleClass().remove(1, this.Vbtn.getStyleClass().size());
        this.Bbtn.getStyleClass().remove(1, this.Bbtn.getStyleClass().size());
        this.Nbtn.getStyleClass().remove(1, this.Nbtn.getStyleClass().size());
        this.Mbtn.getStyleClass().remove(1, this.Mbtn.getStyleClass().size());
        this.N0btn.getStyleClass().remove(1, this.N0btn.getStyleClass().size());
        this.N1btn.getStyleClass().remove(1, this.N1btn.getStyleClass().size());
        this.N2btn.getStyleClass().remove(1, this.N2btn.getStyleClass().size());
        this.N3btn.getStyleClass().remove(1, this.N3btn.getStyleClass().size());
        this.N4btn.getStyleClass().remove(1, this.N4btn.getStyleClass().size());
        this.N5btn.getStyleClass().remove(1, this.N5btn.getStyleClass().size());
        this.N6btn.getStyleClass().remove(1, this.N6btn.getStyleClass().size());
        this.N7btn.getStyleClass().remove(1, this.N7btn.getStyleClass().size());
        this.N8btn.getStyleClass().remove(1, this.N8btn.getStyleClass().size());
        this.N9btn.getStyleClass().remove(1, this.N9btn.getStyleClass().size());
        this.Qbtn.getStyleClass().add("medium-bg");
        this.Wbtn.getStyleClass().add("medium-bg");
        this.Ebtn.getStyleClass().add("medium-bg");
        this.Rbtn.getStyleClass().add("medium-bg");
        this.Tbtn.getStyleClass().add("medium-bg");
        this.Ybtn.getStyleClass().add("medium-bg");
        this.Ubtn.getStyleClass().add("medium-bg");
        this.Ibtn.getStyleClass().add("medium-bg");
        this.Obtn.getStyleClass().add("medium-bg");
        this.Pbtn.getStyleClass().add("medium-bg");
        this.Abtn.getStyleClass().add("medium-bg");
        this.Sbtn.getStyleClass().add("medium-bg");
        this.Dbtn.getStyleClass().add("medium-bg");
        this.Fbtn.getStyleClass().add("medium-bg");
        this.Gbtn.getStyleClass().add("medium-bg");
        this.Hbtn.getStyleClass().add("medium-bg");
        this.Jbtn.getStyleClass().add("medium-bg");
        this.Kbtn.getStyleClass().add("medium-bg");
        this.Lbtn.getStyleClass().add("medium-bg");
        this.Zbtn.getStyleClass().add("medium-bg");
        this.Xbtn.getStyleClass().add("medium-bg");
        this.Cbtn.getStyleClass().add("medium-bg");
        this.Vbtn.getStyleClass().add("medium-bg");
        this.Bbtn.getStyleClass().add("medium-bg");
        this.Nbtn.getStyleClass().add("medium-bg");
        this.Mbtn.getStyleClass().add("medium-bg");
        this.N0btn.getStyleClass().add("medium-bg");
        this.N1btn.getStyleClass().add("medium-bg");
        this.N2btn.getStyleClass().add("medium-bg");
        this.N3btn.getStyleClass().add("medium-bg");
        this.N4btn.getStyleClass().add("medium-bg");
        this.N5btn.getStyleClass().add("medium-bg");
        this.N6btn.getStyleClass().add("medium-bg");
        this.N7btn.getStyleClass().add("medium-bg");
        this.N8btn.getStyleClass().add("medium-bg");
        this.N9btn.getStyleClass().add("medium-bg");
    }

    /**
     * playMusic
     * @param btn Button
     * Start playback of sound
     */
    protected void playMusic( Button btn ) {

        btn.playSound();
        if ( !btn.getStyleClass().contains("active") ) {

            btn.getStyleClass().add("active");
        }
    }

    /**
     * stopMusic
     * @param btn Button
     * Stop playback of sound
     */
    protected void stopMusic( Button btn ) {

        btn.stopSound();
        btn.getStyleClass().remove("active");
    }

    /**
     * toggleMusic
     * @param btn
     * Toggle playback of sound
     */
    protected void toggleMusic( final Button btn ) {

        if ( btn.isPlaying() ) {
            btn.stopSound();
            btn.getStyleClass().remove("active");
        }
        else {
            btn.playSound();
            if ( btn.isPlaying() ) {
                btn.getSound().setOnEndOfMedia(new Runnable() {
                    public void run() {
                        btn.stopSound();
                        btn.getStyleClass().remove("active");
                    }
                });
                if ( !btn.getStyleClass().contains("active") ) {

                    btn.getStyleClass().add("active");
                }
            }
        }
    }

    /**
     * playMusicEvent
     * @param event KeyEvent
     * Play music based on key press
     */
    @FXML
    protected void playMusicEvent( KeyEvent event ) {

        switch ( event.getCode() ) {
            case DIGIT1:
                playMusic(N1btn);
                break;
            case DIGIT2:
                playMusic(N2btn);
                break;
            case DIGIT3:
                playMusic(N3btn);
                break;
            case DIGIT4:
                playMusic(N4btn);
                break;
            case DIGIT5:
                playMusic(N5btn);
                break;
            case DIGIT6:
                playMusic(N6btn);
                break;
            case DIGIT7:
                playMusic(N7btn);
                break;
            case DIGIT8:
                playMusic(N8btn);
                break;
            case DIGIT9:
                playMusic(N9btn);
                break;
            case DIGIT0:
                playMusic(N0btn);
                break;
            case NUMPAD1:
                playMusic(N1btn);
                break;
            case NUMPAD2:
                playMusic(N2btn);
                break;
            case NUMPAD3:
                playMusic(N3btn);
                break;
            case NUMPAD4:
                playMusic(N4btn);
                break;
            case NUMPAD5:
                playMusic(N5btn);
                break;
            case NUMPAD6:
                playMusic(N6btn);
                break;
            case NUMPAD7:
                playMusic(N7btn);
                break;
            case NUMPAD8:
                playMusic(N8btn);
                break;
            case NUMPAD9:
                playMusic(N9btn);
                break;
            case NUMPAD0:
                playMusic(N0btn);
                break;
            case A:
                playMusic(Abtn);
                break;
            case B:
                playMusic(Bbtn);
                break;
            case C:
                playMusic(Cbtn);
                break;
            case D:
                playMusic(Dbtn);
                break;
            case E:
                playMusic(Ebtn);
                break;
            case F:
                playMusic(Fbtn);
                break;
            case G:
                playMusic(Gbtn);
                break;
            case H:
                playMusic(Hbtn);
                break;
            case I:
                playMusic(Ibtn);
                break;
            case J:
                playMusic(Jbtn);
                break;
            case K:
                playMusic(Kbtn);
                break;
            case L:
                playMusic(Lbtn);
                break;
            case M:
                playMusic(Mbtn);
                break;
            case N:
                playMusic(Nbtn);
                break;
            case O:
                playMusic(Obtn);
                break;
            case P:
                playMusic(Pbtn);
                break;
            case Q:
                playMusic(Qbtn);
                break;
            case R:
                playMusic(Rbtn);
                break;
            case S:
                playMusic(Sbtn);
                break;
            case T:
                playMusic(Tbtn);
                break;
            case U:
                playMusic(Ubtn);
                break;
            case V:
                playMusic(Vbtn);
                break;
            case W:
                playMusic(Wbtn);
                break;
            case X:
                playMusic(Xbtn);
                break;
            case Y:
                playMusic(Ybtn);
                break;
            case Z:
                playMusic(Zbtn);
                break;
            default:
                break;
        }
    }

    /**
     * stopMusicEvent
     * @param event KeyEvent
     * Stop music based on key press
     */
    @FXML
    protected void stopMusicEvent( KeyEvent event ) {

        switch ( event.getCode() ) {
            case DIGIT1:
                stopMusic(N1btn);
                break;
            case DIGIT2:
                stopMusic(N2btn);
                break;
            case DIGIT3:
                stopMusic(N3btn);
                break;
            case DIGIT4:
                stopMusic(N4btn);
                break;
            case DIGIT5:
                stopMusic(N5btn);
                break;
            case DIGIT6:
                stopMusic(N6btn);
                break;
            case DIGIT7:
                stopMusic(N7btn);
                break;
            case DIGIT8:
                stopMusic(N8btn);
                break;
            case DIGIT9:
                stopMusic(N9btn);
                break;
            case DIGIT0:
                stopMusic(N0btn);
                break;
            case NUMPAD1:
                stopMusic(N1btn);
                break;
            case NUMPAD2:
                stopMusic(N2btn);
                break;
            case NUMPAD3:
                stopMusic(N3btn);
                break;
            case NUMPAD4:
                stopMusic(N4btn);
                break;
            case NUMPAD5:
                stopMusic(N5btn);
                break;
            case NUMPAD6:
                stopMusic(N6btn);
                break;
            case NUMPAD7:
                stopMusic(N7btn);
                break;
            case NUMPAD8:
                stopMusic(N8btn);
                break;
            case NUMPAD9:
                stopMusic(N9btn);
                break;
            case NUMPAD0:
                stopMusic(N0btn);
                break;
            case A:
                stopMusic(Abtn);
                break;
            case B:
                stopMusic(Bbtn);
                break;
            case C:
                stopMusic(Cbtn);
                break;
            case D:
                stopMusic(Dbtn);
                break;
            case E:
                stopMusic(Ebtn);
                break;
            case F:
                stopMusic(Fbtn);
                break;
            case G:
                stopMusic(Gbtn);
                break;
            case H:
                stopMusic(Hbtn);
                break;
            case I:
                stopMusic(Ibtn);
                break;
            case J:
                stopMusic(Jbtn);
                break;
            case K:
                stopMusic(Kbtn);
                break;
            case L:
                stopMusic(Lbtn);
                break;
            case M:
                stopMusic(Mbtn);
                break;
            case N:
                stopMusic(Nbtn);
                break;
            case O:
                stopMusic(Obtn);
                break;
            case P:
                stopMusic(Pbtn);
                break;
            case Q:
                stopMusic(Qbtn);
                break;
            case R:
                stopMusic(Rbtn);
                break;
            case S:
                stopMusic(Sbtn);
                break;
            case T:
                stopMusic(Tbtn);
                break;
            case U:
                stopMusic(Ubtn);
                break;
            case V:
                stopMusic(Vbtn);
                break;
            case W:
                stopMusic(Wbtn);
                break;
            case X:
                stopMusic(Xbtn);
                break;
            case Y:
                stopMusic(Ybtn);
                break;
            case Z:
                stopMusic(Zbtn);
                break;
            default:
                break;
        }
    }

    /**
     * toggleMusicEvent
     * @param event KeyEvent
     * Play music based on key press
     */
    @FXML
    protected void toggleMusicEvent( KeyEvent event ) {

        switch ( event.getCode() ) {
            case DIGIT1:
                toggleMusic(N1btn);
                break;
            case DIGIT2:
                toggleMusic(N2btn);
                break;
            case DIGIT3:
                toggleMusic(N3btn);
                break;
            case DIGIT4:
                toggleMusic(N4btn);
                break;
            case DIGIT5:
                toggleMusic(N5btn);
                break;
            case DIGIT6:
                toggleMusic(N6btn);
                break;
            case DIGIT7:
                toggleMusic(N7btn);
                break;
            case DIGIT8:
                toggleMusic(N8btn);
                break;
            case DIGIT9:
                toggleMusic(N9btn);
                break;
            case DIGIT0:
                toggleMusic(N0btn);
                break;
            case NUMPAD1:
                toggleMusic(N1btn);
                break;
            case NUMPAD2:
                toggleMusic(N2btn);
                break;
            case NUMPAD3:
                toggleMusic(N3btn);
                break;
            case NUMPAD4:
                toggleMusic(N4btn);
                break;
            case NUMPAD5:
                toggleMusic(N5btn);
                break;
            case NUMPAD6:
                toggleMusic(N6btn);
                break;
            case NUMPAD7:
                toggleMusic(N7btn);
                break;
            case NUMPAD8:
                toggleMusic(N8btn);
                break;
            case NUMPAD9:
                toggleMusic(N9btn);
                break;
            case NUMPAD0:
                toggleMusic(N0btn);
                break;
            case A:
                toggleMusic(Abtn);
                break;
            case B:
                toggleMusic(Bbtn);
                break;
            case C:
                toggleMusic(Cbtn);
                break;
            case D:
                toggleMusic(Dbtn);
                break;
            case E:
                toggleMusic(Ebtn);
                break;
            case F:
                toggleMusic(Fbtn);
                break;
            case G:
                toggleMusic(Gbtn);
                break;
            case H:
                toggleMusic(Hbtn);
                break;
            case I:
                toggleMusic(Ibtn);
                break;
            case J:
                toggleMusic(Jbtn);
                break;
            case K:
                toggleMusic(Kbtn);
                break;
            case L:
                toggleMusic(Lbtn);
                break;
            case M:
                toggleMusic(Mbtn);
                break;
            case N:
                toggleMusic(Nbtn);
                break;
            case O:
                toggleMusic(Obtn);
                break;
            case P:
                toggleMusic(Pbtn);
                break;
            case Q:
                toggleMusic(Qbtn);
                break;
            case R:
                toggleMusic(Rbtn);
                break;
            case S:
                toggleMusic(Sbtn);
                break;
            case T:
                toggleMusic(Tbtn);
                break;
            case U:
                toggleMusic(Ubtn);
                break;
            case V:
                toggleMusic(Vbtn);
                break;
            case W:
                toggleMusic(Wbtn);
                break;
            case X:
                toggleMusic(Xbtn);
                break;
            case Y:
                toggleMusic(Ybtn);
                break;
            case Z:
                toggleMusic(Zbtn);
                break;
            default:
                break;
        }
    }

    @FXML
    protected void toggleTapHold( ActionEvent event ) {
//        System.out.println(event);

        if ( tapHoldToggle == HOLD ) {

            tapHoldToggle = TAP;
            playStopToggle.setText("Hold to Play");
            gui.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle( KeyEvent event ) {
                    toggleMusicEvent(event);
                }
            });
            gui.setOnKeyReleased(null);
        }
        else {

            tapHoldToggle = HOLD;
            playStopToggle.setText("Tap to Play");
            gui.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle( KeyEvent event ) {
                    playMusicEvent(event);
                }
            });
            gui.setOnKeyReleased(new EventHandler<KeyEvent>() {
                @Override
                public void handle( KeyEvent event ) {
                    stopMusicEvent(event);
                }
            });
        }
    }

    /**
     * styleButton
     * @param btn Button
     * @param event ActionEvent
     * Change the background color of the button
     */
    @FXML
    protected void styleButton( Button btn, ActionEvent event ) {

        // Retrieve the MenuItem clicked on
        MenuItem item = (MenuItem) event.getSource();

        // Retrieve the css class from the circle on the menuitem
        String newClass = item.getGraphic().getStyleClass().get(item.getGraphic().getStyleClass().size() - 1);

        // Assign newClass to btn
        btn.getStyleClass().add(newClass);
    }

    /**
     * setupContextMenu
     * @param btn Button
     * Create a context menu for btn
     */
    protected void setupContextMenu( Button btn ) {
        final ContextMenu menu = new ContextMenu();

        // Create a sub-menu for the colors
        Menu colors = new Menu("Colors");

        // Add the menu items to the sub-menu
        colors.getItems().add(colorMenuItem(btn, "red"));
        colors.getItems().add(colorMenuItem(btn, "orange"));
        colors.getItems().add(colorMenuItem(btn, "yellow"));
        colors.getItems().add(colorMenuItem(btn, "green"));
        colors.getItems().add(colorMenuItem(btn, "blue"));
        colors.getItems().add(colorMenuItem(btn, "teal"));
        colors.getItems().add(colorMenuItem(btn, "violet"));

        // Add the sub-menu to the context menu
        menu.getItems().add(colors);

        // Assign the context menu to btn
        btn.setContextMenu(menu);
    }

    /**
     * colorMenuItem
     * @param btn Button
     * @param str String
     * @return item MenuItem
     * Creates a the menu item for the colors sub-menu
     * Creates an event handler for the menu item
     */
    protected MenuItem colorMenuItem( final Button btn, String str ) {

        // Capitalize the first letter of the string
        str = str.toLowerCase();
        str = Character.toString(str.charAt(0)).toUpperCase() + str.substring(1);

        // Circle to display the color
        Circle circle = new Circle();
        circle.setRadius(6);
        circle.getStyleClass().add(str.toLowerCase());

        // Create the MenuItem and create an event handler
        MenuItem item = new MenuItem(str, circle);
        item.setOnAction(new EventHandler<ActionEvent>() {
            public void handle( ActionEvent event ) {
                styleButton(btn, event);
            }
        });

        return item;
    }

    /**
     * helpBtn
     * Redirect the user to our help page
     */
    @FXML
    protected void helpBtn(ActionEvent event) {
        hostServices.showDocument("http://syths.io");
    }
}
