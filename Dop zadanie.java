import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = 0;
       while (true) {
           System.out.println("Введите год:");
           int year = scanner.nextInt();
           System.out.println("Введите количество дней:");
           int days = scanner.nextInt();
           if (year%4==0 && days == 366) {
                quantity += 1;
           } else if (year%4!=0 && days == 365) {
               quantity += 1;
           } else {
               if (year % 4 == 0) {
                   System.out.println("Неправильно! В этом году 366 дней!");
                   System.out.println("Набрано очков: " + quantity);
                   break;
               } else {
                   System.out.println("Неправильно! В этом году 365 дней!");
                   System.out.println("Набрано очков: " + quantity);
                   break;
               }
           }
       }
    }
}
