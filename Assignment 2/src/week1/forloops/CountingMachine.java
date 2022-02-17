package week1.forloops;
import java.util.Scanner;

public class CountingMachine {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Count to:");
        int userNumber = number.nextInt();

        for (int i = 0;i<=userNumber;i++){
            System.out.println(i);
        }

    }
}
