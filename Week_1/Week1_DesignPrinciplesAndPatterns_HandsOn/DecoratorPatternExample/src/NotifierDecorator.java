public abstract class NotifierDecorator implements Notifier{
    private Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public String send() {
        return notifier.send();
    }
}
