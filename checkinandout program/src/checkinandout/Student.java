package checkinandout;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Student extends Person{
	
	public String studentid; 
	
	public Student() {};
	public Student(String studentid, String name, String email, String localDate, String vehicle, String timein
			) {
		super(name, email, localDate, vehicle, timein);
		this.studentid = studentid; 
	}
	
	public ArrayList<String> studentcheckin(){
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(studentid);
		list.add(name);
		list.add(email);
		list.add(date);
		list.add(vehicle);
		list.add(timein);
		return list;
	}
	
	public List<List<String>> checkout(List<List<String>> alldata, String studentname) {
		
		String data;
		for(int row = 0; row < alldata.size(); row++) {
			for(int column = 0; column < alldata.get(row).size(); column++) {
				data = alldata.get(row).get(1);
				if(data.contains(studentname)) {
					System.out.println("Removing " + alldata.get(row).get(1));
					alldata.remove(alldata.get(row));
					break;
				}
			}	
		}
		 System.out.println();
		 return alldata;
	}
	
	
	
	// Method to display the students 
	
	public void displayStudents(List<List<String>> alldata) {
		 
		for(int row = 0; row < alldata.size(); row++) {
			for(int column = 0; column < alldata.get(row).size(); column++) {		
				studentid = alldata.get(row).get(0);
				name = alldata.get(row).get(1);
				email = alldata.get(row).get(2);
				date = alldata.get(row).get(3);
				vehicle = alldata.get(row).get(4);
				timein = alldata.get(row).get(5);
				
//				System.out.println(new_array.get(row).get(column));
				System.out.println(String.format( "StudentId: %s\nName: %s\nEmail: %s\nDate: %s\nVehicle: %s\nTimein: %s"
			    		  , studentid, capitalize(name), email, date, vehicle, timein));
				break;
			}
			System.out.println();
		}
		 
	}
	
}
