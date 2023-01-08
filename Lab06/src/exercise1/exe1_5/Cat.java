package exercise1.exe1_5;

public class Cat extends Mammals{
    public Cat(String name) {
        super(name);
    }
    public void greets() {
        System.out.println("meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
