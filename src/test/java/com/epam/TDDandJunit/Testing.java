package com.epam.TDDandJunit;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

	class Testing {
	//void test() {
			//fail("Not yet implemented");
		//}
		StringRemoval obj;
	    void setUp()
	    {
	        obj = new StringRemoval();
	    }

	    void testFirstLetterA()
	    {
	        Assertions.assertEquals("DCB",obj.R("ADCB"));
	    }

	    void testBothLetterA()
	    {
	        Assertions.assertEquals("BC",obj.R("AABC"));
	    }

	    void testSecondLetterA()
	    {
	        Assertions.assertEquals("CBD",obj.R("CABD"));
	    }

	    void testNoneLetterA()
	    {
	        Assertions.assertEquals("RRJJ",obj.R("RRJJ"));
	    }

	    void testStartAndEndLetterA()
	    {
	        Assertions.assertEquals("BCCA",obj.R("ABCCA"));
	    }

	    void testBothAndOnlyLetterA()
	    {
	        Assertions.assertEquals("",obj.R("AA"));
	    }

	    void testSingleLetterA()
	    {
	        Assertions.assertEquals("",obj.R("A"));
	    }

	    void testFirstLetterAInTwoLetters()
	    {
	        Assertions.assertEquals("C",obj.R("AC"));
	    }

	    void testSecondLetterAInTwoLetters()
	    {
	        Assertions.assertEquals("C",obj.R("CA"));
	    }
}
