public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        int moneyPerMonth = 15000;
        int countMonth = 0;
        float totalDeposit = 0;
        int wantedMoney = 2459000;
        float percent = 7F / 100F / 12F + 1F;

        while (totalDeposit <= wantedMoney) {
            totalDeposit *= percent;
            totalDeposit += moneyPerMonth;
            ++countMonth;
        }
        System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + (int) totalDeposit + " руб.");

        System.out.println("Task2");
        int countNumbers = 1;
        while (countNumbers <= 10) {
            System.out.print(" " + countNumbers);
            countNumbers += 1;
        }
        System.out.println();
        for (int i = 10; i > 0; --i) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Task3");
        int countryYPeople = 1200000;
        int birthRate = 17;
        int mortalityRate = 8;
        int periodYears = 10; //???

        for (int i = 1; i <= periodYears; ++i) {
            countryYPeople += countryYPeople / 1000 * (birthRate - mortalityRate);
            System.out.println("Год " + i + ", численность населения составляет "
                    + countryYPeople + " человек");
        }

        System.out.println("Task4");
        moneyPerMonth = 15000;
        totalDeposit = 0;
        percent = 7F / 100F / 12F + 1F;
        countMonth = 0;
        wantedMoney = 1200000;
        do {
            totalDeposit += moneyPerMonth;
            totalDeposit *= percent;
            ++countMonth;
            System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + (int) totalDeposit + " руб.");

        } while (totalDeposit <= wantedMoney);

        System.out.println("Task5");

        int periodForPrint = 6;
        moneyPerMonth = 15000;
        totalDeposit = 0;
        percent = 7F / 100F / 12F + 1F;
        countMonth = 0;
        wantedMoney = 1200000;
        do {
            totalDeposit += moneyPerMonth;
            totalDeposit *= percent;
            ++countMonth;
            if (countMonth % periodForPrint == 0) {
                System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + (int) totalDeposit + " руб.");
            }
        } while (totalDeposit <= wantedMoney);

        System.out.println("Task6");

        moneyPerMonth = 15000;
        totalDeposit = 0;
        percent = 7F / 100F / 12F + 1F;
        periodYears = 9;
        periodForPrint = 6;
        for (countMonth = 1; countMonth <= (periodYears * 12); ++countMonth) {
            totalDeposit += moneyPerMonth;
            totalDeposit *= percent;
            ++countMonth;
            if (countMonth % periodForPrint == 0) {
                System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + (int) totalDeposit + " руб.");
            }
        }

        System.out.println("Task7");
        int firstFridayDayNumber = 3;
        byte daysInMonth = 31;
        int daysInWeek = 7;
        for (int i = firstFridayDayNumber; i <= daysInMonth; i += daysInWeek) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Task8");
        int currentYear = 2024;
        int previousYears = 200;
        int nextYears = 100;
        periodForPrint = 79;
        for (int i = currentYear - previousYears; i <= currentYear + nextYears; ++i) {
            if (i % periodForPrint == 0) {
                System.out.println(i);
            }
        }
    }
}
