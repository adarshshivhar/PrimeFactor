package com.tdd.primefactor;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class PrimeFactorTest {
	@Test
	public void test() {
		PrimeFactor pf = new PrimeFactor();
		assertEquals(new ArrayList<Integer>(), pf.factorOf(1));
		assertEquals(new ArrayList<Integer>(Arrays.asList(2)), pf.factorOf(2));
		assertEquals(new ArrayList<Integer>(Arrays.asList(3)), pf.factorOf(3));
		assertEquals(new ArrayList<Integer>(Arrays.asList(2,2)), pf.factorOf(4));
		assertEquals(new ArrayList<Integer>(Arrays.asList(5)), pf.factorOf(5));
		assertEquals(new ArrayList<Integer>(Arrays.asList(2,3)), pf.factorOf(6));
		assertEquals(new ArrayList<Integer>(Arrays.asList(7)), pf.factorOf(7));
		assertEquals(new ArrayList<Integer>(Arrays.asList(2,2,2)), pf.factorOf(8));
	}
}
