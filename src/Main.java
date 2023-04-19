public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int deposit = 15000;
        int totalSum = 0;
        int needSum = 2459000;
        int months = 0;

        while (totalSum<=needSum) {
            totalSum = totalSum + deposit;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSum + " рублей.");
        }
    }

    public static void task2 () {
        System.out.println("\nЗадача 2");
        // Пишем код для задачи 2
        int numberUp=1;
        String blank = " ";

        while (numberUp<11) {
            System.out.print(numberUp + blank);
            numberUp++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i-- ) {
            System.out.print(i+blank);
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("\nЗадача 3");
        // Пишем код для задачи 3
        int totalPopulation = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int rateRatio = 1000;

        for (int i=1; i<=10; i++) {
            totalPopulation = totalPopulation + birthRate*totalPopulation/rateRatio -
                    deathRate*totalPopulation/rateRatio;
            System.out.println("Год " + i + ", численность населения составляет " +
                    totalPopulation+ " человек.");
        }
    }

    public static void task4 () {
        System.out.println("\nЗадача 4");
        // Пишем код для задачи 4
        double totalSum = 15000.0;
        double needSum = 12000000.0;
        double percentAdd = 1.07;
        int months = 0;
        String totalSumFormatted;

        while (totalSum<=needSum) {
            totalSum *= percentAdd;
            months++;
             totalSumFormatted = String.format("%8.2f", totalSum);
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSumFormatted + " рублей.");
        }
    }

    public static void task5 () {
        System.out.println("\nЗадача 5");
        // Пишем код для задачи 5
        double totalSum = 15000.0;
        double needSum = 12000000.0;
        double percentAdd = 1.07;
        int months = 0;
        String totalSumFormatted;

        while (totalSum<=needSum) {
            totalSum *= percentAdd;
            months++;
            if ( months % 6 == 0 ) {
                totalSumFormatted = String.format("%8.2f", totalSum);
                System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSumFormatted + " рублей.");
            }
        }
        totalSumFormatted = String.format("%8.2f", totalSum);
        System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSumFormatted + " рублей.");
    }
    public static void task6 () {
        System.out.println("\nЗадача 6");
        // Пишем код для задачи 6

        double totalSum = 15000.0;
        double percentAdd = 1.07;
        int howLong = 9*12;
        int months = 0;
        String totalSumFormatted;

        while (months<=howLong) {
            totalSum *= percentAdd;
            months++;
            if ( months % 6 == 0 ) {
                totalSumFormatted = String.format("%8.2f", totalSum);
                System.out.println("Месяц " + months + ", сумма накоплений Василия равна " + totalSumFormatted + " рублей.");
            }
        }
    }
    public static void task7 () {
        System.out.println("\nЗадача 7");
        // Пишем код для задачи 7
        int fridayDate = 3;
        int currentDate = 1;
        while (currentDate<=31) {
            if ((currentDate - fridayDate) % 7 == 0) {
                System.out.println("Сегодня пятница, " + currentDate + "-е число. Необходимо подготовить отчет");
            }
            currentDate++;
        }
    }

    public static void task8 () {
        System.out.println("\nЗадача 8");
        // Пишем код для задачи 8
    }
}
