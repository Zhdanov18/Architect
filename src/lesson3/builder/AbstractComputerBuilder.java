package lesson3.builder;

public abstract class AbstractComputerBuilder {
    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public AbstractComputerBuilder create() {
        computer = new Computer();
        return this;
    }

    public abstract AbstractComputerBuilder buildMotherboard();
    public abstract AbstractComputerBuilder buildProcessors();
    public abstract AbstractComputerBuilder buildMemories();
    public abstract AbstractComputerBuilder buildStorages();
}
