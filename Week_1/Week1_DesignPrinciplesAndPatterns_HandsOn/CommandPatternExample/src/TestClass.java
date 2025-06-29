public class TestClass {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl control = new RemoteControl();

        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        control.setCommand(onCommand);
        control.pressSwitch();

        control.setCommand(offCommand);
        control.pressSwitch();
    }
}
