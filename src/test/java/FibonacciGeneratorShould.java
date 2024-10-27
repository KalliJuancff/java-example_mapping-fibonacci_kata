import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciGeneratorShould {
    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1"
    })
    public void return_the_index_when_asked_for_two_first_numbers(int index, int expected) {
        assertThat(getFibonacciNumberFor(index)).isEqualTo(expected);
    }

    @Test
    public void return_1_when_asked_for_the_number_with_index_2() {
        assertThat(getFibonacciNumberFor(2)).isEqualTo(1);
    }

    @Test
    public void return_2_when_asked_for_the_number_with_index_3() {
        assertThat(getFibonacciNumberFor(3)).isEqualTo(2);
    }

    @Test
    public void return_5_when_asked_for_the_number_with_index_5() {
        assertThat(getFibonacciNumberFor(5)).isEqualTo(5);
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
