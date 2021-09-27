package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    Random rn = new Random();
    //System.out.println("First Random int is "+rn.nextInt(10));
    //System.out.println("First Random double is "+rn.nextDouble());

    //int min = 3;
    //int max = 5;
    //int newRandom = rn.nextInt((max-min)+1)+min;
    //System.out.println(newRandom);
        System.out.println("How many numbers?");
        int userInput = input.nextInt();
        System.out.println("Enter maximum number");
        int max = input.nextInt();
        System.out.println("Enter minimum number");
        int min = input.nextInt();
        if (min > max){
            System.out.println("Error");
        }
        else{
            for(int i = 0; i < userInput; i++){
                System.out.println(rn.nextInt((max-min)+1)+min);
            }
        }

    }
}
