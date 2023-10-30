package newp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class listnerrunner18_10
{
    @Test
     public void test1()
     {
    	System.out.println("virat kholi");
}
    @Test(dependsOnMethods  = "test1")
    public void test2()
    {
   	System.out.println("yuvraj shigh");
   	Assert.fail();
}
    @Test(dependsOnMethods  = "test2")
    public void test3()
    {
   	System.out.println("ms dhoni ");
}
}
