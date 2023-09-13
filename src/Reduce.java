public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int i = 100;
        while (i != 0) {
            // Find out if number is even or odd
            boolean isEven = i % 2 == 0;

            // Perform appropriate operation
            if (isEven) {
                i = i / 2;
            } else {
                i = i - 1;
            }
            count += 1;
        }
        System.out.println(count);
    }
}
