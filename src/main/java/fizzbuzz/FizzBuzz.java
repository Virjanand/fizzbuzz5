package fizzbuzz;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    private final FizzBuzzRules fizzBuzzRules;

    public FizzBuzz(FizzBuzzRules fizzBuzzRules) {
        this.fizzBuzzRules = fizzBuzzRules;
    }

    public List<String> getNumbers(int from, int until) {
        return IntStream.rangeClosed(from, until).mapToObj(number -> toFizzBuzz(number, fizzBuzzRules.getRules(number))).collect(Collectors.toList());
    }

    private String toFizzBuzz(int number, Stream<Supplier<String>> rules) {
        String result = rules.map(Supplier::get).collect(Collectors.joining());
        if (result.isEmpty()) {
            return Integer.toString(number);
        }
        return result;
    }
}
