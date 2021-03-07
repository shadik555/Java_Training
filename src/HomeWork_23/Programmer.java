package HomeWork_23;

public class Programmer extends Worker implements CodeWritable {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void writecode() {
        System.out.println("Write code");
    }
}
