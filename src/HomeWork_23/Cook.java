package HomeWork_23;

public class Cook extends Worker implements Cookable {
    public Cook(String name) {
        super(name);
    }

    @Override
    public void ableToMake() {
        System.out.println("Cooking");
    }
}
