import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите количество испеченных пирожков (четное число): ");
        int tP = s.nextInt();

        if (tP > 20) {
            int piesForGrandma = tP - 10;
            System.out.println("Красная Шапочка сможет донести " + piesForGrandma + " пирожков до бабушки.");
        }
        else if (tP < 20) {
            int piesForWolf = tP / 2;
            System.out.println("Красная Шапочка сможет донести " + piesForWolf + " пирожков до бабушки.");
        }
        else {
            int evenTotalPies = tP / 2;
            System.out.println("Красная Шапочка сможет донести " + evenTotalPies + " пирожков до бабушки.");
        }

    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите количество часов и минут, в которое надо проснуться Игорю Валерьевичу(через пробел): ");
        String hm = s.nextLine();
        System.out.print("Введите время, которое показывают часы(через пробел): ");
        String x = s.nextLine();
        
        if (!hm.equals(x)){
            System.out.print("Опоздал");
        }
        
        else{
            System.out.print("Успел");
        }
    }        
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите три числв через пробел: ");
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        if((x>y) && (x>z)){
            System.out.print(x);
        }
        else if((y>x) && (y>z)){
            System.out.print(y);
        }
        else if((z>x) && (z>y)){
            System.out.print(z);
        }
        else{
            System.out.print("Ваши числа равны");
        }
    }        
} */


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите ваш год: ");
        int year = s.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.print("Год високосный");
                }
                else{
                    System.out.print("Год не високосный");
                }
            }
            else{
                System.out.print("Год високосный");
            }
        }
        else{
             System.out.print("Год не високосный");
        }
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("введите первую строку: ");
        String s1 = s.nextLine();
        System.out.print("введите вторую строку: ");
        String s2 = s.nextLine();
        System.out.print("введите третью строку: ");
        String s3 = s.nextLine();
        if ((s1.equals(s2) && s2.equals(s3)) && (s1.equals(s3))) {
            System.out.println("No");
        } 
        else if ((s1.equals(s2) | s2.equals(s3)) | (s1.equals(s3))) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}*/



/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Длину и ширину, количество долек шоколадки(через пробел): ");
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        if (k == n * m) {
            System.out.println("NO");
            return;
        }
        if (k % n == 0 || k % m == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите возраст: ");
        int age = s.nextInt();
        
        String result = (age >= 18) ? "совершеннолетний" : "несовершеннолетний";
        System.out.println("Пользователь " + result);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите длину первого катета: ");
        int a = s.nextInt();
        
        System.out.print("Введите длину второго катета: ");
        int b = s.nextInt();
        
        double c = Math.sqrt(a * a + b * b);
        
        System.out.println("Гипотенуза: " + c);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите длину первой стороны: ");
        int a = s.nextInt();
        
        System.out.print("Введите длину второй стороны: ");
        int b = s.nextInt();
        
        System.out.print("Введите длину третьей стороны: ");
        int c = s.nextInt();
        
        boolean exists = (a + b > c) && (b + c > a) && (c + a > b);
        
        if (exists) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите число (меньше 100): ");
        int n = s.nextInt();
        
        String word;
        
        if (n % 10 == 1 && n % 100 != 11) {
            word = "корова";
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) {
            word = "коровы";
        } else {
            word = "коров";
        }
        
        System.out.println(n + " " + word);
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите количество котлет, которые можно положить на сковородку: ");
        int k = s.nextInt();
        System.out.print("Введите время обжарки одной стороны котлеты (в минутах): ");
        int m = s.nextInt();
        System.out.print("Введите количество котлет, которые нужно обжарить: ");
        int n = s.nextInt();
        int passes = (int) Math.ceil((double) n / k) * 2;
        int totalTime = passes * m;
        
        System.out.println("Общее время обжарки: " + totalTime + " минут");
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        int a = s.nextInt();
        
        System.out.print("Введите второе число: ");
        int b = s.nextInt();
        
        System.out.print("Введите третье число: ");
        int c = s.nextInt();
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        System.out.println("Упорядоченная тройка: " + a + ", " + b + ", " + c);
    }
}*/

