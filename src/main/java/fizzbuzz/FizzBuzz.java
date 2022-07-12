package fizzbuzz;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class FizzBuzzRules {
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

public class FizzBuzz {

    public List<String> getNumbers(int from, int until) {
        return IntStream.rangeClosed(from, until).mapToObj(number -> toFizzBuzz(number, new FizzBuzzRules().getRules(number))).collect(Collectors.toList());
    }

    private String toFizzBuzz(int number, Stream<Supplier<String>> rules) {
        String result = rules.map(Supplier::get).collect(Collectors.joining());
        if (result.isEmpty()) {
            return Integer.toString(number);
        }
        return result;
    }
}
