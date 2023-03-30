package Interface;

public class ssd implements Usb {

    final String deviceName = "ssd";

    public String getDeviceName() {
        return deviceName;
    }

    @Override
    public void startTrans() {
        System.out.println("start transferring data(ssd)");
    }

    @Override
    public void stopTrans() {
        System.out.println("transfer stopped(flashDrive)");
    }
}
