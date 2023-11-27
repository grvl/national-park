package nationalPark;

public class Ranger implements Person{
	
	private String name;
	private String surname;
	private PhoneNumber home;
	private PhoneNumber work;
	private Park park;
	
	public Ranger(String name, String surname, String home, String work, Park park) throws Exception {
		setName(name);
		setSurname(surname);
		this.home = new PhoneNumber();
		this.work = new PhoneNumber();
		setHome(home);
		setWork(work);
		setPark(park);
		this.park.insertRanger(this);
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

	public String getHome() {
		return home.getPhoneNumber();
	}

	public void setHome(String home) throws Exception {
		this.home.setPhoneNumber(home);
	}

	public String getWork() {
		return work.getPhoneNumber();
	}

	public void setWork(String work) throws Exception {
		this.work.setPhoneNumber(work);
	}

	public Park getPark() {
		return park;
	}

	public void setPark(Park park) {
		this.park = park;
	}
}
