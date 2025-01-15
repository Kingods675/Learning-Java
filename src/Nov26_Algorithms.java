import java.util.Arrays;
import java.util.HashMap;

public class Nov26_Algorithms {
    public static void main(String[] args) {
        HashMap<String, String> urlStructure = getURLStructure("https://www.youtube.com/watch?v=OL_eIZjiLUk&ab_channel=TopGear");
        System.out.println(urlStructure);
//
//        System.out.println(getURLStructure("https://en.wikipedia.org/wiki/Write_once,_run_anywhere"));

//        String number = "66-333-88-7777";  // -> "never"
//        String[] characters = number.split("-");
//        System.out.println(Arrays.toString(characters));
        String number = "66-33-88-33-777";  // -> "never"
        System.out.println(transformNumberToWord(number));
    }

    public static HashMap<String, String> getURLStructure(String url) {
        HashMap<String, String> urlStructure = new HashMap<>();

//        urlStructure.put("protocol", url.substring(0, url.indexOf("w")));
//        urlStructure.put("subDomain", url.substring(url.indexOf("w"), url.indexOf(".") + 1));
//        urlStructure.put("domainName", url.substring(url.indexOf(".") + 1, url.);

        int i = 0;

        StringBuilder protocol = new StringBuilder();
        while (url.charAt(i) != 'w') {
            protocol.append(url.charAt(i));
            i++;
        }
        urlStructure.put("protocol", protocol.toString());

        StringBuilder subDomain = new StringBuilder();
        while (url.charAt(i) != '.') {
            subDomain.append(url.charAt(i));
            i++;
        }
        subDomain.append(url.charAt(i));
        urlStructure.put("subDomain", subDomain.toString());
        i++;

        StringBuilder domainName = new StringBuilder();
        while (url.charAt(i) != '/') {
            domainName.append(url.charAt(i));
            i++;
        }
        urlStructure.put("domainName", domainName.toString());

        StringBuilder path = new StringBuilder();
//        while (url.charAt(i) != '?') {
        while (i < url.length()) {
            path.append(url.charAt(i));
            i++;
        }
//        path.append(url.charAt(i));
        urlStructure.put("path", path.toString());
        return urlStructure;
    }

//    getMessageFromPhonePad(String phone) -> String message

//
//        {
//            protocol: "http://",
//            subDomain: "www.",
//            domainName: "youtube.com",
//            path: "/watch"
//            queryString: {
//                v: "OL_eIZjiLUk",
//                ab_channel: "TopGear"
//            } // OPTIONAL
//            queryString: "?v=OL_eIZjiLUk&ab_channel=TopGear"
//        }

    public static String transformNumberToWord(String number) {
        // Mapping from digits to letters
        HashMap<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");


        StringBuilder word = new StringBuilder();
        String[] characters = number.split("-");
        for (String group : characters) {
            char digit = group.charAt(0);
            int count = group.length();

            String letters = digitToLetters.get(digit);

            char letter = letters.charAt((count - 1) % letters.length());
            word.append(Character.toLowerCase(letter));
        }

        return word.toString();
    }
}