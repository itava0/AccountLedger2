package com.pluralsight;
import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class HomeScreen {
    public static void main(String[] args) throws IOException {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Piedmont Credit Union");
            System.out.println("D)Add deposit");
            System.out.println("P)Make a payment(debit)");
            System.out.println("L)Ledger");
            System.out.println("X)Exit");

            System.out.print("Enter a choice:");
            String userChoice = myScanner.nextLine().trim();


            if (userChoice.equalsIgnoreCase("D")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("Name of the deposit:");
                String description = myScanner.nextLine();

                System.out.print("Name of the vendor:");
                String vendor = myScanner.nextLine();

                System.out.print("Amount:");
                double amount = myScanner.nextDouble();

                Account account = new Account(description, vendor, amount);

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/transactions.csv", true));
                bufferedWriter.write(account.toString());
                bufferedWriter.close();
            } else if (userChoice.equalsIgnoreCase("P")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("Name of the payment:");
                String description = myScanner.nextLine();

                System.out.print("Name of the vendor:");
                String vendor = myScanner.nextLine();

                System.out.print("Amount:");
                double amount = myScanner.nextDouble();

                Account account = new Account(description, vendor, amount);

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/transactions.csv", true));
                String text;
                for (int i = 1; i <= 10; i++) {
                    text = String.format("Counting %d\n", i);
                    bufferedWriter.write((text));
                }
                bufferedWriter.close();
            } else if (userChoice.equalsIgnoreCase("L")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                Ledger.main(null);
            } else if (userChoice.equalsIgnoreCase("X")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Exiting Program...");
                System.exit(0);
            }

        }
    }

    }

