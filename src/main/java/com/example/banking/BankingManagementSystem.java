package com.example.banking;

import java.util.Scanner;

public class BankingManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for account creation details
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double initialBalance = scanner.nextDouble();

        // Create a new bank account
        BankAccount account = new BankAccount(name, initialBalance);

        // Display menu and options for the user
        boolean exit = false;
        while (!exit) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Banking System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
