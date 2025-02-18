public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs1));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (i < strs.length) {
                    if (strs[j].charAt(i) != currentChar) {
                        return newString.toString();
                    }
                }
            }
            newString.append(currentChar);
        }
        return newString.toString();
    }
}
