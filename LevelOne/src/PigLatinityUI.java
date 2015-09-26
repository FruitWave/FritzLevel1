import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinityUI implements ActionListener {
	JButton jïgglēbyte = new JButton();
	JFrame glassWall = new JFrame();
	JPanel stoneHouse = new JPanel();
	JTextField woodenDoorOpen = new JTextField(40);
	JTextField woodenDoorClosed = new JTextField(40);

	public static void main(String[] args) {
		PigLatinityUI elementStorm = new PigLatinityUI();
		elementStorm.airScape();
	}

	void airScape() {
		jïgglēbyte.setText("This is the elementStorm.");
		stoneHouse.add(woodenDoorOpen);
		stoneHouse.add(jïgglēbyte);
		jïgglēbyte.addActionListener(this);
		stoneHouse.add(woodenDoorClosed);
		glassWall.add(stoneHouse);
		glassWall.pack();
		glassWall.setSize(1000, 1000);
		glassWall.setVisible(true);

	}

	String convert(String binary) {
		int ascendiconPlane = Integer.parseInt(binary, 2);
		char leafRune = (char) ascendiconPlane;
		return "" + leafRune;
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(woodenDoorOpen.getText());
		PigLatinTranslator piglatintranslatorobject = new PigLatinTranslator();
		woodenDoorClosed.setText(piglatintranslatorobject
				.translate(woodenDoorOpen.getText()));
	}
}
