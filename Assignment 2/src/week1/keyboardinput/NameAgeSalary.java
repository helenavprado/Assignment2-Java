package week1.keyboardinput;
import java.util.Scanner;

public class NameAgeSalary {
        public static void main(String[] args) {
            Scanner name = new Scanner(System.in);
            Scanner age = new Scanner(System.in);
            Scanner salary = new Scanner(System.in);

            System.out.println("Hello. What is your name? ");
            String userName = name.nextLine();

            System.out.println(String.format("Hi, %s! How old are you? ", userName));
            int userAge = age.nextInt();

            System.out.println(String.format("So you're %d, eh? That's not old at all!\nHow much do you make, %s?", userAge, userName));
            float userSalary = salary.nextFloat();

            System.out.println(String.format("%f! I hope tha's per hour and not per year! LOL", userSalary));


            // 8.5!  I hope that's per hour and not per year! LOL!









        }

}
