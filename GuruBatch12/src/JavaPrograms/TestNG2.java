package JavaPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
  @Test
  public void tc1() {
	  System.out.println("This TestNG2 class");	  
	  Assert.assertEquals("Batch12", "Batch12","Pass");//fail
	 // Assert.assertEquals(5,5);
	  Assert.assertTrue(4<5);
	  Assert.assertFalse(false);
	  System.out.println("Passed");
	  add(5,10);
  }
  
  //Write a method to Add two numbers
  public static void add(int num1,int num2)
  {
	  System.out.println("Sum of two numbers: "+(num1+num2));
  }
}
