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
	}
}
