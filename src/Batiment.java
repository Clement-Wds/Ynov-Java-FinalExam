
public class Batiment {
	
	private String type;
	private String name;
	private int resistancePoints;
	private int cost = 50;
	
	public Batiment(String type, String name, int resistancePoints, int cost) {
		this.type = type;
		this.name = name;
		this.resistancePoints = resistancePoints;
		this.cost = cost;
	}

}
