// Author: Julien and lando
// Question 3

import java.util.*;


public class Trivia {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		// Loop for playing again
		
		while (true) {
			
			double score = 0; 
			double extra = 0;
			
			// Question 1
			
			System.out.println("Question 1: What is the capital city of USA?");
			System.out.println("a) California");
			System.out.println("b) Washington DC");
			
			System.out.print("Your answer(a or b): ");
			
			// Setting the timer 
			
			long startTime = System.currentTimeMillis();
			
			String q1 = sc.nextLine().toLowerCase();
			
			long stopTime = System.currentTimeMillis();
			long TimeTakenInSec = (stopTime - startTime)/1000;
			
			System.out.println("\nResponse time: " + TimeTakenInSec + " seconds");
			
			if(q1.equals("b") && TimeTakenInSec < 2) {
				score = score + 1;
				extra = extra + 0.5;
				System.out.println("You earned 0.5 extra credit");
			}
			else if(q1.equals("b") && TimeTakenInSec >= 2) {
				score = score + 1;
			}
			else {
				
			}
			// Question 2
			
			System.out.println("\nQuestion 2: Who is the current chairperson of African Union?");
			System.out.println("a) H.E Paul Kagame");
			System.out.println("b) H.E Abdel Fattah el-Sisi");
			
			System.out.print("Your answer(a or b): ");
			
			// Setting the timer 
			
			long startTime2 = System.currentTimeMillis();
			
			String q2 = sc.nextLine().toLowerCase();
			
			long stopTime2 = System.currentTimeMillis();
			long TimeTakenInSec2 = (stopTime2 - startTime2)/1000;
			
			System.out.println("\nResponse time: " + TimeTakenInSec2 + " seconds");
			
			if(q2.equals("b") && TimeTakenInSec2 < 2) {
				score = score + 1;
				extra = extra + 0.5;
				System.out.println("You earned 0.5 extra credit");
			}
			else if(q2.equals("b") && TimeTakenInSec2 >= 2) {
				score = score + 1;
			}
			else {
				
			}
			
			// Question 3
			
			System.out.println("\nQuestion 3: When was ALU founded?");
			System.out.println("a) 2015");
			System.out.println("b) 2016");
			
			System.out.print("Your answer(a or b): ");
			
			// Setting the timer 
			
			long startTime3 = System.currentTimeMillis();
			
			String q3 = sc.nextLine().toLowerCase();
			
			long stopTime3 = System.currentTimeMillis();
			long TimeTakenInSec3 = (stopTime3 - startTime3)/1000;
			
			System.out.println("\nResponse time: " + TimeTakenInSec3 + " seconds");
			
			if(q3.equals("a") && TimeTakenInSec3 < 2) {
				score = score + 1;
				extra = extra + 0.5;
				System.out.println("You earned 0.5 extra credit");
			}
			else if(q3.equals("a") && TimeTakenInSec3 >= 2) {
				score = score + 1;
			}
			else {
				
			}
			
			
			// Question 4
			
			System.out.println("\nQuestion 4: Who is the dean of ALU Rwanda?");
			System.out.println("a) Fred Swaniker");
			System.out.println("b) Gaidi Faraj");
			
			System.out.print("Your answer(a or b): ");
			
			// Setting the timer 
			
			long startTime4 = System.currentTimeMillis();
			
			String q4 = sc.nextLine().toLowerCase();
			
			long stopTime4 = System.currentTimeMillis();
			long TimeTakenInSec4 = (stopTime4 - startTime4)/1000;
			
			System.out.println("\nResponse time: " + TimeTakenInSec4 + " seconds");
			
			if(q4.equals("b") && TimeTakenInSec4 < 2) {
				score = score + 1;
				extra = extra + 0.5;
				System.out.println("You earned 0.5 extra credit");
			}
			else if(q4.equals("b") && TimeTakenInSec4 >= 2) {
				score = score + 1;
			}
			else {
				
			}
			
			
			// Question 5
			
			System.out.println("\nQuestion 5: Who is the richest person in Africa?");
			System.out.println("a) Strive Masiyiwa");
			System.out.println("b) Aliko Dangote ");
			
			System.out.print("Your answer(a or b): ");
			
			// Setting the timer 
			
			long startTime5 = System.currentTimeMillis();
			
			String q5 = sc.nextLine().toLowerCase();
			
			long stopTime5 = System.currentTimeMillis();
			long TimeTakenInSec5 = (stopTime5 - startTime5)/1000;
			
			System.out.println("\nResponse time: " + TimeTakenInSec5 + " seconds");
			
			if(q5.equals("b") && TimeTakenInSec5 < 2) {
				score = score + 1;
				extra = extra + 0.5;
				System.out.println("You earned 0.5 extra credit");
			}
			else if(q5.equals("b") && TimeTakenInSec5 >= 2) {
				score = score + 1;
			}
			else {
				
			}
			
			
			// Question 6
			
			System.out.println("\nQuestion 6: What is the second largest country in Africa?");
			System.out.println("a) Democratic Republic of Congo");
			System.out.println("b) Nigeria");
			
			System.out.print("Your answer(a or b): ");
			
			// Setting the timer 
			
			long startTime6 = System.currentTimeMillis();
			
			String q6 = sc.nextLine().toLowerCase();
			
			long stopTime6 = System.currentTimeMillis();
			long TimeTakenInSec6 = (stopTime6 - startTime6)/1000;
			
			System.out.println("\nResponse time: " + TimeTakenInSec6 + " seconds");
			
			if(q6.equals("a") && TimeTakenInSec6 < 2) {
				score = score + 1;
				extra = extra + 0.5;
				System.out.println("You earned 0.5 extra credit");
			}
			else if(q6.equals("a") && TimeTakenInSec6 >= 2) {
				score = score + 1;
			}
			else {
				
			}
			
			// Question 7
			
			System.out.println("\nQuestion 7: Who won the Nobel Peace Prize in 2019?");
			System.out.println("a) Greta Thunberg");
			System.out.println("b) Abiy Ahmed");
			
			System.out.print("Your answer(a or b): ");
			
			// Setting the timer 
			
			long startTime7 = System.currentTimeMillis();
			
			String q7 = sc.nextLine().toLowerCase();
			
			long stopTime7 = System.currentTimeMillis();
			long TimeTakenInSec7 = (stopTime7 - startTime7)/1000;
			
			System.out.println("\nResponse time: " + TimeTakenInSec7 + " seconds");
			
			if(q7.equals("b") && TimeTakenInSec7 < 2) {
				score = score + 1;
				extra = extra + 0.5;
				System.out.println("You earned 0.5 extra credit");
			}
			else if(q7.equals("b") && TimeTakenInSec7 >= 2) {
				score = score + 1;
			}
			else {
				
			}
		
			
			// Question 8
			
			System.out.println("\nQuestion 8: When do we celebrate the international women's day?");
			System.out.println("a) 8/3");
			System.out.println("b) 15/10");
			
			System.out.print("Your answer(a or b): ");
			
			// Setting the timer 
			
			long startTime8 = System.currentTimeMillis();
			
			String q8 = sc.nextLine().toLowerCase();
			
			long stopTime8 = System.currentTimeMillis();
			long TimeTakenInSec8 = (stopTime8 - startTime8)/1000;
			
			System.out.println("\nResponse time: " + TimeTakenInSec8 + " seconds");
			
			if(q8.equals("a") && TimeTakenInSec8 < 2) {
				score = score + 1;
				extra = extra + 0.5;
				System.out.println("You earned 0.5 extra credit");
			}
			else if(q8.equals("a") && TimeTakenInSec8 >= 2) {
				score = score + 1;
			}
			else {
				
			}
			
			
			// Question 9
			
			System.out.println("\nQuestion 9: Who invented the java language?");
			System.out.println("a) James Gosling");
			System.out.println("b) Denis Ritchie");
			
			System.out.print("Your answer(a or b): ");
			
			// Setting the timer 
			
			long startTime9 = System.currentTimeMillis();
			
			String q9 = sc.nextLine().toLowerCase();
			
			long stopTime9 = System.currentTimeMillis();
			long TimeTakenInSec9 = (stopTime9 - startTime9)/1000;
			
			System.out.println("\nResponse time: " + TimeTakenInSec9 + " seconds");
			
			if(q9.equals("a") && TimeTakenInSec9 < 2) {
				score = score + 1;
				extra = extra + 0.5;
				System.out.println("You earned 0.5 extra credit");
			}
			else if(q9.equals("b") && TimeTakenInSec9 >= 2) {
				score = score + 1;
			}
			else {
				
			}
			
			// Question 10
			
			System.out.println("\nQuestion 10: Who is the president of USA?");
			System.out.println("a) Joe Biden");
			System.out.println("b) Donald Trump");
			
			System.out.print("Your answer(a or b): ");
			
			// Setting the timer 
			
			long startTime10 = System.currentTimeMillis();
			
			String q10 = sc.nextLine().toLowerCase();
			
			long stopTime10 = System.currentTimeMillis();
			long TimeTakenInSec10 = (stopTime10 - startTime10)/1000;
			
			System.out.println("\nResponse time: " + TimeTakenInSec10 + " seconds");
			
			if(q10.equals("a") && TimeTakenInSec10 < 2) {
				score = score + 1;
				extra = extra + 0.5;
				System.out.println("You earned 0.5 extra credit");
			}
			else if(q10.equals("b") && TimeTakenInSec10 >= 2) {
				score = score + 1;
			}
			else {
				
			}
			
			// Displaying their score
			
			System.out.println();
			
			if(extra != 0) {
				System.out.print("Your score is " + score);
				System.out.println(" + " + extra + " extra credit");
			}
			else {
				System.out.println("Your score is: " + score);
			}
			
			// Asking the user if he/she wants to play again
			
			System.out.print("\nDo you want to play again?(Yes or no): ");
			
			
			String again = sc.nextLine().toLowerCase();
			
			if(again.equals("no") || again.equals("n")) {
				System.out.print("\nThank you for playing with us!!!");
				break;
			}
			System.out.println();
		}
	}
}
