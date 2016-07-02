/**
 * Created by Tesla on 02.06.2016.
 */
public class MainMain {
    public static void main(String args[]) {

        int amount = 10;
        Contact[] data = new Contact[amount];

        data[0] = new Contact();
        data[0].name = "Яков";
        data[0].phone = "+7 921 111-11-11";
        data[0].email = "vasya@gmail.com";

        data[1] = new Contact();
        data[1].name = "Василий";
        data[1].phone = "+7 921 222-22-22";
        data[1].email = "vasilisa@gmail.com";

        data[2] = new Contact();
        data[2].name = "Петр";
        data[2].phone = "+7 921 333-33-33";
        data[2].email = "petr@gmail.com";

        data[3] = new Contact();
        data[3].name = "Станистав";
        data[3].phone = "+7 921 444-44-44";
        data[3].email = "stanislav@gmail.com";

        data[4] = new Contact();
        data[4].name = "Евгений";
        data[4].phone = "+7 921 555-55-55";
        data[4].email = "vevgeni@gmail.com";

        data[5] = new Contact();
        data[5].name = "Фёдор";
        data[5].phone = "+7 921 666-66-66";
        data[5].email = "fedor@gmail.com";

        data[6] = new Contact();
        data[6].name = "Николай";
        data[6].phone = "+7 921 777-77-77";
        data[6].email = "nilolai@gmail.com";

        data[7] = new Contact();
        data[7].name = "Марина";
        data[7].phone = "+7 921 888-88-88";
        data[7].email = "marina@gmail.com";

        data[8] = new Contact();
        data[8].name = "Жанна";
        data[8].phone = "+7 921 999-99-99";
        data[8].email = "janna@gmail.com";

        data[9] = new Contact();
        data[9].name = "Зина";
        data[9].phone = "+7 921 000-00-00";
        data[9].email = "zina@gmail.com";

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].name + " " + data[i].phone + " " + data[i].email);
        }

        System.out.println();
        // проверка
//        for (int i = 0; i < data.length; i++) {
//            char[] first = data[0].name.toCharArray();  // так можно получить первый массив имен
//           // char first1 = data[i].name.toCharArray()[0];  // так можно получить первый символ char имени
//            System.out.println(first);
//          //  System.out.println(first1);
//        }

        for (int j = 0; j < data.length - 1; j++) {
            for (int i = 0; i < data.length - 1 - i; i++) {
                if (data[i].name.toCharArray()[0] > data[j].name.toCharArray()[0]) {
                    char temp = data[i].name.toCharArray()[0];
                    data[i].name.toCharArray()[0] = data[j].name.toCharArray()[0];
                    data[j].name.toCharArray()[0] = temp;
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].name + " " + data[i].phone + " " + data[i].email);
            //System.out.println(data.length + " ");
        }
    }
}
