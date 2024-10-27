public class FibonacciGenerator {
    public static int generate(int index) {
        if (index <= 1) {
            return index;
        }
        return generate(index - 1) + generate(index - 2);
    }
}
