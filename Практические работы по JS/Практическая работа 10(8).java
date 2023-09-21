import java.util.ArrayList;
import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите натуральное число n: ");
        int n = s.nextInt();

        if (n <= 0) {
            System.out.println("Введите натуральное число больше нуля.");
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);

        for (int i = 0; i < n - 1; i++) {
            list.add(0);
        }

        list.add(1);

        for (int element : list) {
            System.out.print(element + " ");
        }
    }
}*/



/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите натуральное число n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Введите натуральное число больше нуля.");
            return;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(String.valueOf(i));
        }

        System.out.print("Введите число m (m <= n): ");
        int m = sc.nextInt();
        if (m >= n) {
            System.out.println("Число m должно быть меньше или равно n.");
            return;
        }

        System.out.print("Введите строку s: ");
        String s = sc.next();

        list.add(m, s);

        for (String element : list) {
            System.out.print(element + " ");
        }
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите натуральное число n: ");
        int n = s.nextInt();

        if (n <= 0) {
            System.out.println("Введите натуральное число больше нуля.");
            return;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(String.valueOf(i));
        }

        System.out.print("Введите число m (m < n): ");
        int m = s.nextInt();
        if (m >= n || m < 0) {
            System.out.println("Число m должно быть меньше n и больше или равно нулю.");
            return;
        }

        list.remove(m);

        for (String element : list) {
            System.out.print(element + " ");
        }
    }
}*/


/*public class Main {
    public static void main(String[] args) {

        ArrayList<String> stack = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество запросов: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 


        for (int i = 0; i < n; i++) {
            String query = scanner.nextLine();
            

            String[] words = query.split(" ");
            
            if (words[0].equals("push")) {

                String clothing = words[1];
                stack.add(clothing);
            } else if (words[0].equals("pop")) {

                if (!stack.isEmpty()) {
                    String clothing = stack.remove(stack.size() - 1);
                    System.out.println("Петя взял " + clothing);
                }
            }
        }

        System.out.println("Оставшиеся вещи на стуле:");
        for (String clothing : stack) {
            System.out.println(clothing);
        }
    }
}*/
