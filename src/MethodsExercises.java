import java.util.Scanner;

public class MethodsExercises {

    // Add
    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    // Subtract
    public static void sub(int x, int y) {
        System.out.println(x - y);
    }

    // Multiply
    public static void mul(int x, int y) {
        System.out.println(x * y);
    }

    // Divide
    public static void div(int x, int y) {
        System.out.println(x / y);
    }

    // Modulus
    public static void mod(int x, int y) {
        System.out.println(x % y);
    }



    // Exercise 2
    // Get integer
    public static boolean getInt(int userNum) {

        if (userNum >= 1 & userNum <= 50) {
            System.out.println("Good number!");
            return false;
        } else {
            System.out.println("Invalid number.");
            return true;
        }

    }




    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        // Exercise 1
//        System.out.println("-----Exercise 1-----");
//        System.out.println("Enter first number:");
//        int inOne = sc.nextInt();
//        System.out.println("Enter second number:");
//        int inTwo = sc.nextInt();
//
//        // Add
//        System.out.println("Add:");
//        add(inOne,inTwo);
//
//        // Subtract
//        System.out.println("Subtract:");
//        sub(inOne,inTwo);
//
//        // Multiply
//        System.out.println("Multiply:");
//        mul(inOne,inTwo);
//
//        // Divide
//        System.out.println("Divide:");
//        div(inOne,inTwo);
//
//        // Modulus
//        System.out.println("Modulus:");
//        mod(inOne,inTwo);



        // Exercise 2
        System.out.println("-----Exercise 2-----");

        boolean wrongNum = true;

        while (wrongNum) {
            System.out.println("Please enter a number between 1 and 50:");
            int userNum = sc.nextInt();


            wrongNum = getInt(userNum);
        }




        // Exercise 3
        System.out.println("-----Exercise 3-----");



    }
}
