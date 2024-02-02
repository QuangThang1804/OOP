import java.util.Scanner;

// 4.6
public class InputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inNumber;
        boolean isValid = false;
        do {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            inNumber = in.nextInt();
            if ((inNumber >= 0 && inNumber <= 10) || (inNumber >= 90 && inNumber <= 100)) {
                System.out.println("You have entered: " + inNumber);
                isValid = true;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);
    }
}
