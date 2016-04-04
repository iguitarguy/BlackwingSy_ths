package controller;

import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.Button;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

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

    public static class testApp extends Application {

        public Button Qbtn;

        @Override
        public void start( Stage primaryStage ) throws Exception {

            Qbtn = new Button("Q");
        }
    }

    @BeforeClass
    public static void initJFX() throws InterruptedException {

        System.out.println("About to launch FX App\n");
        Thread t1 = new Thread("Java init thread") {
            @Override
            public void run() {
                Application.launch(testApp.class, new String[0]);
            }
        };
        t1.setDaemon(true);
        t1.start();
        System.out.println("FX App thread started\n");
        Thread.sleep(500);
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void assignMusic() throws Exception {

    }

    @Test
    public void playMusic() throws Exception {

        System.out.printf("\nPlay Music:\nStart playing the music track assigned to the Qbtn when key pressed\n\n");
        Button Qbtn = new Button();

        System.out.printf("Set Qbtn sound to bassloop-17.mp3\n");
        Qbtn.setSound(new File("bin/Composite/bassloop-17.mp3"));

        Controller ctrl = new Controller();
        System.out.printf("Intercept Qbtn\n");
        ctrl.Qbtn = Qbtn;

        System.out.printf("Emulate a KEY_PRESSED KeyEvent of the \'Q\' button\n");
        KeyEvent event = new KeyEvent(Qbtn, Qbtn, KEY_PRESSED, "", "Q", KeyCode.Q, false, false, false, false);

        System.out.printf("Start sound track\n\n");
        ctrl.playMusic(event);
        assert (Qbtn.isPlaying());
    }

    @Test
    public void stopMusic() throws Exception {

        System.out.printf("\nStop Music:\nStop playing the music track assigned to the Qbtn when key released\n\n");
        Button Qbtn = new Button();

        System.out.printf("Set Qbtn sound to bassloop-17.mp3\n");
        Qbtn.setSound(new File("bin/Composite/bassloop-17.mp3"));
        Controller ctrl = new Controller();

        System.out.printf("Intercept Qbtn\n");
        ctrl.Qbtn = Qbtn;

        System.out.printf("Emulate a KEY_RELEASED KeyEvent of the \'Q\' button\n");
        KeyEvent press = new KeyEvent(Qbtn, Qbtn, KEY_PRESSED, "", "Q", KeyCode.Q, false, false, false, false);
        KeyEvent release = new KeyEvent(Qbtn, Qbtn, KEY_RELEASED, "", "Q", KeyCode.Q, false, false, false, false);

        System.out.printf("Stop sound track\n\n");
        ctrl.playMusic(press);
        ctrl.stopMusic(release);
        assert (!Qbtn.isPlaying());
    }
}