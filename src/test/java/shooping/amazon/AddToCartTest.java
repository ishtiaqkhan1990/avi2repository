package shooping.amazon;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//added by avi
public class AddToCartTest extends Object {
	@DataProvider
	public Object[][] readdata()
	{
		Object[][] a = new Object[5][2];
		a[0][0]="shirt";
		a[0][1]="10";
		
		a[1][0]="tshirt";
		a[1][1]="12";
		
		a[2][0]="suit";
		a[2][1]="50";
		
		a[3][0]="pant";
		a[3][1]="15";
		
		a[4][0]="shorts";
		a[4][1]="20";
		
		return a;
	}
	@Test(dataProvider="readdata")
	public void addtocart(String item,String price)
	{
		System.out.println(item);
		System.out.println(price);
		System.out.println("changes made by user 1" );
		System.out.println("Change done by User 2");
		System.out.println("Change done by new developer to commit");

}
}