import java.util.Scanner;

public class doan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int number = (int) (1 +Math.random() * 99);
        System.out.print("Guess the number: ");
        while (true) {
            int guessNum = sc.nextInt();
            if (guessNum > number) {
                System.out.print("Choose lower number than " + guessNum + ":");
            } else if (guessNum < number) {
                System.out.print("Choose higher number than " + guessNum + ":");
            } else if (guessNum == number) {
                break;
            } else {
                System.out.println("Please input number");
            }
            count++;
        }
        System.out.println("The number player try: " + count);
    }
}
