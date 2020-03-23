package lesson4;

public class Pig implements Animal{
    protected Fruit fruit;

    public Pig() {}

    public Pig(Fruit fruit) {
        this.fruit = fruit;
    }
    @Override
    public void eat() {
        System.out.println("eat " + fruit.getClass().getSimpleName());
    }
}
