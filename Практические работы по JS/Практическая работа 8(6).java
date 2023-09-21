import java.util.Scanner;

/*public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter кол-во строк: ");
        int a = s.nextInt();
        System.out.println("Enter кол-во столбцов: ");
        int b = s.nextInt();
        
        int matrix[][] = new int[a][b];
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                matrix[i][j] = (j+1) * (i+1);
            }
        }
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

     }
}*/

/*public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите размер матрицы: ");
        int n = s.nextInt();
        
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    // Элементы главной диагонали равны 1
                    matrix[i][j] = 1;
                } else if (i > j) {
                    // Элементы ниже главной диагонали равны 2
                    matrix[i][j] = 2;
                } else {
                    // Элементы выше главной диагонали равны 0
                    matrix[i][j] = 0;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите количество строк зубчатого массива: ");
        int n = s.nextInt();
        
        int[][] arr = new int[n][];
        int maxSum = Integer.MIN_VALUE;
        int maxSumRow = -1;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Введите количество элементов в строке " + (i + 1) + ": ");
            int k = s.nextInt();
            
            arr[i] = new int[k];
            
            int sum = 0;
            
            System.out.print("Введите элементы строки " + (i + 1) + ": ");
            for (int j = 0; j < k; j++) {
                arr[i][j] = s.nextInt();
                sum += arr[i][j];
            }
            
            if (sum > maxSum) {
                maxSum = sum;
                maxSumRow = i;
            }
        }
        
        System.out.println("Номер строки с максимальной суммой: " + (maxSumRow + 1));
        System.out.println("Максимальная сумма: " + maxSum);
        System.out.print("Строка, которая даёт эту сумму: ");
        for (int num : arr[maxSumRow]) {
            System.out.print(num + " ");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите количество строк: ");
        int n = s.nextInt();
        System.out.print("Введите количество столбцов: ");
        int m = s.nextInt();
        
        int[][] arr = new int[n][m];
        
        System.out.println("Введите элементы массива (по строкам): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        
        int[][] rotatedArr = rotateArray(arr);
        
        System.out.println("Повернутый массив: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedArr[j][i] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] rotateArray(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        int[][] rotatedArr = new int[columns][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rotatedArr[j][rows - i - 1] = arr[i][j];
            }
        }
        
        return rotatedArr;
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Введите количество строк: ");
        int n = s.nextInt();
        System.out.print("Введите количество столбцов: ");
        int m = s.nextInt();
        
        int[][] matrix = new int[n][m];
        
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Поворот массива на 90 градусов против часовой стрелки
        int[][] rotatedMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[i][j] = matrix[j][m - i - 1];
            }
        }
        
        System.out.println("Повернутый массив:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/
