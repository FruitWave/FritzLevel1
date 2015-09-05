import java.applet.AudioClip;

import javax.swing.JApplet;

public class Utility {
	public static void playMusic(Object o, String soundFile) {
		AudioClip sound = JApplet.newAudioClip(o.getClass().getResource(
				soundFile));
		sound.play();
	}

	public static void main(String[] args) {

	}

}
