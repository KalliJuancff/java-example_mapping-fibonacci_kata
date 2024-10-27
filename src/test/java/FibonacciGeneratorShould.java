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
        assertThat(FibonacciGenerator.generate(index)).isEqualTo(expected);
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
