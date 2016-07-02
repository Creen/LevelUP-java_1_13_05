package ru.levelp;

/**
 * Created by Tesla on 07.06.2016.
 */
public class MathOperations {

    public int min(int a, int b) {
        int min = a;
        if (min > b) {
            min = b;
        }
        return min;
    }

    public int max(int a, int b, int c){
        if((a > b) && (a > c)){
            return a;
        }
        if ((b > a) && (b > c)){
            return b;
        } else {
            return c;
        }
    }

    public  int sumArr (int[] mas){
        int sumArr = 0;
        for (int i = 0; i < mas.length; i++) {
            sumArr = sumArr + mas[i];
        }
        return sumArr;
    }

    public int avrArr (int[] mas){
        int sumArr = 0;
        for (int i = 0; i < mas.length; i++) {
            sumArr = sumArr + mas[i];
        }
        return sumArr/mas.length;
    }

    public int factorial (int n) {
        if (n == 0) return 1;
        return n * factorial(n-1); // Так можно? Вроде рабоатет.
    }

    public int fib (int n){
//        i-1 и i-2 i>=2
        if (n == 1) return 1;
        if (n == 2) return 1;
        return fib(n - 1) + fib(n - 2);

    }

}
