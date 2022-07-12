package fizzbuzz;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FizzBuzzRules {
    public Stream<Supplier<String>> getRules(int number) {
        return Stream.of(() -> getFizzRule(number), () -> getBuzzRule(number));
    }

    private String getFizzRule(int number) {
        return convertNumberToFizzBuzz(number, 3, "Fizz");
    }

    private String getBuzzRule(int number) {
        return convertNumberToFizzBuzz(number, 5, "Buzz");
    }

    private String convertNumberToFizzBuzz(int number, int divisor, String result) {
        if (number % divisor == 0) {
            return result;
        }
        return "";
    }
}
