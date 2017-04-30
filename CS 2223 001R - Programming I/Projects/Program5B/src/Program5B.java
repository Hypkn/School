/*
Assignment  : Program 5B Determine students with highest grade
	Author         : Daniel Hill
	Course         : Programming I, RSU
	Created        : 03/25/2017

	 */


import java.util.Scanner;


public class Program5B {


    public static void main(String[] args) {
        String studentName;
        String highestName = "";
        String nextHighestName = "";
        int score;
        int highScore = 0;
        int nextHighestScore = 0;
        int numStudents;

        Scanner input = new Scanner(System.in);


        // Prompt to enter the number of students and assigns to the numStudents variable for the for loop
        System.out.print("Enter the number of students:");
        numStudents = input.nextInt();

        for (int i = 0; i < numStudents; i++) {

            //Input for current student name
            System.out.print("Enter student name:");
            studentName = input.next();
            //Input for current student score
            System.out.print("Enter student score:");
            score = input.nextInt();
            //Checks if highScore is greater than next highest score

            if (score > nextHighestScore) {
                //If score is not greater than highScore , checks if second highest score is less than current score
                //and assigns current student name and score to variable.
                if (score > highScore) {
                    nextHighestScore = highScore;
                    nextHighestName = highestName;
                    highestName = studentName;
                    highScore = score;

                    //Checks highScore variable against current score and assigns that to highScore if greater
                } else {
                    nextHighestName = studentName;
                    nextHighestScore = score;
                }





                input.nextLine();
            }

        }
            //Prints highScore and student name associated with that score
            System.out.printf("Highest score: %s %d %n", highestName, highScore);
            System.out.printf("Next highest score: %s %d ", nextHighestName, nextHighestScore);

        }
    }





