package week1.classes;
import java.util.Scanner;

// Hey, Derrick! I know it's super far from what it should look like, but my brain could't take it anymore right now

public class Rectangle {
    int width = 1;
    int height = 1;
    String color = "Blue";

    public void draw(int wid, int hei, String cor) {
        width = wid;
        height = hei;
        color = cor;
        char firstLetterColor = cor.charAt(0);

        int i = 1;
        int j = 1;
        while (i <= hei) {
            j = 1;
            while (j <= wid) {
                System.out.print(firstLetterColor);
                j++;
            }
            i++;
            System.out.print("\n");
        }
    }

        public static void main (String[] args){
        Rectangle drawRectangle = new Rectangle();
        drawRectangle.draw(7, 5, "Pink");

        }
}
