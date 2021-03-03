package HomeWork_6;
/*Вывести все нечетные числа от 100 до 1000,
 которые деляется без остатка на 5.
 */
public class Loop {
    public static void main(String[] args) {
        for(int i = 100; i <= 1000; i++){
            if(i % 2 == 1 && i % 5 == 0 ){
                System.out.println(i);
            }
        }
    }
}
