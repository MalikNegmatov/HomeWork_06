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
        int deposit = 15000; // Размер вклада
        int totalSum = 0; // Общая сумма накоплений на текущий момент
        int needSum = 2459000; // Желаемая сумма
        int months = 0; // счетчик месяцев

        while (totalSum<=needSum) {
            totalSum = totalSum + deposit; // увеличиваем общую сумму на размер вклада
            months++; // переходим к следующему месяцу (такту цикла)
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSum + " рублей.");
        }
    }

    public static void task2 () {
        System.out.println("\nЗадача 2");
        // Пишем код для задачи 2
        int numberLeftBorder=1; // левая граница интервала числового ряда (начало)
        int numberRighBorder=10; // правая граница интервала числового ряда (конец)
        int cycleStep=1; // шаг перехода от одного числа к другому
        String blank = " "; // разделитель "пробел"

        int number=numberLeftBorder; // инициализация счётчика-цикла и выводимых чисел

        while (number<=numberRighBorder) { // Пока не дошли до верхнего края заданного интервала
            System.out.print(number + blank); // печатаем число
            number += cycleStep; // переходим к следующему числу с заданным шагом
        }
        System.out.println();
        for (int i = numberRighBorder; i >= numberLeftBorder; i-=cycleStep ) {
            System.out.print(i+blank); // пока не спустились до нижнего края ряда печатаем число
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("\nЗадача 3");
        // Пишем код для задачи 3
        int totalPopulation = 12000000; // Всего населения в начальный момент
        int birthRate = 17; // коэффициент рождаемости
        int deathRate = 8; // коэффициент смертности
        int rateRatio = 1000; // размерность коэффициентов рождаемости-смертности
        int years = 10; // Длительность расчетного периода в годах

        for (int i=1; i<=years; i++) {
            totalPopulation = totalPopulation + birthRate*totalPopulation/rateRatio -
                    deathRate*totalPopulation/rateRatio; // По большому гамбургскому счёту есть проблема с потерей точности при делении
            System.out.println("Год " + i + ", численность населения составляет " +
                    totalPopulation + " человек.");
        }
        System.out.println();
        double exactPopulation = 12000000.0; // Посчитаем и сравним без потери точности на округление
        for (int i=1; i<=years; i++) {
            exactPopulation = exactPopulation + (birthRate*exactPopulation)/rateRatio -
                    (deathRate*exactPopulation)/rateRatio;
             // Здесь не будет потерь при округлении. Интересно сравнить.

            String exactPopulationFormatted = String.format("%8.1f", exactPopulation);
            // приводим double к удобному для вывода формату

            System.out.println("Год " + i + ", численность населения составляет " +
                    exactPopulationFormatted + " человек.");
        }
        System.out.println("\nРазница = " + (totalPopulation-exactPopulation));
    }

    public static void task4 () {
        System.out.println("\nЗадача 4");
        // Пишем код для задачи 4
        double totalSum = 15000.0; // сумма вклада
        double needSum = 12000000.0; // величина желаемых накоплений
        double percentAdd = 1.07; // процентная ставка 1 + n/100, n - заданный процент
        int months = 0; // счетчик месяцев и цикла
        String totalSumFormatted; // строка форматирования для переменной типа double

        while (totalSum<=needSum) {
            totalSum *= percentAdd; // увеличиваем на сумму проценнтной ставки
            months++; // переходим к следующему месяцу
             totalSumFormatted = String.format("%8.2f", totalSum); // форматирование переменной типа double
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSumFormatted + " рублей.");
        }
    }

    public static void task5 () {
        System.out.println("\nЗадача 5");
        // Пишем код для задачи 5
        double totalSum = 15000.0; // сумма вклада
        double needSum = 12000000.0; // величина желаемых накоплений
        double percentAdd = 1.07; // процентная ставка 1 + n/100, n - заданный процент
        int months = 0;  // счетчик месяцев и цикла
        String totalSumFormatted; // строка форматирования для переменной типа double

        while (totalSum<=needSum) { // пока не накопили нужную сумму продолжаем
            totalSum *= percentAdd; // увеличиваем на сумму проценнтной ставки
            months++; // переходим к следующему месяцу
            if ( months % 6 == 0 ) { // если месяц кратен 6, выводим промежуточный результат
                totalSumFormatted = String.format("%8.2f", totalSum);
                System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSumFormatted + " рублей.");
            }
        }
        totalSumFormatted = String.format("%8.2f", totalSum);
        // Выводим конечный результат, если конечный месяц не кратен 6
        if (months % 6 != 0 ){
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSumFormatted + " рублей.");
        }
    }
    public static void task6 () {
        System.out.println("\nЗадача 6");
        // Пишем код для задачи 6

        double totalSum = 15000.0;  // сумма вклада
        double percentAdd = 1.07; // процентная ставка 1 + n/100, n - заданный процент
        int howLong = 9*12; // длительность периода накопления год*12 месяцев
        int months = 0; // счетчик месяцев и цикла
        String totalSumFormatted; // строка форматирования для переменной типа double

        while (months<=howLong) {
            totalSum *= percentAdd; // увеличиваем на сумму проценнтной ставки
            months++;  // переходим к следующему месяцу
            if ( months % 6 == 0 ) {  // если месяц кратен 6, выводим промежуточный результат
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
        int cometCycle=79;
        int currentYear=2023;
        int minusYears = 200;
        int plusYears = 100;
        int year=currentYear-minusYears;
        while ( year <= (currentYear+plusYears) ) {
            if (year % cometCycle == 0 ) System.out.println(year);
            year++;
        }
    }
}
