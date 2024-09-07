import java.util.Scanner;

public class App extends zodiacMethod{
    public static void main (String[] args){

        int year, month, day;

try (Scanner scanner = new Scanner(System.in)) {
    boolean isValid = false;
    zodiacMethod app = new zodiacMethod(); 
        
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
                                // Concatenate year, month, and day into a string
                                System.out.println(" you enter in your birth year "+year+" you enterd in your birth month is "+month+" you enter in your birth date is "+day);
                                
                                // Call method based on concatenated date
                                ZodiacAnimal animal = app.getZodiacAnimalByYear(year);
                                if (animal != null) {
                                    animal.displayTraits();  // Display the traits of the corresponding zodiac animal
                                }
                                isValid = true; // Exit the loop once a valid date is processed
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
            scanner.next(); // Clear the invalid input
        }
    } while (!isValid);

} catch (Exception e) {
    System.out.println("An error occurred: " + e.getMessage());
}
    }
}