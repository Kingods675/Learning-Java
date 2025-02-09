import java.util.ArrayList;
import java.util.Arrays;

public class toCharArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(toCharStaticArray("abc 123 h2")));

        System.out.println(toCharDynamicArray("abc 123 h2"));
    }
    public static char[] toCharStaticArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static ArrayList<Character> toCharDynamicArray(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            arr.add(s.charAt(i));
        }
        return arr;
    }
}
