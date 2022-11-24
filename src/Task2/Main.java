package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] intArray = {65,23,36,478,500,6589,745,87896,9105,14560};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
