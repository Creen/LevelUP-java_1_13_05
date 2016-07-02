package ru.levelp.L2;

/**
 * Created by Tesla on 11.06.2016.
 */
public class MathOperations {
    public int min(int a, int b) {
        int min = a;
        if (min > b) {
            min = b;
        }
        return min;
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int avr(int[] array) {
        return sum(array) / array.length;
    }

    public int[] sort(int[] array, boolean isAscending) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if ((array[j] > array[j + 1] && isAscending)
                        || (array[j] < array[j+1] && !isAscending)) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    //max(int, int, int)

    //sum(int[]) - возвращает сумму элементов массива

    //avr(int[]) - возвращает среднее арифметическое чисел в массиве

    //factorial(int n) - возвращает n!

    //fibonacci(int n) - возвращает n-й член последовательности Фибоначчи
    //Последовательность: 1 1 2 3 5 8 13 21 34 ...
    //каждый i-й член последовательности равен сумме i-1 и i-2

    //sort(int[] array, boolean isAscending)

    //* sqrt(double)
}
