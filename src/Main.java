import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean isValid = false;
        double rad = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle to calculate Circumference and Area");
        String userInput = scanner.nextLine();
        while(!isValid) {
            try {
                rad = Double.parseDouble(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException ex) {
                System.out.println("Incorrect format, please enter a valid real number");
                userInput = scanner.nextLine();
            }
        }
        System.out.println("The circumference of the circle is: " + CircumferenceArea.calcCircumference(rad));
        System.out.println("The area of the circle is: " + CircumferenceArea.calcArea(rad));
        }
    }