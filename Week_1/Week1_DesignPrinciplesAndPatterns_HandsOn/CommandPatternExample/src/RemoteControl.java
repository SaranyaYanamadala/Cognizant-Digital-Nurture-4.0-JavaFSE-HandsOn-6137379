public class RemoteControl {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressSwitch() {
        this.command.execute();
    }
}
