package selniumTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class StandardAnnotations {
	@BeforeSuite
	public void setupBeforeTestSuite() {
		System.out.println("--- Before TestSuite ---");
	}
	
	@AfterSuite
	public void cleanAfterTestSuite() {
		System.out.println("--- After TestSuite ---");
	}
	
	@BeforeClass
	public void setupBeforeClass() {
		System.out.println("--- Before Class ---");
	}
	
	@AfterClass
	public void cleanAfterClass() {
		System.out.println("--- After Class ---");
	}
	
	@BeforeMethod
	public void setupBeforeTestMethod() {
		System.out.println("--- Before Test Method ---");
	}

	@AfterMethod
	public void cleanAfterTestMethod() {
		System.out.println("--- After Test Method ---");
	}
	
	
	@Test
	public void testOne() {
		System.out.println("---Testone is executed---");
		
	}
	@Test
	public void testTwo() {
		System.out.println("---TestTwo is executed---");
		
	}
	@Test
	@Ignore
	public void testThree() {
		System.out.println("---TestThree is executed---");
		
	}

}
