package com.thoughtworks.exercices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //Triangle Exercises
        System.out.println("Triangle Exercises");
        triangleExercises();
        System.out.println();

        //Draw a horizontal line
        System.out.println("Draw a horizontal line");
        drawHorizontalLine(askNumber());
        System.out.println();

        //Draw a vertical line
        System.out.println("Draw a vertical line");
        drawVerticalLine(askNumber());
        System.out.println();

        //Draw a right triangle
        System.out.println("Draw a right triangle");
        drawARightTriangle(askNumber());
        System.out.println();
    }


    private static void triangleExercises(){
        System.out.println("*");
    }

    private static void drawHorizontalLine(int n) {
        //iterate n times to print n *
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }

        System.out.println();
    }

    private static void drawVerticalLine(int n) {
        //iterate n times to print n *
        for(int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    private static void drawARightTriangle(int n) {
        //iterate n times to print n *
        for(int i = 1; i <= n; i++){
            drawHorizontalLine(i);
        }
    }

    private static int askNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        return scanner.nextInt();
    }
}