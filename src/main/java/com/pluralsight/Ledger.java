package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ledger {
    public static void main(String[] args) throws IOException {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("A)All");
        System.out.println("D)Deposits");
        System.out.println("P)Payments)");
        System.out.println("R)Reports");
        System.out.print("Enter a choice:");
        myScanner.nextLine();

        String userChoice = myScanner.nextLine().trim();
        if (userChoice.equals("A")) {
            FileReader fileReader = new FileReader("src/main/resources/transactions.csv.xlsx");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;

            while ((input = bufferedReader.readLine()) != null) System.out.println(input);
            bufferedReader.close();


        }
    }
}
