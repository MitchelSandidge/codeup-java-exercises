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

    public String getString() {
        return scanner.nextLine();
    }

    // The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo(){
        String userString = scanner.nextLine();
        return userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes");
    }

    //getInt method w/ custom prompt. returns input int between min & max.
    public int getInt(int x, int y, String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        int i;

        try {                                    //validation try/catch.
            i = Integer.parseInt(input.trim());
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid format...");
            return getInt(x, y, prompt);
        }

        if (i < x || i > y) {
            System.out.println("Number out of range.");
            return getInt(x, y, prompt);
        }
        return i;
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



