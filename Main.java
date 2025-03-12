import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        while (true) {
            String selectedProgram = "-1";
            Scanner in = new Scanner(System.in);

            do {
                if (!selectedProgram.equals("-1")) {
                    System.out.println("������ � ������ ���������");
                }

                System.out.print("������� ����� ��������� (1, 2 ��� 3) ��� 0 ��� ������: ");

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

        System.out.println("��������� 1 ��������");

        int a, b;
        Scanner in = new Scanner(System.in);

        System.out.print("������� ����� ����� a: ");
        while (!in.hasNextInt()) {
            System.out.print("������ �����. ������� ����� ����� a: ");
            in.next();
        }
        a = in.nextInt();

        System.out.print("������� ����� ����� b: ");
        while (!in.hasNextInt()) {
            System.out.print("������ �����. ������� ����� ����� b: ");
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
            System.out.println("������ �� 0 ������");
        } else {
            System.out.println("a / b = " + ((double) a / (double) b));
        }
        System.out.println("a * b = " + (a * b));

        System.out.println("��������� 1 ���������");

    }

}

class Program_2 {

    public static void start() {

        System.out.println("��������� 2 ��������");

        String a, b;
        Scanner in = new Scanner(System.in);

        System.out.print("������� ������ a: ");
        a = in.nextLine();

        System.out.print("������� ������ b: ");
        b = in.nextLine();

        if (a.equals(b)) {
            System.out.println("������ ���������");
        } else {
            System.out.println("������ �����������");
        }

        System.out.println("��������� 2 ���������");

    }

}
