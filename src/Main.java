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
        System.out.println("Задание 4");
        initialAmount = 15000;
        month = 0;
        while (initialAmount < 12_000_000) {
            month++;
            initialAmount = initialAmount + initialAmount * 7 / 100;
            System.out.println("Месяц " + month + " сумма накоплений равна " + initialAmount);
        }
        System.out.println("Задание 5");
        initialAmount = 15000;
        month = 0;
        while (initialAmount < 12_000_000) {
            month++;
            initialAmount = initialAmount + initialAmount * 7 / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + initialAmount);
            }
        }
        System.out.println("Задание 6");
        initialAmount = 15000;
        month = 9 * 12;
        for (int i = 1; i <= month; i++) {
            initialAmount = initialAmount + initialAmount * 7 / 100;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + initialAmount);
            }
        }
        System.out.println("Задание 7");
        for (int friday = 6; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет");
        }
        System.out.println("Задание 8");
        int thisYear = 2023;
        int start = thisYear - 200;
        int stop = thisYear + 100;
        while (start <= stop) {
            start++;
            if (start % 79 == 0) {
                System.out.println(start);
            }
        }
    }
}