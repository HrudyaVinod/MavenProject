package testNgcommands;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GroupExecution {
  @Test
  public void testCase1() {
	  System.out.println("Test case1");
  }
  @Test
  public void testCase2() {
	  System.out.println("Test case2");
  }
  @Test(groups = "critical")
  public void testCase3() {
	  System.out.println("Test case3");
  }
  @Test(groups = "critical")
  public void testCase4() {
	  System.out.println("Test case4");
  }
  @Test
  public void testCase5() {
	  System.out.println("Test case5");
  }
  
  
  
  @BeforeMethod(alwaysRun =true)
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
