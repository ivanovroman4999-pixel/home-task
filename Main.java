import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();
        int poshlina = calculateCustoms(price, weight);
        System.out.println("Размер пошлины (в руб.) составит: " + poshlina);
    }
    public static int calculateCustoms(int a, int b) {
        int result = a/100 + b*100;
        return result;
     }
}