# Energy Management System

## Project Name:
Energy Management System (Exception Handling and Unit Testing)

## Description:
This project simulates an Energy Management System designed to manage log files for charging stations and energy sources. The system allows users to create daily logs, view logs, simulate data exchange, and manage log files (create, delete, move). It is designed to monitor and control the energy usage of charging stations in an organized and efficient manner.

In this version, we have integrated advanced exception handling and comprehensive unit testing as per the project requirements. Each team member contributed to implementing specific exception handling mechanisms and corresponding unit tests, ensuring robust error management and high-quality code.

### Project Requirements:
1. **Create Metadata for Managing Log Files**:
   - Implemented in the **LogFileManager** class with methods like `createLogFile`, `deleteLogFile`, and `moveLogFile` to handle log files systematically.

2. **Simulate Data Exchange Using Streams**:
   - Implemented in the **DataExchangeSimulation** class, utilizing byte streams to simulate data exchanges between energy stations and the system.

3. **Generate Logs for Each Day for Charging Stations and Energy Sources**:
   - Implemented in the **DailyLogCreator** class, with methods like `createDailyLog` and `createSystemLogs`, ensuring logs are consistently formatted.

4. **Allow Users to Open Log Files by Equipment Name or Date**:
   - Implemented in the **LogViewer** class with the `openLogFile` method, allowing users to view specific log files based on equipment name or date.

5. **Exception Handling**:
   - Integrated multiple exception handling strategies into the system to ensure robust error management:
     - **Handling Multiple Exceptions**: Implemented in `MultipleExceptionsHandler` to manage multiple types of exceptions within a single block.
     - **Re-throwing Exceptions**: Implemented in `RethrowExceptionHandler`, which catches and re-throws exceptions to propagate errors for higher-level handling.
     - **Chaining Exceptions**: Implemented in `ChainingExceptionHandler`, which preserves the original exception while adding new context to the error.
     - **Resource Management**: Implemented in `ResourceManagementHandler` to ensure resources, like file streams, are properly managed and closed, even when exceptions occur.

6. **Unit Testing**:
   - We developed unit tests for each exception handling class, covering edge cases and main functionality to ensure proper behavior in all scenarios.
   - All tests are organized into a test suite (`AllTests.java`), allowing for easy execution and verification of the system's correctness.

### Version:
1.1 (Updated Exception Handling and Unit Testing)

## Author(s):
- **Zahra Mahdion** - 7221957
  - LogFileManager & DataExchangeSimulation
  - Exception Handling: `MultipleExceptionsHandler`
  - Unit Testing: `MultipleExceptionsHandlerTest`
  
- **Maede Eskandari Borujerdi** - 7221435
  - Main Interface & Repository Management
  - Exception Handling: `RethrowExceptionHandler`
  - Unit Testing: `RethrowExceptionHandlerTest`
  
- **Zahra Paya** - 7216582
  - DailyLogCreator
  - Exception Handling: `ChainingExceptionHandler`
  - Unit Testing: `ChainingExceptionHandlerTest`
  
- **Vida Bahrami** - 7221533
  - LogViewer
  - Exception Handling: `ResourceManagementHandler`
  - Unit Testing: `ResourceManagementHandlerTest`

### Instructions for Running the Project

1. **Clone or Download the Project from GitHub**:
   - Visit the GitHub repository and download the project by clicking **Code** and selecting **Download ZIP**, or clone the repository using:
   
   ```bash
   git clone https://github.com/Mdeskn/EnergyManagementSystem.git
   ```

2. **Import the Project into Eclipse**:
   - Open **Eclipse IDE**.
   - Navigate to **File > Import**.
   - Choose **General > Existing Projects into Workspace** and click **Next**.
   - Browse to the location where you saved or extracted the project and select the project folder.
   - Click **Finish** to import the project.

3. **Run the Program in Eclipse**:
   - In the **Package Explorer**, right-click the project folder.
   - Choose **Run As > Java Application**.
   - Use the on-screen menu to create logs, view logs, simulate data exchanges, or manage log files.

4. **Running Unit Tests**:
   - In the **test** package, right-click `AllTests.java`.
   - Choose **Run As > JUnit Test** to run the test suite.
   - Verify that all tests pass successfully. The test results will be displayed in the **JUnit** tab within Eclipse.

### Screenshots:
Below are screenshots of key project results, such as successful unit test execution and system outputs:

1. **Unit Test Results**:
   - A screenshot showing the successful execution of all unit tests, verifying that exception handling works as expected.

   ![Unit Test Results](https://fhdoprod-my.sharepoint.com/:i:/g/personal/maede_eskandariborujerdi001_stud_fh-dortmund_de/EcOSB0Pv0H5PhcCyO_fe1SYB20abuvtSPkeRRfYBriIg1A?e=5MiuMy)

2. **Triggering and Capturing `IOException` in `DataExchangeSimulation`**:
   - A screenshot showing the process of simulating a data exchange error and capturing an `IOException`.

   ![IOException in DataExchangeSimulation](https://fhdoprod-my.sharepoint.com/:i:/g/personal/maede_eskandariborujerdi001_stud_fh-dortmund_de/Eahw5HDM3iBJs_iaNKKcDrYBPUhddofgZCDGULw-QQKCVA?e=6Z0MN8)

3. **Triggering and Capturing `RethrowException`**:
   - A screenshot showing the re-throwing of an exception in the `RethrowExceptionHandler`, along with the stack trace and custom message.

   ![RethrowException Capturing](https://fhdoprod-my.sharepoint.com/:i:/g/personal/maede_eskandariborujerdi001_stud_fh-dortmund_de/EQ2sOPny6vdCmMJP6moIEWMBFlBXzBmZ4w6Nmqq6YVU-EQ?e=LdBKYp)

   *(Make sure to update these paths if they change in the future.)*

---

This project was developed for the **Exception Handling & Unit Testing Assignment** under the supervision of **Dr. Prof. Galyna Tabunshchyk**.

## [Link to Video](link)

