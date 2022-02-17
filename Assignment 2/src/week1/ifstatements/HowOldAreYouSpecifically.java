package week1.ifstatements;
import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);

        System.out.println("Hey, what's your name? (Sorry, I keep forgetting)");
        String userName = name.nextLine();

        System.out.println(String.format("Ok, %s, how old are you?", userName));
        int userAge = age.nextInt();

        if (userAge < 16) {
            System.out.println("You can't drive");
        } else if (userAge == 16 || userAge == 17) {
            System.out.println("You can drive but not vote.");
        } else if (userAge >= 18 && userAge <= 24) {
            System.out.println("You can vote but not rent a car.");
        } else {
            System.out.println("You can do pretty much anything.");
        }

    }
}
