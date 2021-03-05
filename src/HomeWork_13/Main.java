package HomeWork_13;
/*Создать класс работник, в котором будет 3 поля: имя, должность и ЗП. В конструкторе с параметрами
проинициализировать все поля.
Добавить метод с параметром int , тип возвращаемого значения String, который возвращает инфу о работнике,
а также о сумме зарплаты, которую он получил за i месяцев(значение i передается в качестве параметра)
 */
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Ivan","Senior developer", 2500.5);
        System.out.println(worker1.getInfo(5));
    }
}
