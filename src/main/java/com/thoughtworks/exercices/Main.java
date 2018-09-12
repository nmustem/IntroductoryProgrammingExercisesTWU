package com.thoughtworks.exercices;

import java.util.ArrayList;
import java.util.List;
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

        //Diamond with name
        System.out.println("Diamond with Name");
        diamondWithName(askNumber(), askName());
        System.out.println();

        //FizzBuzz Exercise
        System.out.println("FizzBuzz Exercise");
        fizzBuzz();
        System.out.println();

        //Prime Factors Exercise
        System.out.println("Prime Factors Exercise");
        primeFactorsExercise();
    }

    private static void primeFactorsExercise() {
        List<Integer> primeFactors = new ArrayList<>();
        generate(askNumber(), primeFactors);

        for(Integer fact : primeFactors){
            System.out.println(fact);
        }
    }

    private static int askNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        return scanner.nextInt();
    }

    private static String askName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a name: ");
        return scanner.next();
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

    private static void reverseIsoscelesTriangle(int n) {
        for (int i = n; i >= 1; i--){
            for (int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }

            for (int j = i*2-1; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void diamondWithName(int n, String name) {
        isoscelesTriangle(n-1);
        System.out.println(name);
        reverseIsoscelesTriangle(n-1);
    }

    private static void fizzBuzz(){
        for (int i = 1; i <= 100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    private static void generate(int n, List<Integer> factorsList){
        int factor = 2;

        while(n != 1){
            if(n % factor == 0){
                n = n / factor;
                generate(n, factorsList);
                factorsList.add(0,factor);
                break;
            }else{
                factor++;
            }
        }
    }
}