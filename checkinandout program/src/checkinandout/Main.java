package checkinandout;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		String newdate = date.toString();
		
		Boolean vehicle = true;
		String newvehicle = Boolean.toString(vehicle);
		
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String newtime = sdf.format(cal.getTime()).toString();
		
		Student student = new Student();
		Staff staff = new Staff();
		Visitors visitor = new Visitors();
		
		Student student1 = new Student("100" ,"julien", "b.julien@alustudent.com", newdate, newvehicle, newtime);
		Student student2 = new Student("200", "lando", "g.landelin@alustudent.com", newdate, newvehicle, newtime);
		Staff staff1 = new Staff("300", "brian", "g.brian@alustudent.com", "facilitator", newdate, newvehicle, newtime);
		Staff staff2 = new Staff("400", "bruce", "u.bruce@alustudent.com", "facilitator", newdate, newvehicle, newtime);
		Visitors visitor1 = new Visitors("20", "nelson", "k.nelson@gmail.com", "culture event", newdate, newvehicle, newtime);
		Visitors visitor2 = new Visitors("30", "linda", "i.linda@gmail.com", "application", newdate, newvehicle, newtime);
		
		ArrayList<String> studentdata1 = student1.studentcheckin();
		ArrayList<String> studentdata2 = student2.studentcheckin();
		ArrayList<String> staffdata1 = staff1.staffcheckin();
		ArrayList<String> staffdata2 = staff2.staffcheckin();
		ArrayList<String> visitordata1 = visitor1.visitorcheckin();
		ArrayList<String> visitordata2 = visitor2.visitorcheckin();
		
		List<List<String>> studentdata = new ArrayList<List<String>>();
		studentdata.add(studentdata1);
		studentdata.add(studentdata2);
		
		List<List<String>> staffdata = new ArrayList<List<String>>();
		staffdata.add(staffdata1);
		staffdata.add(staffdata2);
		
		List<List<String>> visitordata = new ArrayList<List<String>>();
		visitordata.add(visitordata1);
		visitordata.add(visitordata2);
		
		System.out.println("CHECK IN AND CHECK OUT PROGRAM");
		System.out.println("==============================");
		
		System.out.println("\nCurrent Status: ");
		System.out.println("\nPeople who are currently in school");
		System.out.println("----------------------------------\n");
		System.out.println("Students:\n");
		student.displayStudents(studentdata);
		System.out.println("\nStaff:\n");
		staff.displayStaff(staffdata);
		System.out.println("\nVisitors:\n");
		visitor.displayVisitors(visitordata);
		System.out.println("--------------------------------\n");
			
		takeinfo(studentdata, staffdata, visitordata, student, staff, visitor);
			
	}
	
	
	public static void takeinfo(List<List<String>> student_array, List<List<String>> staff_array, List<List<String>> visitor_array,
			Student student, Staff staff, Visitors visitor) {
		
		LocalDate date = LocalDate.now();
		String newdate = date.toString();
		
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
     
        String newtime = sdf.format(cal.getTime()).toString();
        
		System.out.println("Choose What you want to do:");
		System.out.println("1. Checkin");
		System.out.println("2. Checkout");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Your choice: ");
		int choice = sc.nextInt();
		
		boolean c = true;
		while(c) {
			switch(choice) {
				case 1:
					while(true) {
						System.out.println("\nWho do you want to checkin: ");
						System.out.println("1. Student");
						System.out.println("2. Staff");
						System.out.println("3. Visitors");
						
						System.out.print("Your choice: ");
						int choice2 = sc.nextInt();
						
						if (choice2 == 1) {
							System.out.println("\nChecking in Student ------\n");
							System.out.print("Student Id: ");
							int stid = sc.nextInt();
							
							String newstid = String.valueOf(stid);
							
							System.out.print("Name: ");
							String name = sc.next().toLowerCase();
							System.out.print("Email: ");
							String email = sc.next();
							System.out.print("Vehicle(true or false): ");
							boolean vehicle = sc.nextBoolean();
							
							String newvehicle = Boolean.toString(vehicle);
							
							Student newstudent = new Student(newstid, name, email, newdate, newvehicle, newtime);
							ArrayList<String> studentdata = newstudent.studentcheckin();
							student_array.add(studentdata);
							System.out.println("\nUpdated List of students in the campus");
							System.out.println("-------------------------------------\n");
							student.displayStudents(student_array);
						}
					
						else if(choice2 == 2) {
							System.out.println("\nChecking in Staff ------\n");
							System.out.print("Staff Id: ");
							int staffid = sc.nextInt();
							
							String newstaffid = String.valueOf(staffid);
							
							System.out.print("Name: ");
							String staffname = sc.next().toLowerCase();
							System.out.print("Email: ");
							String staffemail = sc.next();
							System.out.print("Role: ");
							String staffrole = sc.next();
							System.out.print("Vehicle(true or false): ");
							boolean staffvehicle = sc.nextBoolean();
							
							String newstaffvehicle = Boolean.toString(staffvehicle);
							
							Staff newstaff = new Staff(newstaffid, staffname, staffemail, staffrole, newdate, newstaffvehicle, newtime);
							ArrayList<String> staffdata = newstaff.staffcheckin();
							staff_array.add(staffdata);
							System.out.println("\nUpdated List of staff in the campus");
							System.out.println("-------------------------------------\n");
							staff.displayStaff(staff_array);
						}
						
						else {
							System.out.println("\nChecking in Visitor ------\n");
							System.out.print("Visitor Id: ");
							int visitorid = sc.nextInt();
							
							String newvisitorid = String.valueOf(visitorid);
							
							System.out.print("Name: ");
							String visitorname = sc.next().toLowerCase();
							System.out.print("Email: ");
							String visitoremail = sc.next();
							System.out.print("Motif: ");
							String visitormotif = sc.next();
							System.out.print("Vehicle(true or false): ");
							boolean visitorvehicle = sc.nextBoolean();
							
							String newvisitorvehicle = Boolean.toString(visitorvehicle);
							
							Visitors newvisitor = new Visitors(newvisitorid, visitorname, visitoremail, visitormotif, newdate, newvisitorvehicle, newtime);
							ArrayList<String> visitordata = newvisitor.visitorcheckin();
							visitor_array.add(visitordata);
							System.out.println("\nUpdated List of visitors in the campus");
							System.out.println("-------------------------------------\n");
							visitor.displayVisitors(visitor_array);
						}
						
						System.out.print("Do you want to checkin again(yes or no): ");
						String resp = sc.next().toLowerCase();
						if(resp.contains("no")) {
							break;
						}
					}
					
					System.out.println("\nChoose What you want to do next\n");
					System.out.println("1. Check out someone");
					System.out.println("2. View a list of all people currently in campus");
					System.out.print("Your answer: ");
					String resp = sc.next();
					if (resp.contains("2")) {
						System.out.println("\nPeople who are currently in school");
						System.out.println("----------------------------------\n");
						System.out.println("Students:\n");
						student.displayStudents(student_array);
						System.out.println("\nStaff:\n");
						staff.displayStaff(staff_array);
						System.out.println("\nVisitors:\n");
						visitor.displayVisitors(visitor_array);
						System.out.println("--------------------------------\n");
						System.out.print("Thank you for using our program!!!!!");
						c = false;
						break;
					}
				case 2: 
					boolean out = true;
					while(out) {
						System.out.println("\nWho do you want to checkout: ");
						System.out.println("1. Student");
						System.out.println("2. Staff");
						System.out.println("3. Visitors");
						
						System.out.print("Your choice: ");
						int choice3 = sc.nextInt();
						
						if (choice3 == 1) {
							System.out.print("\nStudent Name: ");
							String studentname = sc.next().toLowerCase();
							List<List<String>> updated_list = student.checkout(student_array, studentname);
							System.out.println("Updated List of students after checkout");
							System.out.println("-------------------------------------\n");
							student.displayStudents(updated_list);
						}
						
						else if (choice3 == 2) {
							System.out.print("\nStaff Name: ");
							String staffname = sc.next().toLowerCase();
							List<List<String>> updated_list = staff.checkout(staff_array, staffname);
							System.out.println("Updated List of staff after checkout");
							System.out.println("-------------------------------------\n");
							student.displayStudents(updated_list);
						}
						
						else {
							System.out.print("\nVisitor Name: ");
							String visitorname = sc.next().toLowerCase();
							List<List<String>> updated_list = student.checkout(visitor_array, visitorname);
							System.out.println("Updated List of visitors after checkout");
							System.out.println("-------------------------------------\n");
							student.displayStudents(updated_list);
						}
						
						System.out.print("Do you want to checkout again(yes or no): ");
						String respc = sc.next().toLowerCase();
						if(respc.contains("no")) {
							break;
						}
					}
					System.out.println("\nChoose What you want to do next\n");
					System.out.println("1. Check in someone");
					System.out.println("2. View a list of all people currently in campus");
					System.out.print("Your answer: ");
					String respc = sc.next();
					if (respc.contains("2")) {
						System.out.println("\nPeople who are currently in school");
						System.out.println("----------------------------------\n");
						System.out.println("Students:\n");
						student.displayStudents(student_array);
						System.out.println("\nStaff:\n");
						staff.displayStaff(staff_array);
						System.out.println("\nVisitors:\n");
						visitor.displayVisitors(visitor_array);
						System.out.println("--------------------------------\n");
						System.out.print("Thank you for using our program!!!!!");
						c = false;
					}
					
					else {
						out = false;
					}	
			}
			choice = 1;
		}
	}
}
