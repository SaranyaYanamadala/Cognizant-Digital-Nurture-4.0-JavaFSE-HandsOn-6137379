public class TestClass {
    public static void main(String[] args) {
        StockMarket subject = new StockMarket();
        Observer mobile_observer = new MobileApp("Mobile Observer");
        subject.register(mobile_observer);

        Observer web_observer = new WebApp("Web Observer");
        subject.register(web_observer);

        subject.setState(42);
        subject.deregister(web_observer);
        subject.setState(100);

    }
}
