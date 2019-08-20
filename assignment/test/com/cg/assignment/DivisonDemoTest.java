package com.cg.assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisonDemoTest {
	DivisonDemo dd = new DivisonDemo();
	@Test
	void InavlidDenominatorTest() throws InavlidDenominatorException {
	
		double output= dd.divison(6,3);
		assertEquals(2.0,output);
		
	}

}
