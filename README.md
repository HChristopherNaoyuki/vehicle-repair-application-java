# Vehicle Repair Application

## Overview

The Vehicle Repair Application is a Java-based program designed to manage and report vehicle repair data for technicians. It allows users to view monthly repair amounts, calculate total repairs and commissions, and identify top-performing technicians. The application features a clear structure and is complemented by unit tests to ensure accuracy.

## Features

- **Monthly Repair Data Management:** Store and display repair amounts for multiple technicians across different months.
- **Total Repair Calculation:** Automatically calculates total repairs for each technician.
- **Commission Calculation:** Computes a 10% commission on total repairs for each technician.
- **Top Technician Identification:** Identifies and reports the technician with the highest total repairs.
- **Formatted Output:** Presents data in a user-friendly format with clear monetary representations.

## Requirements

- Java Development Kit (JDK) 8 or higher
- Apache Maven (optional, for building and running tests)

## Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/HChristopherNaoyuki/vehicle-repair-application-java.git
   cd VehicleRepairApp
   ```

2. **Compile the Application:**
   ```bash
   javac Solutions/*.java
   ```

3. **Run the Application:**
   ```bash
   java Solutions.VehicleRepairApp
   ```

## Running Tests

To run the unit tests, you can use a testing framework like JUnit. If you have Maven set up, you can run the tests with:

```bash
mvn test
```

## Code Structure

- `VehicleRepairApp.java`: Main class for executing the application.
- `IRepairs.java`: Interface defining methods for repair calculations.
- `Repairs.java`: Implementation of the IRepairs interface, containing business logic.
- `RepairsTest.java`: Unit tests for validating the functionality of the Repairs class.

## Usage

Upon running the application, it will display a report of vehicle repairs, including:

- Monthly repairs for each technician.
- Total repairs for each technician.
- Commission calculations based on total repairs.
- The top-performing technician.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
