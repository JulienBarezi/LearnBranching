import java.util.Random; 
import java.util.Scanner;
  
public class generateRandom{ 
  
    public static void main(String args[]) {
    	 // create instance of Random class 
    	Random rand = new Random();
    	// Generate random integers in range 0 to 10 
        int rand_int1 = rand.nextInt(11);
        int tries = 0;
        Scanner input= new Scanner (System.in);
        boolean w = false;
		 
        while (w==false) {
        System.out.println("Guess a number: ");
        int num= input.nextInt();
        tries++;
        if (num==rand_int1) {
        	w =true;
        	System.out.println("You guessed the number!");
        }
        
        else if (num<rand_int1) {
        	System.out.println("Too low, try again");
        }
        else if (num>rand_int1) {
        	System.out.println("Too high,try again");
        }
        
        }
        System.out.print("You won after " + tries + " trials");
      
    }}