import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 101);
        int userGuess;
        System.out.println("Guess the number between 0 and 100");

        while (true) {
            userGuess = sc.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulation, you guessed the number");
                break;
            } else if (userGuess > numberToGuess) {
                System.out.println("Guessing number is smaller");
            } else {
                System.out.println("Guessing number is bigger");
            }
        }
    }
}