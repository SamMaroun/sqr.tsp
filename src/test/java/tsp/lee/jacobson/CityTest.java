package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class CityTest {

	// @Test
	// public void test() {
	// 	fail("Not yet implemented");
	// }

	
	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN cityToHerself
	 * THEN 0
	 */
	public void distanceTo_cityToHerself_0(){
		City First = new City(0,0);
		
		double expected = 0;
		double actual = First.distanceTo(First);
		assertEquals(expected,actual,0.0);
	} 

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN FirstToSecond
	 * THEN 1
	 */
	public void distanceTo_FirstToSecond_1(){
		City First = new City(0,0);
		City Second = new City(1,0);

		double expected = 1;
		double actual = First.distanceTo(Second);
		assertEquals(expected,actual,0.0);
	}
	
	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN FirstToThird
	 * THEN sqrt2
	 */
	public void distanceTo_FirstToThird_sqrt2(){
		City First = new City(0,0);
		City Third = new City(1,1);

		double expected = Math.sqrt(2);
		double actual = First.distanceTo(Third);
		assertEquals(expected,actual,0.0);
	}
	
	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN negativeX
	 * THEN 1
	 */
	public void distanceTo_negativeX_1() {
		City First = new City(0,0);
		City Fourth = new City(-1,0);

		double expected = 1;
		double actual = First.distanceTo(Fourth);
		assertEquals(expected,actual,0.0);
	}
	
	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN negativeY
	 * THEN 1
	 */
	public void distanceTo_negativeY_1() {
		City First = new City(0,0);
		City Fifth = new City(0,-1);

		double expected = 1;
		double actual = First.distanceTo(Fifth);
		assertEquals(expected,actual,0.0);
	}

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN negativeXandY
	 * THEN sqrt2
	 */
	public void distanceTo_negativeXandY_sqrt2() {
		City First = new City(0,0);
		City Fifth = new City(-1,-1);

		double expected = Math.sqrt(2);
		double actual = First.distanceTo(Fifth);
		assertEquals(expected,actual,0.0);
	}
}
