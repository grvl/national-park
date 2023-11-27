package nationalPark;

import java.util.ArrayList;
import java.util.List;

public class Guest implements Person {
	private String name;
	private String surname;
	private PhoneNumber phone;
	private List<Reservation> reservations;
	
	public Guest(String name, String surname, String phone) {
		setName(name);
		setSurname(surname);
		setReservations(new ArrayList<>());
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getFullName() {
		return name + ' ' + surname;
	}
	
	public void setName(String name) {
	   this.name = name;
	}

	public void setSurname(String surname) {
	   this.surname = surname;
	}
	
	public String getPhone() {
		return phone.getPhoneNumber();
	}

	public void setPhone(String phone) throws Exception {
		this.phone.setPhoneNumber(phone);
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
