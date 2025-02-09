public class ReplaceChars {
    public static void main(String[] args) {
        System.out.println(replaceChars("replaceChar", 'e','E'));

    }
    public static String replaceChars(String string, char oldChar, char newChar) {
        StringBuilder newString = new StringBuilder(string);

        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) == oldChar) {
                newString.setCharAt(i, newChar);
            }
        }
        return newString.toString();
    }
}
