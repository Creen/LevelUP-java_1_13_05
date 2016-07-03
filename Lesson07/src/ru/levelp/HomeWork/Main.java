package ru.levelp.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        ArrayList<Contact> contacts = new ArrayList<Contact>();  // коллекция контактов

        Scanner sc = new Scanner(System.in); // создаем сканер
        Menu menu = new Menu(); // создаем меню
        menu.Menu(); // Меню_1 программы

        while (true) {

            int choice = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную

            if (choice == 1) {
                System.out.print("Enter name: ");
                String nameSc = sc.next(); // считываем имя
                System.out.print("Enter email: ");
                String emailSc = sc.next(); // считываем email
//                System.out.print("Enter address: ");
//                String addressSc = sc.next(); // считываем address
//                System.out.print("Enter workplace: ");
//                String workplaceSc = sc.next(); // считываем workplace
                System.out.print("Enter phone: ");
                String phoneSc = sc.next(); // считываем phone

                Contact User = new Contact();
                User.setName(nameSc);
                User.setEmail(emailSc);
                User.addPhone(phoneSc);

                menu.Menu1(); // предлагаем добавить еще нормер

                while (true){
                    choice = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
                    if(choice == 6) {
                        System.out.print("Enter phone: ");
                        phoneSc = sc.next(); // считываем phone
                        User.addPhone(phoneSc);
                        contacts.add(User);
                        menu.Menu1(); // предлагаем добавить еще номер
                    }else if(choice == 5){
                        break;
                    }
                }
                menu.Menu();

            } else if (choice == 2) {
                for (int i = 0; i < contacts.size(); i++) {

                }
//                menu.Menu();
            } else if (choice == 3) {
                System.out.print("Enter name: ");
                String nameDelete = sc.next(); // считываем имя

                for (int i = 0; i < contacts.size(); i++) {
                    if (contacts.get(i).getName().equals(nameDelete)) {
                        contacts.remove(i);
                        break;
                    }
                }
                System.out.println("Successfully");
                System.out.println();
                menu.Menu();
            } else if (choice == 4) {
                break;
            }
        }
    }
}

/*
 while (true){
                    choice = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
                    if(choice == 6){
                        System.out.print("Enter phone: ");
                        int phoneNew = sc.nextInt(); // считываем phone
                        DetailContact user = new DetailContact(name, email, address, workplace, phoneNew); // записали пользователя

                        contacts.add(user);// добавляем в коллекцию контактов
                        System.out.println("Do you want to enter another number?\n " +  // предлагаем ввести еще номер
                                "5)No\n " +
                                "6)Yes");
                        System.out.print("Enter: ");
                    } else if(choice == 5){
                        DetailContact user = new DetailContact(name, email, address, workplace, phone); // записали пользователя
                        contacts.add(user);// добавляем в коллекцию контактов
                        menu.Menu(); // Меню программы
                        break;
                    }
                }
 */
