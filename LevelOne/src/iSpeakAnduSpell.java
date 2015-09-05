import javax.swing.JOptionPane;

public class iSpeakAnduSpell {

	public static void main(String[] args) {
speak("brghtohaugh");
		String jhser = JOptionPane.showInputDialog("Write the word spoken . Do it now!");
		
		// 3. If the user spelled the word embarrassing correctly, say "correct"
if (jhser.equals("brghtohaugh") ) {
	System.out.println("correct");
	speak("brghtohaugh");
}
speak("speil mandle kqjehfjshghjbsdjh jcxfgsjcdfscjbyrcgs adftscevysdjfcshbsd");
String vLo = JOptionPane.showInputDialog("Write the words spoken . Do it now!");

// 3. If the user spelled the word embarrassing correctly, say "correct"
if (vLo.equals("speil mandle kqjehfjshghjbsdjh jcxfgsjcdfscjbyrcgs adftscevysdjfcshbsd") ) {
System.out.println("correct");
speak("speil mandle kqjehfjshghjbsdjh jcxfgsjcdfscjbyrcgs adftscevysdjfcshbsd");
}

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
