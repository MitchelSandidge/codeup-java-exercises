import java.lang.reflect.Array;
import java.util.Scanner;

public class ServerNameGenerator {

    public static String randomString(String [] array) {

        int randomNum = (int) Math.floor(Math.random() * array.length);
        String randomArray = array[randomNum];

        return randomArray;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] adjectives = {"Jealous", "Old", "Spotless", "Stormy", "Lucky", "Clever", "Unusual", "Puzzled", "Victorious", "Modern"};
        String[] nouns = {"Johnny", "Orlando", "Bootstrap", "Cube", "Emily", "Timbuktu", "Sock", "River", "Wolf", "Feather"};


        boolean cont = true;
        do {
            System.out.println("\n\tYour server name is: " + randomString(adjectives) + " " + randomString(nouns));

            System.out.println("\tGet another name? y/n");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                cont = false;
            }
        } while (cont);
    }
}
