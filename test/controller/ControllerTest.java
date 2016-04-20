package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Menu;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
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
import static org.junit.Assert.*;

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
    public File sound1;
    public File sound2;

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

        String OS = System.getProperty("os.name");
        if ( OS.startsWith("Windows") ) {

            sound1 = new File("bin\\Composite\\Loops\\Bass\\BassLoop (1).mp3");
            sound2 = new File("bin\\Composite\\Drums\\Snare\\AcousticSnare (1).mp3");
        }
        else {

            sound1 = new File("bin/Composite/Loops/Bass/BassLoop (1).mp3");
            sound2 = new File("bin/Composite/Drums/Snare/AcousticSnare (1).mp3");
        }
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void reset() throws Exception {

        try {

            Qbtn.setSound(sound1);
            Wbtn.setSound(sound1);
            Gbtn.setSound(sound1);

            Qbtn.getStyleClass().add("red");
            Wbtn.getStyleClass().add("violet");
            Gbtn.getStyleClass().add("active");

            Controller ctrl = new Controller();
            ctrl.btns = btns;

            ctrl.reset(new ActionEvent());
            assertNull("Unbind Qbtn sound track", Qbtn.getSound());
            assertEquals("Change Qbtn style class back to medium-bg", "button medium-bg" , Qbtn.getStyleClass().toString());
            assertNull("Unbind Wbtn sound track", Wbtn.getSound());
            assertEquals("Change Wbtn style class back to medium-bg", "button medium-bg" , Wbtn.getStyleClass().toString());
            assertNull("Unbind Gbtn sound track", Gbtn.getSound());
            assertEquals("Change Gbtn style class back to medium-bg", "button medium-bg" , Gbtn.getStyleClass().toString());

            System.out.printf("Reset: - passed\n" +
                    "\tUnbind all sounds\n" +
                    "\tChange style classes to medium-bgn\n\n");
        }
        catch ( AssertionError ae ) {

            System.out.printf("Reset: - failed\n" +
                    "\tUnbind all sounds\n" +
                    "\tChange style classes to medium-bg\n\n");
            fail(ae.getMessage());
        }
    }

    @Test
    public void playMusic() throws Exception {

        try {

            Qbtn.setSound(sound1);

            Controller ctrl = new Controller();
            ctrl.Qbtn = Qbtn;

            ctrl.playMusic(Qbtn);
            assertTrue("Start sound track", Qbtn.isPlaying());
            assertEquals("Add active to Qbtn's Style Class", "button active" , Qbtn.getStyleClass().toString());

            System.out.printf("Play Music: - passed\n" +
                    "\tStart playing the music track assigned to the Qbtn and change the Style Class\n\n");
        }
        catch ( AssertionError ae ) {

            System.out.printf("Play Music: - failed\n" +
                    "\tStart playing the music track assigned to the Qbtn and change the Style Class\n\n");
            fail(ae.getMessage());
        }
    }

    @Test
    public void stopMusic() throws Exception {

        try {

            Qbtn.setSound(sound1);
            Qbtn.getStyleClass().add("white");

            Controller ctrl = new Controller();
            ctrl.Qbtn = Qbtn;

            ctrl.playMusic(Qbtn);
            ctrl.stopMusic(Qbtn);
            assertFalse("Stop sound track", Qbtn.isPlaying());
            assertEquals("Remove active to Qbtn's Style Class", "button white" , Qbtn.getStyleClass().toString());

            System.out.printf("Stop Music: - passed\n" +
                    "\tStop playing the music track assigned to the Qbtn and change the Style Class\n\n");
        }
        catch ( AssertionError ae ) {

            System.out.printf("Stop Music: - failed\n" +
                    "\tStop playing the music track assigned to the Qbtn and change the Style Class\n\n");
            fail(ae.getMessage());
        }
    }

    @Test
    public void stopAll() throws Exception {

        try {

            Qbtn.setSound(sound1);
            Wbtn.setSound(sound1);
            Gbtn.setSound(sound1);

            Qbtn.getSound().setOnEndOfMedia(new Runnable() {
                public void run() {
                    Qbtn.stopSound();
                }
            });
            Wbtn.getSound().setOnEndOfMedia(new Runnable() {
                public void run() {
                    Wbtn.stopSound();
                }
            });
            Gbtn.getSound().setOnEndOfMedia(new Runnable() {
                public void run() {
                    Gbtn.stopSound();
                }
            });

            Controller ctrl = new Controller();
            ctrl.btns = this.btns;

            ctrl.playMusic(Qbtn);
            ctrl.playMusic(Wbtn);
            ctrl.playMusic(Gbtn);
            ctrl.stopAll();
            assertFalse("Stop all tracks, Qbtn", Qbtn.isPlaying());
            assertFalse("Stop all tracks, Wbtn", Wbtn.isPlaying());
            assertFalse("Stop all tracks, Gbtn", Gbtn.isPlaying());
            assertNull("Remove Qbtn On End of Media Event", Qbtn.getSound().getOnEndOfMedia());
            assertNull("Remove Wbtn On End of Media Event", Wbtn.getSound().getOnEndOfMedia());
            assertNull("Remove Gbtn On End of Media Event", Gbtn.getSound().getOnEndOfMedia());

            System.out.printf("Stop All: - passed\n" +
                    "\tStop all music tracks playing\n" +
                    "\tRemove any On End of Media Events\n\n");
        }
        catch ( AssertionError ae ) {

            System.out.printf("Stop All: - failed\n" +
                    "\tStop all music tracks playing\n" +
                    "\tRemove any On End of Media Events\n\n");
            fail(ae.getMessage());
        }
    }

    @Test
    public void toggleMusic() throws Exception {

        try {

            Qbtn.setSound(sound2);
            Qbtn.getStyleClass().add("white");

            Controller ctrl = new Controller();
            ctrl.Qbtn = Qbtn;
            ctrl.toggleMusic(Qbtn);
            assertTrue("Start playing", Qbtn.isPlaying());
            assertEquals("Change style class to active", "button white active" , Qbtn.getStyleClass().toString());

            Thread.sleep(2000);
            assertFalse("Stop Playing", Qbtn.isPlaying());
            assertEquals("Change style class to white", "button white" , Qbtn.getStyleClass().toString());

            ctrl.toggleMusic(Qbtn);
            assertTrue("Started Playing", Qbtn.isPlaying());
            ctrl.toggleMusic(Qbtn);
            assertFalse("Stopped Playing", Qbtn.isPlaying());

            System.out.printf("Toggle Music: - passed\n" +
                    "\tStart playing the music track\n" +
                    "\tStop playing if playing\n" +
                    "\tStop playing playback has ended\n" +
                    "\tWhen playing change style class to active\n" +
                    "\tWhen not playing change style class to white\n\n");
        }
        catch ( AssertionError ae ) {

            System.out.printf("Toggle Music: - failed\n" +
                    "\tStart playing the music track\n" +
                    "\tStop playing if playing\n" +
                    "\tStop playing playback has ended\n" +
                    "\tWhen playing change style class to active\n" +
                    "\tWhen not playing change style class to white\n\n");
            fail(ae.getMessage());
        }
    }

    @Test
    public void playMusicEvent() throws Exception {

        try {

            Qbtn.setSound(sound1);

            Controller ctrl = new Controller();
            ctrl.Qbtn = Qbtn;
            KeyEvent event = new KeyEvent(Qbtn, Qbtn, KEY_PRESSED, "", "Q", KeyCode.Q, false, false, false, false);

            ctrl.playMusicEvent(event);
            assertTrue("Start sound track", Qbtn.isPlaying());

            System.out.printf("Play Music Event: - passed\n" +
                    "\tStart playing the music track assigned to the Qbtn when key pressed\n\n");
        }
        catch ( AssertionError ae ) {

            System.out.printf("Play Music Event: - failed\n" +
                    "\tStart playing the music track assigned to the Qbtn when key pressed\n\n");
            fail(ae.getMessage());
        }
    }

    @Test
    public void stopMusicEvent() throws Exception {

        try {
            Qbtn.setSound(sound1);
            Controller ctrl = new Controller();
            ctrl.Qbtn = Qbtn;
            KeyEvent press = new KeyEvent(Qbtn, Qbtn, KEY_PRESSED, "", "Q", KeyCode.Q, false, false, false, false);
            KeyEvent release = new KeyEvent(Qbtn, Qbtn, KEY_RELEASED, "", "Q", KeyCode.Q, false, false, false, false);

            ctrl.playMusicEvent(press);
            ctrl.stopMusicEvent(release);
            assertFalse("Stop sound track", Qbtn.isPlaying());

            System.out.printf("Stop Music Event: - passed\n" +
                    "\tStop playing the music track assigned to the Qbtn when key released\n\n");
        }
        catch ( AssertionError ae ) {

            System.out.printf("Stop Music Event: - failed\n" +
                    "\tStop playing the music track assigned to the Qbtn when key released\n\n");
            fail(ae.getMessage());
        }
    }

    @Test
    public void toggleMusicEvent() throws Exception {

        try {

            Qbtn.setSound(sound1);
            Qbtn.getStyleClass().add("white");

            Controller ctrl = new Controller();
            ctrl.Qbtn = Qbtn;
            KeyEvent event = new KeyEvent(Qbtn, Qbtn, KEY_PRESSED, "", "Q", KeyCode.Q, false, false, false, false);

            ctrl.toggleMusicEvent(event);
            assertTrue("Start sound track", Qbtn.isPlaying());

            ctrl.toggleMusicEvent(event);
            assertFalse("Stop sound track", Qbtn.isPlaying());

            System.out.printf("Toggle Music Event: - passed\n" +
                    "\tStart playing the music track\n" +
                    "\tStop playing if playing\n\n");
        }
        catch ( AssertionError ae ) {

            System.out.printf("Toggle Music Event: - failed\n" +
                    "\tStart playing the music track\n" +
                    "\tStop playing if playing\n\n");
            fail(ae.getMessage());
        }
    }

    @Test
    public void toggleTapHold() throws Exception {

        try {

            boolean tapHoldToggle = false;
            Qbtn.setSound(sound1);
            KeyEvent press = new KeyEvent(Qbtn, Qbtn, KEY_PRESSED, "", "Q", KeyCode.Q, false, false, false, false);
            KeyEvent release = new KeyEvent(Qbtn, Qbtn, KEY_RELEASED, "", "Q", KeyCode.Q, false, false, false, false);

            Controller ctrl = new Controller();
            ctrl.tapHoldToggle = tapHoldToggle;
            ctrl.playStopToggle = new MenuItem();
            ctrl.gui = new Pane();
            ctrl.btns = btns;
            ctrl.Qbtn = Qbtn;

            ctrl.toggleTapHold(new ActionEvent());

            assertTrue("Toggle tapHoldToggle to TAP", ctrl.tapHoldToggle);
            assertEquals("Swap playStopToggle to 'Hold to Play'", "Hold to Play" , ctrl.playStopToggle.getText());

            ctrl.gui.getOnKeyPressed().handle(press);
            ctrl.gui.getOnKeyPressed().handle(press);
            assertFalse("Set onKeyPressed to toggleMusicEvent", Qbtn.isPlaying());
            assertNull("Set onKeyReleased to null", ctrl.gui.getOnKeyReleased());

            ctrl.toggleTapHold(new ActionEvent());

            assertFalse("Toggle tapHoldToggle to HOLD", ctrl.tapHoldToggle);
            assertEquals("Swap playStopToggle to 'Tap to Play'", "Tap to Play" , ctrl.playStopToggle.getText());

            ctrl.gui.getOnKeyPressed().handle(press);
            ctrl.gui.getOnKeyPressed().handle(press);
            assertTrue("Set onKeyPressed to playMusicEvent", Qbtn.isPlaying());

            ctrl.gui.getOnKeyReleased().handle(release);
            assertFalse("Set onKeyReleased to stopMusicEvent", Qbtn.isPlaying());

            System.out.printf("Toggle Tap Hold: - passed\n" +
                    "\tToggle between hold to play and tap to play");
        }
        catch ( AssertionError ae ) {

            System.out.printf("Toggle Tap Hold: - failed\n" +
                    "\tToggle between hold to play and tap to play");
            fail(ae.getMessage());
        }
    }

    @Test
    public void styleButton() throws Exception {

        try {

            Circle circle = new Circle();
            circle.setRadius(6);
            circle.getStyleClass().add("red");
            MenuItem item = new MenuItem("red", circle);
            Qbtn.getStyleClass().add("white");

            Controller ctrl = new Controller();
            ctrl.Qbtn = Qbtn;
            ActionEvent event = new ActionEvent(item, null);

            ctrl.styleButton(Qbtn, event);
            assertEquals("Change Qbtn's style class to red", "button red" , Qbtn.getStyleClass().toString());

            System.out.printf("Style Button: - passed\n" +
                    "\tChange the style class of the button\n\n");
        }
        catch ( AssertionError ae ) {

            System.out.printf("Style Button: - failed\n" +
                    "\tChange the style class of the button\n\n");
            fail(ae.getMessage());
        }
    }

    @Test
    public void clearColors() throws Exception {

        try {

            Qbtn.setSound(sound1);
            Hbtn.setSound(sound1);
            Qbtn.getStyleClass().add("red");
            Hbtn.getStyleClass().add("blue");
            Tbtn.getStyleClass().add("green");
            Xbtn.getStyleClass().add("red");

            Controller ctrl = new Controller();
            ctrl.btns = btns;

            ctrl.clearColors(new ActionEvent());
            assertEquals("Change Qbtn's style class to white", "button white", Qbtn.getStyleClass().toString());
            assertEquals("Change Hbtn's style class to white", "button white", Hbtn.getStyleClass().toString());
            assertEquals("Change Tbtn's style class to medium-bg", "button medium-bg", Tbtn.getStyleClass().toString());
            assertEquals("Change Xbtn's style class to medium-bg", "button medium-bg", Xbtn.getStyleClass().toString());

            System.out.printf("Clear Colors: - passed\n" +
                    "\tReset all button style classes back\n" +
                    "\t\twhite if a music track is assigned\n" +
                    "\t\tmedium-bg otherwise\n\n");
        } catch (AssertionError ae) {

            System.out.printf("Clear Colors: - failed\n" +
                    "\tReset all button style classes back\n" +
                    "\t\twhite if a music track is assigned\n" +
                    "\t\tmedium-bg otherwise\n\n");
            fail(ae.getMessage());
        }
    }

    @Test
    public void colorMenuItem() throws Exception {

        try {

            Qbtn.getStyleClass().add("white");

            Controller ctrl = new Controller();
            ctrl.Qbtn = Qbtn;
            MenuItem item = ctrl.colorMenuItem(Qbtn, "red");

            assertEquals("Create a circle with the style class red", "red", item.getGraphic().getStyleClass().toString());
            assertEquals("Menuitem text is Red", "Red", item.getText());
            
            item.getOnAction().handle(new ActionEvent(item, null));
            assertEquals("Change the style class of the Qbtn to red", "button red", Qbtn.getStyleClass().toString());

            System.out.printf("Color Menu Item: - passed\n" +
                    "\tCreate a menu item for the colors sub-menu\n" +
                    "\tCreate an event handler for the menu item");
        } catch ( AssertionError ae ) {

            System.out.printf("Color Menu Item: - failed\n" +
                    "\tCreate a menu item for the colors sub-menu\n" +
                    "\tCreate an event handler for the menu item");
            fail(ae.getMessage());
        }
    }
}
