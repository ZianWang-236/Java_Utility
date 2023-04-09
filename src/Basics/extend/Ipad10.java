package Basics.extend;

public class Ipad10 extends ipadModel implements bluetooth{
    public Ipad10(){
        super();
    }

    public Ipad10(String makeName, double price) {
        super(makeName, price);
    }

    @Override
    public void fileTransfer(String file) {
        System.out.println("iphone11 received file: " + file);
    }

    @Override
    public void connectToAirpods() {
        System.out.println("ipad10 connect to airpods");
    }

    @Override
    public void playMusic() {
        System.out.println("ipad10 playing music");
    }
}
