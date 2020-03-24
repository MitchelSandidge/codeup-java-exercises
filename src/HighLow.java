import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randomNum = (int) (Math.random() * 100) + 1;
//        System.out.println(randomNum);
        boolean continueHighLow = true;

        System.out.println("Guess the random number from 1 - 100");
        int numOfGuesses = 0;

        while (continueHighLow) {
            int userGuess = sc.nextInt();

            numOfGuesses += 1;

            if (numOfGuesses == 8) {
                System.out.println("Thats 8 guesses.. YOU LOSE");
                continueHighLow = false;
            } else if (userGuess == randomNum) {
                System.out.println("CORRECT!!! The number was: " + randomNum + ".  It took you: " + numOfGuesses + " guesses.");
                continueHighLow = false;
            } else if (userGuess > randomNum){
                System.out.println("LOWER");
            } else if (userGuess < randomNum) {
                System.out.println("HIGHER");
            }



        }


    }
}
