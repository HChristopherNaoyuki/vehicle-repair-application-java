// File: IRepairs.java
// Package declaration
package Solutions;

// IRepairs interface defining required methods for Repairs calculations
public interface IRepairs
{
    // Method to calculate the total repair costs for a technician
    double RepairCosts(double[] repairCosts);

    // Method to calculate 10% commission on the total repairs
    double TechnicianPay(double amount);

    // Method to find the index of the top-performing technician based on total repairs
    int TopTechnician(double[] repairs);
}
