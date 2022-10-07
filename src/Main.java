import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int moneyYear = 0; // годовой доход
        Scanner write = new Scanner(System.in);
        System.out.print("Введите доход за год ");
        moneyYear = Integer.parseInt(write.nextLine());
        calcMoney(moneyYear);

    }


    private static void calcMoney(int moneyYear) {   //Метод для вычесления отпускных
        int DAYSFREE = 28;  // Колличество дней в отпуске
        double MONTH = 12;
        double DAYS = 29.5;   //Коллличество дней усстановленых законом
        double calc = (moneyYear / MONTH / DAYS)* DAYSFREE;
        String string = String.format ("%.0f", calc);
        System.out.print(string);
    }
}
