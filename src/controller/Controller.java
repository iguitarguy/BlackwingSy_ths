package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaException;
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

    @Override
    public void initialize( URL location, ResourceBundle resources ) {

        System.out.println("View is now loaded!");
        error.setText("Not all menu buttons not implemented yet.");
        this.tapHoldToggle = HOLD;
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
    protected void reset (ActionEvent event) {
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
    	
    }
    
    /**
     * playMusic
     * @param event KeyEvent
     * Play music based on key press
     */
    @FXML
    protected void playMusic( KeyEvent event ) {

        switch ( event.getCode() ) {
            case DIGIT1:
                N1btn.playSound();
                break;
            case DIGIT2:
                N2btn.playSound();
                break;
            case DIGIT3:
                N3btn.playSound();
                break;
            case DIGIT4:
                N4btn.playSound();
                break;
            case DIGIT5:
                N5btn.playSound();
                break;
            case DIGIT6:
                N6btn.playSound();
                break;
            case DIGIT7:
                N7btn.playSound();
                break;
            case DIGIT8:
                N8btn.playSound();
                break;
            case DIGIT9:
                N9btn.playSound();
                break;
            case DIGIT0:
                N0btn.playSound();
                break;
            case NUMPAD1:
                N1btn.playSound();
                break;
            case NUMPAD2:
                N2btn.playSound();
                break;
            case NUMPAD3:
                N3btn.playSound();
                break;
            case NUMPAD4:
                N4btn.playSound();
                break;
            case NUMPAD5:
                N5btn.playSound();
                break;
            case NUMPAD6:
                N6btn.playSound();
                break;
            case NUMPAD7:
                N7btn.playSound();
                break;
            case NUMPAD8:
                N8btn.playSound();
                break;
            case NUMPAD9:
                N9btn.playSound();
                break;
            case NUMPAD0:
                N0btn.playSound();
                break;
            case Q:
                Qbtn.playSound();
                break;
            case W:
                Wbtn.playSound();
                break;
            case E:
                Ebtn.playSound();
                break;
            case R:
                Rbtn.playSound();
                break;
            case T:
                Tbtn.playSound();
                break;
            case Y:
                Ybtn.playSound();
                break;
            case U:
                Ubtn.playSound();
                break;
            case I:
                Ibtn.playSound();
                break;
            case O:
                Obtn.playSound();
                break;
            case P:
                Pbtn.playSound();
                break;
            case A:
                Abtn.playSound();
                break;
            case S:
                Sbtn.playSound();
                break;
            case D:
                Dbtn.playSound();
                break;
            case F:
                Fbtn.playSound();
                break;
            case G:
                Gbtn.playSound();
                break;
            case H:
                Hbtn.playSound();
                break;
            case J:
                Jbtn.playSound();
                break;
            case K:
                Kbtn.playSound();
                break;
            case L:
                Lbtn.playSound();
                break;
            case Z:
                Zbtn.playSound();
                break;
            case X:
                Xbtn.playSound();
                break;
            case C:
                Cbtn.playSound();
                break;
            case V:
                Vbtn.playSound();
                break;
            case B:
                Bbtn.playSound();
                break;
            case N:
                Nbtn.playSound();
                break;
            case M:
                Mbtn.playSound();
                break;
            default:
                break;
        }
    }

    @FXML
    protected void stopMusic( KeyEvent event ) {

        switch ( event.getCode() ) {
            case DIGIT1:
                N1btn.stopSound();
                break;
            case DIGIT2:
                N2btn.stopSound();
                break;
            case DIGIT3:
                N3btn.stopSound();
                break;
            case DIGIT4:
                N4btn.stopSound();
                break;
            case DIGIT5:
                N5btn.stopSound();
                break;
            case DIGIT6:
                N6btn.stopSound();
                break;
            case DIGIT7:
                N7btn.stopSound();
                break;
            case DIGIT8:
                N8btn.stopSound();
                break;
            case DIGIT9:
                N9btn.stopSound();
                break;
            case DIGIT0:
                N0btn.stopSound();
                break;
            case NUMPAD1:
                N1btn.stopSound();
                break;
            case NUMPAD2:
                N2btn.stopSound();
                break;
            case NUMPAD3:
                N3btn.stopSound();
                break;
            case NUMPAD4:
                N4btn.stopSound();
                break;
            case NUMPAD5:
                N5btn.stopSound();
                break;
            case NUMPAD6:
                N6btn.stopSound();
                break;
            case NUMPAD7:
                N7btn.stopSound();
                break;
            case NUMPAD8:
                N8btn.stopSound();
                break;
            case NUMPAD9:
                N9btn.stopSound();
                break;
            case NUMPAD0:
                N0btn.stopSound();
                break;
            case Q:
                Qbtn.stopSound();
                break;
            case W:
                Wbtn.stopSound();
                break;
            case E:
                Ebtn.stopSound();
                break;
            case R:
                Rbtn.stopSound();
                break;
            case T:
                Tbtn.stopSound();
                break;
            case Y:
                Ybtn.stopSound();
                break;
            case U:
                Ubtn.stopSound();
                break;
            case I:
                Ibtn.stopSound();
                break;
            case O:
                Obtn.stopSound();
                break;
            case P:
                Pbtn.stopSound();
                break;
            case A:
                Abtn.stopSound();
                break;
            case S:
                Sbtn.stopSound();
                break;
            case D:
                Dbtn.stopSound();
                break;
            case F:
                Fbtn.stopSound();
                break;
            case G:
                Gbtn.stopSound();
                break;
            case H:
                Hbtn.stopSound();
                break;
            case J:
                Jbtn.stopSound();
                break;
            case K:
                Kbtn.stopSound();
                break;
            case L:
                Lbtn.stopSound();
                break;
            case Z:
                Zbtn.stopSound();
                break;
            case X:
                Xbtn.stopSound();
                break;
            case C:
                Cbtn.stopSound();
                break;
            case V:
                Vbtn.stopSound();
                break;
            case B:
                Bbtn.stopSound();
                break;
            case N:
                Nbtn.stopSound();
                break;
            case M:
                Mbtn.stopSound();
                break;
            default:
                break;
        }
    }

    /**
     * toggleMusic
     * @param event KeyEvent
     * Play music based on key press
     */
    @FXML
    protected void toggleMusic( KeyEvent event ) {

        switch ( event.getCode() ) {
            case DIGIT1:
                if ( !N1btn.isPlaying() ) {
                    N1btn.playSound();
                }
                else {
                    N1btn.stopSound();
                }
                break;
            case DIGIT2:
                if ( !N2btn.isPlaying() ) {
                    N2btn.playSound();
                }
                else {
                    N2btn.stopSound();
                }
                break;
            case DIGIT3:
                if ( !N3btn.isPlaying() ) {
                    N3btn.playSound();
                }
                else {
                    N3btn.stopSound();
                }
                break;
            case DIGIT4:
                if ( !N4btn.isPlaying() ) {
                    N4btn.playSound();
                }
                else {
                    N4btn.stopSound();
                }
                break;
            case DIGIT5:
                if ( !N5btn.isPlaying() ) {
                    N5btn.playSound();
                }
                else {
                    N5btn.stopSound();
                }
                break;
            case DIGIT6:
                if ( !N6btn.isPlaying() ) {
                    N6btn.playSound();
                }
                else {
                    N6btn.stopSound();
                }
                break;
            case DIGIT7:
                if ( !N7btn.isPlaying() ) {
                    N7btn.playSound();
                }
                else {
                    N7btn.stopSound();
                }
                break;
            case DIGIT8:
                if ( !N8btn.isPlaying() ) {
                    N8btn.playSound();
                }
                else {
                    N8btn.stopSound();
                }
                break;
            case DIGIT9:
                if ( !N9btn.isPlaying() ) {
                    N9btn.playSound();
                }
                else {
                    N9btn.stopSound();
                }
                break;
            case DIGIT0:
                if ( !N0btn.isPlaying() ) {
                    N0btn.playSound();
                }
                else {
                    N0btn.stopSound();
                }
                break;
            case NUMPAD1:
                if ( !N1btn.isPlaying() ) {
                    N1btn.playSound();
                }
                else {
                    N1btn.stopSound();
                }
                break;
            case NUMPAD2:
                if ( !N2btn.isPlaying() ) {
                    N2btn.playSound();
                }
                else {
                    N2btn.stopSound();
                }
                break;
            case NUMPAD3:
                if ( !N3btn.isPlaying() ) {
                    N3btn.playSound();
                }
                else {
                    N3btn.stopSound();
                }
                break;
            case NUMPAD4:
                if ( !N4btn.isPlaying() ) {
                    N4btn.playSound();
                }
                else {
                    N4btn.stopSound();
                }
                break;
            case NUMPAD5:
                if ( !N5btn.isPlaying() ) {
                    N5btn.playSound();
                }
                else {
                    N5btn.stopSound();
                }
                break;
            case NUMPAD6:
                if ( !N6btn.isPlaying() ) {
                    N6btn.playSound();
                }
                else {
                    N6btn.stopSound();
                }
                break;
            case NUMPAD7:
                if ( !N7btn.isPlaying() ) {
                    N7btn.playSound();
                }
                else {
                    N7btn.stopSound();
                }
                break;
            case NUMPAD8:
                if ( !N8btn.isPlaying() ) {
                    N8btn.playSound();
                }
                else {
                    N8btn.stopSound();
                }
                break;
            case NUMPAD9:
                if ( !N9btn.isPlaying() ) {
                    N9btn.playSound();
                }
                else {
                    N9btn.stopSound();
                }
                break;
            case NUMPAD0:
                if ( !N0btn.isPlaying() ) {
                    N0btn.playSound();
                }
                else {
                    N0btn.stopSound();
                }
                break;
            case Q:
                if ( !Qbtn.isPlaying() ) {
                    Qbtn.playSound();
                }
                else {
                    Qbtn.stopSound();
                }
                break;
            case W:
                if ( !Wbtn.isPlaying() ) {
                    Wbtn.playSound();
                }
                else {
                    Wbtn.stopSound();
                }
                break;
            case E:
                if ( !Ebtn.isPlaying() ) {
                    Ebtn.playSound();
                }
                else {
                    Ebtn.stopSound();
                }
                break;
            case R:
                if ( !Rbtn.isPlaying() ) {
                    Rbtn.playSound();
                }
                else {
                    Rbtn.stopSound();
                }
                break;
            case T:
                if ( !Tbtn.isPlaying() ) {
                    Tbtn.playSound();
                }
                else {
                    Tbtn.stopSound();
                }
                break;
            case Y:
                if ( !Ybtn.isPlaying() ) {
                    Ybtn.playSound();
                }
                else {
                    Ybtn.stopSound();
                }
                break;
            case U:
                if ( !Ubtn.isPlaying() ) {
                    Ubtn.playSound();
                }
                else {
                    Ubtn.stopSound();
                }
                break;
            case I:
                if ( !Ibtn.isPlaying() ) {
                    Ibtn.playSound();
                }
                else {
                    Ibtn.stopSound();
                }
                break;
            case O:
                if ( !Obtn.isPlaying() ) {
                    Obtn.playSound();
                }
                else {
                    Obtn.stopSound();
                }
                break;
            case P:
                if ( !Pbtn.isPlaying() ) {
                    Pbtn.playSound();
                }
                else {
                    Pbtn.stopSound();
                }
                break;
            case A:
                if ( !Abtn.isPlaying() ) {
                    Abtn.playSound();
                }
                else {
                    Abtn.stopSound();
                }
                break;
            case S:
                if ( !Sbtn.isPlaying() ) {
                    Sbtn.playSound();
                }
                else {
                    Sbtn.stopSound();
                }
                break;
            case D:
                if ( !Dbtn.isPlaying() ) {
                    Dbtn.playSound();
                }
                else {
                    Dbtn.stopSound();
                }
                break;
            case F:
                if ( !Fbtn.isPlaying() ) {
                    Fbtn.playSound();
                }
                else {
                    Fbtn.stopSound();
                }
                break;
            case G:
                if ( !Gbtn.isPlaying() ) {
                    Gbtn.playSound();
                }
                else {
                    Gbtn.stopSound();
                }
                break;
            case H:
                if ( !Hbtn.isPlaying() ) {
                    Hbtn.playSound();
                }
                else {
                    Hbtn.stopSound();
                }
                break;
            case J:
                if ( !Jbtn.isPlaying() ) {
                    Jbtn.playSound();
                }
                else {
                    Jbtn.stopSound();
                }
                break;
            case K:
                if ( !Kbtn.isPlaying() ) {
                    Kbtn.playSound();
                }
                else {
                    Kbtn.stopSound();
                }
                break;
            case L:
                if ( !Lbtn.isPlaying() ) {
                    Lbtn.playSound();
                }
                else {
                    Lbtn.stopSound();
                }
                break;
            case Z:
                if ( !Zbtn.isPlaying() ) {
                    Zbtn.playSound();
                }
                else {
                    Zbtn.stopSound();
                }
                break;
            case X:
                if ( !Xbtn.isPlaying() ) {
                    Xbtn.playSound();
                }
                else {
                    Xbtn.stopSound();
                }
                break;
            case C:
                if ( !Cbtn.isPlaying() ) {
                    Cbtn.playSound();
                }
                else {
                    Cbtn.stopSound();
                }
                break;
            case V:
                if ( !Vbtn.isPlaying() ) {
                    Vbtn.playSound();
                }
                else {
                    Vbtn.stopSound();
                }
                break;
            case B:
                if ( !Bbtn.isPlaying() ) {
                    Bbtn.playSound();
                }
                else {
                    Bbtn.stopSound();
                }
                break;
            case N:
                if ( !Nbtn.isPlaying() ) {
                    Nbtn.playSound();
                }
                else {
                    Nbtn.stopSound();
                }
                break;
            case M:
                if ( !Mbtn.isPlaying() ) {
                    Mbtn.playSound();
                }
                else {
                    Mbtn.stopSound();
                }
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
                    toggleMusic(event);
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
                    playMusic(event);
                }
            });
            gui.setOnKeyReleased(new EventHandler<KeyEvent>() {
                @Override
                public void handle( KeyEvent event ) {
                    stopMusic(event);
                }
            });
        }
    }

}