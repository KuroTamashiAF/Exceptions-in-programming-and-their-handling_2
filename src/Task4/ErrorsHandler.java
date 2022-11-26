package Task4;

public class ErrorsHandler {

    public void checked()
    {
        Noname obj1 = new Noname();

        while(true){
            try{
                obj1.inputData();

                if (obj1.getData().length() == 0 )
                {
                    throw new RuntimeException("Пустая строка");
                }
                break;
            }catch (RuntimeException e) {
                System.out.println("Нельзя вводить пустые строки, повторите ввод: ");
            }
        }
    }
}
