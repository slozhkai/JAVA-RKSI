import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите количество элементов списка: ");
        int count = s.nextInt();
        
        int[] numbers = new int[count];
        
        System.out.println("Введите элементы списка:");
        for (int i = 0; i < count; i++) {
            numbers[i] = s.nextInt();
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("Сумма элементов списка: " + sum);
        
        System.out.println("Элементы списка в обратном порядке:");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}*/

/*public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите количество элементов списка: ");
        int count = s.nextInt();
        
        int[] numbers = new int[count];
        
        System.out.println("Введите элементы списка:");
        for (int i = 0; i < count; i++) {
            numbers[i] = s.nextInt();
        }
        
        int sum = 0;
        System.out.print("Числа с четными индексами: ");
        for (int i = 0; i < count; i += 2) {
            sum += numbers[i];
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nСумма чисел с четными индексами: " + sum);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите количество элементов списка: ");
        int count = s.nextInt();

        int[] numbers = new int[count];

        System.out.println("Введите элементы списка:");
        for (int i = 0; i < count; i++) {
            numbers[i] = s.nextInt();
        }

        System.out.print("Введите номер элемента a: ");
        int a = s.nextInt();
        System.out.print("Введите номер элемента b: ");
        int b = s.nextInt();

        int temp = numbers[a - 1];
        numbers[a - 1] = numbers[b - 1];
        numbers[b - 1] = temp;

        System.out.println("Результат после замены:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите количество человек в строю: ");
        int count = s.nextInt();

        int[] heights = new int[count];

        System.out.println("Введите рост каждого человека в строю (в невозрастающем порядке):");
        for (int i = 0; i < count; i++) {
            heights[i] = s.nextInt();
        }

        System.out.print("Введите рост Пети: ");
        int petyaHeight = s.nextInt();

        int position = count + 1;
        for (int i = 0; i < count; i++) {
            if (heights[i] <= petyaHeight) {
                position = i + 1;
                break;
            }
        }

        System.out.println("Пете нужно встать на позицию: " + position);

    }
}*/




























































/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите количество чисел: ");
        int count = s.nextInt();
        
        int[] numbers = new int[count];
        
        System.out.println("Введите список чисел:");
        for (int i = 0; i < count; i++) {
            numbers[i] = s.nextInt();
        }
        
        for (int i = 0; i < count - 1; i += 2) {
            int temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;
        }
        
        System.out.println("Результат после перестановки:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}*/



/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите число a: ");
        int a = s.nextInt();
        
        System.out.print("Введите число b: ");
        int b = s.nextInt();
        
        int size = b - a + 1;
        int[] cubes = new int[size];
        
        for (int i = 0; i < size; i++) {
            int number = a + i;
            cubes[i] = number * number * number;
        }
        
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        
        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            int number = s.nextInt();
            
            if (number < a || number > b) {
                System.out.println("Error");
            } else {
                int index = number - a;
                System.out.println("Куб числа " + number + ": " + cubes[index]);
            }
        }
    }
}
*/
