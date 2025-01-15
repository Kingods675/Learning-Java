import java.util.Arrays;

public class Dec19_Strings {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello words!"));

        System.out.println(slugify("Atehea - disposable and"));

        System.out.println(reverseWords("Hello words!"));
    }

    public static String reverseString(String words) {
        StringBuilder newWords = new StringBuilder();

        for (int i = words.length() - 1; i >= 0; i--) {
            newWords.append(words.charAt(i));
//            System.out.println(newWords);
        }
        return newWords.toString();
    }

    public static String slugify(String title) {
        return title.toLowerCase().replace(" ", "-");
    }

    public static String reverseWords(String words) {
        StringBuilder newString = new StringBuilder();
        String[] word = words.split(" ");

        for (int i = word.length - 1; i >= 0; i--) {
                newString.append(word[i]).append(' ');
        }
        return newString.toString();
    }
}
