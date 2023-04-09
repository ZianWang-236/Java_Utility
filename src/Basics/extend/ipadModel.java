package Basics.extend;

public abstract class ipadModel implements Lighting{
    String makeName;
    double price;

    public ipadModel() {
    }

    public ipadModel(String makeName, double price) {
        this.makeName = makeName;
        this.price = price;
    }

    @Override
    public void connect() {
        System.out.println("iphone11 connected");
    }

    @Override
    public void charge() {
        System.out.println("iphone11 charging");
    }

}
