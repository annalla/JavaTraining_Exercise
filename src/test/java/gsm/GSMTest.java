package gsm;

import gsm.Battery;
import gsm.BatteryType;
import gsm.Display;
import gsm.GSM;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GSMTest {
    public static List<GSM> GSMList = new ArrayList<>();

    @BeforeClass
    public static void setUp() {
        Battery battery1 = new Battery("RBL A 091", 24, 10, BatteryType.LiIon);
        Battery battery2 = new Battery("RBL X 091", 24, 10, BatteryType.NiCd);
        Display display1 = new Display((float) 9.2, 2);
        Display display2 = new Display((float) 10.2, 1);

        GSM iphone11 = new GSM("IPHONE 11 PRO", "Apple", 1699.9, "Apple", battery1, display1);
        GSM iphoneX = new GSM("IPHONE X", "Apple", 1399.9, "Apple", battery1, display1);
        GSM samsung = new GSM("Samsung Galaxy Z Flip3", "Samsung", 999.99, "Samsung", battery2, display2);
        GSMList.add(iphone11);
        GSMList.add(iphoneX);
        GSMList.add(samsung);
    }

    @Test
    public void testGSMDisplay() {
        System.out.println("\nList of GSMs:");
        int i = 1;
        for (GSM gsm : GSMList) {
            System.out.println("\nGSM " + i + ": ");
            System.out.println(gsm.toString());
            i++;
        }
    }

    @Test
    public void testGSMStaticProperty() {
        System.out.println("\nDisplay static property:");
        System.out.println(GSM.iphone4s.toString());

    }
}
