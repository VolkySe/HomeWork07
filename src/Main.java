public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        int currentSalary = 15000;
        int countMonth = 1;
        int totalDeposit = 0;
        while (totalDeposit <= 2459000) {
            totalDeposit += currentSalary;
            countMonth += 1;
        }
        System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + totalDeposit + " руб.");

        System.out.println("Task2");
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i += 1;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Task3");
        int countryYPeople = 1200000 / 1000;
        int bornedPeoplePer1000 = 17;
        int deadPeoplePer1000 = 8;
        int periodYears = 10; //???

        for (i = 1; i <= periodYears; i++) {
            countryYPeople = countryYPeople + bornedPeoplePer1000 - deadPeoplePer1000;
            System.out.println("Год " + i + ", численность населения составляет "
                    + countryYPeople * 1000 + " человек");
        }

        System.out.println("Task4");
        float interestOnDepositPerMonth = 7F / 12F;
        int sumDeposit = 15000;
        countMonth = 1;
        float accumulation = 0F;

        do {
            accumulation += (float) sumDeposit;
            System.out.println("Сумма накоплений в " + countMonth + " месяцe составляет " + accumulation + " руб.");
            accumulation += (accumulation / 100 * interestOnDepositPerMonth);
            countMonth += 1;
        } while (accumulation <= 1200000);


        System.out.println("Task5");

        sumDeposit = 15000;
        countMonth = 1;
        accumulation = 0F;

        do {
            accumulation += (float) sumDeposit;
            if (countMonth % 6 == 0) {
                System.out.println("Сумма накоплений в " + countMonth + " месяцe составляет " + accumulation + " руб.");
            }
            accumulation += (accumulation / 100 * interestOnDepositPerMonth);
            countMonth += 1;
        } while (accumulation <= 1200000);

        System.out.println("Task6");

        sumDeposit = 15000;
        accumulation = 0F;
        periodYears = 9;

        for (countMonth = 1; countMonth <= (periodYears * 12); countMonth += 1) {
            accumulation += (float) sumDeposit;
            if (countMonth % 6 == 0) {
                System.out.println("Сумма накоплений в " + countMonth + " месяцe составляет " + accumulation + " руб.");
            }
            accumulation += (accumulation / 100 * interestOnDepositPerMonth);
        }

        System.out.println("Task7");
        int firstFridayDayNumber = 3;
        byte daysInMonth = 31;
        for (i = 1; i <= daysInMonth; i++) {
            if (i % 7 == firstFridayDayNumber) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            } else {
                System.out.println("Сегодня пятница, " + i + "-е число.");
            }
        }

        System.out.println("Task8");
        int currentYear = 2024;
        int previousYears = 200;
        int nextYears = 100;

        for (i = currentYear - previousYears; i <= currentYear + nextYears; i += 1) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
