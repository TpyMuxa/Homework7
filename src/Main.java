public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int initialAmount = 0;
        int initialPayment = 15000;
        int month = 0;
        while (initialAmount <= 2_459_000) {
            initialPayment = initialPayment + initialPayment / 100;
            initialAmount = initialAmount + initialPayment;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + initialAmount + " рублей");
        }
    }
}