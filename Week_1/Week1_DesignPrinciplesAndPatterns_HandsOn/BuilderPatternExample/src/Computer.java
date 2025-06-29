public class Computer {
    private String CPU;
    private String ram;
    private String storage;
    
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    public void getSpecifications() {
        System.out.println("CPU : " + CPU + "\nRAM : " + ram + "\nStorage : " + storage);
    }

    public static class ComputerBuilder {
        private String CPU;
        private String ram;
        private String storage;

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
