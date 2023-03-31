package Interface;

import java.lang.reflect.Type;

public class Computer {
    public void transferOut(Usb usb){
//        Type name = usb.GetType();
        usb.startTrans();
        for(int i=0; i < 2; i++){
            System.out.println("in transitioning~~~~~" + usb.getClass());
        }
        usb.stopTrans();
    }
}
