package com.kh.junit.practice;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayPracticeTest {
	
	@Test
	public void testPractice1() {
		ArrayPractice ap = new ArrayPractice(10);
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] actual = ap.getArray();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testPractice2() {
		ArrayPractice ap = new ArrayPractice(10);
		int[] expected = {10,9,8,7,6,5,4,3,2,1};
		int[] actual = ap.getArray();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testPractice3() {
		int[] expected = {1,2,3,4,5};
		int[] actual = {1,2,3,4,5};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testPractice4() {
		String[] expected = {"±Ö"};
		String[] actual = {"±Ö"};
		assertArrayEquals(expected, actual);
	}
}
