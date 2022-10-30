import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //initialize scanner
        Scanner scanner = new Scanner(System.in);
        double ageInSeconds;

        try {
            System.out.print("Give me your age in seconds -> ");
            // read age in seconds
            ageInSeconds = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("ERROR -> " + e);
            ageInSeconds = 0;
        }

        // initialize SpaceAge class and read age in seconds
        SpaceAge age = new SpaceAge(ageInSeconds);
        System.out.println("Age on Jupiter " + age.onJupiter());

        // close scannner
        scanner.close();

    }
}
