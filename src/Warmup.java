public class Warmup {


    public static String helloCami() {
        return ("Hey Cami, Whats up?!");
    }

//    public static void loop(int lrg) {
//        int i;
//        for (i = 0; i < lrg; i++) {
//            System.out.println(i);
//        }
//    }
//
//    public static void loopToThirty() {
//        int i;
//        for (i = 0; i <= 30; i++) {
//            System.out.println(i);
//        }
//    }
//
//
//    public static void countToNum(int num) {
//        int i;
//        for (i = 0; i <= num; i++) {
//            System.out.println(i);
//        }
//            System.out.println("The number the user counted to was: " + num);
//    }
//
//
//    public static boolean isPalindrome(String str)
//    {
//        int i = 0, x = str.length() - 1;
//        while (i < x) {
//            if (str.charAt(i) != str.charAt(x))
//                return false;
//            i++;
//            x--;
//        }
//        return true;
//    }

    public static int fizzBuzz() {
        int i;
        for (i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i +" Fizz");
            } else {
                System.out.println(i);
            }
        }
        return i;
    }




//    public static void main(String[] args) {
//        System.out.println("hello");
//        loop(20);
//
//        System.out.println("This is a test");
//
//        System.out.println(isPalindrome("helleh"));
//
//
//        loopToThirty();
//
//        System.out.println(fizzBuzz());
//
//        countToNum(18);
//
//    }

//    public static void fizzBuzz() {
//        for( int i = 0; i <= 100; i++ ) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if ( i % 5 == 0 ) {
//                System.out.println("Buzz");
//            } else if ( i % 3 == 0 ) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }








//    public static void fizzBuzz() {
//        for (int i = 0; i <= 100; i++) {
//
//            if (i % 3 == 0 && i % 2 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 2 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//
//        }
//    }



    public static boolean isAdmin(String input) {
        boolean isAdmin;

        if (input.equalsIgnoreCase("iamtheadmin@gmail.com")) {
            isAdmin = true;
        } else {
            isAdmin = false;
        }
        return isAdmin;
    }




    public static void main(String[] args) {
//        fizzBuzz();
//        System.out.println(isAdmin("notAdmin@gmail.com"));
//        loop(23);
        System.out.println(helloCami());
    }







}
