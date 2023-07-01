import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("----- BMI Calculator -----");
            System.out.println("1. Calculate BMI");
            System.out.println("2. View BMI Category");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    calculateBMI(input);
                    break;
                case 2:
                    viewBMICategory(input);
                    break;
                case 3:
                    System.out.println("Thank you for using the BMI Calculator. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }

    public static void calculateBMI(Scanner input) {
        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);
    }

    public static void viewBMICategory(Scanner input) {
        System.out.print("Enter BMI value: ");
        double bmi = input.nextDouble();

        String category = getBMICategory(bmi);

        System.out.println("BMI Category: " + category);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
