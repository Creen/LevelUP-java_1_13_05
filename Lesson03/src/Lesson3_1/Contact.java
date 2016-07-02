package Lesson3_1;

/**
 * Created by Tesla on 07.06.2016.
 */
public class Contact {
    //Поля класса - описывают состояние объекта
    String phone;
    String name;
    String email;

    //Поведение объекта - это методы

    public void print() {
        System.out.println(name + " " + phone + " " + email);
    }

    //Перед именем метода необходимо писать тип возвращаемого значения
    public String string() {
        String outputString = name + " " + phone + " " + email;
        return outputString;
    }

}