package Utilities;

import java.awt.geom.Line2D;

public class Triangle2D 
{
	private MyPoint p1, p2, p3;
	
	public Triangle2D()
	{
		this(0, 0, 1, 1, 2, 5);
	}
	
	public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3)
	{
		p1 = new MyPoint(x1, y1);
		p2 = new MyPoint(x2, y2);
		p3 = new MyPoint(x3, y3);
	}
	
	public double getArea()
	{
		double side = (getP1().distance(getP2()) + getP2().distance(getP3()) + getP3().distance(getP1())) / 2;
		
		return Math.sqrt(side * (side - getP1().distance(getP2())) * 
				(side - getP2().distance(getP3())) * 
				(side - getP3().distance(getP1()) ));
	}
	
	public double getArea(MyPoint p1, MyPoint p2, MyPoint p3)
	{
		double side = (p1.distance(p2) + p2.distance(p3) + p3.distance(p1)) / 2;
		
		return Math.sqrt(side * (side - p1.distance(p2)) * 
				(side - p2.distance(p3)) * 
				(side - p3.distance(p1)));
	}
	
	public double getPerimeter()
	{
		return (getP1().distance(getP2()) + getP2().distance(getP3()) + getP3().distance(getP1()));
	}
	
	public boolean contains(MyPoint p)
	{
		double area = Math.round((getArea(p, p1, p2) + getArea(p, p2, p3) + getArea(p, p3, p1)) * 100) / 100;
		double triangleArea =  Math.round(getArea() * 100) / 100;
		
		return (triangleArea == area);
	}

	public boolean contains(Triangle2D t)	
	{
		return contains(t.p1) && contains(t.p2) && contains(t.p3);
	}
	
	public boolean overlap(Triangle2D t)
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
