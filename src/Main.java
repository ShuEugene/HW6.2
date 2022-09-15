//  ДЗ к уроку 6.2 «Массивы»
public class Main {
    public static void main(String[] args) {

//  ДЗ6.2.1
        System.out.println();
        int dayInMonth = 30,
                minExpenses = 100_000, maxExpenses = 200_000, rangeExpenses = maxExpenses - minExpenses + 1;
        int[] dailyExpenses = generateRandomArray(dayInMonth, minExpenses, rangeExpenses);
        System.out.printf("Сумма трат за месяц составила %s рублей.\n", calculateSumm(dailyExpenses));

//  ДЗ6.2.2
        System.out.println();
        System.out.printf("Минимальная сумма затрат за день составила %s рублей.\n" +
                "Максимальная сумма затрат за день составила %s рублей.",
                minDaylyExpenses(dailyExpenses), maxDaylyExpenses(dailyExpenses));

        System.out.println();
    }

    static int[] generateRandomArray(int arrayLenght, int minValue, int range) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[arrayLenght];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(range) + minValue;
        }
        return arr;
    }

// showAray()
/*    static void showArray(int[] someArray) {
        for (int i = 0; i < someArray.length - 1; i++) System.out.printf("%s, ", someArray[i]);
        System.out.printf("%s.\n", someArray[someArray.length - 1]);
    }*/

    static int calculateSumm(int[] expensesArray) {
        int summ = 0;
        for (int currentElement : expensesArray) summ += currentElement;
        return summ;
    }

    static int minDaylyExpenses(int[] dailyExpenses) {
        int min = dailyExpenses[0];
        for (int curentElement : dailyExpenses) if (curentElement < min) min = curentElement;
        return min;
    }

    static int maxDaylyExpenses(int[] dailyExpenses) {
        int max = dailyExpenses[0];
        for (int curentElement : dailyExpenses) if (curentElement > max) max = curentElement;
        return max;
    }
}