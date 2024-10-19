package group4;

import group4.exceptions.RethrowExceptionHandler;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Energy Management System!");

        try {
            while (true) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Create daily logs");
                System.out.println("2. View log file");
                System.out.println("3. Simulate data exchange");
                System.out.println("4. Delete a log file");
                System.out.println("5. Trigger Rethrow Exception");
                System.out.println("6. Exit");

                int choice = 0;
                boolean validInput = false;

                // Input validation loop
                while (!validInput) {
                    try {
                        choice = scanner.nextInt();
                        validInput = true;  // valid input, exit the loop
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 and 6.");
                        scanner.nextLine();  // clear the invalid input
                    }
                }
                scanner.nextLine();  // consume newline

                switch (choice) {
                    case 1:
                        try {
                            DailyLogCreator.createSystemLogs();
                        } catch (IOException e) {
                            System.out.println("Error creating system logs: " + e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.print("Enter equipment name: ");
                        String equipmentName = scanner.nextLine();
                        System.out.print("Enter date (YYYY-MM-DD): ");
                        String date = scanner.nextLine();
                        LogViewer.openLogFile(equipmentName, date);
                        break;
                    case 3:
                        System.out.print("Simulate error in data exchange? (true/false): ");
                        boolean triggerError = scanner.nextBoolean();
                        scanner.nextLine(); // consume the newline
                        try {
                            DataExchangeSimulation.simulateDataExchange(triggerError);
                        } catch (IOException e) {
                            System.out.println("Error during data exchange: " + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.print("Enter log file name to delete (e.g., ChargingStation1_log_2024-10-06.txt): ");
                        String fileName = scanner.nextLine();
                        LogFileManager.deleteLogFile(fileName);
                        break;
                    case 5:
                        // Call the RethrowExceptionHandler and handle the re-thrown exception
                        try {
                            RethrowExceptionHandler handler = new RethrowExceptionHandler();
                            handler.rethrowException();
                        } catch (IOException e) {
                            // Handle the re-thrown IOException
                            System.out.println("Caught re-thrown exception: " + e.getMessage());
                            e.printStackTrace();  // Log the stack trace
                        }
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
        } finally {
            scanner.close();  // Close the scanner
        }
    }
}
