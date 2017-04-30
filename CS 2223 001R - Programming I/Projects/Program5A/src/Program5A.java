/*
Assignment  : Program 5A Determine students with highest grade
	Author         : Daniel Hill
	Course         : Programming I, RSU
	Created        : 03/25/2017

	 */


import java.util.Scanner;


public class Program5A {





        public static void main(String[] args) {
            String studentName;
            String highestName = "";
            int score;
            int highScore = 0;
            int numStudents;

            Scanner input = new Scanner(System.in);


            // Prompt to enter the number of students and assigns to the numStudents variable for the for loop
            System.out.print("Enter the number of students:");
            numStudents = input.nextInt();

            for(int i = 0; i < numStudents; i++) {


                System.out.print("Enter student name:");
                studentName = input.next();

                System.out.print("Enter student score:");
                score = input.nextInt();
                //Checks highScore variable against current score and assigns that to highScore if greater
                if( score >= highScore) {

                    highestName = studentName;
                    highScore = score;

                }

                input.nextLine();
            }
            //Prints highScore and student name associated with that score
            System.out.printf("Highest Score: %s  %d ",  highestName, highScore);

        }

    }

