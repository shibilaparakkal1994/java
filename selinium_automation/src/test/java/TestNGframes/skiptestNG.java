package TestNGframes;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skiptestNG {
boolean val = true;
@Test(enabled =false)
public void f1()
{
	System.out.println("method 1");
}
@Test
public void f2()
{
	System.out.println("method 2");
	throw new SkipException("not required");
}
@Test
public void f3()
{
	if(val ==false)
	{
		System.out.println("false value printed");
		throw new SkipException("else not required");
	}
}
	

}
