import java.util.Scanner;

public class App extends zodiacMethod{
    public static void main (String[] args){

        int year, month, day;

        try (Scanner scanner = new Scanner(System.in)) {
            boolean isValid = false;
            boolean tryAgain = false;
            zodiacMethod app = new zodiacMethod();
            
            do {
                do {
                    System.out.println("Enter year of birth (between 1900 and 2043):");
                    if (scanner.hasNextInt()) {
                        year = scanner.nextInt();
                        if (year >= 1900 && year <= 2043) {
                            System.out.println("Enter month of birth (1-12):");
                            if (scanner.hasNextInt()) {
                                month = scanner.nextInt();
                                if (month >= 1 && month <= 12) {
                                    System.out.println("Enter day of birth (1-31):");
                                    if (scanner.hasNextInt()) {
                                         day = scanner.nextInt();
                                        if (day >= 1 && day <= 31) {
                                            // Valid date entered
                                            System.out.println("You entered: Year - " + year + ", Month - " + month + ", Day - " + day);
                                            
                                            // Call method based on concatenated date
                                            ZodiacAnimal animal = app.getZodiacAnimalByYear(year);
                                            if (animal != null) {
                                                animal.displayTraits();  // Display traits of corresponding zodiac animal
                                            }
                                            isValid = true; // Valid date, exit the inner loop
                                        } else {
                                            System.out.println("Invalid day. Please enter a valid day.");
                                        }
                                    } else {
                                        System.out.println("Invalid input. Please enter a valid day.");
                                        scanner.next(); // Clear invalid input
                                    }
                                } else {
                                    System.out.println("Invalid month. Please enter a valid month (1-12).");
                                }
                            } else {
                                System.out.println("Invalid input. Please enter a valid month.");
                                scanner.next(); // Clear invalid input
                            }
                        } else {
                            System.out.println("Invalid year. Please enter a year between 1900 and 2043.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid year.");
                        scanner.next(); // Clear invalid input
                    }
                } while (!isValid);

                // Prompt the user if they want to try again
                System.out.println("Would you like to try again? (yes/no):");
                String response = scanner.next().toLowerCase();
                if (response.equals("yes")) {
                    isValid = false; // Reset validation flag to allow retry
                } else {
                    tryAgain = false; // Exit the outer loop
                    System.out.println("Thank you for using the Zodiac Finder!");
                }
            } while (tryAgain);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}