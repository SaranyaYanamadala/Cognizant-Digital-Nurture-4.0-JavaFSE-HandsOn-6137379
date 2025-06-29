public class MobileApp implements Observer {
    public String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(int state) {
        System.out.println(name + ": Received update. New state is " + state);
    }
}
