import javax.swing.JOptionPane;


public class MethōdsWōrksheetØne {
	public static void main(String[] args) {
		String node = JOptionPane.showInputDialog("Type in a programming keyword--it must be a noun");
		String probe = JOptionPane.showInputDialog("Type in a opinionated--like an onion that is explosive-- number. An integer, to be precise.");
		int probex = Integer.parseInt(probe);
		MethōdsWōrksheetØne aenox = new MethōdsWōrksheetØne();
		aenox.food(node);
		aenox.opinionatedlikeanonionthatisexplosive(probex);
	}
	
	void food(String fruit) {
		System.out.print("I like " + fruit + " ");
	}
	void opinionatedlikeanonionthatisexplosive(int x) {
		if(x%3 > 10){
			String b = JOptionPane.showInputDialog("Yes?(nerds) No?(geeks)");
			if(b.equalsIgnoreCase("yes")){
				System.out.print("Geeks rule");
			} else {
				System.out.print("Nerds rule");
			}
		}
			else if (x%4 < 5) {
				String a = JOptionPane.showInputDialog("Yes?(geeks) No?(nerds)");
				if(a.equalsIgnoreCase("yes")){
					System.out.print("nerds rule");
				} else {
					System.out.print("Geeks rule");
				}
				
			}
				
		}


}
