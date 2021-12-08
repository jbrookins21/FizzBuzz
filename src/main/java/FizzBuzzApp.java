import java.util.Scanner;

public class FizzBuzzApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FizzBuzz fizzBuzz = new FizzBuzz();

        for(int i = 0; i < 10; i++) {
            System.out.println("Welcome to FizzBuzz. Enter a number.");
            int userNumber = input.nextInt();

            System.out.println(fizzBuzz.playGame(userNumber));
        }
    }
}
