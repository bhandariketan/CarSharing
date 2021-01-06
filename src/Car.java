import java.util.ArrayList;

public class Car {
	private int idNo;
	private int destination;
	private int location;
	private ArrayList<Passenger> passengers = new ArrayList<Passenger>();
	private double faresCollected;
	private int milesDriven;
	private final double FAREPERMILE = 1.0;
	private final int MAXPASSENGERS = 3;
	
	public Car(int idNo, int location,int destination) {
		this.idNo = idNo;
		this.destination = destination;
		this.location = location;
	}

	public int getIdNo() {
		return idNo;
	}

	public int getDestination() {
		return destination;
	}

	public int getLocation() {
		return location;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public double getFares() {
		return faresCollected;
	}

	public int getMilesDriven() {
		return milesDriven;
	}
	
	public boolean hasArrived() {
		if(location == destination) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean hasRoom() {
		if(passengers.size() == MAXPASSENGERS) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void drive() {
		if(hasArrived() == false) {
			location++;
			milesDriven += FAREPERMILE;
			faresCollected = passengers.size()*milesDriven;
			System.out.println("Car "+ idNo +" drives to station "+ location);
		}
	}
	
	public boolean dropOff() {
		boolean drop = false;
		int index = 0;
		while (!passengers.isEmpty() && index < passengers.size()) {
			if(location == passengers.get(index).getDestination()) {
				drop = true;
				System.out.println("Car"+ idNo +" drops off "+ passengers.get(index) +" at station "+ location +". Now has "+ (passengers.size() -1) +" passengers");
				passengers.remove(index);				
			}
			else {
				index++;
			}
		}
		return drop;
	}
	
	public boolean add(Passenger p) {
		if (hasRoom() == true) {
			passengers.add(p);
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "[idNo = "+ this.idNo +",location = "+this.location+ ", destination = "+this.destination+", passengers = "+ this.passengers+"]";
	}
}
