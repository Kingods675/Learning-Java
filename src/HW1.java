import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Height (m): ");
        double height = sc.nextDouble();

        double BMI = weight / (Math.pow(height,2));
        System.out.printf("Your BMI is %.2f%n",BMI);

        if (BMI > 35) {
            System.out.println("Extremely obese");
        } else if (30 <= BMI && BMI <= 34.9) {
            System.out.println("Obese");
        } else if (25 <= BMI && BMI <= 29.9) {
            System.out.println("Overweight");
        } else if (18.5 <= BMI && BMI <= 24.9) {
            System.out.println("Normal");
        } else if (0 <= BMI && BMI <= 18.5) {
            System.out.println("Under weight");
        } else {
            System.out.println("Error");
        }

        double maxHealthyWeight = 24 * (Math.pow(height,2));
        double minHealthyWeight = 18.5 * (Math.pow(height,2));

        if (24 < BMI){
            double loseWeight = weight - maxHealthyWeight;
            System.out.printf("Lose %.2f kg to reach a BMI of 24 kg/m2",loseWeight);
        } else if ( BMI < 18.5) {
            double gainWeight = minHealthyWeight - weight;
            System.out.printf("Gain %.2f kg to reach a BMI of 18.5 kg/m2", gainWeight);
        }


    }
}
