package part9.task36;

public enum Seasons {
    WINTER("Зима", 90),
    SPRING("Весна",92),
    SUMMER("Лето",93),
    AUTUMN("Осень",91);

    private final String description;
    private final int countOfDays;

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }
    public String getDescription() {
        return description;
    }
    public int getCountOfDays() {
        return countOfDays;
    }
}
