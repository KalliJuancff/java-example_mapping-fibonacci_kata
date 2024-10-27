import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciGeneratorShould {
    @Test
    public void return_0_when_asked_for_the_0th_number() {
        assertThat(FibonacciGenerator.generate(0)).isEqualTo(0);
    }

    @Test
    public void return_1_when_asked_for_the_1st_number() {
        assertThat(FibonacciGenerator.generate(1)).isEqualTo(1);
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
