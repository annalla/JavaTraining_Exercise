package gsm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class GSMCallHistoryTest {
    protected double pricePerMinute;

    @Before
    public void setUp() {
        pricePerMinute = 0.37;
    }

    @Test
    public void testGSMCallHistory() {
        Call call1 = new Call( 1200, "0343431343");
        Call call2 = new Call( -3, "0986313433");
        Call call3 = new Call( 600, "0763445233");

        Battery battery1 = new Battery("RBL A 091", 24, 10, BatteryType.LiIon);
        Display display1 = new Display((float) 9.2, 2);
        GSM iphone11 = new GSM("IPHONE 11 PRO", "Apple", 1699.9, "Apple", battery1, display1);
        System.out.println("Init instance of GSM:\n" + iphone11);

        //test add call to GSM instance
        Assert.assertTrue("Add call succeeded",iphone11.addCall(call1));
        Assert.assertTrue("Add call succeeded",iphone11.addCall(call2));
        Assert.assertTrue("Add call succeeded",iphone11.addCall(call3));

        //test display
        ArrayList<Call> callHistory = iphone11.getCallHistory();
        System.out.println("Display callHistory of GSM:");
        for (Call call : callHistory) {
            System.out.println(call);
        }
        //test calculate totalPrice of callHistory
        double totalPrice=iphone11.calculateTotalCallsPrice(pricePerMinute);
        System.out.println("Total price of GSM Call History:" + totalPrice);
        Assert.assertEquals(11.1,totalPrice,0.0001);

        //test remove Longest Call
        ArrayList<Call> expectedCallHistory =new ArrayList<>();
        expectedCallHistory.add(call2);
        expectedCallHistory.add(call3);
        iphone11.removeLongestCallHistory();
        Assert.assertArrayEquals("Remove longest call succeeded",expectedCallHistory.toArray(),iphone11.getCallHistory().toArray());
        System.out.println("Instance of GSM after remove longest call:\n" + iphone11);

        //test remove all Calls in History
        iphone11.clearCallHistory();
        System.out.println("Instance after clear call history:\n" + iphone11);
        Assert.assertArrayEquals("remove all calls succeeded",new ArrayList<Call>().toArray(),iphone11.getCallHistory().toArray());


    }
}
