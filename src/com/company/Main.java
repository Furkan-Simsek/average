package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Import scanner
        Scanner inp = new Scanner(System.in);
        //create variables
        int math,physics, chermistry, turkish, history;
        //user inputs
        System.out.print("Enter math result: ");
        math = inp.nextInt();
        System.out.print("Enter physics result: ");
        physics = inp.nextInt();
        System.out.print("Enter chermistry result: ");
        chermistry = inp.nextInt();
        System.out.print("Enter turkish result: ");
        turkish = inp.nextInt();
        System.out.print("Enter history result: ");
        history = inp.nextInt();
        int all = math + physics + chermistry + turkish + history;
        double average =  all / 5.0;
        System.out.println("Your average is : " + average);
        String status = (average > 60) ? "Pass"  :  "Failed";
        System.out.println("Your status is: " + status);

    }
}


