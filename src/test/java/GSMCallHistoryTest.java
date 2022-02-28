import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class GSMCallHistoryTest {
    protected double pricePerMinute;
    @Before
    public void setUp() {
        pricePerMinute=0.37;
    }

    @Test
    public void testGSMCallHistory() {
    Call call1=new Call(LocalDate.now(), LocalTime.now(),1,"0343431343");
    Call call2=new Call(LocalDate.now(), LocalTime.now(),3,"0986313433");
    Call call3=new Call(LocalDate.now(), LocalTime.now(),21,"0763445233");
    Battery battery1 = new Battery("RBL A 091",24,10,BatteryType.LiIon);
    Display display1 = new Display((float) 9.2,2);
    GSM iphone11 = new GSM("IPHONE 11 PRO","Apple",1699.9,"Apple",battery1,display1);
    System.out.println("Init instance of GSM:\n"+iphone11);

    iphone11.addCall(call1);
    iphone11.addCall(call2);
    iphone11.addCall(call3);
    ArrayList<Call> callHistory=iphone11.getCallHistory();
    System.out.println("Display callHistory of GSM:");
    for (Call call:callHistory){
        System.out.println(call.toString());
    }
    System.out.println("Total price of GSM Call History:" + iphone11.calculateTotalCallsPrice(pricePerMinute));

    iphone11.removeLongestCallHistory();
    System.out.println("Instance of GSM after remove longest call:\n"+iphone11);
    iphone11.clearCallHistory();
    System.out.println("Instance after clear call history:\n"+iphone11);

    }
}
