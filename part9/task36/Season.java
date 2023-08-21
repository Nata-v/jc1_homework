package part9.task36;

public class Season {
    public static void main(String[] args) {
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons.name() + " - " + seasons.getDescription() + " - количество дней: " + seasons.getCountOfDays());
        }
    }
}
