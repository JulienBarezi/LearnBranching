import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        // open a scanning object to allow user input
		Scanner myObj= new Scanner (System.in);
        // prompt the user to enter their number
        System.out.println("Enter a number that you would like to reverse\r\n");
        int num= myObj.nextInt(), reversed = 0;
        
        // while loops to go through the numbers reversing them
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Your reversed Number is: " + reversed);
    }
}