import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        while (true) {
            String selectedProgram = "-1";
            Scanner in = new Scanner(System.in);

            do {
                if (!selectedProgram.equals("-1")) {
                    System.out.println("Ошибка в номере программы");
                }

                System.out.print("Введите номер программы (1, 2 или 3) или 0 для выхода: ");

                selectedProgram = in.next();
            } while (!selectedProgram.equals("1") &&
                    !selectedProgram.equals("2") &&
                    !selectedProgram.equals("3") &&
                    !selectedProgram.equals("0"));

            switch (selectedProgram) {
                case "1":
                    Program_1.start();
                    break;
                case "2":
                    Program_2.start();
                    break;
                case "3":
                    Program_3.start();
                    break;
            }

            if (selectedProgram.equals("0")) {
                break;
            }
        }

    }

}

class Program_1 {

    public static void start() {

        System.out.println("Программа 1 запущена");

        int a, b;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число a: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка ввода. Введите целое число a: ");
            in.next();
        }
        a = in.nextInt();

        System.out.print("Введите целое число b: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка ввода. Введите целое число b: ");
            in.next();
        }
        b = in.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        if (b == 0) {
            System.out.println("Делить на 0 нельзя");
        } else {
            System.out.println("a / b = " + ((double) a / (double) b));
        }
        System.out.println("a * b = " + (a * b));

        System.out.println("Программа 1 завершена");

    }

}

class Program_2 {

    public static void start() {

        System.out.println("Программа 2 запущена");

        String a, b;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку a: ");
        a = in.nextLine();

        System.out.print("Введите строку b: ");
        b = in.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        System.out.println("Программа 2 завершена");

    }

}

class Program_3 {

    public static void start() {

        System.out.println("Программа 3 запущена");

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(
                "Задан массив целых чисел: { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } - необходимо вывести все чётные числа");
        System.out.print("Вывод:  ");
        for (int value : array) {
            if (value % 2 == 0) {
                System.out.print(value + "  ");
            }
        }

        System.out.println("\nПрограмма 3 завершена");

    }

}
