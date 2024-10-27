public class FibonacciGenerator {
    public static int generate(int index) {
        if (index <= 1) {
            return index;
        }
        return index - 1;
    }
}
