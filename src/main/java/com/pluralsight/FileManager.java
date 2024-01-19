package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

public class FileManager {

    public static HashMap<Integer,Account> accountHashMap = new HashMap<Integer,Account>();



    public static void reader(){
        try{
            FileReader fileReader = new FileReader("src/main/resources/transactions.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String input = "";
            int counter = 0;
            while((input = bufferedReader.readLine())!=null){
                String[] splitInput = input.split("\\|");
                String date = (splitInput[0]);
                String time = (splitInput[1]);
                String description = (splitInput[2]);
                String vendor  = (splitInput[3]);
                String amount = (splitInput[4]);
                Account account = new Account(LocalDate.parse(date), LocalTime.parse(time), description,vendor,Double.parseDouble(amount));
                accountHashMap.put(counter,account);
                counter++;

            }
            fileReader.close();
            bufferedReader.close();
        }catch (Exception fileError){
            System.out.println("There is a problem with reading the file");
            fileError.printStackTrace();
        }


    }

    public static void writer(){
        try{
            FileWriter fileWriter = new FileWriter("src/main/resources/transactions.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Account account: accountHashMap.values()){
                String transactionLine = (String.format(account.getDate()  + "|" + account.getTime().trim() + "|" + account.getDescription().trim() + "|" + account.getVendor().trim() + "|" + account.getAmount()));
                bufferedWriter.write(transactionLine);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (Exception fileError){
            System.out.println("There is a problem with writing to the file");
            fileError.printStackTrace();
        }

    }

}
