public class NestedLoops {
    public static void main(String[] args) {
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        printStarPyramid(8);
        printReversedNumberPyramid(6);
        printPyramid(5);
        printDiamond(5);
        printChristmasTree(6);
    }



    public static void printStarPyramid(int column) {
        for (int i = 1; i < column; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printReversedNumberPyramid(int column) {
        int number = 1;
        for (int i = column; i > 0; i--) {
//            int counter = 1;
            for (int j = i; j > 0; j--) {
                System.out.print(number);
//                counter++;
                number++;
            }
            number = 1;
            System.out.println();
        }
    }
    public static void printPyramid(int column) {

        for (int line = 0; line < column; line++) {
            for (int spaces = column - line; spaces > 0; spaces-- ) {
                System.out.print(" ");
            }
            int gap = (line * 2) + 1;
            for (int stars = 0; stars < gap; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printDiamond(int column) {

        for (int line = 0; line <= column / 2; line++) {
            for (int spaces = column / 2 - line; spaces > 0; spaces-- ) {
                System.out.print(" ");
            }
            int gap = (line * 2) + 1;
            for (int stars = 0; stars < gap; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( int line = column / 2 - 1; line >= 0; line--) {
            for (int space = column / 2 - line; space > 0 ; space--) {
                System.out.print(" ");
            }
            int gap = (line * 2) + 1;
            for (int star = 0; star < gap; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void printChristmasTree(int column) {
        for (int line = 0; line < column; line++) {
            for (int spaces = column - line; spaces > 0; spaces-- ) {
                System.out.print(" ");
            }
            int gap = (line * 2) + 1;
            for (int stars = 0; stars < gap; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int spaces = 0; spaces < column - 1; spaces++) {
            System.out.print(" ");
        }
        System.out.println("| |");
        for (int spaces = 0; spaces < column - 1; spaces++) {
            System.out.print(" ");
        }
        System.out.println("|_|");
    }

}

