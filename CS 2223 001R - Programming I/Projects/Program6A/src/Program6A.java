/*
Assignment  : Program 6A Determine validity of a password
	Author         : Daniel Hill
	Course         : Programming I, RSU
	Created        : 04/01/2016
Description   : This program will request the user to enter an integer. It will be passed to the reverseDigits static method, which will return an integer which is the same as the original but with the digits reversed. Then print both the original and reversed integers from the main method.
	 */
import java .util.Scanner;

public class Program6A {

    public static void main(String args[]){

       Scanner input = new Scanner(System.in);
       int originalNumber;

        //Asking the user to input an integer and reading it in
        System.out.print("Please enter an integer: ");
        originalNumber = input.nextInt();

        System.out.printf("original = %d, reversed = %d",originalNumber, reverseDigits(originalNumber));

    }
//Method to reverse a number entered by the user
    private static int reverseDigits(int original){
        int digit;
        int reversed = 0;
//Creating a loop to take one digit off of end  original number and adding it back to the
//reversed number
        while(original != 0) {
            digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }
        return reversed;
    }
}
