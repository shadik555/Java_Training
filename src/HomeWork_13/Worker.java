package HomeWork_13;

public class Worker {
    String name;
    String position;
    Double salary;

    public Worker(String name, String position, Double salary) { //инициализация полей метода.
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo(int month){
        return "Имя: " + name + "\nДолжность: " + position + "\nЗарплата за " + month  + " месяцев: "+ month *salary;
    }
}
