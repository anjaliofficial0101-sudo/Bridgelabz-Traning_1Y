import java.util.Scanner;
class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for the countdown: ");
        int counter = scanner.nextInt();
        scanner.close();

        System.out.println("Initiating countdown...");
        while (counter >= 1) {
            System.out.println(counter);
           
        }
        System.out.println("Lift off");
    }
}