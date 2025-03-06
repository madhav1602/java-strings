import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // Array to store weight and height
        
        // Taking input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble(); // Store weight
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble(); // Store height
        }
        
        // Compute BMI and statuses
        String[][] bmiData = calculateBMI(data);
        
        // Display the results
        displayResults(bmiData);
    }

    // Method to calculate BMI and determine status
    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4]; // Store weight, height, BMI, and status
        
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100; // Convert cm to meters
            double bmi = weight / (height * height); // BMI formula
            
            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height * 100);
            result[i][2] = String.format("%.2f", bmi); // Round BMI to 2 decimal places
            result[i][3] = getStatus(bmi); // Get BMI status
        }
        return result;
    }

    // Method to determine BMI status
    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    // Method to display BMI results in a tabular format
    static void displayResults(String[][] bmiData) {
        System.out.println("\nBMI Analysis:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("------------------------------------------------");
        
        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
    }
}
