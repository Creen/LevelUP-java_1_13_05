package ru.levelp;

/**
 * Created by Tesla on 07.06.2016.
 */
public class Main {
    public static void main(String args[]){

        MathOperations math = new MathOperations();

        // Минимальное среди двух целых чисел
        int min = math.min(3, 1);
        System.out.println("min = " + min);

        // Масимальное среди двух целых чисел
        int max = math.max(3, 1, 14);
        System.out.println("max = " + max);

        //Сумма элементов массива
        int amount = 10;
        int[] a = new int[amount];
        for (int i = 0; i <a.length ; i++) {
            a[i] = 3;
//            a[i] = (int)(Math.random()*10 - 5);
        }
        int sumArr = math.sumArr(a);
        System.out.println("sumArr = " + sumArr);

        //Возвращает среднее арифметическое
        int avrArr = math.avrArr(a);
        System.out.println("avrArr = " + avrArr);

        //возвращает n!
        int factorial = math.factorial(5);
        System.out.println("factorial = " + factorial);

        int fibonachchi = math.fib(6);
        System.out.println("fibonachchi = " + fibonachchi);



    }
}
