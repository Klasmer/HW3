public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte variableNumbers1 = 127;
        System.out.println("значение переменной byte = " + variableNumbers1);
        int variableNumbers2 =2_147_483_647;
        System.out.println("значение переменной int = " + variableNumbers2);
        short variableNumbers3 = 32_767;
        System.out.println("значение переменной short = " + variableNumbers3);
        long variableNumbers4 = 9_223_372_036_854_775_807L;
        System.out.println("значение переменной long = " + variableNumbers4);
        float variableNumbers5 = 3.4E+38f;
        System.out.println("значение переменной float = " + variableNumbers5);
        double variableNumbers6 = 1.7E+308;
        System.out.println("значение переменной double = " + variableNumbers6);

        // Вывел задание в коментарий, т.к. не выводим эти значения  в консоль.
        // System.out.println("Задача 2");
        //double a = 27.12;
        //long b  = 987_678_965_549L;
        //float c = 2.786F;
        //short d = 569;
        //short i = -159;
        //short f = 27_897;
        //byte g = 67;

        System.out.println("Задача 3");
        byte teacherLuda = 23;
        byte teacherAnna = 27;
        byte teacherEkaterina = 30;
        short totalPaper = 480;
        int paperForEveryone = totalPaper / (teacherLuda+ teacherAnna + teacherEkaterina);
        System.out.println("на каждого ученика расситано " + paperForEveryone + " листов бумаги");

        System.out.println("Задача 4");
        byte productionIn2Minutes = 16;
        byte minCount = 2;
        int productionForMinutes = productionIn2Minutes / minCount;
        int productionFor20Minutes = productionForMinutes * 20;
        System.out.println("за 20 минут машина произвела " + productionFor20Minutes + " штук бутылок");
        int productionForDay = productionForMinutes * 24 * 60;
        System.out.println("за день машина произвела " + productionForDay + " штук бутылок");
        int productionFor3Day = productionForDay * 3;
        System.out.println("за 3 деня машина произвела " + productionFor3Day + " штук бутылок");
        int productionForMounth = productionForDay * 30;
        System.out.println("за месяц машина произвела " + productionForMounth + " штук бутылок");

        System.out.println("Задача 5");
        byte schoolRenovation = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classesAtSchool =  (schoolRenovation / (whitePaint + brownPaint));
        int witePaintBuy =  (whitePaint * classesAtSchool);
        int brownPaintBuy =  (brownPaint * classesAtSchool);
        System.out.println("В школе, где " + classesAtSchool + (" классов, нужно " + witePaintBuy + (" белой краски и ") + brownPaintBuy + (" банок коричневой краски")));

        System.out.println("Задача 6");
        float grammIsKg = 1000f;
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte eggs = 70;
        byte bananaAmount = 5;
        byte milkAmount = 2;
        byte iceCreamAmount = 2;
        byte eggsAmount = 4;
        int breakfast = (banana * bananaAmount) + (milk * milkAmount) + (iceCream * iceCreamAmount) + (eggs * eggsAmount);
        System.out.println("Вес завтрака состовляет " + breakfast + " грамм");
        float breakfast2 = breakfast / grammIsKg;
        System.out.println("Вес завтрака состовляет " + breakfast2 + " килограмм");






    }
}
