package testNgcommands;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	
  @Test(dataProvider = "data-provider",dataProviderClass = BasicCommands.class)
  public void testcase1(int a,int b) {
	  System.out.println(a+b);
  }
 /* @DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 3}, {7, 9},{10,15}};
	}*/
}
