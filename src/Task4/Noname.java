package Task4;

import java.util.Scanner;

public class Noname {
    private String data;
    public Noname()
    {
        this.data = "";
    }
    public Noname(String data) {
        this.data = data;
    }

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
        Noname num1 = new Noname("jjjjj");

        num1.inputData();
        System.out.println(num1.getData());

    }
}
