import java.util.*;

public class RouteActivity {
    public static void main(String[] args) {
        RouteActivity routeActivity = new RouteActivity();
        routeActivity.startTrip();
    }

    private Route route = new Route();
    private Scanner sc = new Scanner(System.in);

    public void startTrip() {
        try {
            printWithDelay(" =============================");
            printWithDelay("|       TRIP TO MOALBOAL      |");
            printWithDelay("|=============================|");
            printWithDelay("|        | Main Route |       |");
            printWithDelay("|=============================|");
            printWithDelay("|    ---Default Routes---     |");
            printWithDelay("|=============================|");
            printWithDelay("| Cebu City    ||  START      |");
            printWithDelay("| Minglanilia  ||  Route 1    |");
            printWithDelay("| San Fernando ||  Route 2    |");
            printWithDelay("| Carcar       ||  Route 3    |");
            printWithDelay("| Barili       ||  Route 4.1  |");
            printWithDelay("| Dumanjug     ||  Route 4.1.1|");
            printWithDelay("| Alcantara    ||  Route 4.1.2|");
            printWithDelay("| Moalboal     ||  ARRIVED    |");
            printWithDelay(" =============================");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        char ans;

        do {
            System.out.print("\nAre there any road issues in Barili? (Route 4)? [Y/N]: ");
            ans = sc.next().charAt(0);

            if (ans == 'Y' || ans == 'y') {
                System.out.println("Barili route is obstructed. Redirecting to Route 2 (R2).");
                break;
            } else if (ans == 'N' || ans == 'n') {
                break;
            } else {
                System.out.println("\nInvalid Input! Please enter 'Y' or 'N'.");
            }
        } while (true);

        double speed;

        if (ans == 'Y' || ans == 'y') {
            do {
                System.out.print("\nAre there any road issues in Dumajug? (Route 4.1.1)? [Y/N]: ");
                ans = sc.next().charAt(0);

                if (ans == 'Y' || ans == 'y') {
                    System.out.println("\nDumanjug route is obstructed. Redirecting to Route 3 (R3).");
                    speed = getSpeed(sc);
                    route.route3();
                    calculateArrivalTime(92.3, speed);
                    break;
                } else if (ans == 'N' || ans == 'n') {
                    System.out.println("\nSince Barili Route is obstructed. Redirecting to Route 2 (R2).");
                    speed = getSpeed(sc);
                    route.route2();
                    calculateArrivalTime(94.0, speed);
                    break;
                } else {
                    System.out.println("\nInvalid Input! Please enter 'Y' or 'N'.");
                }
            } while (true);
        } else {
            System.out.println("\nSince there is no issue, I advise you to take the Default Route.");
            speed = getSpeed(sc);
            route.defaultRoute();
            calculateArrivalTime(84.9, speed);
        }
    }

    private double getSpeed(Scanner sc) {
        double speed;
        while (true) {
            System.out.print("What is your current speed?: ");
            try {
                speed = sc.nextDouble();
                if (speed > 0) {
                    return speed;
                } else {
                    System.out.println("\nInvalid Input! Please enter a positive speed.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Input! Please enter a numeric value.");
                sc.nextLine();
            }
        }
    }

    private void calculateArrivalTime(double distance, double speed) {
        double timeInHours = distance / speed;
        int hours = (int) timeInHours;
        int minutes = (int) ((timeInHours - hours) * 60);
        System.out.println("Estimated time of arrival: " + hours + " hour(s) and " + minutes + " minute(s)");
    }

    private void printWithDelay(String message) throws InterruptedException {
        System.out.println(message);
        Thread.sleep(1000);
    }
}

class Route {
    public void defaultRoute() {
        try {
            printWithDelay("\nRecommended Default Routes: ");
            printWithDelay("Cebu City    |(START)      ");
            printWithDelay("Minglanilia  |(Route 1)    ");
            printWithDelay("San Fernando |(Route 2)    ");
            printWithDelay("Carcar       |(Route 3)    ");
            printWithDelay("Barili       |(Route 4.1)  ");
            printWithDelay("Dumanjug     |(Route 4.1.1)");
            printWithDelay("Alcantara    |(Route 4.1.2)");
            printWithDelay("Moalboal     |(ARRIVED)    ");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void route2() {
        System.out.println("\nRedirected Route (Route 2): ");
        System.out.println("Cebu City    |(START)      ");
        System.out.println("Minglanilia  |(Route 1)    ");
        System.out.println("San Fernando |(Route 2)    ");
        System.out.println("Moalboal     |(ARRIVED)    ");
    }

    public void route3() {
        System.out.println("\nRedirected Route (Route 3): ");
        System.out.println("Cebu City    |(START)      ");
        System.out.println("Minglanilia  |(Route 1)    ");
        System.out.println("San Fernando |(Route 2)    ");
        System.out.println("Carcar       |(Route 3)    ");
        System.out.println("Moalboal     |(ARRIVED)    ");
    }

    private void printWithDelay(String message) throws InterruptedException {
        System.out.println(message);
        Thread.sleep(1000);
    }
}
