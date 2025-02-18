import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanNum = new HashMap<>();
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0) {
                char curr = s.charAt(i);
                char prev = s.charAt(i - 1);
                if ((prev == 'I' && curr == 'V') || (prev == 'I' && curr == 'X') || (prev == 'X' && curr == 'L') || (prev == 'X' && curr == 'C') || (prev == 'C' && curr == 'D') || (prev == 'C' && curr == 'M')) {
                    int specialNum = romanNum.get(curr) - romanNum.get(prev);
                    sum = sum + specialNum;
                } else {
                    sum = sum + romanNum.get(curr);
                }
            } else {
                sum = sum + romanNum.get(s.charAt(i));
            }
        } return sum;
    }
}
