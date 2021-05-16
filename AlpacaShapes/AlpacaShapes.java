package AlpacaShapes;

import java.util.Scanner;

public class AlpacaShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int squareLength = Integer.parseInt(s[0]);
        int radius = Integer.parseInt(s[1]);
        int squareArea = squareLength*squareLength;
        double circleArea = 3.14*(radius*radius);
        if (squareArea > circleArea) {
            System.out.println("SQUARE");
        }
        else {
            System.out.println("CIRCLE");
        }
    }
}
