public class getTollFreeNumber {
    public static void main(String[] args) {
        String applePhone = getPhoneWord("apple");
        System.out.println(applePhone);
        String applePhone1 = getPhoneWord("Samsung");
        System.out.println(applePhone1);
        String applePhone2 = getPhoneWord("MICrosoft");
        System.out.println(applePhone2);
    }

    public static String getPhoneWord(String word) {
//        word = word.toLowerCase();
        String phoneNum = "1-800-";
        for ( int i = 0; i < word.length(); i++ ) {

            switch (word.toLowerCase().charAt(i)) {
                case 'a', 'b', 'c':
                    phoneNum += "2";
                    break;
                case 'd', 'e', 'f':
                    phoneNum += "3";
                    break;
                case 'g', 'h', 'i':
                    phoneNum += "4";
                    break;
                case 'j', 'k', 'l':
                    phoneNum += "5";
                    break;
                case 'm', 'n', 'o':
                    phoneNum += "6";
                    break;
                case 'p', 'q', 'r', 's':
                    phoneNum += "7";
                    break;
                case 't', 'u', 'v':
                    phoneNum += "8";
                    break;
                case 'w', 'x', 'y', 'z':
                    phoneNum += "9";
                    break;

            }
        }
        return phoneNum;
    }
}
