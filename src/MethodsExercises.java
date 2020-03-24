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



    // Exercise 3
    public static boolean getFac(long factNum) {

        Scanner sc = new Scanner(System.in);

        if (factNum >= 1 & factNum <=10) {
            System.out.println("Good your number is: " + factNum);

            System.out.println("The factorial of " + factNum + " is: %n");
            long total = 0;
            long currentMath = 0;
            for(long i = factNum; i >= 1; i-- ) {
                total += factNum * i;
                currentMath = factNum * i;
                System.out.println(factNum + " x " + i + " = " + currentMath);
            }
            System.out.println("The factorial of " + factNum + " is: " + total);

            System.out.println("Do you wish to continue? y/n");
            String userCon = sc.nextLine();
            if (userCon.equalsIgnoreCase("y")) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("That is not a valid number..");
            return true;
        }
    }



    // Main method
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

//        boolean wrongNum = true;
//
//        while (wrongNum) {
//            System.out.println("Please enter a number between 1 and 50:");
//            int userNum = sc.nextInt();
//
//
//            wrongNum = getInt(userNum);
//        }




        // Exercise 3
        System.out.println("-----Exercise 3-----");
//
//        boolean factorialContinue = true;
//
//        while (factorialContinue) {
//            System.out.println("Enter a number between 1 and 10 to get the factorial:");
//            long factNum = sc.nextInt();
//
//            factorialContinue = getFac(factNum);
//        }



        // Exercise 4
        System.out.println("-----Exercise 4-----");
//        boolean dieContinue = true;
//
//        while (dieContinue) {
//            System.out.println("How many sides are on the die? ");
//            int userSides = sc.nextInt();
//
//            int SIDES = userSides;   // how many sides on the die?
//
//            // roll should be 1 through SIDES
//            int roll = (int) (Math.random() * SIDES) + 1;
//
//            // print result
//            System.out.println(roll);
//
//            dieContinue = false;
//        }


    }
}
