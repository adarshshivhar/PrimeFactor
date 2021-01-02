package com.tdd.primefactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public List<Integer> factorOf(int i) {
		List<Integer> factors = new ArrayList<>();
		if(i>1) {
			if(i%2==0) {
				factors.add(2);
				i = i/2;
			}
			if(i>1) {
				factors.add(i);
			}	
		}
		return factors;
	}

	
}