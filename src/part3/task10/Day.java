package part3.task10;

public class Day {
    public static void main(String[] args) {
        int day = 29;
        int month = 2;
        int year = 2024;
        switch (month) {
            case 1:
                if (day == 31) {
                    System.out.println("1.2." + year);
                } else {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                }
                break;
            case 2:
                if (year % 4 == 0 && day == 28) {
                    System.out.println("29.2." + year);
                } else if (day != 28 && day != 29) {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                } else {
                    System.out.println("1.3." + year);
                }
                break;
            case 3:
                if (day == 31) {
                    System.out.println("1.4." + year);
                } else {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                }
                break;
            case 4:
                if (day == 30) {
                    System.out.println("1.5." + year);
                } else {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                }
                break;
            case 5:
                if (day == 31) {
                    System.out.println("1.6." + year);
                } else {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                }
                break;
            case 6:
                if (day == 30) {
                    System.out.println("1.7." + year);
                } else {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                }
                break;
            case 7:
                if (day == 31) {
                    System.out.println("1.8." + year);
                } else {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                }
                break;
            case 8:
                if (day == 31) {
                    System.out.println("1.9." + year);
                } else {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                }
                break;
            case 9:
                if (day == 30) {
                    System.out.println("1.10." + year);
                } else {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                }
                break;
            case 10:
                if (day == 31) {
                    System.out.println("1.11." + year);
                } else {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                }
                break;
            case 11:
                if (day == 30) {
                    System.out.println("1.12." + year);
                } else {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                }
                break;
            case 12:
                if (day == 31) {
                    ++year;
                    System.out.println("1.1." + year);
                } else {
                    ++day;
                    System.out.println("" + day + "." + month + "." + year);
                }
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }

    }
}
