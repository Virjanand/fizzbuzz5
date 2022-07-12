package fizzbuzz;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FizzBuzzRules {
    public Stream<Supplier<String>> getRules(int number) {
        return Stream.of(() -> getFizzRule(number), () -> getBuzzRule(number));
    }

    private String getFizzRule(int number) {
        return isDivisibleBy(number, 3) || numberContains(number, "3") ? "Fizz" : "";
    }

    private boolean numberContains(int number, String numberToBeContained) {
        return Integer.toString(number).contains(numberToBeContained);
    }

    private String getBuzzRule(int number) {
        return isDivisibleBy(number, 5) || numberContains(number, "5")? "Buzz" : "";
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

}
