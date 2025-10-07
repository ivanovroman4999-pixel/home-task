import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы
        while (true) {
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения\n" +
                    "3 <Enter>");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String moneyStr2 = scanner.nextLine();
                    int money2 = Integer.parseInt(moneyStr2);
                    spendings += money2;
                    break;
                case 3:
                    int taxEarningsMinusSpendings2 = taxEarningsMinusSpendings(earnings, spendings);
                    int taxEarnings2 = taxEarnings(earnings);
                    if (taxEarnings2<taxEarningsMinusSpendings2){
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит:"+ taxEarnings2);
                        System.out.println("Налог на другой системе:" + taxEarningsMinusSpendings2);
                        System.out.println("Экономия:"+ (taxEarningsMinusSpendings2-taxEarnings2 ));
                    } else if(taxEarnings2>taxEarningsMinusSpendings2) {
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит:"+ taxEarningsMinusSpendings2);
                        System.out.println("Налог на другой системе:" + taxEarnings2);
                        System.out.println("Экономия:"+ (taxEarnings2-taxEarningsMinusSpendings2));
                    } else {
                        System.out.println("Можете выбрать любую систему налогообложения");
                    }
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");

    }
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
    public static int taxEarnings(int earnings) {
        int tax = (earnings) * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}
