package testNgcommands;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotations {
  @Test
  public void testcase1() {
	  System.out.println("Testcase1 executed");
	  
  }
  @Test
  public void testcase2() {
	  System.out.println("Testcase2 executed");
	  
  }
  @Test
  public void testcase3() {
	  System.out.println("Testcase3 executed");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method executed");
  }

}
