package com.labs.util;

import java.util.Arrays;

import org.junit.Test;

import com.labs.util.ArrayUtil;

import junit.framework.TestCase;

public class ArrayUtilTest extends TestCase {

	ArrayUtil arrayUtil = new ArrayUtil();

	int[] myArr = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3, 20,
			17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6, 19, 13, 5, 11, 4,
			7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
	
	int[] expected = { 1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43, 10000, 11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10, 14,
			12, 13, 7 };

	@Test
	public void testGetUniqueArray() {
		System.out.println("###### UNIQUE ARRAY WITH ITERATION ALGORITHM #######");
		int[] uniqueArray = arrayUtil.getUniqueArray(myArr);
		System.out.println(Arrays.toString(uniqueArray));
		assertTrue(Arrays.equals(uniqueArray, expected));
	}

	@Test
	public void testGetUniqueArrayIgnoringOrder() {
		System.out
        .println("###### UNIQUE ARRAY WITH NO CONSISTENT ORDER #######");
		int[] uniqueArrayIgnoringOrder = arrayUtil.getUniqueArrayIgnoringOrder(myArr);
		System.out.println(Arrays.toString(uniqueArrayIgnoringOrder));
		assertTrue(Arrays.equals(uniqueArrayIgnoringOrder, expected));
	}

	@Test
	public void testGetUniqueArrayWithOrderMaintained() {
		System.out.println("###### UNIQUE ARRAY WITH ORDER #######");
		int[] uniqueArrayWithOrderMaintained = arrayUtil.getUniqueArrayWithOrderMaintained(myArr);
		System.out.println(Arrays.toString(uniqueArrayWithOrderMaintained));
		assertTrue(Arrays.equals(uniqueArrayWithOrderMaintained, expected));
	}

}
