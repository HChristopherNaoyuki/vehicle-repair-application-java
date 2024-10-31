// File: RepairsTest.java
// Package declaration
package Solutions;

// Import testing library for unit tests
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Unit test class for the Repairs class
public class RepairsTest
{
    // Test case for the RepairCosts method
    @Test
    public void CalculateCosts_ReturnsRepairCosts()
    {
        // Instantiate the Repairs class
        Repairs repairs = new Repairs();

        // Test data for repair costs
        double[] repairData = {8000.0, 2500.0, 5000.0};

        // Expected total repair cost
        double expectedTotal = 15500.0;

        // Assert that the calculated repair cost matches the expected total
        assertEquals(expectedTotal, repairs.RepairCosts(repairData), 0.001);
    }

    // Test case for the TechnicianPay method
    @Test
    public void CalculatePay_ReturnsExpectedPay()
    {
        // Instantiate the Repairs class
        Repairs repairs = new Repairs();

        // Total repair amount for testing
        double totalRepairs = 15500.0;

        // Expected commission based on 10% of totalRepairs
        double expectedPay = 1550.0;

        // Assert that the calculated commission matches the expected pay
        assertEquals(expectedPay, repairs.TechnicianPay(totalRepairs), 0.001);
    }

    // Test case for the TopTechnician method
    @Test
    public void TopTechnician_ReturnsTopPosition()
    {
        // Instantiate the Repairs class
        Repairs repairs = new Repairs();

        // Array of total repairs for each technician
        double[] totalRepairs = {15500.0, 14800.0};

        // Expected index of the top-performing technician
        int expectedTopIndex = 0;

        // Assert that the calculated top technician index matches the expected index
        assertEquals(expectedTopIndex, repairs.TopTechnician(totalRepairs));
    }
}
