package Task1;

import java.util.InputMismatchException;

public class ErrorHandler {
    public void handler()
    {
        Number num = new Number();
        while(true){
            try{
                num.inputData();
                break;
            }catch (InputMismatchException e) {
                System.out.println("Ввод символов недопустим, введите число ");
            }

        }

        System.out.printf("Вы ввели %f",num.getValue());

    }
}
