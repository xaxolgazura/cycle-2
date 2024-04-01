public class Main {
    public static void main(String[] args) {


        // task № 1
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month++;
            total = total + salary;
            System.out.println("Месяц " + month + "  сумма накоплений равна " + total + " рублей");


        }// task № 2

        int count = 0;
        while (count < 10) {
            count++;
            System.out.print(count + " ");
        }
        System.out.println();
        for (; count > 0; count--) {
            System.out.print(count + " ");
        }
        System.out.println();
        {

        } // task № 3
        int population = 12_000_000;
        int birthRate = (12_000_000 / 1000) * 17;
        int mortality = (12_000_000 / 1000) * 8;
        int populationNext = birthRate - mortality;
        int year = 2024;
        while (year <= 2034) {
            population = population + populationNext;
            year = year + 1;
            System.out.println("Год " + year + " численность населения составляет " + population + " милион человек");

        }//task № 4
        int depositAmount = 15000;
        int total2 = depositAmount;
        double monthPercents = 0.07;
        for (int month2 = 1; total2 < 12_000_000; month2++) {
            total2 += total2 * monthPercents;
            total2 = (int) ((total2 + depositAmount) * (1 + monthPercents));
            System.out.println("Месяц " + month2 + " сумма " + total2);
        }
        //task № 5
        int depositAmount2 = 15_000;
        int total3 = 0;
        double monthPercents2 = 0.07;
        for (int month3 = 1; total3 <= 12_000_000; month3++) {
            total3 = total3 + total3 / 100;
            total3 = (int) ((total3 + depositAmount2) * (1 + monthPercents2));
            if (month3 % 6 == 0)
            System.out.println("Месяц " +month3+  " сумма " + total3);
        }
            // task № 6
            int salary2 = 15_000;
            int total4 = 0;
            int month4 = 108;
            double monthPercents3 = 0.07;
            for (int year2 = 1; year2 <= month4; year2++) {
                total4 = total4 + total4 / 100;
                total4 = (int) ((total4 + salary2) * (1 + monthPercents3));
                if (year2 % 6 == 0)
                    System.out.println("Год " + year2 + " сумма " + total4);
            }
            // task № 7
            int friday = 3;
            int reportDay = friday + 7;
            for (reportDay = friday; reportDay <= 31; reportDay = reportDay + 7) {
                System.out.println("Сегодня пятница, " + reportDay + "-ое число. Необходимо подготовить отчет.");
            }
            // task № 8
            int yearNow = 2024;
            int yearEarlier = yearNow - 200;
            int yearNex = yearNow + 100;
            int cometYears = 0;
            for (cometYears = yearEarlier; cometYears <= yearNex; cometYears++) {
                if (cometYears % 79 == 0){
                    System.out.println(cometYears);
                }
            }
        }
    }













