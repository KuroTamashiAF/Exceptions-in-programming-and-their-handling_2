package Task1;

import java.util.InputMismatchException;

public class ErrorHandler {
    public void handler()
    {
        Number num = new Number();
        try{
            num.inputData();
        }catch (InputMismatchException e){
            System.out.println("Ввод символов недопустим, введите число ");
            num.inputData();
        }
        System.out.printf("Вы ввели %f",num.getValue());

    }
}
