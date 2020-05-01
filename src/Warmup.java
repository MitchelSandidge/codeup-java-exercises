import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;

public class Warmup {


    public static void loop(int lrg) {
        int i;
        for (i = 0; i < lrg; i++) {
            System.out.println(i);
        }
    }



    public static boolean isPalindrome(String str)
    {
        int i = 0, x = str.length() - 1;
        while (i < x) {
            if (str.charAt(i) != str.charAt(x))
                return false;
            i++;
            x--;
        }
        return true;
    }
    
    
    

    public static void main(String[] args) {
        System.out.println("hello");
        loop(20);

        System.out.println("This is a test");

        System.out.println(isPalindrome("helleh"));
        
        
        
    }

    
    
    





}
