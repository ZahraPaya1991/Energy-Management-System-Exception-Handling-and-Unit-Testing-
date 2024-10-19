package group4.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceManagementHandler {

    public void manageResources(String filePath) throws IOException {
        // Simulate file handling operation that can throw an IOException
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Attempt to read from a valid or invalid file
            System.out.println("File read successfully.");
        } catch (IOException e) {
            // If the file doesn't exist or an error occurs, throw an exception with a specific message
            throw new IOException("Error handling resource: " + filePath + " (No such file or directory)", e);
        }
    }
}
