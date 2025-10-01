import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год в формате ****: ");
        int year = scanner.nextInt();
        if (year%4==0) {
            System.out.println("В этом году 366 дней!");
        } else {
            System.out.println("В этом году 365 дней!");
        }
    }
}
