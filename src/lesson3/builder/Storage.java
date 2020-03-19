package lesson3.builder;

public class Storage implements Device {
    private String model;
    private Integer capacity;

    public Storage(String model, Integer capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    @Override
    public String getModel() {
        return model;
    }
}
