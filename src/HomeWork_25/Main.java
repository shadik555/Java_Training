package HomeWork_25;

import HomeWork_7.Array;

/*Создать исключительную ситуацию, при которой будет брошено исключение IndexOutOfBoundsException(выход за пределы массива)
Обработать ее в блоке try catch и вывести сообщение "выход за пределы массива".
 */
public class Main {
    public static void main(String[] args) {
        try {
            int[] array = new int[10];
            System.out.println(array[25]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
}
