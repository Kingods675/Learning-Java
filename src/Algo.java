import java.util.HashMap;
import java.util.Objects;

public class Algo {
    public static void main(String[] args) {
//        System.out.println(isAnagram("tea", "eat"));
//        System.out.println(isAnagram("tea", "eatt"));
//        System.out.println(isAnagram("tea", "ear"));
//        System.out.println(isAnagram("tee", "ete"));

//        int[] num = {1,2,3,3};
//        System.out.println(hasDuplicate(num));

        HashMap<String, Double> portfolio = new HashMap<>();
        portfolio.put("stock", 123.0);
        portfolio.put("bond", 454.0);
        portfolio.put("real estate", 999.0);
        portfolio.put("cars", 1000.0);
        portfolio.put("cash", 52.0);


        System.out.println(calculate(portfolio));

    }

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;


        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            String key = String.valueOf(s1.charAt(i));
            if (!map1.containsKey(key)) {
                map1.put(key, 1);
            } else {
                int num = map1.get(key);
                map1.put(key, ++num);
            }
        }

        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            String key = String.valueOf(s2.charAt(i));
            if (!map2.containsKey(key)) {
                map2.put(key, 1);
            } else {
                int num = map2.get(key);
                map2.put(key, ++num);
            }
        }
        for (String map1key : map1.keySet()) {
            if (!map2.containsKey(map1key))
                return false;
            if (!Objects.equals(map1.get(map1key), map2.get(map1key)))
                return false;
        }
        return true;
    }

    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicate = new HashMap<>();
        for (int num : nums) {
            if (duplicate.containsKey(num)) {
                return true;
            } else {
                duplicate.put(num, 1);
            }
        }
        return false;
    }

    public static double calculate(HashMap<String, Double> portfolio) {
        double sum = 0;
        for (double value : portfolio.values()) {
            sum += value;
        }
        return sum;
    }
}
