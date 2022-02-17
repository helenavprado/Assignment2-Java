package week1.keyboardinput;
import java.util.Scanner;

public class AgeInFiveYears {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String userName = name.nextLine();

        System.out.println(String.format("Hi, %s! How old are you?", userName));
        int userAge = age.nextInt();

        int plusFive = userAge + 5;
        int minusFive = userAge - 5;

        System.out.println(String.format("Did you know that in five years you will be %d years old?\n" +
                "And five years ago you were %d! Imagine that!", plusFive, minusFive));



    }





}
