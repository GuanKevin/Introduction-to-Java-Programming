package Chapter_04_Mathematical_Functions_Characters_And_Strings;

/**
 * Geography: estimate areas
 * Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from 
 * www.gps-data-team.com/map/ and compute the estimated area enclosed by these four cities. 
 * (Hint: Use the formula in Programming Exercise 4.2 to compute the distance between two cities. 
 * Divide the polygon into two triangles and use the formula in Programming Exercise 2.19 to compute the area of a triangle.)
 * 
 * 08/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		final double AVERAGE_EARTH_RADIUS = 6371.01;
		double xAtlantaGeorgia, yAtlantaGeorgia, xOrlandoFlorida, yOrlandoFlorida, xSavannahGeorgia, ySavannahGeorgia, xCharlotteNC, yCharlotteNC,
		t1s1, t1s2, t1s3, t2s1, t2s2, t2s3, s1, s2, area1, area2, area;
		xAtlantaGeorgia = -73.98504495620728;
		yAtlantaGeorgia = 40.757123775433385;
		xOrlandoFlorida = -73.98504495620728;
		yOrlandoFlorida = 40.757123775433385;
		xSavannahGeorgia = -81.09983419999998;
		ySavannahGeorgia = 32.0835407;
		xCharlotteNC = -80.84312669999997;
		yCharlotteNC = 35.2270869;
		
		t1s1 = AVERAGE_EARTH_RADIUS * 
				Math.acos(
						Math.sin(Math.toRadians(xAtlantaGeorgia)) * 
						Math.sin(Math.toRadians(xOrlandoFlorida)) * 
						Math.cos(Math.toRadians(xAtlantaGeorgia)) * 
						Math.cos(Math.toRadians(xOrlandoFlorida)) * 
						Math.cos(Math.toRadians(yAtlantaGeorgia - yOrlandoFlorida))
						);
		t1s2 = AVERAGE_EARTH_RADIUS * 
				Math.acos(
						Math.sin(Math.toRadians(xOrlandoFlorida)) * 
						Math.sin(Math.toRadians(xSavannahGeorgia)) * 
						Math.cos(Math.toRadians(xOrlandoFlorida)) * 
						Math.cos(Math.toRadians(xSavannahGeorgia)) * 
						Math.cos(Math.toRadians(yOrlandoFlorida - ySavannahGeorgia))
						);
		t1s3 = AVERAGE_EARTH_RADIUS * 
				Math.acos(
						Math.sin(Math.toRadians(xSavannahGeorgia)) * 
						Math.sin(Math.toRadians(xCharlotteNC)) * 
						Math.cos(Math.toRadians(xSavannahGeorgia)) * 
						Math.cos(Math.toRadians(xCharlotteNC)) * 
						Math.cos(Math.toRadians(ySavannahGeorgia - yCharlotteNC))
						);
		
		t2s1 = AVERAGE_EARTH_RADIUS * 
				Math.acos(
						Math.sin(Math.toRadians(xCharlotteNC)) * 
						Math.sin(Math.toRadians(xAtlantaGeorgia)) * 
						Math.cos(Math.toRadians(xCharlotteNC)) * 
						Math.cos(Math.toRadians(xAtlantaGeorgia)) * 
						Math.cos(Math.toRadians(yCharlotteNC - yAtlantaGeorgia))
						);
		t2s2 = AVERAGE_EARTH_RADIUS * 
				Math.acos(
						Math.sin(Math.toRadians(xAtlantaGeorgia)) * 
						Math.sin(Math.toRadians(xSavannahGeorgia)) * 
						Math.cos(Math.toRadians(xAtlantaGeorgia)) * 
						Math.cos(Math.toRadians(xSavannahGeorgia)) * 
						Math.cos(Math.toRadians(yAtlantaGeorgia - ySavannahGeorgia))
						);
		t2s3 = AVERAGE_EARTH_RADIUS * 
				Math.acos(
						Math.sin(Math.toRadians(xOrlandoFlorida)) * 
						Math.sin(Math.toRadians(xCharlotteNC)) * 
						Math.cos(Math.toRadians(xOrlandoFlorida)) * 
						Math.cos(Math.toRadians(xCharlotteNC)) * 
						Math.cos(Math.toRadians(yOrlandoFlorida - yCharlotteNC))
						);
		
		s1 = (t1s1 + t1s2 + t1s3) / 2.0;
		s2 = (t2s1 + t2s2 + t2s3) / 2.0;
		area1 = Math.pow((s1 * (s1 - t1s1) * (s2 - t1s2) * (s2 - t1s3)), 0.5);
		area2 = Math.pow((s1 * (s1 - t2s1) * (s2 - t2s2) * (s2 - t2s3)), 0.5);
		area = area1 + area2;
		
		System.out.print("The area is: " + area);
	}
}
