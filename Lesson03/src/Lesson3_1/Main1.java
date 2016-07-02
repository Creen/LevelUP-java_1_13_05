package Lesson3_1; /**
 * Created by Tesla on 07.06.2016.
 */


/**
 * Created by vladimir on 31.05.16.
 */
public class Main1 {
    public static void main(String[] args) {

//        int[] array = new int[100];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 100);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        //Sorting
//        //Пар за один пробег: N-1
//        //Пробегов: N-1
//        for (int j = 0; j < array.length - 1; j++) {
//            //Пробег ->
//            for (int i = 0; i < array.length - 1 - j; i++) {
//                if (array[i] > array[i + 1]) {
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                }
//            }
//            //
//        }
//        //
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

//        Contact vasya; //объявление
//        vasya = new Contact(); //инициализация
        Contact vasya = new Contact();
        vasya.name = "Vasya";
        vasya.phone = "+78398457893";
        vasya.email = "fkgjh@gkfgd.ri";

        vasya.phone = "+73453459804";

        vasya.print();

        String toOutput = vasya.string();
        int res = 5 + 2;

//        file.write(toOutput);
//        textField.setText(toOutput);

        Contact vasya2 = new Contact();
        vasya2 = vasya;
        vasya2.email = "AAAA@AAA.RU";
        vasya.email = "bbbbbb";

        vasya.print();

        char first = vasya.name.toCharArray()[0]; // так можно получить первый символ char имени

        int[] array = new int[10];
        String[] strArray = new String[10];
        Contact[] contacts = new Contact[10];

//        for (int i = 0; i < contacts.length; i++) {
//            contacts[i] = new Contact();
//        }
//
//        contacts[0].name = "Alex";
//        contacts[0].phone = "43545";
//        contacts[0].email = "fdfgdfgdf@fdfgd.gfg";
//
//        //...[1]...[2]...
//
//        for (int j = 0; j < contacts.length - 1; j++) {
//            //Пробег ->
//            for (int i = 0; i < contacts.length - 1 - j; i++) {
//                int minLength = contacts[i].name.length(); //Math.min(contacts[i].name.length(), contacts[i+1].name.length());
//                if (minLength > contacts[i+1].name.length()) {
//                    minLength = contacts[i+1].name.length();
//                }
//                for (int k = 0; k < minLength; k++) {
//                    char left = contacts[i].name.toCharArray()[k];
//                    char right = contacts[i + 1].name.toCharArray()[k];
//                    if (left > right) {
//                        //надо менять контакты i и i+1
//                        Contact temp = contacts[i];
//                        contacts[i] = contacts[i + 1];
//                        contacts[i + 1] = temp;
//                        break;
//                    }
//                }
//            }
//            //
//        }
//
//        //Alex
//        //Alexandr
//
//        for (int i = 0; i < contacts.length; i++) {
//            System.out.println(contacts[i].name + " " + contacts[i].phone);
//        }

        /*
        javarush.ru
        HeadFirst "Изучаем Java"
        stepic.org
        Алгоритмы и структуры данных:
        Роберт Лафоре
        Роберт Седжвик
        ДЗ
        1) Создаете 10 объектов класса Contact с разными именами, телефонами и email
            (настоятельно рекомендую записать их в массив)
        2) Вывести все объекты на экран
        3) Модифицировать алгоритм сортировки пузырьком для сортировки контактов
            в массиве по алфавиту (по первой букве)
        4) Вывести отсортированный массив на экран
         */
    }
}