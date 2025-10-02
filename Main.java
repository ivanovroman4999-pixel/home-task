import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();
        int duty = calculateCustoms(price, weight);
        System.out.print("Размер пошлины (в руб.) составит: " + duty);
    }

    public static int calculateCustoms(int price, int weight) {
        int duty = price/100 + weight*100;
        return duty;
    }
}
