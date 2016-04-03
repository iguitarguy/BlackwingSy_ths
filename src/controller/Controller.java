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

    @FXML private Label error;
    @FXML private Button N1btn;
    @FXML private Button N2btn;
    @FXML private Button N3btn;
    @FXML private Button N4btn;
    @FXML private Button N5btn;
    @FXML private Button N6btn;
    @FXML private Button N7btn;
    @FXML private Button N8btn;
    @FXML private Button N9btn;
    @FXML private Button N0btn;
    @FXML private Button Qbtn;
    @FXML private Button Wbtn;
    @FXML private Button Ebtn;
    @FXML private Button Rbtn;
    @FXML private Button Tbtn;
    @FXML private Button Ybtn;
    @FXML private Button Ubtn;
    @FXML private Button Ibtn;
    @FXML private Button Obtn;
    @FXML private Button Pbtn;
    @FXML private Button Abtn;
    @FXML private Button Sbtn;
    @FXML private Button Dbtn;
    @FXML private Button Fbtn;
    @FXML private Button Gbtn;
    @FXML private Button Hbtn;
    @FXML private Button Jbtn;
    @FXML private Button Kbtn;
    @FXML private Button Lbtn;
    @FXML private Button Zbtn;
    @FXML private Button Xbtn;
    @FXML private Button Cbtn;
    @FXML private Button Vbtn;
    @FXML private Button Bbtn;
    @FXML private Button Nbtn;
    @FXML private Button Mbtn;

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
    private void assignMusic( MouseEvent event ) {

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
    private void playMusic( KeyEvent event ) {

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
    private void stopMusic( KeyEvent event ) {

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
     * keyActions
     * create the key event handlers
     */
//    public void keyActions() {
//
//        this.primaryScene.setOnKeyPressed(new EventHandler<KeyEvent>()
//        {
//            @Override
//            public void handle( KeyEvent event ) {
//
//                switch ( event.getCode() ) {
//
//                    case NUMPAD1: data.N1btn.playSound(); break;
//                    case NUMPAD2: data.N2btn.playSound(); break;
//                    case NUMPAD3: data.N3btn.playSound(); break;
//                    case NUMPAD4: data.N4btn.playSound(); break;
//                    case NUMPAD5: data.N5btn.playSound(); break;
//                    case NUMPAD6: data.N6btn.playSound(); break;
//                    case NUMPAD7: data.N7btn.playSound(); break;
//                    case NUMPAD8: data.N8btn.playSound(); break;
//                    case NUMPAD9: data.N9btn.playSound(); break;
//                    case NUMPAD0: data.N0btn.playSound(); break;
//                    case Q: data.Qbtn.playSound(); break;
//                    case W: data.Wbtn.playSound(); break;
//                    case E: data.Ebtn.playSound(); break;
//                    case R: data.Rbtn.playSound(); break;
//                    case T: data.Tbtn.playSound(); break;
//                    case Y: data.Ybtn.playSound(); break;
//                    case U: data.Ubtn.playSound(); break;
//                    case I: data.Ibtn.playSound(); break;
//                    case O: data.Obtn.playSound(); break;
//                    case P: data.Pbtn.playSound(); break;
//                    case A: data.Abtn.playSound(); break;
//                    case S: data.Sbtn.playSound(); break;
//                    case D: data.Dbtn.playSound(); break;
//                    case F: data.Fbtn.playSound(); break;
//                    case G: data.Gbtn.playSound(); break;
//                    case H: data.Hbtn.playSound(); break;
//                    case J: data.Jbtn.playSound(); break;
//                    case K: data.Kbtn.playSound(); break;
//                    case L: data.Lbtn.playSound(); break;
//                    case Z: data.Zbtn.playSound(); break;
//                    case X: data.Xbtn.playSound(); break;
//                    case C: data.Cbtn.playSound(); break;
//                    case V: data.Vbtn.playSound(); break;
//                    case B: data.Bbtn.playSound(); break;
//                    case N: data.Nbtn.playSound(); break;
//                    case M: data.Mbtn.playSound(); break;
//                    default: break;
//                }
//            }
//        });
//        this.primaryScene.setOnKeyReleased(new EventHandler<KeyEvent>()
//        {
//            @Override
//            public void handle( KeyEvent event ) {
//
//                switch ( event.getCode() ) {
//
//                    case NUMPAD1: data.N1btn.stopSound(); break;
//                    case NUMPAD2: data.N2btn.stopSound(); break;
//                    case NUMPAD3: data.N3btn.stopSound(); break;
//                    case NUMPAD4: data.N4btn.stopSound(); break;
//                    case NUMPAD5: data.N5btn.stopSound(); break;
//                    case NUMPAD6: data.N6btn.stopSound(); break;
//                    case NUMPAD7: data.N7btn.stopSound(); break;
//                    case NUMPAD8: data.N8btn.stopSound(); break;
//                    case NUMPAD9: data.N9btn.stopSound(); break;
//                    case NUMPAD0: data.N0btn.stopSound(); break;
//                    case Q: data.Qbtn.stopSound(); break;
//                    case W: data.Wbtn.stopSound(); break;
//                    case E: data.Ebtn.stopSound(); break;
//                    case R: data.Rbtn.stopSound(); break;
//                    case T: data.Tbtn.stopSound(); break;
//                    case Y: data.Ybtn.stopSound(); break;
//                    case U: data.Ubtn.stopSound(); break;
//                    case I: data.Ibtn.stopSound(); break;
//                    case O: data.Obtn.stopSound(); break;
//                    case P: data.Pbtn.stopSound(); break;
//                    case A: data.Abtn.stopSound(); break;
//                    case S: data.Sbtn.stopSound(); break;
//                    case D: data.Dbtn.stopSound(); break;
//                    case F: data.Fbtn.stopSound(); break;
//                    case G: data.Gbtn.stopSound(); break;
//                    case H: data.Hbtn.stopSound(); break;
//                    case J: data.Jbtn.stopSound(); break;
//                    case K: data.Kbtn.stopSound(); break;
//                    case L: data.Lbtn.stopSound(); break;
//                    case Z: data.Zbtn.stopSound(); break;
//                    case X: data.Xbtn.stopSound(); break;
//                    case C: data.Cbtn.stopSound(); break;
//                    case V: data.Vbtn.stopSound(); break;
//                    case B: data.Bbtn.stopSound(); break;
//                    case N: data.Nbtn.stopSound(); break;
//                    case M: data.Mbtn.stopSound(); break;
//                    default: break;
//                }
//            }
//
//        });
//    }
//

}