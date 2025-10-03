import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean menu = true;
        double distance = 0.00;
        while (menu)
        {
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Enter your choice (1, 2, or 3): ");
            choice = sc.nextInt();

            switch (choice)
            {
                default:
                {
                    System.out.println("Error");
                    break;
                }
                case 1:
                    System.out.print("\nEnter distance in miles: ");
                    distance = sc.nextDouble();
                    System.out.println("\nConversion Results:");
                    System.out.println("Miles: " + distance);
                    distance *= 1.60935;
                    System.out.println("Kilometers: " + distance);
                    System.out.println();
                    break;
                case 2:
                {
                    System.out.print("\nEnter distance in kilometers: ");
                    distance = sc.nextDouble();
                    System.out.println("\nConversion Results:");
                    System.out.println("Kilometers: " + distance);
                    distance /= 1.60935;
                    System.out.println("Miles: " + distance);
                    System.out.println();
                    break;
                }
                case 3:
                {
                    System.out.println("Goodbye!");
                    menu = false;
                    break;
                }
            }
        }
    }
}