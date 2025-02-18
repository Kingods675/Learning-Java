import java.util.HashMap;

public class Feb17_HashMap {
    public static void main(String[] args) {
//        System.out.println(getCharFrequency("abcdacee"));
        System.out.println(containsDuplicate(new int[] {1,2,3,4,1}));
    }

    public static HashMap<Character, Integer> getCharFrequency(String s) {
        HashMap<Character,Integer> charFrequency = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (charFrequency.get(c) == null) {
                charFrequency.put(c, 1);
            } else {
                int currentValue = charFrequency.get(c);
                int newValue = ++currentValue;
                charFrequency.put(c, newValue);
            }

        }
        return charFrequency;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numberMaps = new HashMap<>();

        for (int n : nums) {
            if (numberMaps.get(n) == null) {
                numberMaps.put(n, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
