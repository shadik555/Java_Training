package Collections;

public class main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Никита");
        employees.add("Игорь");
        employees.add("Ваня");
        employees.add("Максим");
        employees.add("Ирина");
        employees.add("Viktorya");
        employees.remove("Ирина");
        employees.remove("Никита");

        for(int i = 0; i < employees.getSize(); i++){
            System.out.println(employees.get(i));
        }

    }
}