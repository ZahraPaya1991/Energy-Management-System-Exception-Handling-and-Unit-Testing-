package group4.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResourceManagementHandler {

    // Method to manage resources (e.g., reading a log file)
    public void manageResources() throws IOException {
        // Use relative path instead of absolute path
        Path filePath = Paths.get("logs", "sample.txt");

        // Ensure the file exists, otherwise throw an IOException
        if (!Files.exists(filePath)) {
            throw new IOException("Error handling resource: " + filePath.toAbsolutePath());
        }

        // Open the file using a FileReader
        try (FileReader fileReader = new FileReader(filePath.toFile())) {
            // Handle file reading here
            System.out.println("File read successfully.");
        }
    }
}
