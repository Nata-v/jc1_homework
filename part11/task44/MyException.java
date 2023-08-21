package part11.task44;

public class MyException {
    public static void main(String[] args) {

        try {
            String message = null;
            System.out.println(message.length());

        }
        catch (NullPointerException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
