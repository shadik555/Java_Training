package HomeWork_20;
/*Создать 3 коллекции.В первой 10 чисел, во второй 10 имен(произвольные значения), третья должна автоматически
заполняться строками , которые содержат число из первой коллекции, потом знак тире и строку из второй коллекции
Вывести все значения второй коллекции в цикле for each.
 */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); //лист на 10 чисел
        ArrayList<String> names = new ArrayList<>();//лист на 10 имен
        ArrayList<String> NamesAndNumbers = new ArrayList<>(); //лист на вывод чисел-имен.
            for(int i = 1; i <= 10; i++){ //заполнение листа чисел числами от 1 до 10.
                numbers.add(i);
            }
        names.add("Паша");
        names.add("Сергей");
        names.add("Иван");
        names.add("Олег");
        names.add("Максим");
        names.add("Слава");
        names.add("Дима");
        names.add("Оксана");
        names.add("Вика");
        names.add("Елена");
        for(int i = 0; i < numbers.size(); i++){ //цикл заполнения 3 листа числами(1лист) - именами(2лист)
            String s = numbers.get(i) + " - "+names.get(i);
            NamesAndNumbers.add(s); //добавление в 3 лист 1и2 листа.
        }
        for(String s: NamesAndNumbers){ //вывод всех значений через foreach
            System.out.println(s);
        }


    }
}
