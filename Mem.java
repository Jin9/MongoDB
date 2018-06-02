import java.util.List;



public class Mem {
	private String name;
	private String street;
	private String borough;
	private List<Double> coordinates;
	
	public Mem(String name, String street, String borough){
		this.name = name;
		this.street = street;
		this.borough = borough;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBorough() {
		return borough;
	}

	public void setBorough(String borough) {
		this.borough = borough;
	}

	public List<Double> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<Double> coordinates) {
		this.coordinates = coordinates;
	}
	
	
}
