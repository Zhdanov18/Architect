package lesson4;

public class Man extends Pig {
    public Man(Fruit fruit) {
        super.fruit = fruit;
    }

    public void wash() {
        System.out.println("wash " + fruit.getClass().getSimpleName());
    }
}
