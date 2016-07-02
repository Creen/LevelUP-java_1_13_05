package ru.levelp.HomeWork;

/**
 * Created by Tesla on 18.06.2016.
 */
public class Menu {
    public void Menu(){
        System.out.println("Phone Book\n" +
                "    Menu:\n" +
                "    1) Add contact\n" +
                "    2) Show all contacts\n" +
                "    3) Delete contact (by name)\n" +
                "    4) Exit");
        System.out.print("Enter: ");
    }
    public void Menu1(){
        System.out.println("Do you want to enter another number?\n " +  // предлагаем ввести еще номер
                "5)No\n " +
                "6)Yes");
        System.out.print("Enter: ");
    }
}
