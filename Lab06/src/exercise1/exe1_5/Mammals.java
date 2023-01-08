package exercise1.exe1_5;

public class Mammals extends Animal{
    public Mammals(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammals[" + super.toString() + "]";
    }
}
