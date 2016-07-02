package ru.levelup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Tesla on 01.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<User> users= new ArrayList<User>();

        users.add(new User("Anna", 39));
        users.add(new User("Dima", 16));
        users.add(new User("Dima", 10));
        users.add(new User("Anna", 17));

        //код вывода всех юзеров
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
        System.out.println();


//        Comparator<User> COMP_BY_USER = new Comparator<User>() {
//            @Override
//            public int compare(User u1, User u2) {
//                return u1.getName().compareTo(u2.getName());
//            }
//        };


//        Comparator<User> compByAge = new Comparator<User>() { //анонимный объект - создание класса в момент выполнения программы
//            @Override
//            public int compare(User u1, User u2) {
//                //...
//                return Integer.compare(u1.getAge(), u2.getAge());
//            }
//        };

        //Замена анонимным объектам
        //Лямбда-выражения заменяют анонимный объект, который
        //  оздается от интерфейса с ОДНИМ методом
        Comparator<User> lambdaCompByAge = (u1, u2) -> {
            //...
            return Integer.compare(u1.getAge(), u2.getAge());
        };

//        Collections.sort(users, compByAge);
//        Collections.sort(users, COMP_BY_USER);
        Collections.sort(users, User.compByAge);
        Collections.sort(users, User.COMP_BY_USER);


        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
        System.out.println();

        //Тестим Лямбды
        WithArgs firstLambda = (a, b, c) -> System.out.println(a + b + c);
        firstLambda.method(3, 4, 5);

        WithArgs secondLambda = (a, b, c) -> {
            int result = a * b * c;
            if(result % 2 == 0){
                System.out.println("a * b * c - четное");
            } else {
                System.out.println("a * b * c - нечетное");
            }
        };
        secondLambda.method(5, 3 ,2);

        WithOutArgs withOutArgs = () -> System.out.println("not args");

        // в методе args тут value и без return
        WithReturnedValue returnedValue = value ->  Math.abs(value);
        WithReturnedValue returnedSuperValue = Math::abs;
        returnedValue.method(-10);

//        WithReturnedValue withReturnedValue = value ->  Math.abs(value);



    }

}

//анонимные объекты - лямбда
