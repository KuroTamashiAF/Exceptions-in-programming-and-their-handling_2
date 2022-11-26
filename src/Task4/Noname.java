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
        return this.data;
    }
    public void inputData()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Введите строку: ");
        this.data = sc.nextLine();
    }
}
