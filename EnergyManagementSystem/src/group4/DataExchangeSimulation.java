package group4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DataExchangeSimulation {

    // Simulate data exchange between components using byte streams
    public static void simulateDataExchange(boolean triggerError) throws IOException {
        ByteArrayOutputStream byteStream = null;
        ByteArrayInputStream inputStream = null;

        try {
            // Simulate sending data (e.g., energy usage data)
            byteStream = new ByteArrayOutputStream();
            String data = "Energy Data from Charging Station";

            // Use triggerError flag to intentionally throw an IOException
            if (triggerError) {
                throw new IOException("Simulated error: data stream failure.");
            }

            byteStream.write(data.getBytes());

            // Simulate receiving the data
            inputStream = new ByteArrayInputStream(byteStream.toByteArray());

            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData); // Print each byte as a character
            }
            System.out.println();

        } catch (IOException e) {
            // Handle the IOException and log the error message
            System.err.println("An error occurred during data exchange: " + e.getMessage());
            throw e; // Optionally rethrow the exception
        } finally {
            // Close resources
            if (byteStream != null) {
                byteStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public static void main(String[] args) {
        try {
            // To test without errors, pass false. To simulate an error, pass true.
            simulateDataExchange(false); // Change this to simulate an error: simulateDataExchange(true);
        } catch (IOException e) {
            System.out.println("Data exchange failed: " + e.getMessage());
        }
    }
}
