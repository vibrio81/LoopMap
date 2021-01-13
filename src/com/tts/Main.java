package com.tts;

import java.util.Scanner;
import static java.lang.System.out;
import static com.tts.Cars.carLot;

    public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int[] number = new int[5];
            int sum = 0;
            int findings = 0;
            int product = 1;
            int largest = 0;
            int smallest = 1;
            //User input

            out.println("Enter in 5 numbers");
            for (int index = 0; index < number.length; index++) {
                number[index] = scan.nextInt();
            }


            for (int i : number) {
                if (i == sum) {
                    findings++;
                }
            }
            for (int i : number) {
                sum += i;
            }
            System.out.println("The sum is " + sum);

            for (int i : number) {
                product *= i;
            }
            System.out.println("The product is " + product);

            for (int i : number) {
                if (largest < i) {
                    largest = i;
                }
            }
            System.out.println("The largest number is " + largest);


            for (int i : number) {
                if (smallest > i) {
                    smallest = i;
                }
            }
            System.out.println("The smallest number is " + smallest);

        }

    }