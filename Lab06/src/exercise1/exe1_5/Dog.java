package exercise1.exe1_5;

public class Dog extends Mammals{
    public Dog(String name) {
        super(name);
    }
    public void greets() {
        System.out.println("Woof");
    }
    public void greets ( Dog another) {
        System.out.println("wooofff");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
