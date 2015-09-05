public class Platypus {
	Platypus(String name){
		this.name = "Gyfy";
	}
	
	private String name;

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus gyf = new Platypus("Gyfy");
		//2. Call the sayHi method
		gyf.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
}

