package denisbategela.babyfeedingscheduleprogram;

public class BabyFeedingSchedule {
    public static void main(String[] args) {
        // Given quantities
        double porridgeLiters = 2.0;    // 2 liters of porridge
        double milkLiters = 2.0;        // 2 liters of milk
        
        // Baby's cup capacity (0.5 liters = half liter)
        double cupCapacity = 0.5;
        
        // Feeding intervals in minutes
        int porridgeInterval = 45;  // 45 minutes after half cup porridge
        int milkInterval = 30;      // 30 minutes after full cup milk
        
        // Calculate number of feeds
        int porridgeFeeds = (int)(porridgeLiters / cupCapacity);
        int milkFeeds = (int)(milkLiters / cupCapacity);
        
        System.out.println("Porridge feeds: " + porridgeFeeds + " (half-cup each)");
        System.out.println("Milk feeds: " + milkFeeds + " (full-cup each)");
        
        // Calculate total time
        // Each porridge feed takes 45 minutes interval
        // Each milk feed takes 30 minutes interval
        // We need to simulate the feeding schedule
        
        int totalTime = 0;
        int porridgeCount = 0;
        int milkCount = 0;
        
        while (porridgeCount < porridgeFeeds || milkCount < milkFeeds) {
            // Alternate between porridge and milk for optimal feeding
            if (porridgeCount < porridgeFeeds) {
                totalTime += porridgeInterval;
                porridgeCount++;
                System.out.println("Porridge feed " + porridgeCount + " at minute: " + totalTime);
            }
            
            if (milkCount < milkFeeds) {
                totalTime += milkInterval;
                milkCount++;
                System.out.println("Milk feed " + milkCount + " at minute: " + totalTime);
            }
        }
        
        // Convert minutes to hours and minutes
        int hours = totalTime / 60;
        int minutes = totalTime % 60;
        
        System.out.println("\nTotal time to finish all food: " + 
                          hours + " hours and " + minutes + " minutes");
        System.out.println("Total minutes: " + totalTime);
    }
}