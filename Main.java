public class Main {
    public static void main(String[] args){
        Book book = new Book("Ядовитый клинок", 2021,"Anya", 506);
        System.out.println(book.isBig());
        System.out.println(book.matches("Abc"));
        System.out.println(book.estimatePrice(book.pages));

        Book book2 = new Book("Олимп", 2024,"Pikls", 25);
        System.out.println(book2.isBig());
        System.out.println(book2.matches("Pikls"));
        System.out.println(book2.estimatePrice(book2.pages));
        Book book3 = new Book("Я переродился торговым автоматом", 2022,"Petya", 307);
        System.out.println(book3.isBig());
        System.out.println(book3.matches("лся"));
        System.out.println(book3.estimatePrice(book3.pages));

    }
 }