import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите натуральное число: ");
        int number = s.nextInt();

        System.out.println("Полные квадраты натуральных чисел, не превосходящие " + number + ":");

        int i = 1;
        while (i * i <= number) {
            System.out.println(i * i);
            i++;
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите целое число a: ");
        int a = s.nextInt();

        System.out.print("Введите целое число b (a <= b): ");
        int b = s.nextInt();

        int sum = 0;
        while (a <= b) {
            sum += a;
            a++;
        }

        System.out.println("Сумма всех чисел от " + a + " до " + b + " равна " + sum);
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите целое число a: ");
        int a = s.nextInt();

        System.out.print("Введите целое число b (a <= b): ");
        int b = s.nextInt();

        int count = 0;
        int num = a;
        while (num <= b) {
            if (num % 3 == 0 && num % 5 != 0) {
                count++;
            }
            num++;
        }

        System.out.println("Количество чисел, кратных 3 и не кратных 5, от " + a + " до " + b + " равно " + count);
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Введите целые числа (введите 0 для завершения):");
        while (true) {
            int number = s.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое введенных чисел: " + average);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите последовательность натуральных чисел (0 - для завершения):");

        int max = 0;
        int number = s.nextInt();

        while (number != 0) {
            if (number > max) {
                max = number;
            }
            number = s.nextInt();
        }

        System.out.println("Максимальное значение в последовательности: " + max);
    }
}*/

//6
