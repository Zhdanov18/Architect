package lesson3.builder;

public class Processor implements Device {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}
