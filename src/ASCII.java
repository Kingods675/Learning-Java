import java.util.ArrayList;

public class ASCII {
    public static void main(String[] args) {
        String plaintext = "HTsLwfyzqfyntsx! Dtz ozxy bfxyji 5x wjfinsl ymnx Rjfsnslqjxx rjxxflj jmjmj";
        int key = 3;
//        String cipher = simpleEncrypted(plaintext, key);
//        System.out.println(cipher);
//        String cipherText = "XYZ";
//        String plainText = simpleDecrypted(plaintext, key);
//        System.out.println(plainText);
        ArrayList<String> test = bruteForceDecrypt(plaintext);
        System.out.print(test);

    }

    public static String simpleEncrypted(String plaintext, int key) {
        StringBuilder cipher = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char plainChar = plaintext.charAt(i);
            int plainAscii = (int) plainChar;
            int encryptedAscii = plainAscii + key;
            if (65 <= plainAscii && plainAscii <= 90) {
                if (encryptedAscii > 90) {
                    int different = encryptedAscii - 91;
                    int lowerbound = 65 + different;
                    encryptedAscii = lowerbound;
                } else if (encryptedAscii < 65) {
                    int different = encryptedAscii - 64;
                    int uperbound = 90 + different;
                    encryptedAscii = uperbound;
                }
            } else if (97 <= plainAscii && plainAscii <= 122) {
                if (encryptedAscii > 122) {
                    int different = encryptedAscii - 123;
                    int lowerbound = 97 + different;
                    encryptedAscii = lowerbound;
                } else if (encryptedAscii < 97) {
                    int different = encryptedAscii - 96;
                    int uperbound = 122 + different;
                    encryptedAscii = uperbound;
                }
            }
            char encryptedChar = (char) encryptedAscii;
            cipher.append(encryptedChar);
        }
        return cipher.toString();
    }

    public static String decrypt(String cipher, int key) {
        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < cipher.length(); i++) {
            char plainChar = cipher.charAt(i);
            int plainAscii = (int) plainChar;
            int decryptedAscii = plainAscii;
            if (65 <= plainAscii && plainAscii <= 90) {
                decryptedAscii = plainAscii - key;
                if (decryptedAscii > 90) {
                    int different = decryptedAscii - 91;
                    int lowerbound = 65 + different;
                    decryptedAscii = lowerbound;
                } else if (decryptedAscii < 65) {
                    int different = decryptedAscii - 64;
                    int uperbound = 90 + different;
                    decryptedAscii = uperbound;
                }
            } else if (97 <= plainAscii && plainAscii <= 122) {
                decryptedAscii = plainAscii - key;
                if (decryptedAscii > 122) {
                    int different = decryptedAscii - 123;
                    int lowerbound = 97 + different;
                    decryptedAscii = lowerbound;
                } else if (decryptedAscii < 97) {
                    int different = decryptedAscii - 96;
                    int uperbound = 122 + different;
                    decryptedAscii = uperbound;
                }
            }
            char decryptedAscii1 = (char) decryptedAscii;
            plaintext.append(decryptedAscii1);
        }
        return plaintext.toString();
    }

    public static ArrayList<String> bruteForceDecrypt(String cipher) {
        ArrayList<String> option = new ArrayList<>();
        for (int key = 1; key <= 24; key++) {
            String text = decrypt(cipher, key);
            System.out.printf("key = %d | text = %s\n",key,text);
            option.add(text);
        }
        return option;
    }
}
