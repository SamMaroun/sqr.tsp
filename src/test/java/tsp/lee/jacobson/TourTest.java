package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TourTest {

	// @Test
	// public void test() {
	// 	fail("Not yet implemented");
	// }
	
	@Test
	/**
	 * GIVEN getDistance
	 * WHEN noTour
	 * THEN 0
	 */

	public void getDistance_noTour_0(){

		Tour tour = new Tour();

		int expected = 0;
		int actual = tour.getDistance();

		assertEquals(expected,actual);
	}

	@Test
	/**
	 * GIVEN getDistance
	 * WHEN oneCity
	 * THEN 0
	 */

	public void getDistance_oneCity_0(){

		Tour tour = new Tour();

		int expected = 0;
		int actual = tour.getDistance();

		assertEquals(expected,actual);
	}

	@Test
	/**
	 * GIVEN getDistance
	 * WHEN 2Cities
	 * THEN 2
	 */

	public void getDistance_2Cities_2(){
		ArrayList<City> cities = new ArrayList<City>();

		City FirstCity = new City(0,0);
		City SecondCity = new City(1,0);

		cities.add(FirstCity);
		cities.add(SecondCity);

		Tour tour = new Tour(cities);

		int expected = 2;
		int actual = tour.getDistance();

		assertEquals(expected,actual);
	}

	@Test
	/**
	 * GIVEN getDistance
	 * WHEN 4Cities
	 * THEN 2
	 */

	public void getDistance_4Cities_4(){
		ArrayList<City> cities = new ArrayList<City>();

		City FirstCity = new City(0,0);
		City SecondCity = new City(1,0);
		City ThirdCity = new City(0,1);
		City FourthCity = new City(1,0);

		cities.add(FirstCity);
		cities.add(SecondCity);
		cities.add(ThirdCity);
		cities.add(FourthCity);

		Tour tour = new Tour(cities);

		int expected = 4;
		int actual = tour.getDistance();

		assertEquals(expected,actual);
	}

}
