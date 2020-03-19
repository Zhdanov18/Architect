package lesson3.builder;

import java.util.ArrayList;
import java.util.List;

public class OfficeComputerBuilder extends AbstractComputerBuilder {
    @Override
    public AbstractComputerBuilder buildMotherboard() {
        Motherboard motherboard = new Motherboard("ASUS PRIME H310M-R R2.0");
        computer.setMotherboard(motherboard);
        return this;
    }

    @Override
    public AbstractComputerBuilder buildProcessors() {
        List<Processor> processors = new ArrayList<>();
        processors.add(new Processor("Intel Core i3-9100F"));
        computer.setProcessors(processors);
        return this;
    }

    @Override
    public AbstractComputerBuilder buildMemories() {
        List<Memory> memories = new ArrayList<>();
        memories.add(new Memory("Hynix [H5AN4G8NMFR-UHC]", 4));
        computer.setMemories(memories);
        return this;
    }

    @Override
    public AbstractComputerBuilder buildStorages() {
        List<Storage> storages = new ArrayList<>();
        storages.add(new Storage("A-Data SU635 [ASU635SS-240GQ-R]", 240));
        computer.setStorages(storages);
        return this;
    }
}
