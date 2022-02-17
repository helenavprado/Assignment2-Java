package week1.whileloops;
import java.util.Scanner;

public class AddingValuesInLoop {

    public static void main(String[] args){
        int result = 0;

        Scanner number = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.\nNumber:");
        int userNumber = number.nextInt();

        while (userNumber != 0) {
            result = result + userNumber;
            System.out.println(String.format("The total so far is %d\nNumber:", result));
            userNumber = number.nextInt();
        }

        System.out.println(String.format("The total is %d", result));


    }
}
