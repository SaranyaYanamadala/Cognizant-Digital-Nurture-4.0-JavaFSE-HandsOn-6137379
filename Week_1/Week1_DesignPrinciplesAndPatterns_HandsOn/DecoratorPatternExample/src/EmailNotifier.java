public class EmailNotifier implements Notifier {
    private String msg;

    public EmailNotifier(String msg) {
        this.msg = msg;
    }

    public String send() {
        return msg;
    }
}
