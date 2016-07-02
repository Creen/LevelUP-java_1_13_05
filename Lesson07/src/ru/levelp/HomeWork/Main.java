package ru.levelp.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        ArrayList<DetailContact> contacts = new ArrayList<DetailContact>();  // коллекция контактов

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
                System.out.print("Enter address: ");
                String addressSc = sc.next(); // считываем address
                System.out.print("Enter workplace: ");
                String workplaceSc = sc.next(); // считываем workplace
                System.out.print("Enter phone: ");
                String phoneSc = sc.next(); // считываем phone

                menu.Menu1(); // предлагаем добавить еще нормер

                DetailContact dataUser = new DetailContact();
                dataUser.setName(nameSc);
                dataUser.setEmail(emailSc);
                dataUser.setAddress(addressSc);
                dataUser.setWorkpale(workplaceSc);

                while (true){
                    choice = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
                    if(choice == 6) {
                        System.out.print("Enter phone: ");
                        phoneSc = sc.next(); // считываем phone
                        dataUser.addPhone(phoneSc);
                        contacts.add(dataUser);
                        menu.Menu1(); // предлагаем добавить еще нормер
                    }else if(choice == 5){
                        menu.Menu();
                        break;
                    }
                }

            } else if (choice == 2) {

                System.out.println();
                menu.Menu();
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
