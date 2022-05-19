public class Main {
    public static void main(String[] args) {

        int tPrice = 2500; // стоимость билетов
        int mPrice = 20;   // стоимость мили

        int miles = tPrice / mPrice;

        System.out.println("Количество миль: " + miles);
    }
}