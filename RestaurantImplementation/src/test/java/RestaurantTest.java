import controllers.MenuManagement;
import models.*;
import org.junit.Test;
public class RestaurantTest {
    @Test
    public void test(){
        Menu menu=new LunchMenu("a","s","s",3.3);
        Menu menu1=new AlcoholMenu("a","s","s",3.3);
        Menu menu2=new AlcoholMenu("a","s45","45",9.3);

        Bill bill=new Bill();
        bill.addMenuItem(menu,2);
        System.out.println(bill);
        bill.addMenuItem(menu1,4);
        System.out.println(bill);
        bill.addMenuItem(menu2,4);
        System.out.println(bill);
        MenuManagement m=new MenuManagement();
        MenuManagement m2=new MenuManagement();
        System.out.println(MenuType.DrinkMenu);
    }
}
