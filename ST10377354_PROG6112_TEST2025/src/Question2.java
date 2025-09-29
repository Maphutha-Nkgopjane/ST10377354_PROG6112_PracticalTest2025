import java.util.Scanner;

// Interface
interface ICricket {
    String getBatsman();
    String getStadium();
    int getRunsScored();
}

// Abstract Class
abstract class Cricket implements ICricket {
    protected String batsman;
    protected String stadium;
    protected int runsScored;

    public Cricket(String batsman, String stadium, int runsScored) {
        this.batsman = batsman;
        this.stadium = stadium;
        this.runsScored = runsScored;
    }

    @Override
    public String getBatsman() {
        return batsman;
    }

    @Override
    public String getStadium() {
        return stadium;
    }

    @Override
    public int getRunsScored() {
        return runsScored;
    }

    public abstract void printReport();
}

// Subclass
class CricketRunsScored extends Cricket {
    public CricketRunsScored(String batsman, String stadium, int runsScored) {
        super(batsman, stadium, runsScored);
    }

    @Override
    public void printReport() {
        System.out.println("\n==============================================");
        System.out.println("               CRICKET RUNS REPORT            ");
        System.out.println("==============================================");
        System.out.printf("Batsman Name : %s\n", getBatsman());
        System.out.printf("Stadium Name : %s\n", getStadium());
        System.out.printf("Runs Scored  : %d\n", getRunsScored());
        System.out.println("==============================================");
    }
}

// Main Class
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Batsman's Name: ");
        String batsman = scanner.nextLine();

        System.out.print("Enter Stadium Name: ");
        String stadium = scanner.nextLine();

        System.out.print("Enter Runs Scored: ");
        int runsScored = scanner.nextInt();

        CricketRunsScored report = new CricketRunsScored(batsman, stadium, runsScored);
        report.printReport();

        scanner.close();
    }
}
