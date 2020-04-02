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
        String s = getString();
        int var = 0;
        try {
            var = Integer.parseInt(s);
        } catch (Exception e) {
            System.err.println("This is not an Integer");
            e.printStackTrace();
            return getInt();
        }
        return var;
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
        String d = getString();
        double dub = 0;
        try {
            dub = Double.parseDouble(d);
        } catch (Exception e) {
            System.err.println("That is not a double");
            return getDouble();
        }
        return dub;
    }


    public String getBinary() {
        System.out.println("\n\tEnter a number to get its binary value");
        System.out.print("\n\t>");
        int num = getInt();
        String binary = "null";

        try {
            binary = Integer.toBinaryString(num);

        } catch (Exception e) {
            System.err.println("Not a valid number");
            return getBinary();
        }
        return binary;
    }


    public static void main(String[] args) {
        Input test1 = new Input();
        System.out.println(test1.getInt());
//        System.out.println(test1.getDouble());
//        System.out.println(test1.getBinary());
    }


}



