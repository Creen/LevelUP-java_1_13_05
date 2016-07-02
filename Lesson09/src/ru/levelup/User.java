package ru.levelup;

import java.util.Comparator;

/**
 * Created by Tesla on 01.07.2016.
 */
public class User {
    // константа public static
    public static final Comparator<User> COMP_BY_USER = new Comparator<User>() {
        @Override
        public int compare(User u1, User u2) {
            return u1.getName().compareTo(u2.getName());
        }
    };
    public static final Comparator<User> compByAge = new Comparator<User>() { //анонимный объект - создание класса в момент выполнения программы
        @Override
        public int compare(User u1, User u2) {
            //...
            return Integer.compare(u1.getAge(), u2.getAge());
        }
    };
    protected String name;
    protected int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return  age;
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    //по имени

}
