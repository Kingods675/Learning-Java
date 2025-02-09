public class MixAndMatch {
    public static void main(String[] args) {
        String s1 = "String";
        String s2 = "Double 123";
        System.out.println(mixAndMatch(s1, s2));
    }

    public static String mixAndMatch(String s1, String s2) {
        StringBuilder newString = new StringBuilder();
        int totalCharactersLength = s1.length() + s2.length();
        for (int i = 0; i < totalCharactersLength; i++) {
            if (i < s1.length())  { newString.append(s1.charAt(i));}
            if (i < s2.length())  { newString.append(s2.charAt(i));}
        }

        return newString.toString();
    }
}
