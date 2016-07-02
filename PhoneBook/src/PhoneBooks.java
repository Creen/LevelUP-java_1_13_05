import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBooks {
    public static void main(String args[]) {

        ArrayList<Contact> contacts = new ArrayList<Contact>();  // коллекция контактов
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Phone Book\n" +
                    "    Menu:\n" +
                    "    1) Add contact\n" +
                    "    2) Show all contacts\n" +
                    "    3) Delete contact (by name)\n" +
                    "    4) Exit");
            System.out.print("Enter: ");
            int choice = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную

            if (choice == 1) {
                System.out.print("Enter name: ");
                String nameScanner = sc.next(); // считываем имя
                System.out.print("Enter phone: ");
                String phoneScanner = sc.next(); // считываем телефон
                System.out.print("Enter email: ");
                String emailScanner = sc.next(); // считываем email

                Contact namePhoneEmail = new Contact();
                namePhoneEmail.name = nameScanner;
                namePhoneEmail.phone = phoneScanner;
                namePhoneEmail.email = emailScanner;
                contacts.add(namePhoneEmail); // добавляем в коллекцию
                System.out.println("Successfully");
                System.out.println();
            } else if (choice == 2) {
                for (int i = 0; i < contacts.size(); i++) {
                    System.out.println(contacts.get(i).name + " " + contacts.get(i).phone + " " +
                            contacts.get(i).email); // вывод записанного контакта
                }
                System.out.println();
            } else if (choice == 3) {
                String nameDelete = sc.next(); // считываем имя

                for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).name.equals(nameDelete)){
                        contacts.remove(i);
                            break;
                    }
                }
                System.out.println("Successfully");
                System.out.println();
            } else if (choice == 4) {
                break;
            }
        }
    }
}

