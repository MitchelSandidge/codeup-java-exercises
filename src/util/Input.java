package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;
    private String prompt;

    public Input() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
    }

    public String getString(String prompt) {
        if (prompt != null) {
            System.out.println(prompt);
        } else {
            prompt = "Get String";
        }
        return scanner.nextLine() + " is your string";
    }

    public boolean yesNo() {
        System.out.println("Would you like to continue? y/n");
        if (scanner.next().equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: %n", min, max);
        int userNum = scanner.nextInt();
        if (userNum > min & userNum < max) {
            return userNum;
        } else {
            return getInt(min, max);
        }
    }

    public int getInt() {
        System.out.println("Enter an integer");
        String s = scanner.nextLine();
        return Integer.parseInt(s);
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a double between %s and %s: %n", min, max);
        double userDouble = scanner.nextDouble();
        if (userDouble > min & userDouble < max) {
            return userDouble;
        } else {
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        System.out.println("Enter a double:");
        String d = scanner.nextLine();
        return Integer.parseInt(d);

    }


}



