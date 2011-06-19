package com.digitalmixer.lcm;

import java.util.Arrays;

public class LCM {

	public static long calculateConsecutiveLCM (int max)
	{
		long[] ints = new long[max - 1];
		for (int i = 0; i < max - 1; i++)
		{
			ints[i] = i + 2;
		}
		
		return calculateLCM(ints);
	}
	
	public static long calculateLCM (long[] ints)
	{
		long[] lcms = Arrays.copyOf(ints, ints.length);
		while (!areAllEqual(lcms))
		{
			int smallest_idx = indexOfSmallest(lcms);
			lcms[smallest_idx] += ints[smallest_idx];
		}
		
		return lcms[0];
		
	}
	
	private static int indexOfSmallest (long[] ints)
	{
		long smallest = ints[0];
		int smallest_idx = 0;
		for (int i = 0; i < ints.length; i++)
		{
			if (ints[i] < smallest)
			{
				smallest = ints[i];
				smallest_idx = i;
			}
		}
		
		return smallest_idx;
	}
	
	private static boolean areAllEqual (long[] ints)
	{
		long last = ints[0];
		for (long i : ints) {
			if (i != last)
				return false;
			else
				last = i;
		}
		
		return true;
	}
	
}
