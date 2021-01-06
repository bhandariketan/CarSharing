
public class Passenger {
	private String name;
	private int destination;
	
	public Passenger(String name, int destination) {
		this.name = name;
		this.destination = destination;
	}
	
	public int getDestination() {
		return this.destination;
	}
	
	public String toString() {
		return   this.name + this.destination;
	}
}
