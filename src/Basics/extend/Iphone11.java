package Basics.extend;

public class Iphone11 implements fastChargeLighting, bluetooth{
    @Override
    public void connect() {
        System.out.println("iphone11 connected");
    }

    @Override
    public void charge() {
        System.out.println("iphone11 charging");
    }

    @Override
    public void fileTransfer(String file) {
        System.out.println("iphone11 received file: " + file);
    }

    @Override
    public void fastCharge() {
        System.out.println("iphone11 fast-charging");
    }

    @Override
    public void connectToAirpods() {
        System.out.println("iphone11 connect to airpods");
    }

    @Override
    public void playMusic() {
        System.out.println("iphone11 playing music");
    }
}
