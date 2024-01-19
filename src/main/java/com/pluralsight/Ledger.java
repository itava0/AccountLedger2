package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
impport com.pluralsight.FileManager.accountHashMap;

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
        switch(userChoice){
            case "A":
            case "a":
                System.out.print("\033[H\033[2J");
                System.out.flush();
                FileManager.reader();
                break;
            case "D":
            case "d":
                //do stuff
                break;
            case "P":
            case "p":
                //do stuff
                break;
            case "R":
            case "r":
                //do stuff
                break;
            default:
                System.out.println("ERROR: Invalid input");
        }
//        if (userChoice.equalsIgnoreCase("A")) {
//            FileReader fileReader = new FileReader("src/main/resources/transactions.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            String input;
//
//            while ((input = bufferedReader.readLine()) != null) System.out.println(input);
//            bufferedReader.close();
//
//
//        }
//        else if (userChoice.equalsIgnoreCase("D")){
//
//        }
//        else if (userChoice.equalsIgnoreCase("P")){
//
//        }
//        else if (userChoice.equalsIgnoreCase("R")){
//
//        }
    }

    public static void display() {
        for (Account acc: accountHashMap.values) {
            System.out.printf("Date: %s | Time: %s | Description: %s | Vendor: %s | Amount: %.2f\n", acc.getDate(), acc.getTime(), acc.getDescription(), acc.getVendor(), acc.getAmount());
        }
    }
}
