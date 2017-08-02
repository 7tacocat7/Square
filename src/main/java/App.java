import models.Rectangle;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println( "Enter the length of your rectangle:");
        int length = Integer.parseInt(myConsole.readLine());

        System.out.println("Enter the width of your rectangle");
        int width = Integer.parseInt(myConsole.readLine());

        Rectangle rectangle = new Rectangle(length, width);

        boolean squareResult = rectangle.isSquare();
        System.out.println(rectangle.toString() );

        System.out.printf("Is your rectangle a square, too? %b! Your length was %d and your width was %s.", squareResult, length, width);
    }
}