package nationalPark;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Park {
	private String name;
	private List<Campsite> campsites;
	private List<Ranger> rangers;
	
	public Park (String name) {
		setName(name);
		campsites = new ArrayList<Campsite>();
		rangers = new ArrayList<Ranger>();
	}
	
	public List<Campsite> getCampsites() {
		return campsites;
	}
	
	public void insertCampsite(Campsite campsite) {
		this.campsites.add(campsite);
	}
	
	public List<Ranger> getRangers() {
		return rangers;
	}
	
	public void insertRanger(Ranger ranger) {
		this.rangers.add(ranger);
	}
	
	public List<Ranger> getRangerByName(String name) {
		return rangers.stream().filter(r -> r.getName().equals(name) || r.getSurname().equals(name)).collect(Collectors.toList());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Campsite getMostPopularCampsite() {
		int mostVisitors = 0;
		Campsite mostPopular = null;
		for (Campsite campsite: campsites){
			int visitors = campsite.getReservations().size();
			if (visitors > mostVisitors) {
				mostVisitors = visitors;
				mostPopular = campsite;
			}
		}
		return mostPopular;
	}
}
