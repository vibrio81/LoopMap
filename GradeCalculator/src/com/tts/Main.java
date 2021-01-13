package com.tts;
import java.util.*;


public class Main {



        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);
            System.out.print("Enter average of your grades on a ten point scale");

            int average = Scanner.nextInt();
            char grade;

            if (average >= 90){
                grade ='A';
            }
            else if(average >=80 && average<90){
                grade = 'B';
            }
            else if (average >=70 && average< 80){
                grade = 'C';
            }
            else if (average >=60 && average<70){
                grade = 'D';
            }
            else {
                grade = 'F';
            }



            switch (grade){
                case 'A':
                    System.out.println("Great Job!");
                    break;

                case 'B':
                    System.out.println("Good Job");
                    break;

                case 'C':
                    System.out.println("Almost there");
                    break;

                case 'D':
                    System.out.println("Needs improvement");
                    break;

                case 'F':
                    System.out.println("Time to get a tutor");
                    break;

                default:
                    System.out.println("Invalid Grade");
                    break;
            }
            System.out.println("Your grade is " + grade);
        }
    }



