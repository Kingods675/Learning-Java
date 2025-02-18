import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MDCXCV"));
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
        int i = 0;
        while ( i < s.length()) {
            char curr = s.charAt(i);
            char next = i < s.length() - 1 ? s.charAt( i + 1 ) : s.charAt(i);
            if ((curr == 'I' && next == 'V') || (curr == 'I' && next == 'X') || (curr == 'X' && next == 'L') || (curr == 'X' && next == 'C') || (curr == 'C' && next == 'D') || (curr == 'C' && next == 'M')) {
                int specialNum = romanNum.get(next) - romanNum.get(curr);
                sum = sum + specialNum;
                i += 2;
            } else {
                sum = sum + romanNum.get(curr);
                i++;
            }
        }
        return sum;
    }
}

