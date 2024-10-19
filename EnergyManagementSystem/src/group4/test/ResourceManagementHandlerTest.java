package group4.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import group4.exceptions.ResourceManagementHandler;

import java.io.IOException;

public class ResourceManagementHandlerTest {

    @Test
    public void testManageResources() {
        ResourceManagementHandler handler = new ResourceManagementHandler();
        // Ensure the path points to the correct existing file
        assertDoesNotThrow(() -> handler.manageResources("C:\\Users\\Maede\\Desktop\\EnergyManagementSystem\\logs\\sample.txt"));
    }

    @Test
    public void testFileNotFound() {
        ResourceManagementHandler handler = new ResourceManagementHandler();
        // Test with an invalid path to trigger IOException
        Exception exception = assertThrows(IOException.class, () -> handler.manageResources("C:\\Users\\Maede\\Desktop\\EnergyManagementSystem\\logs\\nonexistent-file.txt"));
        assertTrue(exception.getMessage().contains("No such file or directory"), 
                   "Expected IOException due to missing file");
    }

    @Test
    public void testResourcesAreClosed() {
        ResourceManagementHandler handler = new ResourceManagementHandler();
        // Ensure the path points to the correct existing file
        assertDoesNotThrow(() -> handler.manageResources("C:\\Users\\Maede\\Desktop\\EnergyManagementSystem\\logs\\sample.txt"), 
                           "Resources should be closed properly in try-with-resources");
    }

    @Test
    public void testIOExceptionMessage() {
        ResourceManagementHandler handler = new ResourceManagementHandler();
        // Test with an invalid path to trigger IOException
        Exception exception = assertThrows(IOException.class, () -> handler.manageResources("C:\\Users\\Maede\\Desktop\\EnergyManagementSystem\\logs\\nonexistent-file.txt"));
        assertEquals("Error handling resource: C:\\Users\\Maede\\Desktop\\EnergyManagementSystem\\logs\\nonexistent-file.txt (No such file or directory)",
                     exception.getMessage(), 
                     "Expected specific IOException message");
    }

    @Test
    public void testNoOtherExceptionsThrown() throws IOException {
        ResourceManagementHandler handler = new ResourceManagementHandler();
        // Ensure the path points to the correct existing file
        assertDoesNotThrow(() -> {
            handler.manageResources("C:\\Users\\Maede\\Desktop\\EnergyManagementSystem\\logs\\sample.txt");
        }, "No other exceptions should be thrown");
    }
}
