import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance (km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter the speed (km/h): ");
        double speed = sc.nextDouble();

        double time = distance / speed;
        int hour = (int) time;
        double hourToMinute = time % 1 *60;
        int minute = (int) hourToMinute;


        String hourUnit = hour > 1 ? "hours" : "hour";
        String minuteUnit = minute > 1 ? "minutes" : "minute";
        if( minute != 0) {
            System.out.printf("It would take %d %s and %d %s to travel %.0f km", hour, hourUnit, minute, minuteUnit, distance);
        } else if ( minute == 0) {
            System.out.printf("It would take %d %s to travel %.0f km", hour, hourUnit, distance);
        }


        }
    }

