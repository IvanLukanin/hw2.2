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
        int totalStudents = (firstClass + secondClass + thirdClass);
        System.out.println("На каждого ученика расчитано " + (totalSheets / totalStudents) + " листов бумаги");

        // Задание 4
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int outputPerMinutes = (bottles / minutes);
        int productionIn20Minutes = (outputPerMinutes * 20);
        System.out.println("За 20 минут машина произвела " + productionIn20Minutes + " штук бутылок");
        int productionInHour = (productionIn20Minutes * 3);
        System.out.println("За 1 час машина произвела " + productionInHour + " штук бутылок");
        int productionIn1Day = (productionInHour * 24);
        System.out.println("За 1 день машина произвела " + productionIn1Day + " штук бутылок");
        int productionIn3Day = (productionIn1Day * 3);
        System.out.println("За 3 дня машина произвела " + productionIn3Day + " штук бутылок");
        int productionInMonth = (productionIn1Day * 30);
        System.out.println("За месяц машина произвела " + productionInMonth + " штук бутылок");

        // Задание 5
        System.out.println("Задача 5");
        int cansTotal = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int oneClass = (whitePaintPerClass + brownPaintPerClass);
        System.out.println(oneClass + " банок краски было куплено на 1 класс");
        int totalClasses = cansTotal / oneClass;
        System.out.println(totalClasses + " классов всего");
        int whitePaintTotalPurchased = (totalClasses * whitePaintPerClass);
        int brownPaintTotalPurchased = (totalClasses * brownPaintPerClass);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaintTotalPurchased + " банок белой краски и " + brownPaintTotalPurchased + " банок коричневой краски");

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
        int weightForLossInGramm = 7_000;
        int theWeightMin = 250;
        int theWeightMax = 500;
        int minNumberOfDaysToLoseWeight = (weightForLossInGramm / theWeightMin);
        System.out.println("Минимильное количество дней для похудания - " + minNumberOfDaysToLoseWeight);
        int maxNumberOfDaysToLoseWeight = (weightForLossInGramm / theWeightMax);
        System.out.println("Максимальное количество дней для похудания - " + maxNumberOfDaysToLoseWeight);
        int averageNumberOfDaysToLoseWeight = (maxNumberOfDaysToLoseWeight + minNumberOfDaysToLoseWeight) / 2;
        System.out.println("Среднее количество дней для похудания - " + averageNumberOfDaysToLoseWeight);

        System.out.println("Задача 8");
        int percentIncrease = 10;
        int mashaSalaryPerMonth = 67760;
        int denisSalaryPerMonth = 83690;
        int krisSalaryPerMonth = 76230;
        int mashaPercentIncrease10 = (mashaSalaryPerMonth / percentIncrease);
        int denisPercentIncrease10 = (denisSalaryPerMonth / percentIncrease);
        int krisPercentIncrease10 = (krisSalaryPerMonth / percentIncrease);
        int a2 = (mashaSalaryPerMonth + mashaPercentIncrease10) ;
        System.out.println(a2 + " ежемесячная зарплата Маши, повышенная на 10%");
        int b2 = (denisSalaryPerMonth + denisPercentIncrease10);
        System.out.println(b2 + " ежемесячная зарплата Дениса, повышенная на 10%");
        int c2 = (krisSalaryPerMonth + krisPercentIncrease10);
        System.out.println(c2 + " ежемесячная зарплата Кристины, повышенная на 10%");
        int aOne = mashaSalaryPerMonth * 12;
        System.out.println(aOne + " годовая зарпата Маши нынешняя");
        int aTwo = a2 * 12;
        System.out.println(aTwo + " годовая зарплата Маши после повышения");
        int aThree = aTwo - aOne;
        System.out.println(aThree + " разница между нынешней годовой зарплатой Маши и после повышения");
        int bOne = denisSalaryPerMonth * 12;
        System.out.println(bOne + " годовая зарплата Дениса нынешняя");
        int bTwo = b2 * 12;
        System.out.println(bTwo + " годовая зарплата Дениса после повышения");
        int bThree = bTwo - bOne;
        System.out.println(bThree + " разница между нынешней годовой зарплатой Дениса и после повышения");
        int cOne = krisSalaryPerMonth * 12;
        System.out.println(cOne + " годовая зарплата Кристины нынешняя");
        int cTwo = c2 * 12;
        System.out.println(cTwo + " годовая зарплата Кристины после повышения");
        int cThree = cTwo - cOne;
        System.out.println(cThree + " разница между нынешней годовой зарплатой Кристины и после повышения");
        System.out.println("Маша теперь получает " + a2 + " рублей. Годовой доход вырос на " + aThree + " рублей" );
        System.out.println("Денис теперь получает " + b2 + " рублей. Годовой доход вырос на " + bThree + " рублей" );
        System.out.println("Кристина теперь получает " + c2 + " рублей. Годовой доход вырос на " + cThree + " рублей" );
    }
}