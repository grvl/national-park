package nationalPark;

import java.util.List;

/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
	private static void getRangerPhoneByName(Park park, String name) {
        List<Ranger> rangers = park.getRangerByName(name);
        if (rangers.size()> 0)
        	System.out.println(rangers.size() + " ranger(s) found with the name " + name + ". Returning the first one: " + rangers.get(0).getHome());
        else
        	System.out.println("No rangers found.");
	}
	
    public static void main(String[] args) throws Exception {
    	Park park = new Park("Parky Park");
        new Ranger("", "Smith", "+35399988771", "+35368978731", park);        
        new Ranger("", "Roger", "+35399988771", "+35368978731", park);        
        new Ranger("", "Someone", "+35399988771", "+35368978731", park);      
        new Ranger("Smith", "Else", "+35399988771", "+35368978731", park);

        System.out.println("Total rangers: " + park.getRangers().size());
        
        getRangerPhoneByName(park, "Smith");
        
        getRangerPhoneByName(park, "A");
        
        Campsite camp1 = new Campsite("Camp1", 5, park);
        Campsite camp2 = new Campsite("Camp2", 10, park);
        Campsite camp3 = new Campsite("Camp3", 3, park);
        
        new Guest("A", "B", "+353");
        new Guest("B", "B", "+353");
        new Guest("C", "B", "+353");
        new Guest("D", "B", "+353");
        new Guest("E", "B", "+353");
        new Guest("F", "B", "+353");
        new Guest("G", "B", "+353");
        
        //Campsite campsite = park.getMostPopularCampsite();
        
        //System.out.println("The most popular campsite is: " + campsite.getName() + " with " + campsite.getGuests().size() + " guests.");
    }
}
