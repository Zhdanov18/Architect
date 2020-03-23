package lesson4;

public class Orange implements Fruit {
    private Integer weight;
    private String color;

    @Override
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public Integer getWeight() {
        return this.weight;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
