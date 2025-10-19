package denisbategela.telcombillingsystem;

public class TelecomBillingSystem {
    public static void main(String[] args) {
        // Constants
        final double SERVICE_CHARGE_RATE = 0.10; // 10% service charge
        final int CALL_RATE_PER_SECOND = 200;    // UGX 200 per second
        
        // User inputs
        double airtimeLoaded = 10000;  // UGX 10,000
        int callDurationMinutes = 5;
        
        // Calculate service charge (10% of loaded airtime)
        double serviceCharge = airtimeLoaded * SERVICE_CHARGE_RATE;
        
        // Calculate call cost
        int callDurationSeconds = callDurationMinutes * 60;
        double callCost = callDurationSeconds * CALL_RATE_PER_SECOND;
        
        // Calculate total deductions
        double totalDeductions = serviceCharge + callCost;
        
        // Calculate remaining balance
        double remainingBalance = airtimeLoaded - totalDeductions;
        
        // Display results
        System.out.println("=== TELECOM BILLING STATEMENT ===");
        System.out.printf("Airtime loaded: UGX %.2f%n", airtimeLoaded);
        System.out.printf("Service charge (10%%): UGX %.2f%n", serviceCharge);
        System.out.printf("Call duration: %d minutes (%d seconds)%n", 
                         callDurationMinutes, callDurationSeconds);
        System.out.printf("Call cost: UGX %.2f%n", callCost);
        System.out.printf("Total deductions: UGX %.2f%n", totalDeductions);
        System.out.printf("Remaining balance: UGX %.2f%n", remainingBalance);
        
        // Check if balance is sufficient
        if (remainingBalance < 0) {
            System.out.println("WARNING: Insufficient balance! Additional UGX " + 
                             Math.abs(remainingBalance) + " required.");
        }
    }
}