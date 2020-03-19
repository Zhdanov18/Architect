package lesson3.builder;

import java.util.List;

public class Computer {
    private Motherboard motherboard = null;
    private List<Processor> processors = null;
    private List<Memory> memories = null;
    private List<Storage> storages = null;

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setProcessors(List<Processor> processors) {
        this.processors = processors;
    }

    public void setMemories(List<Memory> memories) {
        this.memories = memories;
    }

    public void setStorages(List<Storage> storages) {
        this.storages = storages;
    }
}
