/*
Assignment  : Program 7: Create array of students and sort it
	Author         : Daniel HIll
	Course         : Programming I, RSU
	Created        : 04/10/2016
Description   : This program takes an array of student names prints out the names and then prints the student names in a descending order.

	 */

import java.util.Scanner;

public class Program7 {


    private static int maxNumberStudents = 0;
    private static int actualNumberStudents = 0;
    //Array to hold studentNames
    private static String[] studentNames;

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

//Gets max number of array elements
        System.out.print("Please enter the maximum number of students: ");
        maxNumberStudents = input.nextInt();

        studentNames = new String[maxNumberStudents];

        enterStudentNames(input);
        printStudentNames();
        sortStudentNames(studentNames);
    }

//Gets student names for the array
    private static String[] enterStudentNames(Scanner scan) {
        String fullStudentName;
        String firstName;
        String lastName;

        //Loops through to grab first and last name
        for (; actualNumberStudents < maxNumberStudents; actualNumberStudents++) {

            System.out.print("First name(enter period. to quit: ");
            firstName = scan.next();
            if (firstName.equals(".")) {
                break;
            }

            System.out.print("Last name: ");
            lastName = scan.next();
            fullStudentName = lastName + " , " + firstName;
            studentNames[actualNumberStudents] = fullStudentName;


        }
        return studentNames;
    }

    //Method to print student names
    private static void printStudentNames() {

        for (int i = 0; i < studentNames.length; i++) {
    //checks for null or empty strings
            if (studentNames[i] == null || studentNames[i].isEmpty()) {
                break;
            }

            //prints out unsorted names numbered
            System.out.printf("%d. %s \n", i + 1, studentNames[i]);
        }

    }

//Sorts students names in descending order using a bubble sort
    private static void sortStudentNames(String[] sortedNames) {

        //variable to store the element before swapping
        String temp;

        for (int j = 0; j < sortedNames.length; j++) {
            //iterates through unsorted items
            for (int i = j + 1; i < sortedNames.length; i++) {
                //checks for null elements
                if(sortedNames[i] != null) {
                    //swaps them
                    if (sortedNames[i].compareTo(sortedNames[j]) < 0) {
                        temp = sortedNames[j];
                        sortedNames[j] = sortedNames[i];
                        sortedNames[i] = temp;
                    }

                }


            }
            }
        for (int i = 0; i < sortedNames.length; i++) {
            if (sortedNames[i] == null || sortedNames[i].isEmpty()) {
                break;
            }
            System.out.printf("%d. %s \n", i + 1, sortedNames[i]);
        }

    }

}








