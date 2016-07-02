package ru.model;

import ru.UserFriend;

/**
 * Created by Tesla on 14.06.2016.
 */
public class Main {
    public  static void main (String args[]){

        Contact contact = new Contact("Vasya");
        contact.
        Contact contact1 = new Contact("Dasya");
//        contact.name = "Vasay";
//        contact.age = 99;
        new Contact(23);

        contact.setName("sdfdsf");
        System.out.println(contact.getName()); // получаем значение поля

        User user = new User();
        user.getAge();
        user.getName();

        UserFriend friend = new UserFriend();
        friend.getPhone();
        friend.getEmail();
        friend.getName();
        friend.getAge();




    }
    /*
    1)Читаем про public, private, protected, default (нет модификатора)
    - особенности относительно пакетов
    2)Создать ИЕРАРХИЮ классов геометрических фигур (2D)
      Shape2D - в этом классе поля и методы общие для всех фигур
      MultiAngle - класс - родитель всех фигур с углами
      Rectangle
      triangle
      Square
      Circle
      Oval


     */

}
