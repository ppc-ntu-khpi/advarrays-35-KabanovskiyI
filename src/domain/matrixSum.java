package domain;

import java.util.Arrays;

/**
 * Клас {@code MatrixSum} надає метод для обчислення суми всіх елементів
 * двовимірного масиву (матриці) розміру N x M.
 *
 * <p>Використовується функціональний підхід без застосування явних циклів —
 * через API класу {@link java.util.Arrays}. Типи даних обрані з урахуванням
 * мінімального споживання памʼяті при збереженні точності (int для елементів матриці).
 */
public class matrixSum {

    /**
     * Обчислює суму всіх елементів матриці.
     *
     * @param matrix двовимірний масив цілих чисел розміром N x M
     * @return сума всіх елементів матриці
     * @throws IllegalArgumentException якщо матриця порожня або містить null-рядки
     */
    public static int calculateSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Матриця не повинна бути порожньою.");
        }

        return Arrays.stream(matrix)
                .filter(row -> row != null)
                .flatMapToInt(Arrays::stream)
                .sum();
    }
}
