import java.util.Scanner;

class Train{
    private int trainNumber;
    private String startingPoint;
    private String destination;
    private String trainName;

    public Train(String startingPoint, String destination){
        this.startingPoint = startingPoint;
        this.destination = destination;
    }

    public void displayDetails() {
        System.out.println("\nTrain Booking Details");
        System.out.println("Starting Point: " + startingPoint);
        System.out.println("Destination: " + destination);
    } 
}

class Coach{
    private String coachType;
}

class passengerInformation {  
    private int noOfPassengers;


}

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Train[] trains = {
            new Train(1, "Keshod", "Rajkot", "Rajkot Express", "Sleeper"),
            new Train(2, "Keshod", "Ahmedabad", "Ahmedabad Express", "AC 3 Tier"),
            new Train(3, "Rajkot", "Mumbai", "Saurashtra Mail", "AC 2 Tier"),
            new Train(4, "Ahmedabad", "Delhi", "Shatabdi Express", "AC 3 Tier"),
            new Train(5, "Surat", "Jaipur", "Surat Superfast", "Sleeper"),
            new Train(6, "Vadodara", "Mumbai", "Gujarat Express", "AC 2 Tier"),
            new Train(7, "Delhi", "Mumbai", "Rajdhani Express", "AC 1 Tier"),
            new Train(8, "Kolkata", "Bangalore", "Howrah Duronto", "AC 3 Tier"),
            new Train(9, "Chennai", "Hyderabad", "Charminar Express", "Sleeper"),
            new Train(10, "Bhopal", "Lucknow", "Bhopal Mail", "AC 2 Tier")
        };

        System.out.println("Welcome to IRCTC Ticket Booking System");
        System.out.print("Enter starting point: ");
        String startingPoint = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter coach type (S - Sleeper, B - 3 Tier AC, A - 2 Tier AC, H - 1st class AC): ");
        String coachType = sc.nextLine();

        System.out.print("Enter number of passengers: ");
        int noOfPassengers = sc.nextInt();

        Train user = new Train(startingPoint, destination);

        user.displayDetails();  
    }
}
