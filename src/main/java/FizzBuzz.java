public class FizzBuzz {
    public String playGame(int userValue) {
        if (userValue % 3 == 0 && userValue % 5 == 0) {
            return "FIZZBUZZ";
        }
        if (userValue % 3 == 0) {
            return "FIZZ";
        }
        if (userValue % 5 == 0) {
            return "BUZZ";
        }
            return "" + userValue;
        }
    }

