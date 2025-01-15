public class ProgramArgument {
    public static void main(String[] args) {

        int length = Integer.parseInt(args[0]);
        System.out.println( RandomPassword.randomPassword(length));
    }
}
