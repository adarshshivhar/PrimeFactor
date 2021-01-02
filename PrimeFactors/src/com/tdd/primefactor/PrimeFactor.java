package com.tdd.primefactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public List<Integer> factorOf(int n) {
		List<Integer> factors = new ArrayList<>();
		int remainder = n;
		if(remainder>1) {
			while(remainder%2==0) {
				factors.add(2);
				remainder = remainder/2;
			}
			if(remainder>1) {
				factors.add(remainder);
			}	
		}
		return factors;
	}

	
}