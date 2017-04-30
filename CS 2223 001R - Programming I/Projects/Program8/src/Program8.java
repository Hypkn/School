/*
Assignment  : Program 8 Gradebook Program
	Author         : First Last
	Course         : Programming I, RSU
	Created        : nn/nn/2016
Description   : [You will need to replace this with your own description.]
	 */


import java.util.Scanner;

public class Program8 {


    private static int maxNumberStudents = 0;
    private static int actualNumberStudents = 0;
    //Array to hold studentNames
    private static String[] studentNames;
    private static int[][] grades;
    private static int  maxNumberAssignments = 0 ;
    private static Scanner input;
    private static int MISSING_GRADE = -1;



    public static void main(String args[]) {

        input = new Scanner(System.in);
//Gets max number of array elements
        System.out.print("Please enter the maximum number of assignments: ");
        maxNumberAssignments = input.nextInt();
        System.out.print("Please enter the maximum number of students: ");
        maxNumberStudents = input.nextInt();

        studentNames = new String[maxNumberStudents];
       // grades = new int[maxNumberStudents][maxNumberAssignments];

        initialize();



        boolean done = false;
        char selection = ' ';

// loop for user's selection
        while (!done) {

            System.out.println("Please enter a single character for your selection:");
            System.out.println("E = Enter grades for an assignment");
            System.out.println("P = Print all grades");
            System.out.println("S = Print all grades for a given student");
            System.out.println("X = Exit");

            System.out.print("?:");
            selection = input.next().charAt(0);

            selection = Character.toUpperCase(selection);
            System.out.printf("selection = %c\n", selection);

            switch (selection) {
                case 'X':
                    done = true;
                    break;

                case 'E':

                    enterAssignmentGrades();

                    break;

                case 'P':
                    printGradebook();
                    break;

                case 'S':
                    printStudentGrades();
                    break;

                default:
                    break;
            }


        }
        input.close();
    }


    private static void initialize(){

     grades = new int [maxNumberStudents][maxNumberAssignments];
     for (int i = 0; i < maxNumberStudents; i++)
     {
         for (int j = 0; j < maxNumberAssignments; j++)
         {
             grades[i][j] = MISSING_GRADE;
         }
     }

     enterStudentNames();
     sortStudentNames(studentNames);
     //printStudentNames();



 }
    //Gets student names for the array
    private static String[] enterStudentNames() {
       // input = new Scanner(System.in);
        String fullStudentName;
        String firstName;
        String lastName;

        //Loops through to grab first and last name
        for (; actualNumberStudents < maxNumberStudents; actualNumberStudents++) {

            System.out.print("First name(enter period. to quit: ");
            firstName = input.next();
            if (firstName.equals(".")) {
                break;
            }

            System.out.print("Last name: ");
            lastName = input.next();
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

    private static void enterAssignmentGrades(){

        int actualNumberAssignments = 0;


        System.out.printf("Enter grades for assignment %d (enter -1 for a missing grade) \n ", actualNumberAssignments + 1 );

        for(int i = 0; i < studentNames.length; i++){
            System.out.printf("\n%d. %s: ", i + 1, studentNames[i]);


            grades[i][actualNumberAssignments] = input.nextInt();


        }

        actualNumberAssignments++;
    }

    private static void printGradebook(){

    }


    private static void printStudentGrades() {

    }

}









