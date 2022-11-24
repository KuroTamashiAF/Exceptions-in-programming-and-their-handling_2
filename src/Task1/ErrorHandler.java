package Task1;

public class ErrorHandler {
    public void handler(Number num)
    {
        try{
            num.inputData();
        }catch (NumberFormatException e){
            System.out.println("Ввод символов недопустим, введите число ");
            num.inputData();
        }

    }
}
