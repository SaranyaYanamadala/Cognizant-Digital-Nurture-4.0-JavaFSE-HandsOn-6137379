public class TestClass {
    public static void main(String[] args) {
        // creating a personal computer
        Computer personalPC = new Computer.ComputerBuilder()
                                .setCPU("Intel i5")
                                .setRAM("8GB")
                                .setStorage("512GB SSD")
                                .build();
        
        personalPC.getSpecifications();

        // creating a gaming computer
        Computer gamingPC = new Computer.ComputerBuilder()
                            .setCPU("Intel i9")
                            .setRAM("32GB")
                            .setStorage("1TB SSD")
                            .build();

        gamingPC.getSpecifications();
    }
}
