package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Button;
import model.MenuItem;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

import static javafx.scene.input.KeyEvent.KEY_PRESSED;
import static javafx.scene.input.KeyEvent.KEY_RELEASED;

/**
 * ControllerTest
 * @author Mike Deiters
 * @version 1.0
 *
 * Description: Unit Tests for Controller
 */
public class ControllerTest {

    public Button N1btn;
    public Button N2btn;
    public Button N3btn;
    public Button N4btn;
    public Button N5btn;
    public Button N6btn;
    public Button N7btn;
    public Button N8btn;
    public Button N9btn;
    public Button N0btn;
    public Button Qbtn;
    public Button Wbtn;
    public Button Ebtn;
    public Button Rbtn;
    public Button Tbtn;
    public Button Ybtn;
    public Button Ubtn;
    public Button Ibtn;
    public Button Obtn;
    public Button Pbtn;
    public Button Abtn;
    public Button Sbtn;
    public Button Dbtn;
    public Button Fbtn;
    public Button Gbtn;
    public Button Hbtn;
    public Button Jbtn;
    public Button Kbtn;
    public Button Lbtn;
    public Button Zbtn;
    public Button Xbtn;
    public Button Cbtn;
    public Button Vbtn;
    public Button Bbtn;
    public Button Nbtn;
    public Button Mbtn;
    public ArrayList< Button > btns;

    public static class testApp extends Application {

        @Override
        public void start( Stage primaryStage ) throws Exception {

        }
    }

    @BeforeClass
    public static void initJFX() throws InterruptedException {

        System.out.println("About to launch FX App\n");
        Thread t1 = new Thread("Java init thread") {
            @Override
            public void run() {
                Application.launch(testApp.class, new String[ 0 ]);
            }
        };
        t1.setDaemon(true);
        t1.start();
        System.out.println("FX App thread started\n");
        Thread.sleep(500);
    }

    @Before
    public void setUp() throws Exception {

        N1btn = new Button("1");
        N2btn = new Button("2");
        N3btn = new Button("3");
        N4btn = new Button("4");
        N5btn = new Button("5");
        N6btn = new Button("6");
        N7btn = new Button("7");
        N8btn = new Button("8");
        N9btn = new Button("9");
        N0btn = new Button("0");
        Qbtn = new Button("Q");
        Wbtn = new Button("W");
        Ebtn = new Button("E");
        Rbtn = new Button("R");
        Tbtn = new Button("T");
        Ybtn = new Button("Y");
        Ubtn = new Button("U");
        Ibtn = new Button("I");
        Obtn = new Button("O");
        Pbtn = new Button("P");
        Abtn = new Button("A");
        Sbtn = new Button("S");
        Dbtn = new Button("D");
        Fbtn = new Button("F");
        Gbtn = new Button("G");
        Hbtn = new Button("H");
        Jbtn = new Button("J");
        Kbtn = new Button("K");
        Lbtn = new Button("L");
        Zbtn = new Button("Z");
        Xbtn = new Button("X");
        Cbtn = new Button("C");
        Vbtn = new Button("V");
        Bbtn = new Button("B");
        Nbtn = new Button("N");
        Mbtn = new Button("M");

        btns = new ArrayList();

        btns.add(N1btn);
        btns.add(N2btn);
        btns.add(N3btn);
        btns.add(N4btn);
        btns.add(N5btn);
        btns.add(N6btn);
        btns.add(N7btn);
        btns.add(N8btn);
        btns.add(N9btn);
        btns.add(N0btn);
        btns.add(Qbtn);
        btns.add(Wbtn);
        btns.add(Ebtn);
        btns.add(Rbtn);
        btns.add(Tbtn);
        btns.add(Ybtn);
        btns.add(Ubtn);
        btns.add(Ibtn);
        btns.add(Obtn);
        btns.add(Pbtn);
        btns.add(Abtn);
        btns.add(Sbtn);
        btns.add(Dbtn);
        btns.add(Fbtn);
        btns.add(Gbtn);
        btns.add(Hbtn);
        btns.add(Jbtn);
        btns.add(Kbtn);
        btns.add(Lbtn);
        btns.add(Zbtn);
        btns.add(Xbtn);
        btns.add(Cbtn);
        btns.add(Vbtn);
        btns.add(Bbtn);
        btns.add(Nbtn);
        btns.add(Mbtn);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void reset() throws Exception {

        System.out.printf("Reset:\n" +
                "Unbind all sounds\n" +
                "Change style classes to medium-bgn\n\n");

        System.out.printf("Set Qbtn to BassLoop (1).mp3\n");
        Qbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));
        System.out.printf("Set Wbtn to BassLoop (1).mp3\n");
        Wbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));
        System.out.printf("Set Gbtn to BassLoop (1).mp3\n");
        Gbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));

        System.out.printf("Change the style class of Qbtn to red\n");
        Qbtn.getStyleClass().add("red");
        System.out.printf("Change the style class of Wbtn to violet\n");
        Wbtn.getStyleClass().add("violet");
        System.out.printf("Change the style class of Gbtn to active\n");
        Gbtn.getStyleClass().add("active");

        Controller ctrl = new Controller();
        System.out.printf("Intercept All Buttons\n");
        ctrl.btns = btns;

        System.out.printf("Unbind sound tracks\n" +
                "Change style class back to medium-bg\n\n");
        ctrl.reset(new ActionEvent());
        assert ( Qbtn.getSound() == null );
        assert ( Qbtn.getStyleClass().toString().equals("button medium-bg") );
        assert ( Wbtn.getSound() == null );
        assert ( Wbtn.getStyleClass().toString().equals("button medium-bg") );
        assert ( Gbtn.getSound() == null );
        assert ( Gbtn.getStyleClass().toString().equals("button medium-bg") );
    }

    @Test
    public void playMusic() throws Exception {

        System.out.printf("\nPlay Music:\nStart playing the music track assigned to the Qbtn and change the Style Class\n\n");

        System.out.printf("Set Qbtn to BassLoop (1).mp3\n");
        Qbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));

        Controller ctrl = new Controller();
        System.out.printf("Intercept Qbtn\n");
        ctrl.Qbtn = Qbtn;

        System.out.printf("Start sound track\n");
        System.out.printf("Add active to Qbtn's Style Class\n\n");
        ctrl.playMusic(Qbtn);
        assert ( Qbtn.isPlaying() );
        assert ( Qbtn.getStyleClass().toString().equals("button active") );
    }

    @Test
    public void stopMusic() throws Exception {

        System.out.printf("\nStop Music:\nStop playing the music track assigned to the Qbtn and change the Style Class\n\n");

        System.out.printf("Set Qbtn to BassLoop (1).mp3\n");
        Qbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));

        System.out.printf("Add the white Style Class to Qbtn\n");
        Qbtn.getStyleClass().add("white");

        Controller ctrl = new Controller();
        System.out.printf("Intercept Qbtn\n");
        ctrl.Qbtn = Qbtn;

        System.out.printf("Stop sound track\n");
        System.out.printf("Remove active to Qbtn's Style Class\n\n");
        ctrl.playMusic(Qbtn);
        ctrl.stopMusic(Qbtn);
        assert ( !Qbtn.isPlaying() );
        System.out.println(Qbtn.getStyleClass());
        assert ( Qbtn.getStyleClass().toString().equals("button white") );
    }

    @Test
    public void stopAll() throws Exception {

        System.out.printf("\nStop All:\nStop all music tracks playing\nRemove any On End of Media Events\n\n");

        System.out.printf("Set Qbtn to BassLoop (1).mp3\n");
        Qbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));
        System.out.printf("Set Wbtn to BassLoop (1).mp3\n");
        Wbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));
        System.out.printf("Set Gbtn to BassLoop (1).mp3\n");
        Gbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));

        System.out.printf("Set On End of Media Event to Qbtn\n");
        Qbtn.getSound().setOnEndOfMedia(new Runnable() {
            public void run() {
                Qbtn.stopSound();
            }
        });
        System.out.printf("Set On End of Media Event to Wbtn\n");
        Wbtn.getSound().setOnEndOfMedia(new Runnable() {
            public void run() {
                Wbtn.stopSound();
            }
        });
        System.out.printf("Set On End of Media Event to Gbtn\n");
        Gbtn.getSound().setOnEndOfMedia(new Runnable() {
            public void run() {
                Gbtn.stopSound();
            }
        });

        Controller ctrl = new Controller();
        System.out.printf("Intercept All Buttons\n");
        ctrl.btns = this.btns;

        System.out.printf("Stop all tracks\n");
        System.out.printf("Remove On End of Media Events\n\n");
        ctrl.playMusic(Qbtn);
        ctrl.playMusic(Wbtn);
        ctrl.playMusic(Gbtn);
        ctrl.stopAll();
        assert ( !Qbtn.isPlaying() && !Wbtn.isPlaying() && !Gbtn.isPlaying() );
        assert ( Qbtn.getSound().getOnEndOfMedia() == null );
        assert ( Wbtn.getSound().getOnEndOfMedia() == null );
        assert ( Gbtn.getSound().getOnEndOfMedia() == null );
    }

    @Test
    public void toggleMusic() throws Exception {

        System.out.printf("Toggle Music:\n" +
                "Start playing the music track\n" +
                "Stop playing if playing\n" +
                "Stop playing playback has ended\n" +
                "When playing change style class to active\n" +
                "When not playing change style class to white\n\n");

        System.out.printf("Set Qbtn to AcousticSnare (1).mp3\n");
        Qbtn.setSound(new File("bin/Composite/Drums/Snare/AcousticSnare (1).mp3"));

        System.out.printf("Add the white Style Class to Qbtn\n");
        Qbtn.getStyleClass().add("white");

        Controller ctrl = new Controller();
        System.out.printf("Intercept Qbtn\n");
        ctrl.Qbtn = Qbtn;
        System.out.printf("Start playing\n" +
                "Change style class to active\n");
        ctrl.toggleMusic(Qbtn);
        assert ( Qbtn.isPlaying() );
        assert ( Qbtn.getStyleClass().toString().equals("button white active") );

        Thread.sleep(2000);
        System.out.printf("Stop playing\n" +
                "Change style class to white\n");
        assert ( !Qbtn.isPlaying() );
        assert ( Qbtn.getStyleClass().toString().equals("button white") );

        System.out.printf("Start then Stop playing\n\n");
        ctrl.toggleMusic(Qbtn);
        assert ( Qbtn.isPlaying() );
        ctrl.toggleMusic(Qbtn);
        assert ( !Qbtn.isPlaying() );
    }

    @Test
    public void playMusicEvent() throws Exception {

        System.out.printf("\nPlay Music Event:\nStart playing the music track assigned to the Qbtn when key pressed\n\n");

        System.out.printf("Set Qbtn sound to BassLoop (1).mp3\n");
        Qbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));

        Controller ctrl = new Controller();
        System.out.printf("Intercept Qbtn\n");
        ctrl.Qbtn = Qbtn;

        System.out.printf("Emulate a KEY_PRESSED KeyEvent of the \'Q\' button\n");
        KeyEvent event = new KeyEvent(Qbtn, Qbtn, KEY_PRESSED, "", "Q", KeyCode.Q, false, false, false, false);

        System.out.printf("Start sound track\n\n");
        ctrl.playMusicEvent(event);
        assert ( Qbtn.isPlaying() );
    }

    @Test
    public void stopMusicEvent() throws Exception {

        System.out.printf("\nStop Music Event:\nStop playing the music track assigned to the Qbtn when key released\n\n");

        System.out.printf("Set Qbtn sound to BassLoop (1).mp3\n");
        Qbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));
        Controller ctrl = new Controller();

        System.out.printf("Intercept Qbtn\n");
        ctrl.Qbtn = Qbtn;

        System.out.printf("Emulate a KEY_RELEASED KeyEvent of the \'Q\' button\n");
        KeyEvent press = new KeyEvent(Qbtn, Qbtn, KEY_PRESSED, "", "Q", KeyCode.Q, false, false, false, false);
        KeyEvent release = new KeyEvent(Qbtn, Qbtn, KEY_RELEASED, "", "Q", KeyCode.Q, false, false, false, false);

        System.out.printf("Stop sound track\n\n");
        ctrl.playMusicEvent(press);
        ctrl.stopMusicEvent(release);
        assert ( !Qbtn.isPlaying() );
    }

    @Test
    public void toggleMusicEvent() throws Exception {

        System.out.printf("Toggle Music Event:\n" +
                "Start playing the music track\n" +
                "Stop playing if playing\n\n");

        System.out.printf("Set Qbtn to BassLoop (1).mp3\n");
        Qbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));
        Qbtn.getStyleClass().add("white");

        Controller ctrl = new Controller();
        System.out.printf("Intercept Qbtn\n");
        ctrl.Qbtn = Qbtn;

        System.out.printf("Emulate a KEY_PRESSED KeyEvent of the \'Q\' button\n");
        KeyEvent event = new KeyEvent(Qbtn, Qbtn, KEY_PRESSED, "", "Q", KeyCode.Q, false, false, false, false);

        System.out.printf("Start sound track\n");
        ctrl.toggleMusicEvent(event);
        assert ( Qbtn.isPlaying() );

        System.out.printf("Stop sound track\n");
        ctrl.toggleMusicEvent(event);
        assert ( !Qbtn.isPlaying() );
    }

    @Test
    public void toggleTapHold() {

        System.out.printf("Toggle Tap Hold:\n" +
                "Toggle between hold to play and tap to play\n\n");

        System.out.printf("Set tapHoldToggle to HOLD\n");
        boolean tapHoldToggle = false;

        System.out.printf("Set Qbtn sound to BassLoop (1).mp3\n");
        Qbtn.setSound(new File("bin/Composite/Loops/Bass/BassLoop (1).mp3"));

        System.out.printf("Emulate a KEY_PRESSED KeyEvent of the \'Q\' button\n");
        KeyEvent press = new KeyEvent(Qbtn, Qbtn, KEY_PRESSED, "", "Q", KeyCode.Q, false, false, false, false);

        System.out.printf("Emulate a KEY_RELEASED KeyEvent of the \'Q\' button\n");
        KeyEvent release = new KeyEvent(Qbtn, Qbtn, KEY_RELEASED, "", "Q", KeyCode.Q, false, false, false, false);

        Controller ctrl = new Controller();
        System.out.printf("Intercept tapHoldToggle\n" +
                "Intercept playStopToggle\n" +
                "Intercept gui\n" +
                "Intercept all buttons\n");
        ctrl.tapHoldToggle = tapHoldToggle;
        ctrl.playStopToggle = new MenuItem();
        ctrl.gui = new Pane();
        ctrl.btns = btns;
        ctrl.Qbtn = Qbtn;

        ctrl.toggleTapHold(new ActionEvent());

        System.out.printf("Toggle tapHoldToggle to TAP\n");
        assert (ctrl.tapHoldToggle);

        System.out.printf("Swap playStopToggle to 'Hold to Play'\n");
        assert (ctrl.playStopToggle.getText().equals("Hold to Play"));

        System.out.printf("Set onKeyPressed to toggleMusicEvent\n");
        ctrl.gui.getOnKeyPressed().handle(press);
        ctrl.gui.getOnKeyPressed().handle(press);
        assert (!Qbtn.isPlaying());

        System.out.printf("Set onKeyReleased to null\n\n");
        assert (ctrl.gui.getOnKeyReleased() == null);


        ctrl.toggleTapHold(new ActionEvent());

        System.out.printf("Toggle tapHoldToggle to HOLD\n");
        assert (!ctrl.tapHoldToggle);

        System.out.printf("Swap playStopToggle to 'Tap to Play'\n");
        assert (ctrl.playStopToggle.getText().equals("Tap to Play"));

        System.out.printf("Set onKeyPressed to playMusicEvent\n");
        ctrl.gui.getOnKeyPressed().handle(press);
        ctrl.gui.getOnKeyPressed().handle(press);
        assert (Qbtn.isPlaying());

        System.out.printf("Set onKeyReleased to stopMusicEvent\n\n");
        ctrl.gui.getOnKeyReleased().handle(release);
        assert (!Qbtn.isPlaying());
    }
}
