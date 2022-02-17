package week1.forloops;

public class FizzBuzz {
    public static void main(String[] args) {
        // x > 3 && x < 10
        for (int i = 1;i <= 100;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
