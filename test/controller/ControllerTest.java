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

        Button Qbtn = new Button();
        Qbtn.setSound(new File("bin/Composite/bassloop-17.mp3"));
        Controller ctrl = new Controller();
        ctrl.Qbtn = Qbtn;
        KeyEvent event = new KeyEvent(Qbtn, Qbtn, KEY_PRESSED, "", "Q", KeyCode.Q, false, false, false, false);
        ctrl.playMusic(event);
        assert (Qbtn.isPlaying());
    }

    @Test
    public void stopMusic() throws Exception {

    }
}