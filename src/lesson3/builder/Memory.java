package lesson3.builder;

public class Memory implements Device {
    private String model;
    private Integer volume;

    public Memory(String model, Integer volume) {
        this.model = model;
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    @Override
    public String getModel() {
        return model;
    }
}
