package be.intecbrussel;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        System.out.println("Specify your age: ");
        int age = in.nextInt();
        if (age > 65) {
            System.out.println("risicolevel = 3");
            System.out.println("Please take this vaccine now");

        } else if (age>45){
            System.out.println("risicolevel = 2");
            System.out.println("Let’s take your temperature first.");

        } else if (age>25){
            System.out.println("risicolevel = 1");
            System.out.println("Any antecedents?");
        } else {
            System.out.println("Go home!");
        }
    }
}
