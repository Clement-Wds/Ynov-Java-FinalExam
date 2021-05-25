
public class Equipement {
	
	private String type;
	private String name;
	private int actionPoints;
	private String description;
	private int cost = 30;
	
	public Equipement(String type, String name, int actionPoints, String description, int cost) {
		this.type = type;
		this.name = name;
		this.actionPoints = actionPoints;
		this.description = description;
		this.cost = cost;
	}

}
