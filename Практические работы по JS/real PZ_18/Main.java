import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Student\\Desktop\\real PZ_18\\ input.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Student\\Desktop\\real PZ_18\\output.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                System.out.println("Ваша строка: " + line);

                try {
                    String[] splitLine = line.split(" ");
                    double a = Double.parseDouble(splitLine[0]);

                    String operation = splitLine[1];
                    double b = Double.parseDouble(splitLine[2]);

                    double result = calculate(a, operation, b);
                    System.out.println("Результат: " + result);

                    writer.write("Результат: " + result + "\n");

                }
                catch (NumberFormatException e) {
                    System.out.println("Ошибка! Не число: " + e.getMessage());
                }
                catch (IllegalArgumentException e) {
                    System.out.println("Ошибка операции: " + e.getMessage());
                }
                catch (ArithmeticException e) {
                    System.out.println("Ошибка! Деление на ноль: " + e.getMessage());
                }
            }
        }
        catch (IOException ex) {
            System.out.print("Ошибка при чтении файла: " + ex.getMessage());
        }
    }

    public static double calculate(double a, String operation, double b) {
        double result = 0.0;

        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Attempt to divide by zero");
                }
                result = a / b;
                break;
            default: throw new IllegalArgumentException("Invalid operation: " + operation);
        }

        return result;
    }
}


