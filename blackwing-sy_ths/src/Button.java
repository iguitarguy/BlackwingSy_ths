

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.JButton;



import java.awt.event.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Button extends javafx.scene.control.Button{

	private Media sound;
	//private boolean playing;
	private Media media;
	private File player;
	private MediaPlayer playerSound;
	private JButton q,w,e,a,s,d,z,x,c;
	private MediaPlayer thisSound;
	
	InputStream inputStream = getClass().getResourceAsStream("SOUND_FILENAME");
	private String text;
	
	
	public Button() {
		// instantiate buttons 'q,w'e,a,s,d,z,x,c' to be able to be used as usable buttons
		q = new JButton("Q");
		w = new JButton("W");
		e = new JButton("E");
		a = new JButton("A");
		s = new JButton("S");
		d = new JButton("D");
		z = new JButton("Z");
		x = new JButton("X");
		c = new JButton("C");
		
		q.setHorizontalAlignment(AbstractButton.LEADING);
		
		// set the binding of key to button
		q.setMnemonic(KeyEvent.VK_Q);
		w.setMnemonic(KeyEvent.VK_W);
		e.setMnemonic(KeyEvent.VK_E);
		a.setMnemonic(KeyEvent.VK_A);
		s.setMnemonic(KeyEvent.VK_S);
		d.setMnemonic(KeyEvent.VK_D);
		z.setMnemonic(KeyEvent.VK_Z);
		x.setMnemonic(KeyEvent.VK_X);
		c.setMnemonic(KeyEvent.VK_C);
		
		/**add(q);
		add(w);
		add(e);
		add(a);
		add(s);
		add(d);
		add(z);
		add(x);
		add(c);**/
		
		
	}

	public Button(String text) {
		super(text);
	}

	public void setSound(String str) {
		// implement github example options. 
		URL path = Button.class.getResource(str);
		File soundFile = new File(path.getPath());
		this.sound = new Media(soundFile.toURI().toString());
		this.thisSound = new MediaPlayer(this.sound);
	}

	public void setSound(Media media ) {
		this.media = media;
		
	}

	public void setSound(File player) {
		this.player = player;
		this.thisSound = new MediaPlayer(this.sound);
	}

	public Media getSound() {
        return sound;
	}

	public void playSound() throws IOException{
		try {
			AudioStream audioStream = new AudioStream(inputStream);
			AudioPlayer.player.start(audioStream);
		} catch (Exception e) {
			System.out.println("An error: "+ e +", has occured while trying to play!");
		}
	}

	public void stopSound() throws IOException {
		try{
		AudioStream audioStream = new AudioStream(inputStream);
		AudioPlayer.player.stop(audioStream);
		} catch (Exception e) {
			System.out.println("An error: "+ e +", has occured while trying to stop!");
		}
	}

	public boolean isPlaying() throws IOException {
		try{
			if (AudioPlayer.player.isAlive()== true){
				System.out.println("Sound is playing.");
				return true;
			}
		} catch (Exception e) {
			System.out.println("An error: " + e + ", has occured.");
		}
		System.out.println("Sound is not playing.");
        return false;
	}

}
