package exercise1.exe1_5;

public class TestMain {
    public static void main(String[] args) {
        Animal animal  = new Animal("dog");
        Mammals mammals =  new Mammals("cat");
        System.out.println(animal);
        System.out.println(mammals);

        //test cat
        Cat cat = new Cat("pipo");
        cat.greets();
        System.out.println(cat.toString());
        //test dog
        Dog dog1 = new Dog("milo");
        dog1.greets();
        System.out.println(dog1.toString());
        Dog dog2 = new Dog("thuong") ;
        dog2.greets(dog2);
        System.out.println(dog2);

    }
}
