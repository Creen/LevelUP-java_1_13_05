/**
 * Created by Tesla on 28.05.2016.
 */
public class HomeWork_1 {
    public static void main (String args[]){

        int[] intArray = new int[10];

         for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 1397 - 1230); //от -1230 до 167
             System.out.print(intArray[i] + " ");
        }
            int min = intArray[0];
            int max = min;
            for (int i = 1; i < intArray.length; i++) {
                if (intArray[i] > max) {
                    max = intArray[i];
                }
                if (intArray[i] < min) {
                    min = intArray[i];
                }
            }
        System.out.println("\n Минимальное значение в массиве: " + min);
    }
}
