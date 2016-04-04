package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
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

    @Override
    public void initialize( URL location, ResourceBundle resources ) {

        System.out.println("View is now loaded!");
        error.setText("");
    }

    /**
     * assignMusic
     * @param event MouseEvent
     * select the music file to assign to button
     */
    @FXML
    protected void assignMusic( MouseEvent event ) {

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
}