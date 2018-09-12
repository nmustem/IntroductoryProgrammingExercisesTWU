package com.thoughtworks.exercices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("TRIANGLE EXERCISES");
        //Triangle Exercises
        System.out.println("Easiest exercise ever");
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

        System.out.println("DIAMOND EXERCISES");
        //Isosceles Triangle
        System.out.println("Isosceles Triangle");
        isoscelesTriangle(askNumber());
        System.out.println();

        //Diamond
        System.out.println("Diamond");
        diamond(askNumber());
        System.out.println();
    }

    private static int askNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        return scanner.nextInt();
    }

    private static void drawARightTriangle(int n) {
        //iterate n times to print n lines, each with one more asterisk than the last
        for(int i = 1; i <= n; i++){
            drawHorizontalLine(i);
        }
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

    private static void isoscelesTriangle(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void diamond(int n) {
        isoscelesTriangle(n);
        for (int i = n-1; i >= 1; i--){
            for (int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }

            for (int j = i*2-1; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}