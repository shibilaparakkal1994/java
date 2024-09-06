package TestNGframes;

import org.checkerframework.common.reflection.qual.GetClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testingannotations {
	@Test

	public void test1()
	{
		System.out.println("Test case 1");
		
	}//testcase2
	@Test
	public void test2()
	{
		System.out.println("test case 2");
		
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
		
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("befor test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite");
	}
	
	}

