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


    }
}
