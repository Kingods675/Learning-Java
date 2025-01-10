import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
//            count();
//
//            driveCar("Tesla", "Y", 2024);
//            driveCar("Mclaren","720", 2023);
//
//
//    }
//
//    public static void count() {
//        System.out.println("1,2,3");
//    }
//
//    public static void driveCar(String car, String model, int year) {
//
//        System.out.printf("I am driving %s %s %d\n", car, model, year);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of 1 circle: ");
        double radius = sc.nextDouble();
        System.out.print("How many circles are there: ");
        int numOfCircles = sc.nextInt();
        calculateCircleArea(radius, numOfCircles);
    }
     public static void calculateCircleArea(double radius, int numOfCircles){

         double totalAreaOfCircles = numOfCircles * (3.14 * Math.pow(radius, 2));
         System.out.printf("Total area of %d circles is %.2f", numOfCircles, totalAreaOfCircles);
    }
}
