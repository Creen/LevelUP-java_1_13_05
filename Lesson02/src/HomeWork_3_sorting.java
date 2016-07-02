/**
 * Created by Tesla on 29.05.2016.
 */
public class HomeWork_3_sorting {
    public static void main(String args[]) {
        // создаем массив
        int[] masSort = new int[10];

        // прогоняем через цикл, заполняем и выводим от -10 до 10
        for (int i = 0; i < masSort.length; i++) {
            masSort[i] = (int)(Math.random()*20 - 10);
            System.out.print(masSort[i] + " ");
        }
        // переход на новую строку
        System.out.println();
        // запускаем сортировку
        for (int i = 0; i < masSort.length; i++) { //запускаем метод пузырька
            for(int j = masSort.length-1 ; j > 0 ; j--){  // запуск для первого эл. и прохода по нему
                for(int k = 0 ; k < j ; k++){             // это для второо эл. и прохода по нему + сравнение
                    if( masSort[k] > masSort[k+1] ){      // если предыдущий эл.массива больше
                        int value = masSort[k];           // то записываем его в целоечисленное значение
                        masSort[k] = masSort[k+1];        // а на самом деле они равны
                        masSort[k+1] = value;             // то записываем его
                    }
                }
            }
            System.out.print(masSort[i] + " ");
        }

//        bubbleSort(masSort);
//        for(int i = 0; i <  masSort.length; i++) {
//            System.out.print(masSort[i] + "  ");
//        }
    }
}
