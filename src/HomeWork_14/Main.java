package HomeWork_14;
/*Создать класс Монстр, с 3-мя полями типа int(колво глаз , ног и рук). Создать 4 конструктора:
(1 пустой. (2 с 1-им параметром) (3 с 2-мя параметрами) (4 с 3-мя параметрами)
Если в параметрах конструктора не устанавливается какое-то значение, то установить его равным 2.
Создать методы: void voice(),который выводит на экран слово "голос"
void voice(int i) выводит слово голос i раз
void voice(int i, String word) выводит слово word i раз.
 */
public class Main {
    public static void main(String[] args) {
        Monstr monstr = new Monstr(2,4,4);
        monstr.voice();
        monstr.voice(2);
        monstr.voice(2,"Hello!");
    }
}
