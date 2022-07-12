package fizzbuzz;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FizzBuzzRules {
    public Stream<Supplier<String>> getRules(int number) {
        return Stream.of(() -> getFizzRule(number), () -> getBuzzRule(number));
    }

    private String getFizzRule(int number) {
        if (isDivisibleBy(number, 3)) {
            return "Fizz";
        }
        return "";
    }

    private String getBuzzRule(int number) {
        if (isDivisibleBy(number, 5)) {
            return "Buzz";
        }
        return "";
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

}
