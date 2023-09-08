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
        System.out.println("Задание 2");
        int counter = 0;
        while (counter < 10) {
            counter++;
            System.out.print(counter + " ");
        }
        System.out.println();
        for (; counter > 0; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate = 17;
        int death = 8;
        int different = birthRate - death;
        for (int i = 1; i <= 10; i++) {
            population = population + population * different / 1000;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }
}