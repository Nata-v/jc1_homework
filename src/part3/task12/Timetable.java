package part3.task12;

public class Timetable {
    public static void main(String[] args) {
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Понедельник - работа!");
                break;
            case 2:
                System.out.println("Вторник - командировка!");
                break;
            case 3:
                System.out.println("Среда - встреча гостей!");
                break;
            case 4:
                System.out.println("Четверг - выдача зарплат!");
                break;
            case 5:
                System.out.println("Пятница - совещание!");
                break;
            case 6:
                System.out.println("Суббота - городской пикник!");
                break;
            case 7:
                System.out.println("Воскресенье - выходной!");
                break;
            default:
                System.out.println("Дня недели с таким номером не существует!");
        }

    }
}
