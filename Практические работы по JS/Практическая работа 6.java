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

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите число a: ");
        int a = s.nextInt();
        
        System.out.print("Введите число b: ");
        int b = s.nextInt();
        
        System.out.println("Четные числа от " + a + " до " + b + ":");
        
        int number = a;
        
        while (number <= b) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите целое число, не меньшее 2: ");
        int number = s.nextInt();
        
        int divisor = 2;
        while (number % divisor != 0) {
            divisor++;
        }
        
        System.out.println("Наименьший натуральный делитель числа " + number + " равен " + divisor);
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите натуральное число n: ");
        int n = s.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i * i;
            i++;
        }

        System.out.println("Сумма равна: " + sum);
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите натуральное число N: ");
        int n = s.nextInt();
        
        int sum = 0;
        
        while (n > 0) {
 
            int digit = n % 10;
            sum += digit;
            
            n /= 10;
        }
        
        System.out.println("Сумма цифр числа: " + sum);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE; 
        int secondMax = Integer.MIN_VALUE;
        int currentNumber = s.nextInt();
        
        while (currentNumber != 0) {
            if (currentNumber > max) {
                secondMax = max;
                max = currentNumber;
            } else if (currentNumber > secondMax && currentNumber != max) {
                secondMax = currentNumber;
            }
            
            currentNumber = s.nextInt();
        }
        
        System.out.println("Второе по величине число: " + secondMax);
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = s.nextInt();
        System.out.print("Введите число b (b >= a): ");
        int b = s.nextInt();

        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от " + a + " до " + b + " равна: " + sum);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean found = false;

        System.out.println("Введите слова (для завершения введите 'СТОП'):");

        for (;;) {
            String word = s.nextLine();

            if (word.equals("СТОП")) {
                break; 
            }

            if (word.equals("Куб")) {
                found = true;
                break; 
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите натуральное число n: ");
        int n = s.nextInt();
        
        if (n <= 0) {
            System.out.println("Число n должно быть натуральным.");
            return;
        }
        
        System.out.println("Введите " + n + " целых чисел:");
        
        int min = Integer.MAX_VALUE; // Начальное значение для минимума
        int max = Integer.MIN_VALUE; // Начальное значение для максимума
        
        for (int i = 0; i < n; i++) {
            int number = s.nextInt();
            
            if (number < min) {
                min = number;
            }
            
            if (number > max) {
                max = number;
            }
        }
        
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}*/


/*public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Факториал определен только для натуральных чисел.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println(n + "! = " + factorial);
        }
    }
}*/



/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int product = 1; 

        while (true) {
            System.out.print("Введите целое число или 'СТОП' для завершения: ");
            String input = s.next();

            if (input.equalsIgnoreCase("СТОП")) {
                break; // Если пользователь ввел "СТОП", завершаем цикл
            }

            try {
                int number = Integer.parseInt(input);

                if (number != 0) {
                    product *= number; // Умножаем на ненулевое число
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите целое число или 'СТОП'");
            }
        }

        if (product != 1) {
            System.out.println("Произведение ненулевых чисел: " + product);
        } else {
            System.out.println("Не найдено");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int N = s.nextInt();
        
        String binaryRepresentation = "";
        
        while (N > 0) {
            int remainder = N % 2;
            binaryRepresentation += String.valueOf(remainder);
            N = N / 2;
        }
        
        for (int i = binaryRepresentation.length() - 1; i >= 0; i--) {
            System.out.print(binaryRepresentation.charAt(i));
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int normalWordCount = 0;
        boolean foundCube = false;

        while (true) {
            System.out.print("Введите слово (для завершения введите 'СТОП'): ");
            String word = s.next();

            if (word.equals("СТОП")) {
                break;
            }

            if (word.equals("Куб") && !foundCube) {
                foundCube = true;
                System.out.println("Слово 'Куб' было введено как " + (normalWordCount + 1) + "-е нормальное слово.");
            }

            if (!word.equals("'ээээ") && !word.equals("нууу")) {
                normalWordCount++;
            }
        }

        if (!foundCube) {
            System.out.println("NO");
        }

    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int maxElement = 0;
        int count = 0;

        System.out.println("Введите последовательность натуральных чисел (0 для завершения):");

        for (;;) {
            int number = s.nextInt();

            if (number == 0) {
                break;
            }

            if (number > maxElement) {
                maxElement = number;
                count = 1;
            } else if (number == maxElement) {
                count++;
            }
        }

        System.out.println("Количество элементов, равных максимальному: " + count);

    }
}*/
