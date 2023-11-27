package nationalPark;

import java.util.Date;

public class Reservation {
	private Guest guest;
	private Date from;
	private Date to;
	private Campsite campsite;
	
	public Guest getGuest() {
		return guest;
	}
	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	public Campsite getCampiste() {
		return campsite;
	}
	
	public void setCampsite(Campsite campsite) {
		this.campsite = campsite;
	}

}
