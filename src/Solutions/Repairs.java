// File: Repairs.java
// Package declaration
package Solutions;

// Repairs class implementing the IRepairs interface
public class Repairs implements IRepairs
{
    // Calculate the total repair costs for a given technician
    @Override
    public double RepairCosts(double[] repairCosts)
    {
        double total = 0; // Initialize total cost to 0

        // Iterate over each repair cost and add to the total
        for (double cost : repairCosts)
        {
            total += cost;
        }
        return total; // Return the total repair cost
    }

    // Calculate 10% commission based on the total repair amount
    @Override
    public double TechnicianPay(double amount)
    {
        return amount * 0.10; // Return 10% of the total amount
    }

    // Determine the index of the top-performing technician based on total repairs
    @Override
    public int TopTechnician(double[] repairs)
    {
        int topIndex = 0; // Start by assuming the first technician is the top performer

        // Loop through each technician's total repairs to find the maximum
        for (int i = 1; i < repairs.length; i++)
        {
            if (repairs[i] > repairs[topIndex])
            {
                topIndex = i; // Update topIndex if the current technician has higher repairs
            }
        }
        return topIndex; // Return the index of the top-performing technician
    }
}
