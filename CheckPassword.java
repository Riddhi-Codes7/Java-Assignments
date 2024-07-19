package basic;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setPassword;
        int maxAttempts = 3;
        int attempt = 0;

        System.out.println("Set a Strong Password: ");
        setPassword = scanner.nextLine();
        while (attempt < maxAttempts) {
            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(setPassword))
            {
                System.out.println("Password correct! Starting MCQ test...");
                runMCQTest();
                break;
            }
            else
            {
                System.out.println("Incorrect password");
                attempt++;
            }
        }

        if (attempt == maxAttempts) {
            System.out.println("No more attempts");
        }

        scanner.close();
    }

    private static void runMCQTest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MCQ Test:");
        System.out.println("1. Who Invented Java Programming Language?");
        System.out.println("a) Guido van Rossum");
        System.out.println("b) James Gosling");
        System.out.println("c) Dennis Ritchie");
        System.out.println("d) Bjarne Stroustrup");


        char answer1 = scanner.next().charAt(0);
        System.out.println("2. Which Component is used to compile, debug and execute the java programs?");
        System.out.println("a) JRE");
        System.out.println("b) JIT");
        System.out.println("c) JDK");
        System.out.println("d) JVM");


        char answer2 = scanner.next().charAt(0);

        if (answer1 == 'b') {
            System.out.println("Correct ans");}
        else {
            System.out.println("Incorrect");}

        if (answer2 == 'c') {
            System.out.println("Correct ans");}
        else {
            System.out.println("Incorrect");}


        scanner.close();
    }
}

