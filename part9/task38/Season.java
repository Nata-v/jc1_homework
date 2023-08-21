package part9.task38;

public enum Season {
    WINTER(90),
    SPRING(89),
    SUMMER(92),
    AUTUMN(91);

    private final int countOfDays;
    Season(int countOfDays) {

        this.countOfDays = countOfDays;

    }
    public int getCountOfDays() {
        return countOfDays;
    }
}
