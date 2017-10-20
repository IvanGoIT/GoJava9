package question.question8;

public class TryCatchExample {

    public static void main(String[] args) {
        try {
            boolean problem = true;
            if (problem) throw new MyException(); // срываем свой экспешн

            Integer.parseInt("2932a"); // NumberFormatException

            Object obj = new Object();
            obj = null;
            String str = obj.toString(); // NullPointerException
            System.out.println(str);


            System.out.println("Программа отработала");

        } catch (NullPointerException e) {
            System.out.println("Мы словили ошибку !! ура :)");
            // e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Текст введен не верно!!! :(");
        } catch (MyException e) {
            System.out.println("Мой экспшен отловлен!");
        }

        // программа продолжает работу
        System.out.println("программа не крэшнулась и теперь выключается");
    }
}
