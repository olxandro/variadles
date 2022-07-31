public class Main {
    byte b = 32;
    short s = 350;
    int i = 240;
    long l = 500L;
    float f = 3.12345f;
    double d = 1.25646;
    char ch = 2;
    boolean tr = true;
    public static void main(String[] args) {
        float firstBoxerWight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float generalWeight = firstBoxerWight + secondBoxerWeight;
        float differenceWeight = secondBoxerWeight - firstBoxerWight;
        System.out.println("Общий вес двух бойцов составляет - " + generalWeight + " кг.");
        System.out.println("Разница между весами бойцов состовляет - " + differenceWeight + " кг.");

        byte bananas = 5;
        byte onebanan = 80;
        int bananasWeight = bananas * onebanan;
        byte milk = 2;
        short oneMilk = 105;
        int milkWeight = milk * oneMilk;
        byte icecream = 2;
        short oneIcecream = 100;
        int icecreamWeight = icecream * oneIcecream;
        byte egges = 4;
        byte oneEgg = 70;
        int eggesWeight = egges * oneEgg;
        double spotrBreakfastWeight = bananasWeight + milkWeight + icecreamWeight +
                eggesWeight;
        System.out.println("Общий вес спорт-завтрака составляет " + spotrBreakfastWeight + " грамм.");
        double spotrBreakfastWeightKg = spotrBreakfastWeight / 1000;
        System.out.println("Общий вес спорт-завтрака составляет " + spotrBreakfastWeightKg + " кг.");

        double excessWeight = 7;
        double firstloseOneDay = 0.25;
        double secondloseOneDay = 0.5;
        double firstDaysLose = excessWeight / firstloseOneDay;
        double secondDaysLose = excessWeight / secondloseOneDay;
        System.out.println(firstDaysLose + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(secondDaysLose + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");

        int oldSalaryMasha = 67760;
        int oldSalaryDenis = 83690;
        int oldSalaryKris = 76230;
        double newSalaryMasha = oldSalaryMasha * 1.1;
        double newSalaryDenis = oldSalaryDenis * 1.1;
        double newSalaryKris = oldSalaryKris * 1.1;
        double oldYearSalaryMasha = oldSalaryMasha * 12;
        double oldYearSalaryDenis = oldSalaryDenis * 12;
        double oldYearSalaryKris = oldSalaryKris * 12;
        double newYearSalaryMasha = newSalaryMasha * 12;
        double newYearSalaryDenis = newSalaryDenis * 12;
        double newYearSalaryKris = newSalaryKris * 12;
        double differenceYearSalaryMasha = newYearSalaryMasha - oldYearSalaryMasha;
        double differenceYearSalaryDenis = newYearSalaryDenis - oldYearSalaryDenis;
        double differenceYearSalaryKris = newYearSalaryKris - oldYearSalaryKris;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " +
                differenceYearSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " +
                differenceYearSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " +
                differenceYearSalaryKris + " рублей.");



    }


    }