package checkinandout;

import java.util.ArrayList;
import java.util.List;

public class Visitors extends Person{
	
	public String visitorid;
	public String motif;
	
	public Visitors() {};
	public Visitors(String visitorid, String name, String email, String motif, String localDate, String vehicle, String timein) {
		super(name, email,localDate, vehicle, timein);
		this.visitorid = visitorid;
		this.motif = motif;
	}
	
	public ArrayList<String> visitorcheckin(){
			
			ArrayList<String> list = new ArrayList<String>();
			
			list.add(visitorid);
			list.add(name);
			list.add(email);
			list.add(motif);
			list.add(date);
			list.add(vehicle);
			list.add(timein);
			
			return list;
		}
		
		public List<List<String>> checkout(List<List<String>> alldata, String visitorname) {
	         
			String data;
			for(int row = 0; row < alldata.size(); row++) {
				for(int column = 0; column < alldata.get(row).size(); column++) {
					data = alldata.get(row).get(1);
					if(data.contains(visitorname)) {
						System.out.println("Removing " + alldata.get(row).get(1));
						alldata.remove(alldata.get(row));
						break;
					}
				}	
			}
			 System.out.println();
			 return alldata;
		}
		
		public void displayVisitors(List<List<String>> alldata) {
			 
			for(int row = 0; row < alldata.size(); row++) {
				for(int column = 0; column < alldata.get(row).size(); column++) {		
					visitorid = alldata.get(row).get(0);
					name = alldata.get(row).get(1);
					email = alldata.get(row).get(2);
					motif = alldata.get(row).get(3);
					date = alldata.get(row).get(4);
					vehicle = alldata.get(row).get(5);
					timein = alldata.get(row).get(6);
					
//					System.out.println(new_array.get(row).get(column));
					System.out.println(String.format( "VisitorId: %s\nName: %s\nEmail: %s\nMotif: %s\nDate: %s\nVehicle: %s\nTimein %s"
				    		  , visitorid, capitalize(name), email, motif, date, vehicle, timein));
					break;
				}
				System.out.println();
			}
			 
		}
}
