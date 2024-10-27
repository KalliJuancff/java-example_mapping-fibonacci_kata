import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciGeneratorShould {
    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1"
    })
    public void generate_index_value_for_two_first_numbers(int index, int expected) {
        assertThat(getFibonacciNumberFor(index)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 1",
            "3, 2",
            "5, 5"
    })
    public void generate_sum_of_two_previous_values_from_third_onwards(int index, int expected) {
        assertThat(getFibonacciNumberFor(index)).isEqualTo(expected);
    }

    private static int getFibonacciNumberFor(int index) {
        return FibonacciGenerator.generate(index);
    }
}


// 0 -> 0
// 1 -> 1
// 2 -> 1
// 3 -> 2
// 4 -> 3
// 5 -> 5
// 6 -> 8
// 7 -> 13
// 8 -> 21
