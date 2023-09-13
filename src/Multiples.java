public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i=1; i<=1000; i++) {
            // Find out if number is divisible by 3 or 5
            boolean divisibleBy3 = i%3==0;
            boolean divisibleBy5 = i%5==0;

            // Count if divisible by 3 or 5
            if (divisibleBy3 || divisibleBy5) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
