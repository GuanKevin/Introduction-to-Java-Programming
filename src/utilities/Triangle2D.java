package utilities;

import java.awt.geom.Line2D;

public class Triangle2D 
{
	private MyPoint p1, p2, p3;
	
	public Triangle2D()
	{
		this (0, 0, 1, 1, 2, 5);
	}
	
	public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3)
	{
		setP1(new MyPoint(x1, y1));
		setP2(new MyPoint(x2, y2));
		setP3(new MyPoint(x3, y3));
	}

	public double getPerimeter()
	{
		return (p1.distance(p2) + p1.distance(p3) + p2.distance(p3));
	}
	
	public double getArea()
	{
		double side1 = p1.distance(p2);
		double side2 = p1.distance(p3);
		double side3 = p2.distance(p3);
		double s = (side1 + side2 + side3) / 2;
		
		return (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))); 
	}
	
	/**
	 * http://stackoverflow.com/questions/2049582/how-to-determine-if-a-point-is-in-a-2d-triangle
	 * 
	 * @param p1
	 * @param p2
	 * @param p3
	 * @return
	 */
	public double sign(MyPoint p1, MyPoint p2, MyPoint p3)
	{
	    return (p1.getX() - p3.getX()) * (p2.getY() - p3.getY()) - (p2.getX() - p3.getX()) * (p1.getY() - p3.getY());
	}
	
	/**
	 * http://stackoverflow.com/questions/2049582/how-to-determine-if-a-point-is-in-a-2d-triangle
	 * 
	 * @param p
	 * @return
	 */
	public boolean contains(MyPoint p)
	{
		boolean b1, b2, b3;

	    b1 = sign(p, p1, p2) < 0.0f;
	    b2 = sign(p, p2, p3) < 0.0f;
	    b3 = sign(p, p3, p1) < 0.0f;

	    return ((b1 == b2) && (b2 == b3));
	}
	
	public boolean contains(Triangle2D t)
	{
		return (contains(t.p1) && contains(t.p2) && contains(t.p3));
	}
	
	/**
	 * From the book
	 * Line2D source code
	 * http://developer.classpath.org/doc/java/awt/geom/Line2D-source.html
	 * 
	 * @param t
	 * @return
	 */
	public boolean overlaps(Triangle2D t)
	{
		Line2D line1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(), t.p2.getY());
	    Line2D line2 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p3.getX(), t.p3.getY());
	    Line2D line3 = new Line2D.Double(t.p2.getX(), t.p2.getY(), t.p3.getX(), t.p3.getY());

	    Line2D side1 = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	    Line2D side2 = new Line2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY());
	    Line2D side3 = new Line2D.Double(p2.getX(), p2.getY(), p3.getX(), p3.getY());
	    
	    return contains(t) || t.contains(this) || 
	      line1.intersectsLine(side1) || 
	      line1.intersectsLine(side2) || 
	      line1.intersectsLine(side3) || 
	      line2.intersectsLine(side1) || 
	      line2.intersectsLine(side2) || 
	      line2.intersectsLine(side3) ||
	      line3.intersectsLine(side1) || 
	      line3.intersectsLine(side2) || 
	      line3.intersectsLine(side3);
	}
	
	public MyPoint getP1() 
	{
		return p1;
	}

	public void setP1(MyPoint p1) 
	{
		this.p1 = p1;
	}

	public MyPoint getP2() 
	{
		return p2;
	}

	public void setP2(MyPoint p2) 
	{
		this.p2 = p2;
	}

	public MyPoint getP3() 
	{
		return p3;
	}

	public void setP3(MyPoint p3) 
	{
		this.p3 = p3;
	}
}
