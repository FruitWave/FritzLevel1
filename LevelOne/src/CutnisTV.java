Iimport java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CutnisTV implements ActionnListener{
	JButton thefirstbutton = new JButton();
	JButton thesecondbutton = new JButton();
	JButton thethirdbutton = new JButton();
	JFrame frame1 = new JFrame();
	JPanel pOne = new JPanel();
	
	
	public static void main(String[] args) {
		CutnisTV intitObj = new CutnisTV();
		intitObj.createUI();
	}
	
	void createUI(){
		thefirstbutton.setText("Click this because I spelld this correctly!");
		thesecondbutton.setText("Click this because that other button is a liar!");
		thethirdbutton.setText("Click this because I said so!!!");
		pOne.add(thefirstbutton);
		pOne.add(thesecondbutton);
		pOne.add(thethirdbutton);
		frame1.add(pOne);
		frame1.pack();
		frame1.setVisible(true);
		thefirstbutton.addActionListener(this);
		thesecondbutton.addActionListener(this);
		thethirdbutton.addActionListener(this);

		
	}
	
	
	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=B00nfVc4FPI");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=sd4bqmP_460");
	}
	
	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=Qit3ALTelOo00");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("You did the wrong thing, idiot!");
		System.out.println("                  -the other two buttons");
	}



}
