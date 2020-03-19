package lesson3.builder;

public class Main {
    public static void main(String[] args) {
        OfficeComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();

        officeComputerBuilder.create()
                .buildMotherboard()
                .buildProcessors()
                .buildMemories()
                .buildStorages();
    }
}
