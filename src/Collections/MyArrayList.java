package Collections;

public class MyArrayList {
    private String[] array = new String[10]; // массив.
    private int size = 0; //переменная которая хранит кол-во элементов

    public void add(String s) {   //метод который принимает строку. берем строку и вставляет в массив с индексом size
        array[size] = s;    // наш массив с индексом сайз и присваеваем значение строки
        size++; //увлеичиваем сайз на 1
        if (size == array.length) { //если размер стал равным размеру массива
            String[] newArray = new String[array.length * 2]; //создаем новый массив, в два раза больше.
            for (int i = 0; i < array.length; i++) { //цикл копирования
                newArray[i] = array[i];// из первого массива во второй
            }
            array = newArray; //присваиваем нашу массиву, значение нового массива.
            //когда доходим до конца массива и добавлять уже некуда, создаем новый массив и копируем в него старый.
        }
    }

    public void remove(int index) { //удаляет элемент по его индексу.
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) { //берем все элементы, начиная от индекса который мы передали. и проходимся до пре
                //дпоследнего эелемента
                array[i] = array[i + 1];//берем элемент массива с индексом i и присваиваем i +1
            }
            size--; //и уменьшаем размер массива на 1.
        }
    }

    public void remove(String s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals(array[i])) {
                index = i;
                break;
            }

        }
        if (index != -1) {
            remove(index);
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return "Элемент не найден";
        }
    }


}
