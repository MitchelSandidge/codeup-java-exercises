import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


        //Exercise: 1a
//        int i = 5;
//        while (i < 15) {
//            System.out.printf("%d%n", i);
//            i++;
//        }


        //Exercise: 1b
//        int i = 100;
//        do {
//            if (i % 5 == 0) {
//                System.out.printf("%d %n", i);
//            }
//            i--;
//        }while (i >= -10);


        // 1.2
//        long i = 2;
//        do {
//            System.out.printf("%d %n",i);
//            i = i*i;
//        } while (i < 1000000);


        // 1 Refactored to for loop
//        for(int i = 100; i >= -10; i--) {
//            if (i % 5 == 0) {
//                System.out.printf("%d %n", i);
//            }
//        }


        // 1.2 Refactored
//        for(long i = 2; i < 1000000; i = i*i) {
//            System.out.printf("%d %n", i);
//        }



        // Exercise 2
//        for(int i = 1; i <= 100; i++) {
//            if (i % 15 ==0) {
//                System.out.printf("FizzBuzz %n");
//            } else if (i % 5 == 0){
//                System.out.printf("Buzz %n");
//            } else if (i % 3 == 0) {
//                System.out.printf("Fizz %n");
//            } else {
//                System.out.printf("%d %n", i);
//            }
//        }



        // Exercise 3
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("What number would you like to go to in your table? %n");
//        int userNum = sc.nextInt();
//
//        System.out.printf("Here is your table: %n%nnumber | squared | cubed %n------ | ------- | ------ %n");
//
//        for(int i = 1; i <= userNum; i++) {
//            int numSquared = i*i;
//            int numCubed = i*i*i;
//
//            System.out.printf("%d      |%d        |%d %n", i, numSquared, numCubed);
//        }




        // Exercise 4
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between 1-100:");
        int userNum = sc.nextInt();

        System.out.printf("Your grade was: %d%n", userNum);

        if (userNum >= 90 && userNum <= 100) {
            System.out.printf("Letter Grade: A");
        } else if (userNum >= 80 && userNum < 90) {
            System.out.printf("Letter Grade: B");
        } else if (userNum >= 70 && userNum < 80) {
            System.out.printf("Letter Grade: C");
        } else if (userNum >= 60 && userNum < 70) {
            System.out.printf("Letter Grade: D");
        } else if (userNum >= 0 && userNum < 60) {
            System.out.printf("Letter Grade: F");
        } else {
            System.out.printf("Not a valid number.. go back to school");
        }








    }
}
