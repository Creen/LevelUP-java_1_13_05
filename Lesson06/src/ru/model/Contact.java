package ru.model;

/**
 * Created by Tesla on 01.06.2016.
 */
//private не не наследуется
public class Contact {
    //Поля класса - описывают состояние объекта
    private String phone;  // инкапсуляция
    private String name;
    private String email;
    private int age;
    private int numbersCount;

    //Конструктор - это метод, который вызывается единственный раз при создании объекта
    //Конструктор именнуется как класс, в котором он имееннуется
    //У конструктора нет и не может быть возвращаемого значения
    public Contact(String name){
        this.name = name;
    }
    public Contact(int age){
        this.age = age;
    }

    /*
    Полиморфизм (перегрузка)
    Условия перегрузки методов:
    1) Количество параметров разное
    2) Разные типы параметров
    3) Порядок типов
     */
    public Contact(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    public void print(){
        System.out.println(string());
    }
    public String string(){
        return name + " " + phone + " " + email + " " + age;
    }
    //Сеттер
    public void setNumbersCount (int count){
        numbersCount = count;
    }

    public void setPhone (String phone){
        this.phone = phone;
    }
    public void setEmail (String email){
        this.email = email;
    }
//    public void setName(String name){
//        this.name = name;
//    }
    //Геттер
    public String getName(){
        return name;
    }


}

