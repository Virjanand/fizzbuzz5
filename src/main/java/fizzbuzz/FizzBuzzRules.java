package fizzbuzz;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FizzBuzzRules {
    public Stream<Supplier<String>> getRules(int number) {
        return Stream.of(() -> convertNumberToFizzBuzz(number, 3, "Fizz"), () -> convertNumberToFizzBuzz(number, 5, "Buzz"));
    }

    private String convertNumberToFizzBuzz(int number, int divisor, String result) {
        if (number % divisor == 0) {
            return result;
        }
        return "";
    }
}
