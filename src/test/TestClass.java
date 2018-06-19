package test;

import org.junit.Assert;
import org.junit.Test;

import controller.Calculator;

public class TestClass {

	@Test
	public void doAddition() {
		Calculator cal = new Calculator();
		int output = cal.getSum(2, 7);
		Assert.assertEquals(9, output);
	}
	
	@Test
	public void doAdditionOf5And5() {
		Calculator cal = new Calculator();
		int output = cal.getSum(5, 5);
		Assert.assertEquals(10, output);
	}

}
