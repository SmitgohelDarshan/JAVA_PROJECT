import java.util.Scanner;

class Train{
    private int trainNumber;
    protected String startingPoint;
    protected String destination;
    private String trainName;
            
    public Train(String startingPoint, String destination) {
        this.startingPoint = startingPoint;
        this.destination = destination;
    }

    public Train(int trainNumber, String startingPoint, String destination, String trainName) {
        this.trainNumber = trainNumber;
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.trainName = trainName;
    }

    public void displayDetails() {
        System.out.println("\nTrain Booking Details");
        System.out.println("Starting Point: " + startingPoint);
        System.out.println("Destination: " + destination);
    }
}

class Coach {
    protected String coachType;
    protected int availableSeats;

    public Coach(String coachType) {
        this.coachType = coachType;

        switch (coachType.toUpperCase()) {    // convert to uppercase when user enter lower case convert to upper
            case "S": availableSeats = 72; break;  // Sleeper
            case "B": availableSeats = 72; break;  // 3 Tier AC
            case "A": availableSeats = 48; break;  // 2 Tier AC
            case "H": availableSeats = 24; break;  // 1st Class AC
            default: availableSeats = 0;  // Invalid coach type
        }
    }

    public void displayCoachInfo() {
        System.out.println("Coach Type: " + coachType + ", Available Seats: " + availableSeats);
    }
}


class PassengerInformation {
    protected int noOfPassengers;

    public PassengerInformation(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    class Ticket {
        public Ticket(Train selectedTrain, PassengerInformation passenger, Coach coach) {
        }

        public void generateTicket() {
        } 
    }
}

            
    public class Project {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Welcome to IRCTC Ticket Booking System");
            System.out.print("Enter starting point: ");
            String startingPoint = sc.nextLine();
            
            System.out.print("Enter destination: ");
            String destination = sc.nextLine();
            
            System.out.print("Enter coach type (S - Sleeper, B - 3 Tier AC, A - 2 Tier AC, H - 1st class AC): ");
            String coachType = sc.nextLine();
            
            System.out.print("Enter number of passengers: ");
            int noOfPassengers = sc.nextInt();
            
            Train selectedTrain = null;
            Train[] trains = {
                new Train(1, "Keshod", "Rajkot", "Keshod Express"),
                new Train(2, "Keshod", "Ahmedabad", "Keshod Local"),
                new Train(3, "Rajkot", "Mumbai", "Rajkot Express"),
                new Train(4, "Ahmedabad", "Delhi", "Ahmedabad Express"),
                new Train(5, "Surat", "Jaipur", "Rajsthan Express"),
                new Train(6, "Veraval", "Gandhinagar", "Somanath Express"),
                new Train(7, "Mumbai", "Gandhinagar", "Mumbai Express"),
                new Train(8, "Delhi", "Mumbai", "Delhi Express"),
                new Train(9, "Veraval", "Kerala", "Kerala Express"),
                new Train(10, "Ahmedabad", "Bhopal", "Bhopal Express"),
            };
            
            for (Train train : trains) {
                if (train.startingPoint.equalsIgnoreCase(startingPoint)
                        && train.destination.equalsIgnoreCase(destination)) {
                        selectedTrain = train;
                        break;
                }
            }
            
            if (selectedTrain == null) {
                    System.out.println("No train found for the given route.");
                    return;
            }
            
            Train user = new Train(startingPoint, destination);
            
            user.displayDetails();
            
        PassengerInformation passenger = new PassengerInformation(noOfPassengers);  
        Coach coach = new Coach(coachType);  // Don't pass `noOfPassengers`  

        PassengerInformation.Ticket ticket = passenger.new Ticket(selectedTrain, passenger, coach);  
        ticket.generateTicket();

    }
}