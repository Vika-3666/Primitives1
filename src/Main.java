public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13_676;// Cтоимость билета

        // Рассчитываем количество миль: за каждые 20 рублей — 1 миля
        // Дробные мили не начисляются, поэтому используем целочисленное деление
        int miles = ticketPrice / 20;

        // Результат
        System.out.println("ticketPrice:" + ticketPrice + "rub");
        System.out.println("accrued miles:" + miles);
    }
}