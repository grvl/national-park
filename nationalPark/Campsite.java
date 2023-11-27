package nationalPark;

import java.util.ArrayList;
import java.util.List;

public class Campsite {
	private String name;
	private Park park;
	private List<Reservation> reservations;
	private int parkingSpace;
	
	public Campsite(String name, int parkingSpace, Park park) {
		setName(name);
		setPark(park);
		setParkingSpace(parkingSpace);
		this.park.insertCampsite(this);
		setReservations(new ArrayList<>());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Park getPark() {
		return park;
	}

	public void setPark(Park park) {
		this.park = park;
	}

	public int getParkingSpace() {
		return parkingSpace;
	}

	public void setParkingSpace(int parkingSpace) {
		this.parkingSpace = parkingSpace;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	public void addReservation(Reservation reservation) {
		this.reservations.add(reservation);
	}
}
