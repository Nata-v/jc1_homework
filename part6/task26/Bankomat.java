package part6.task26;

import java.util.Scanner;

public class Bankomat {
    public static int count = 0;

    private int Banknotes20 = 100;
    private int Banknotes50 = 50;
    private int Banknotes100 = 70;
    public Scanner scanner = new Scanner(System.in);
    public void vivod(){
        System.out.println("20 = " + Banknotes20);
        System.out.println("50 = " + Banknotes50);
        System.out.println("100 = " + Banknotes100);
    }


    public void vvod(){

        System.out.println("Введите Кол-во 20 ");
        int in = scanner.nextInt();
        Banknotes20 += in;
        System.out.println("Введите Кол-во 50 ");
        in = scanner.nextInt();
        Banknotes50 += in;

        System.out.println("Введите Кол-во 100 ");
        in = scanner.nextInt();
        Banknotes100 += in;

    }

    public void cash(){

        System.out.println("Введите сумму, которую хотите снять!");
        int in = scanner.nextInt();

        int sum = Banknotes20 * 20 + Banknotes50 * 50 + Banknotes100 * 100;

        if (sum < in )
            System.out.println("Недостаточно средств!");
        else if (in == 10 || in == 30 || in % 10 != 0) {
            System.out.println("Введен неверный формат купюр!");
        }
        else {
            int num = in % 100;
            boolean bool = false;
            switch (num) {
                case 10: {
                    if (Banknotes20 >= 3 && Banknotes50 >= 1){ bool = true;
                        summa(in-110, 3, 1);}
                    break;
                }
                case 20: {
                    if (Banknotes20 >= 1){ bool = true;
                        summa(in-20, 1, 0);}
                    break;
                }
                case 30: {
                    if (Banknotes20 >= 4 && Banknotes50 >= 1){ bool = true;
                        summa(in-130, 4, 1);}
                    break;
                }
                case 40: {
                    if (Banknotes20 >= 2){ bool = true;
                        summa(in-40, 2, 0);}
                    break;
                }
                case 50: {
                    if (Banknotes50 >= 1){ bool = true;
                        summa(in-50, 0, 1);}
                    break;
                }
                case 60: {
                    if (Banknotes20 >= 3){ bool = true;
                        summa(in-60, 3, 0);}
                    break;
                }
                case 70: {
                    if (Banknotes20 >= 1 && Banknotes50 >= 1){ bool = true;
                        summa(in-70, 1, 1);}
                    break;
                }
                case 80: {
                    if (Banknotes20 >= 4){ bool = true;
                        summa(in-80, 4, 0);}
                    break;
                }
                case 90: {
                    if (Banknotes20 >= 2 && Banknotes50 >= 1){ bool = true;
                        summa(in-90, 2, 1);}
                    break;
                }
                case 0: {
                    bool = true;
                    summa(in-0, 0, 0);
                    break;
                }
                default:
                    System.out.println("Данная операция не возможна!");
            }
            System.out.println(bool);
        }

    }

    public void summa (int inn, int u20, int u50){
        Banknotes20 -= u20;
        Banknotes50 -= u50;
        int u100 = 0;
        int innd = inn;
        while (Banknotes100 > 0 && innd != 0){
            innd -= 100;
            u100++;
            Banknotes100--;
        }
        while (Banknotes50 > 0 && innd != 0){
            innd -= 50;
            u50++;
            Banknotes50--;
        }
        while (Banknotes20 > 0 && innd != 0){
            innd -= 20;
            u20++;
            Banknotes20--;
        }
        System.out.println("Выдано: ");
        System.out.println("купюр номиналом 100 - " + u100);
        System.out.println("Купюр номиналом 50 - " + u50);
        System.out.println("Купюр номиналом 20 - " + u20);


    }

    public void Bank(){
        do{
            cash();
            vivod();
            if (Banknotes100 == 0 && Banknotes50 == 0 && Banknotes20 == 0)
                System.out.println("В банкомате закончились деньги!");
        }while (Banknotes100 != 0 || Banknotes50 != 0 || Banknotes20 != 0);

    }
}
