package com.digitalmixer.lcm;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class LCMTest {

	@Test
	public void test_2 ()
	{
		assertEquals(LCM.calculateConsecutiveLCM(4), 12);
		assertEquals(LCM.calculateConsecutiveLCM(17), 12252240);
		assertEquals(LCM.calculateConsecutiveLCM(23), 5354228880L);
		
	}
	
}
