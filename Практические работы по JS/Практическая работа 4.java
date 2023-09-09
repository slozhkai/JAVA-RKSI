import java.util.Scanner;
/*class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        System.out.print(x*y*z);
    }
}*/

/*public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Введите скорость (км.ч)");
        int speed = s.nextInt();
        System.out.print("Введите время (в часах)");
        int time = s.nextInt();
        int distant = speed * time;
        System.out.println("Пройденный путь: " + distant + " км");
    }
}*/

/*public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = s.nextInt();
        int before = number - 1;
        int after = number + 1;
        System.out.println("The next number for the number " + number + " is " + after);
        System.out.println("The previos number for the number " + number + " is " + before);
    }
}*/

/*public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        int length = s.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        int width = s.nextInt();
        int square = length * width;
        int perimeter = (length * 2) + (width*2);
        System.out.println("Площадь прямоугольника = " + square);
        System.out.println("Периметр прямоуголника = " + perimeter);
    }
}*/

/*public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = s.nextInt();
        int nextEvenNumber = (n/2+1)*2;
        System.out.println("Следующее число после n: " + nextEvenNumber);
    }
}*/

/*public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Введите стоимость одного пирожка в рублях и копейках: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print("Введите количество пирожков: ");
        int n = s.nextInt();
        System.out.print("Стоимость за все пирожки: " + (n*a) + " руб." + (n*b) + " коп.");
    }
}*/

/*public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = s.nextInt();
        int lastDigit = n % 10;
        System.out.print("Последняя цифра числа: " + lastDigit);
    }
}*/

/*public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int n = s.nextInt();
        int digit1 = n/100;
        int digit2 = (n/10)%10;
        int digit3 = n%10;
        int sum = digit1+digit2+digit3;
        System.out.println("Сумма цифр числа= " + sum);
    }
}*/

/*public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Введите скорость автомобиля (в км.ч): ");
        int v = s.nextInt();
        System.out.print("Введите время (в часах): ");
        int t = s.nextInt();
        int distant = v * t;
        int position = (distant % 109 + 109) % 109;
        System.out.println("автомобиль остановится на отметке: " + position);
    }
}*/


/*public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Введите высоту шеста (в метрах): ");
        int h = s.nextInt();
        System.out.print("Введите расстояние, которое ползет улитка вверх за день (в метрах): ");
        int a = s.nextInt();
        System.out.print("Введите расстояние, которое улитка спускается вниз за ночь (в метрах): ");
        int b = s.nextInt();
        int days = (h - b - 1)/(a - b) + 1;
        System.out.print("Улитка доползет до вершины шеста за " + days + "дней");
    }
}*/
