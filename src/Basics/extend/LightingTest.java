package Basics.extend;

public class LightingTest {
    public static void main(String[] args) {
        Iphone11 iphone11 = new Iphone11();
        Ipad10 ipad10 = new Ipad10("ipad10", 599.99);
        System.out.println("------------------iphone11 test-----------------");
        lightingConnectorTest(iphone11, "iphone11");
        bluetoothTest(iphone11);
        fastChargeTest(iphone11);

        System.out.println("------------------ipad10 test-----------------");
        lightingConnectorTest(ipad10, "ipad10");
        bluetoothTest(ipad10);
//        fastChargeTest(ipad10); // 没实现快充接口，编译不通过

        System.out.println("------------------miscellaneous-----------------");
        System.out.println("interface non-static variable through class: " + Lighting.lightingUUID);
        System.out.println("interface non-static variable through obj: " + iphone11.lightingUUID);
        System.out.println("interface non-static variable through class: " + Lighting.lightingUUID);
        System.out.println("interface non-static variable through obj: " + iphone11.lightingUUID);
        Lighting.staticLighting();
        System.out.println("makeName: " + ipad10.makeName);
        System.out.println("price: " + ipad10.price + "$");


    }

    public static void lightingConnectorTest(Lighting device, String msg){
        System.out.println("--------lighting---------");
        device.connect();
        device.charge();
        device.fileTransfer(msg);
    }

    public static void bluetoothTest(bluetooth bluetoothDevice){
        System.out.println("--------bluetoothTest---------");
        bluetoothDevice.connectToAirpods();
        bluetoothDevice.playMusic();
    }

    public static void fastChargeTest(fastChargeLighting fastChargelit){
        System.out.println("--------fastCharge---------");
        fastChargelit.fastCharge();
        fastChargelit.charge();
        fastChargelit.connect();
    }
}
