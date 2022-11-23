package Task1;

import java.util.Scanner;

public class Number {
    private float value;

    public float getValue() {
        return value;
    }
    public float inputData()
    {
        System.out.print("Введите значение: ");
        Scanner sc = new Scanner(System.in);
        value  = sc.nextFloat();
        return value;
    }

    public static void main(String[] args) {
        Number num1  = new Number();
        num1.inputData();
        System.out.println(num1.getValue());
    }
}
