public class Tæčœ {
	String sauce;
	String meat;

	Tæčœ cornStuff = new Tæčœ("pork", "guacamole");

	public Tæčœ(String sauce, String meat) {
		this.meat = meat;
		this.sauce = sauce;
	}

	public String setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String setMeat(String meat) {
		this.meat = meat;
	}

	public String getSauce(String sauce) {
		return sauce;
	}

	public String getMeat(String meat) {
		return meat;
	}

}