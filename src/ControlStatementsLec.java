import java.util.Scanner;

public class ControlStatementsLec {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.printf("Continue? ");
        String userInput = sc.next();
        boolean confirmation = userInput.equals("y");
        System.out.println(confirmation);



    }
}
