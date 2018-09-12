package com.thoughtworks.exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       System.out.println("TRIANGLE EXERCISES");
        System.out.println("Easiest exercise ever");
        triangleExercises();
        System.out.println();

        System.out.println("Draw a horizontal line");
        drawHorizontalLine(askNumber());
        System.out.println();

        System.out.println("Draw a vertical line");
        drawVerticalLine(askNumber());
        System.out.println();

        System.out.println("Draw a right triangle");
        drawARightTriangle(askNumber());
        System.out.println();

        System.out.println("DIAMOND EXERCISES");
        System.out.println("Isosceles Triangle");
        isoscelesTriangle(askNumber());
        System.out.println();

        System.out.println("Diamond");
        diamond(askNumber());
        System.out.println();

        System.out.println("Diamond with Name");
        diamondWithName(askNumber(), askName());
        System.out.println();

        System.out.println("FizzBuzz EXERCISE");
        fizzBuzz();
        System.out.println();

        System.out.println("PRIME FACTORS EXERCISE");
        primeFactorsExercise();
    }

    /**
     * Asks a number
     * @return int --> number requested
     */
    private static int askNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a number: ");

        while (!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number. Enter a new one: \n", input);
        }

        return scanner.nextInt();
    }

    /**
     * Asks a name
     * @return String --> name requested
     */
    private static String askName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a name: ");
        return scanner.next();
    }

    /**
     * Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
     * @param n
     */
    private static void drawARightTriangle(int n) {
        //iterate n times to print n lines, each with one more asterisk than the last
        for(int i = 1; i <= n; i++){
            drawHorizontalLine(i);
        }
    }

    /**
     * Print one asterisk to the console.
     */
    private static void triangleExercises(){
        System.out.println("*");
    }

    /**
     * Given a number n, print n asterisks on one line.
     * @param n
     */
    private static void drawHorizontalLine(int n) {
        //iterate n times to print n *
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }

        System.out.println();
    }

    /**
     * Given a number n, print n lines, each with one asterisks
     * @param n
     */
    private static void drawVerticalLine(int n) {
        //iterate n times to print n *
        for(int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    /**
     * Given a number n, print a centered triangle.
     * @param n
     */
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

    /**
     * Given a number n, print a centered diamond.
     * @param n
     */
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

    /**
     * Given a number n, print a reverse centered diamond.
     * @param n
     */
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

    /**
     * Given a number n, print a centered diamond with your name in place of the middle line.
     * @param n
     * @param name
     */
    private static void diamondWithName(int n, String name) {
        isoscelesTriangle(n-1);
        System.out.println(name);
        reverseIsoscelesTriangle(n-1);
    }

    /**
     * Instead of numbers divisible by three print "Fizz".
     * Instead of numbers divisible by five print "Buzz".
     * Instead of numbers divisible by three and five print "FizzBuzz".
     */
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

    /**
     * Given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order
     * @param n
     * @param factorsList
     */
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

    private static void primeFactorsExercise() {
        List<Integer> primeFactors = new ArrayList<>();
        generate(askNumber(), primeFactors);

        for(Integer fact : primeFactors){
            System.out.println(fact);
        }
    }
}