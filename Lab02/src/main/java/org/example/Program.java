package org.example;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Program {
    private static final Logger logger = Logger.getLogger(Program.class.getName());


    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Invalid Connection URL");
        }
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while(!exit){
            display();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":

                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    exit = true;
          }
        }
    }

    public static void display() {
        System.out.println("1. Read product list");
        System.out.println("2. Read detail of a product by id");
        System.out.println("3. Add a new product");
        System.out.println("4. Update a product");
        System.out.println("5. Delete a product by id");
        System.out.println("6. Exit");
        System.out.print("Your choice: ");
    }

    /*public static void connectDB() {
        try {

        } catch(SQLException e) {

        }
    }*/
}