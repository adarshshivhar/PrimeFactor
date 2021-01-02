package com.tdd.primefactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public List<Integer> factorOf(int n) {
		List<Integer> factors = new ArrayList<>();
		int remainder = n;
		int divisor = 2;
		
		while(remainder>1) {
			
			while(remainder%divisor==0) {
				factors.add(divisor);
				remainder = remainder/divisor;
			}
			divisor++;
		}
		return factors;
	}

	
}