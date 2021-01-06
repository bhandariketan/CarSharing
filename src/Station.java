import java.util.ArrayList;

public class Station {
	private int stationNumber;
	private ArrayList<Passenger> people =  new ArrayList<Passenger>();
	
	
	public Station(int number) {
		this.stationNumber = number;
		
	}
	
	public int getNumber() {
		return this.stationNumber;
	}
	
	public void add(Passenger p) {
		people.add(p);
	}
	
	public Passenger get(int index) {
		return people.get(index);
	
	}
	
	public Passenger remove(int index) {
		return people.remove(index);
	}
	
	public ArrayList<Passenger> peopleWaitingList(){
		return this.people;
	}
	
	public String toString() {
		return "(" + this.people + this.stationNumber+")";
	}
}
