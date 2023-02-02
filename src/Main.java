public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задача 1");
        int countAnimals = 2;
        System.out.println("Значение переменной countAnimals с типом int равно " + countAnimals);
        byte countMachines = 6;
        System.out.println("Значение переменной countMachines с типом byte равно " + countMachines);
        short countPoison = 22;
        System.out.println("Значение переменной countPoison с типом short равно " + countPoison);
        long countPlay = 995732853;
        System.out.println("Значение переменной countPlay с типом long равно " + countPlay);
        float countPeople = 5.1325F;
        System.out.println("Значение переменной countPeople с типом float равно " + countPeople);
        double family = 3.2874;
        System.out.println("Значение переменной family с типом double равно " + family);

        // Задание 2
        System.out.println("Задача 2");
        byte a = 67;
        short b = -159;
        int c = 27897;
        long d = (long) 987_678_965_549F;
        float e = 27.12F;
        double f = 2.786;
        char g = 569;

        // Задание 3
        System.out.println("Задача 3");
        int firstClass = 23;
        int secondClass = 27;
        int thirdClass = 30;
        int totalSheets = 480;
        System.out.println("Всего учеников " + (firstClass + secondClass + thirdClass));
        int totalStudents = 80;
        System.out.println("На каждого ученика расчитано " + (totalSheets / totalStudents) + " листов бумаги");

        // Задание 4
        System.out.println("Задача 4");
        byte machinePerfomance = 16 / 2;
        System.out.println( machinePerfomance + " штук - производительность в 1 минуту");
        short timeOne = 20;
        int thingsOne = machinePerfomance * timeOne;
        System.out.println("За " + timeOne + " минут машина произвела " + thingsOne + " штук бутылок");
        short timeTwo = 1440;
        int thingsTwo = machinePerfomance * timeTwo;
        System.out.println("За сутки машина произвела " + thingsTwo + " штук бутылок");
        short timeThree = 4320;
        int thingsThree = machinePerfomance * timeThree;
        System.out.println("За 3 дня машина произвела " + thingsThree + " штук бутылок");
        int timeFour = 43200;
        int thingsFour = machinePerfomance * timeFour;
        System.out.println("За 1 месяц машина производит " + thingsFour + " штук бутылок");

        System.out.println("Задача 5");
        byte oneClass = 2 + 4;
        System.out.println(oneClass + " банок краски было куплено на 1 класс");
        byte totalClasses = 120 / 6;
        System.out.println(totalClasses + " классов всего");
        byte whitePaint = 20 * 2;
        byte brownPaint = 20 * 4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println("Задача 6");
        int banana = 80 * 5;
        System.out.println(banana + " грамм - вес 5 бананов");
        int milk = 105 * 2;
        System.out.println(milk + " грамм - вес 200мл молока");
        int iceCream = 2 * 100;
        System.out.println(iceCream + " грамм - вес двух брикетов мороженного");
        int Eggs = 70 * 4;
        System.out.println(Eggs + " грамм - вес 4 яиц");
        int totalWeight = banana + milk + iceCream + Eggs;
        System.out.println(totalWeight + " грамм спортзавтрака всего");
        float kilo = totalWeight / 1000f;
        System.out.println(kilo + " килограмм спортзавтрака всего");

        System.out.println("Задача 7");
        int theWeightOne = 250;
        int theWeightTwo = 500;
        int weightOne = 28 * 250;
        System.out.println(weightOne + " грамм, потеряет за 28 дней");
        int weightTwo = 14 * 500;
        System.out.println(weightTwo + " грамм, потеряет за 14 дней");
        int one = (28 + 14) / 2;
        System.out.println(one + " день понадобится в среднем, чтобы добиться результата похудения");

        System.out.println("Задача 8");
        int a2 = 67760 + 6776;
        System.out.println(a2 + " ежемесячная зарплата Маши, повышенная на 10%");
        int b2 = 83690 + 8360;
        System.out.println(b2 + " ежемесячная зарплата Дениса, повышенная на 10%");
        int c2 = 76230 + 7623;
        System.out.println(c2 + " ежемесячная зарплата Кристины, повышенная на 10%");
        int aOne = 67760 * 12;
        System.out.println(aOne + " годовая зарпата Маши нынешняя");
        int aTwo = 74536 * 12;
        System.out.println(aTwo + " годовая зарплата Маши после повышения");
        int aThree = aTwo - aOne;
        System.out.println(aThree + " разница между нынешней годовой зарплатой Маши и после повышения");
        int bOne = 83690 * 12;
        System.out.println(bOne + " годовая зарплата Дениса нынешняя");
        int bTwo = 92050 * 12;
        System.out.println(bTwo + " годовая зарплата Дениса после повышения");
        int bThree = bTwo - bOne;
        System.out.println(bThree + " разница между нынешней годовой зарплатой Дениса и после повышения");
        int cOne = 76230 * 12;
        System.out.println(cOne + " годовая зарплата Кристины нынешняя");
        int cTwo = 83853 * 12;
        System.out.println(cTwo + " годовая зарплата Кристины после повышения");
        int cThree = cTwo - cOne;
        System.out.println(cThree + " разница между нынешней годовой зарплатой Кристины и после повышения");
        System.out.println("Маша теперь получает " + a2 + " рублей. Годовой доход вырос на " + aThree + " рублей" );
        System.out.println("Денис теперь получает " + b2 + " рублей. Годовой доход вырос на " + bThree + " рублей" );
        System.out.println("Кристина теперь получает " + c2 + " рублей. Годовой доход вырос на " + cThree + " рублей" );
    }
}