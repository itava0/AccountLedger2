package com.pluralsight;
import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class HomeScreen {
    public static void main(String[] args) throws IOException {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Piedmont Credit Union");
        System.out.println("D)Add deposit");
        System.out.println("P)Make a payment(debit)");
        System.out.println("L)Ledger");
        System.out.println("X)Exit");

        System.out.print("Enter a choice:");
        String userChoice = myScanner.nextLine().trim();


        if (userChoice.equals("D")) {
            System.out.print("Name of the deposit:");
            myScanner.nextLine();

            System.out.print("Name of the vendor:");
            myScanner.nextLine();

            System.out.print("Amount:");
            myScanner.nextDouble();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/transaction.csv.xlsx", true));
            String text;
            for (int i = 1; i <= 10; i++) {
                text = String.format("Counting %d\n", i);
                bufferedWriter.write((text));
            }
            bufferedWriter.close();
        } else if (userChoice.equals("P")) {  System.out.print("Name of the card holder:");
            myScanner.nextLine();

            System.out.print("Card number:");
            myScanner.nextInt();

            System.out.print("CVV and Expiration Date:");
            myScanner.nextInt();

            System.out.print("How much would you like to pay?");
            myScanner.nextDouble();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/transaction.csv.xlsx", true));
            String text;
            for (int i = 1; i <= 10; i++) {
                text = String.format("Counting %d\n", i);
                bufferedWriter.write((text));
            }
            bufferedWriter.close();
        } else if (userChoice.equals("L")) {

        }

    }

    }

