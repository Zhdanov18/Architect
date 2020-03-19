package lesson3.builder;

public class Motherboard implements Device {
    private String model;

    public Motherboard(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}
