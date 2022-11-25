package Task4;

import java.util.Scanner;

public class Noname {
    private String data;

    public String getData() {
        return data;
    }
    public void inputData()
    {
        Scanner sc  = new Scanner(System.in);
        this.data = sc.next();
    }

    public static void main(String[] args) {
        Noname num = new Noname();
        num.inputData();
        System.out.println(num.getData());
    }
}
