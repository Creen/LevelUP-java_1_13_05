/**
 * Created by Tesla on 01.06.2016.
 */

    public class Main {
        public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20-10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Sorting
        //Пар за один пробег: N-1
        //Пробегов: N-1
        for (int j = 0; j < array.length - 1; j++) {
            //Пробег ->
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            //
        }
        //

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//        Contact vasya; //объявление
//        vasya = new Contact(); //инициализация
            //Contact vasya = new Contact();
//            vasya.name [2]= "Vasya";
//            vasya.phone = "+78398457893";
//            vasya.email = "fkgjh@gkfgd.ri";
//
//            vasya.phone = "+73453459804";
//
//            System.out.println(vasya.name + " " + vasya.phone + " " + vasya.email);
//
//            Contact vasya2 = new Contact();
//            vasya2 = vasya;
//            vasya2.email = "AAAA@AAA.RU";
//            vasya.email = "bbbbbb";
//
//            System.out.println(vasya.name + " " + vasya.phone + " " + vasya.email);
//
//            char first = vasya.name.toCharArray()[0]; // так можно получить первый символ char имени

        /*
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
