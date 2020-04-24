public class HelloWorld {
    public static void main(String[] args) {
        int myFavoriteNumber = 12;
        String myString = "This is a string";
        float myNumber;

        myNumber = 123;

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int three = (int) "three";


//        int x = 4;
//        x++;

//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
//        x /= y;
//        y -= x;

        System.out.println("hello world!");

        System.out.println(myFavoriteNumber);
        System.out.println(myString);
        System.out.println(myNumber);
        System.out.println(x);
        System.out.println(y);

        System.out.println(addInts001(3,5));






    }


    public static int addInts001(int a, int b) {
        return a + b;
    }

    public static double performIndicatedOperation011(String operation, double op1, double op2) {
        double results;
        if (operation.equals("ADD")) {
            results = op1 + op2;
        } else if (operation.equals("SUB")) {
            results = op1 - op2;
        } else if (operation.equals("MUL")) {
            results = op1 * op2;
        } else if (operation.equals("DIV")){
            results = op1/op2;
        } else {
            results = 0.0;
        }

        return results;
    }


    public static int getNearestIntegerToRealSum013(double firstRealAdded, double secondRealAdded) {
        int nearestIntSum;

        nearestIntSum = (int) Math.rint(firstRealAdded + secondRealAdded);

        return nearestIntSum;
    }
}





