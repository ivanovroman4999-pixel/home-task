import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Хлеб", "Молоко", "Крупа"};
        int[] prices = {50, 14, 80};
        int[] productQuantities = new int[products.length];
        int sumProducts = 0;
        for (int i = 0; i < products.length; i++) {
            System.out.print(i+1+") " + products[i]);
            System.out.println("-" + prices[i]+ " Руб/шт");
        }
        while (true) {
            System.out.println("Выберите товар и количество или введите end");
            String input = scanner.nextLine();
            if ("end".equals(input)){
                break;
            }
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0])-1;
            int productCount = Integer.parseInt(parts[1]);
            int currentPrice = prices[productNumber];
            sumProducts += currentPrice*productCount;
            productQuantities[productNumber] += productCount;
        }
        System.out.println("Ваша корзина:");
        for (int i = 0; i < products.length; i++){
            if (productQuantities[i] > 0) {
                int currentProductPrice = prices[i];
                int quantity = productQuantities[i];
                int itemTotal = currentProductPrice * quantity;
                System.out.println(products[i] + " " + quantity + " шт " +
                        currentProductPrice + " руб/шт " +
                        itemTotal + " руб в сумме");
            }
        }
        System.out.println("Итоговая сумма корзины:" + sumProducts);
    }
 }

