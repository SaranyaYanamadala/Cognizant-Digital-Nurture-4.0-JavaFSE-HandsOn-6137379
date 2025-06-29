public class TestClass {
    public static void main(String[] args) {
        Notifier notification = new EmailNotifier("Notification sent.");
        Notifier smsNotification = new SMSNotifierDecorator(notification);
        System.out.println(smsNotification.send());

        Notifier slackNotification = new SlackNotifierDecorator(notification);
        System.out.println(slackNotification.send());
    }
}
