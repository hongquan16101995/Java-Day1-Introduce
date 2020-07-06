package BMI;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, weight, bmi;

        System.out.println("Enter your height:");
        height = scanner.nextDouble();

        System.out.println("Enter your weight:");
        weight = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18){
            System.out.printf("%-20s%s", bmi, "Underwright");
        } else if (bmi <25.0){
            System.out.printf("%-20s%s", bmi, "Normal");
        }else if (bmi <30){
            System.out.printf("%-20s%s", bmi, "Overweight");
        }else {
            System.out.printf("%-20s%s", bmi, "Obese");
        }
    }
}
