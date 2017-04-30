import java.util.Scanner;

/*
Assignment  : Program 6B Determine a character type with character methods
	Author         : Daniel Hill
	Course         : Programming I, RSU
	Created        : 04/04/2016
Description   : This program will generate all 4-digit palindromes. They will be printed 10 per line of output.
	 */



public class Program6B {


    public static void main(String args[]) {
        //Setting counter variable for output in for loop
        int counter = 0;
/*
          Scanner input = new Scanner(System.in);
        int originalNumber;

        //Asking the user to input an integer and reading it in
        System.out.print("Please enter an integer: ");
        originalNumber = input.nextInt();

        System.out.printf("original = %d, reversed = %d",originalNumber, reverseDigits(originalNumber));
         System.out.println( " isPalindrome " + isPalindrome(originalNumber));
*/
    for(int i = 100; i< 9999; i++){
    //Checks if i is palindrome, if true prints  i and adds 1 to counter
       if( isPalindrome(i)){
            System.out.printf("%10d", i);
            counter++;

           }
    //If counter is 10 prints newline and resets counter to 0
        if(counter >= 10){
            System.out.println();
            counter = 0;
        }


    }

    }

    //Method to reverse a number entered by the user
    private static int reverseDigits(int original) {
        int digit;
        int reversed = 0;
//Creating a loop to take one digit off of end  original number and adding it back to the
//reversed number
        while (original != 0) {
            digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }
        return reversed;
    }

//Checks if number inputted is a palindrome and returns true or false
    private static boolean isPalindrome(int original) {

        return (original == (reverseDigits(original)));

        }
    }
