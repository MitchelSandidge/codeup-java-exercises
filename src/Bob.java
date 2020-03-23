import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String continueConvo = "y";

        while (continueConvo.equalsIgnoreCase("y")) {

            System.out.printf("Say something to Bob: %n");

            String userConvo = sc.nextLine();

            if (userConvo.endsWith("?")) {
                System.out.printf("Sure I guess... %n");
            } else if (userConvo.endsWith("!")) {
                System.out.printf("Chill out dude.. %n");
            } else if (userConvo.equals("")) {
                System.out.printf("Fine.. be that way %n");
            } else {
                System.out.printf("ok whatever.. %n");
            }

            System.out.printf("Continue talking to Bob? Y/N %n");
            continueConvo = sc.nextLine();
        }


    }
}
