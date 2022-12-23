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

    public static void task1() {
        System.out.println("Задача 1");
        int bigNumber = 5555;
        byte ot128do127 = 5;
        short shortNumber = 3333;
        long biggestNumber = 213123123213L;
        float drobnoe = 1.12121f;
        double drobnoe2 = 4.232323;
        System.out.println("Значение переменной bigNumber с типом int равно " + bigNumber);
        System.out.println("Значение переменной ot128do127 с типом byte равно " + ot128do127);
        System.out.println("Значение переменной shortNumber с типом short равно " + shortNumber);
        System.out.println("Значение переменной biggestNumber с типом long равно " + biggestNumber);
        System.out.println("Значение переменной drobnoe с типом float равно " + drobnoe);
        System.out.println("Значение переменной drobnoe2 с типом double равно " + drobnoe2);
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte b = 67;
        short c = 569;
        short c1 = -159;
        int  c2 = 27897;
        long d = 987678965549L;
        float e = 27.12f;
        double f = 2.786;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;
        int paperForStudent = paper / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte powerPerMin = 16 / 2;
        int power20Min = powerPerMin * 20;
        short min24Hours = 60 * 24;
        int power24Hours = powerPerMin * min24Hours;
        int min3Days = min24Hours * 3;
        int power3Days = powerPerMin * min3Days;
        int min1Month = min24Hours * 31;
        int power1Month = powerPerMin * min1Month;
        System.out.println("За 20 минут машина произвела " + power20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + power24Hours + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + power3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + power1Month + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte cansOfDye = 120;
        byte cansOfDyeFor1Class = 2 + 4;
        byte cansOfWhiteDyeFor1Class = 2;
        byte cansOfBrownDyeFor1Class = 4;
        int overallClasses = cansOfDye / cansOfDyeFor1Class;
        int overallBrownDye = overallClasses * cansOfBrownDyeFor1Class;
        int overallWhiteDye = overallClasses * cansOfWhiteDyeFor1Class;
        System.out.println("В школе, где " + overallClasses + " классов, нужно " + overallWhiteDye + " банок белой краски и " + overallBrownDye + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte sumBanana = 5;
        byte weightOneBanana = 80;
        int weightAllBanana = sumBanana * weightOneBanana;
        short sumMilk = 200;
        int sum100Milk = sumMilk / 100;
        byte weight100Milk = 105;
        int weightAllMilk = sum100Milk * weight100Milk;
        byte sumIceCream = 2;
        byte weightOneIceCream = 100;
        int weightAllIceCream = sumIceCream * weightOneIceCream;
        byte sumEgg = 4;
        byte weightEgg = 70;
        int weightAllEgg = sumEgg * weightEgg;
        int breakfastWeightGramms = weightAllBanana + weightAllMilk + weightAllIceCream + weightAllEgg;
        float breakfastWeightKg = breakfastWeightGramms / 1000f;
        System.out.println(breakfastWeightGramms + " - вес завтрака спортсмена в граммах");
        System.out.println(breakfastWeightKg + " - вес завтрака спортсмена в килограммах");
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte kgNeedToLoss = 7;
        short grLossPerDayLight = 250;
        short grLossPerDayHard = 500;
        float kgLossPerDayLight = grLossPerDayLight / 1000f;
        float kgLossPerDayHard = grLossPerDayHard / 1000f;
        float daysLight = kgNeedToLoss / kgLossPerDayLight;
        float daysHard = kgNeedToLoss / kgLossPerDayHard;
        float daysMed = (daysHard + daysLight) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, потребуется " + daysLight + " дней для похудения");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, потребуется " + daysHard + " дней для похудения");
        System.out.println("В среднем спортсмену потребуется " + daysMed + " дней для похудения");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double mashaNewSalary = mashaSalary * 1.1;
        double denisNewSalary = denisSalary * 1.1;
        double kristinaNewSalary = kristinaSalary * 1.1;
        int mashaSalaryYear = mashaSalary * 12;
        int denisSalaryYear = denisSalary * 12;
        int kristinaSalaryYear = kristinaSalary * 12;
        double mashaNewSalaryYear = mashaNewSalary * 12;
        double denisNewSalaryYear = denisNewSalary * 12;
        double kristinaNewSalaryYear = kristinaNewSalary * 12;
        double mashaDiffYear = mashaNewSalaryYear - mashaSalaryYear;
        double denisDiffYear = denisNewSalaryYear - denisSalaryYear;
        double kristinaDiffYear = kristinaNewSalaryYear - kristinaSalaryYear;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDiffYear + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDiffYear + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDiffYear + " рублей");
    }
}