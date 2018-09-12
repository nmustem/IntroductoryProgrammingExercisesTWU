package com.thoughtworks.exercices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //Triangle Exercises
        triangleExercises();

        //Draw a horizontal line
        drawHorizontalLine();

        //Draw a vertical line
        drawVerticalLine();
    }

    private static void triangleExercises(){
        System.out.println("Triangle Exercises");
        System.out.println("*");
        System.out.println();
    }

    private static void drawHorizontalLine() {
        System.out.println("Draw a horizontal line");

        //ask number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        int n = scanner.nextInt();

        //iterate n times to print n *
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }

        System.out.println("\n");
    }

    private static void drawVerticalLine() {
        System.out.println("Draw a vertical line");

        //ask number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        int n = scanner.nextInt();

        //iterate n times to print n *
        for(int i = 0; i < n; i++){
            System.out.println("*");
        }

        System.out.println();
    }
}