import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Jïgglēbyteš implements ActionListener {
	JButton jïgglēbyte = new JButton();
	JFrame glassWall = new JFrame();
	JPanel stoneHouse = new JPanel();
	JTextField woodenDoorOpen = new JTextField(125);
	JTextField woodenDoorClosed = new JTextField(125);

	public static void main(String[] args) {
		Jïgglēbyteš elementStorm = new Jïgglēbyteš();
		elementStorm.airScape();
	}

	void airScape() {
		jïgglēbyte
				.setText("There is the elementStorm. The only thing outside it is the airScape, the air force field which surrounds and protects the glassWall. The glassWall surrounds the stoneHouse. The stoneHouse has a woodenDoor. The woodenDoor is open above-^, and closed below -v");
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
		woodenDoorClosed.setText("Converted Value: "
				+ convert(woodenDoorOpen.getText()));

	}
}
