package ru.levelp;

/**
 * Created by Tesla on 02.07.2016.
 */
public class Main {

    // Тернарный оператор if-then-else - это оператор ?:
    // логическоеУсловие ? выражение1 : выражение2
//    public static int max (int x, int y){
//        return x > y ? x : y;
//    }
//    public static int max (int x, int y, int z){
//        return max(z, max(x, y));
//    }

    // Неограниченное кол-во аргументов
    // В метод max будет передан массив интов
//    public static int max (int... args){
//        int max = args[0];
//        for (int i = 0; i < args.length ; i++) {
//            if(max < args[i]){
//                max = args[i];
//            }
//        }
//        return max;
//    }

    public static int max (int... args){
        return checkMax(args, args.length - 1);
    }

    //Выводим по номеру элемент массива
    public static int checkMax(int[] args, int num){
        if(num == 0) {
            return args[0];
        }
        return checkMax(args, num - 1) > args[num] ? checkMax(args, num - 1) : args[num];
    }


    public static void main(String[] args) {
        System.out.println(max(5, 5, 89, 1, 111111, 4));


    }
}
