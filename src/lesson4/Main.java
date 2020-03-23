package lesson4;

public class Main {
// Предметная область: кормим свиней и людей фруктами. Отличие человека от свиньи - умение мыть фрукты
// По замыслу, это должен быть мост: любые фрукты могут есть любые животные
    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();

        Pig pig = new Pig(orange);
        pig.eat();

        Man man = new Man(apple);
        man.wash();
        man.eat();
    }
}
