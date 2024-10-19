package group4.test;

import group4.exceptions.ResourceManagementHandler;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class ResourceManagementHandlerTest {

    @Test
    public void testNoOtherExceptionsThrown() throws IOException {
        ResourceManagementHandler handler = new ResourceManagementHandler();

        // Use relative path for the log file
        Path filePath = Paths.get("logs", "sample.txt");
        File logFile = filePath.toFile();

        // Ensure the file exists before running the test
        if (!logFile.exists()) {
            Files.createDirectories(filePath.getParent());  // Create directories if not exists
            logFile.createNewFile();                        // Create the log file
        }

        // Run the test
        assertDoesNotThrow(() -> handler.manageResources(), "No other exceptions should be thrown");
    }
}
