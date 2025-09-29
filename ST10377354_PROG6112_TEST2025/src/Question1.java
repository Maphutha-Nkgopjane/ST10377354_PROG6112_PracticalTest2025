public class Question1 {

    public static void main(String[] args) {

        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB De Villiers"};
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};

        int[][] runs = {
            {5000, 3800, 4200}, // Kingsmead
            {3500, 3700, 3900}, // St Georges
            {6200, 5000, 5200}  // Wanderers
        };

        int[] batsmanTotals = new int[batsmen.length];
        int[] stadiumTotals = new int[stadiums.length];

        // Calculate totals
        for (int i = 0; i < stadiums.length; i++) {
            for (int j = 0; j < batsmen.length; j++) {
                stadiumTotals[i] += runs[i][j];
                batsmanTotals[j] += runs[i][j];
            }
        }

        // Find stadium with the most runs
        int maxStadiumIndex = 0;
        for (int i = 1; i < stadiumTotals.length; i++) {
            if (stadiumTotals[i] > stadiumTotals[maxStadiumIndex]) {
                maxStadiumIndex = i;
            }
        }

        // Print Report
        System.out.println("==================================================================");
        System.out.println("                        BATTING RUNS REPORT                       ");
        System.out.println("==================================================================\n");

        System.out.printf("%-15s%-18s%-15s%-15s\n", "STADIUM", "JACQUES KALLIS", "HASHIM AMLA", "AB DE VILLIERS");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < stadiums.length; i++) {
            System.out.printf("%-15s%-18d%-15d%-15d\n", stadiums[i], runs[i][0], runs[i][1], runs[i][2]);
        }

        System.out.println("\n==================================================================");
        System.out.println("                TOTAL RUNS SCORED BY EACH BATSMAN                ");
        System.out.println("==================================================================");
        for (int j = 0; j < batsmen.length; j++) {
            System.out.printf("%-20s: %d\n", batsmen[j], batsmanTotals[j]);
        }

        System.out.println("\n==================================================================");
        System.out.println("                  TOTAL RUNS SCORED AT EACH STADIUM              ");
        System.out.println("==================================================================");
        for (int i = 0; i < stadiums.length; i++) {
            System.out.printf("%-15s: %d\n", stadiums[i], stadiumTotals[i]);
        }

        System.out.println("\n==================================================================");
        System.out.println("     STADIUM WITH THE MOST RUNS: " + stadiums[maxStadiumIndex] + " (" + stadiumTotals[maxStadiumIndex] + " runs)");
        System.out.println("==================================================================");

        // Highest scorer per stadium
        System.out.println("\n==================================================================");
        System.out.println("             HIGHEST INDIVIDUAL RUNS PER STADIUM                 ");
        System.out.println("==================================================================");
        for (int i = 0; i < stadiums.length; i++) {
            int max = runs[i][0];
            String topBatsman = batsmen[0];
            for (int j = 1; j < batsmen.length; j++) {
                if (runs[i][j] > max) {
                    max = runs[i][j];
                    topBatsman = batsmen[j];
                }
            }
            System.out.printf("%-15s: %-15s (%d runs)\n", stadiums[i], topBatsman, max);
        }

        System.out.println("==================================================================");
    }
}
