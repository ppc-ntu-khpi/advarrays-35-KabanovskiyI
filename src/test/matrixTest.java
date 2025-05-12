package test;

import java.util.Arrays;
import java.util.Random;
import domain.matrixSum;
/**
 * Тестовий клас для демонстрації роботи {@link MatrixSum}.
 * Створює випадкову матрицю заданих розмірів і виводить суму її елементів.
 */
public class matrixTest {

    // Змінювані параметри користувачем
    private static final int ROWS = 4; // Кількість рядків (N)
    private static final int COLUMNS = 5; // Кількість стовпців (M)
    private static final int MIN_VALUE = 0; // Мінімальне значення в матриці
    private static final int MAX_VALUE = 100; // Максимальне значення в матриці

    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix(ROWS, COLUMNS, MIN_VALUE, MAX_VALUE);

        System.out.println("Згенерована матриця:");
        printMatrix(matrix);

        int sum = matrixSum.calculateSum(matrix);
        System.out.println("Сума елементів матриці: " + sum);
    }

    /**
     * Генерує матрицю з випадковими значеннями в заданому діапазоні.
     */
    private static int[][] generateRandomMatrix(int rows, int columns, int min, int max) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }

    /**
     * Виводить матрицю у консоль у зручному для читання вигляді.
     */
    private static void printMatrix(int[][] matrix) {
        Arrays.stream(matrix)
              .map(Arrays::toString)
              .forEach(System.out::println);
    }
}
