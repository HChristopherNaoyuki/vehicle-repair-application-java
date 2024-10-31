// File: VehicleRepairApp.java
// Package declaration
package Solutions;

import java.text.DecimalFormat; // Import DecimalFormat

// Main class to execute the program
public class VehicleRepairApp 
{
    public static void main(String[] args) 
    {
        // Initialize 2D array for repair data (Technician x Month)
        double[][] repairsData = {
            {8000.0, 2500.0, 5000.0}, // Joe Bloggs' repairs for Jan, Feb, Mar
            {7000.0, 2200.0, 5600.0}  // Jone Doe's repairs for Jan, Feb, Mar
        };

        // Technician names
        String[] technicians = {"Joe Bloggs", "Jone Doe"};
        
        // Create an instance of the Repairs class
        Repairs repairs = new Repairs();
        
        // Array to store total repairs for each technician
        double[] totalRepairs = new double[2];

        // Create a DecimalFormat instance for formatting numbers
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.println("TECHNICIAN VEHICLE REPAIR REPORT");
        System.out.println("");
        System.out.printf("%-15s %-11s %-11s %-11s\n", "    ", "JAN", "FEB", "MAR");
        System.out.println("-------------------------------------------------");

        // Print each technician's monthly repairs and calculate total repairs
        for (int i = 0; i < repairsData.length; i++) 
        {
            System.out.printf("%-15s ", technicians[i]);
            for (int j = 0; j < repairsData[i].length; j++) 
            {
                System.out.printf("R %-10s", df.format(repairsData[i][j])); // Format the output
                totalRepairs[i] += repairsData[i][j];
            }
            System.out.println();
        }

        System.out.println();

        // Calculate and print total repairs for each technician
        for (int i = 0; i < totalRepairs.length; i++) 
        {
            System.out.printf("Total vehicle repairs for %s = R %s\n", technicians[i], df.format(totalRepairs[i])); // Format the output
        }

        System.out.println();

        // Calculate and print 10% commission for each technician
        for (int i = 0; i < totalRepairs.length; i++) 
        {
            double commission = repairs.TechnicianPay(totalRepairs[i]);
            System.out.printf("Repair Commission for %s = R %s\n", technicians[i], df.format(commission)); // Format the output
        }

        System.out.println();

        // Determine and print the top-performing technician
        int topTechnicianIndex = repairs.TopTechnician(totalRepairs);
        System.out.printf("Top performing vehicle repair technician: %s\n", technicians[topTechnicianIndex]);
        System.out.print("\n");
    }
}
