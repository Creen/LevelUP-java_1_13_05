package ru.levelp;

import ru.levelp.shapes.MultiAngle;
import ru.levelp.shapes.Rectangle;
import ru.levelp.shapes.Shape2D;
import ru.levelp.shapes.SquareAsRect;

import java.util.ArrayList;

/**
 * Created by Tesla on 17.06.2016.
 */
public class Main {
    public static void main(String args[]) {

//        MultiAngle shape = new MultiAngle(6); // углы
//        shape.setColor(0xffffff);

//        Rectangle rect = new Rectangle(10, 5);
//        System.out.println("S rect = " + rect.getS());
//
//        rect.setWidth(35);
//        System.out.println("S rect = " + rect.getS());
//
//        SquareAsRect squareAsRect = new SquareAsRect();
//        squareAsRect.setWidth(25);
//        System.out.println("S square = " + squareAsRect.getS());
//
//        // Shape2D shape2D = new Shape2D();// можно создать, но не нужно abstract блокирует это.
//
//        rect.draw();
//        squareAsRect.draw();

        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        ArrayList<SquareAsRect> squareAsRects = new ArrayList<SquareAsRect>();
        ArrayList<MultiAngle> multiAngles = new ArrayList<MultiAngle>();

        rectangles.add(new Rectangle(23, 545));
        multiAngles.add(new MultiAngle(8));
        squareAsRects.add(new SquareAsRect(20));
        //лучше так, через наследование
        ArrayList<Shape2D> shapes = new ArrayList<Shape2D>();
        // ArrayList<Object> shapes = new ArrayList<Object>(); // не нужно так делать
        Rectangle rect = new Rectangle(34, 65);
        shapes.add(rect);
        shapes.add(new SquareAsRect(45));
        shapes.add(new MultiAngle(7));

        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw();
            System.out.println("S = " + shapes.get(i).getS()); //Нам важно просто нарисовать фигуры, без методов фигур
        }

        rect.getWidth();
//        shapes.get(0).getWidth();

        // Пример без коллекции , полиморфизм
        Shape2D multiAngle = new MultiAngle(8);
//        multiAngle.getAngleCount(); // потомучто ссылка shape

        Object obj = new Rectangle(23, 54);
        System.out.println(obj); // System.out.println(obj.toString());
        System.out.println(rect);

        SquareAsRect square = new SquareAsRect(324);
        System.out.println(square);


    }
}
/*
В телефонной книге добавляем:
после ввода телефона программа пердлагает ввести еще номер, а затем еще...

При выводе всех контактов, формат вывода меняется в зависимости от того, что номер
у контакта один или несколько

Если номер один, то строчка контакта выглятит так:
  Name phone email address workplace
Если номеров несколько, то выод такой:
  Name email address workplace
  <--- phones--->
  phone 1
  phone 2
  ...
  <<< Names's phones >>> //чьи номера выывелись
  будет 1 клвсс user в нем коллекция телефонов


  Еще один класс новыый DetailContact
       добавляется адрес, и место работы

       contacts main detail contact
 */