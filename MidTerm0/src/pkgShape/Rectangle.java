package pkgShape;

import java.util.Comparator;
import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class Rectangle extends Shape{
	
       public static class SortByArea implements Comparator<Rectangle>{
		
    	@Override
		public int compare(Rectangle r1, Rectangle r2) {
    		
			return r1.compareTo(r2);
			
			
		}

	}
       public int compareTo(Object r2) {
    	   
    	  return (int) (this.area()-((Rectangle)r2).area());
   	}
   	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int length, int width)  throws Exception {
		if(length <=0 || width<=0) {
			throw new Exception("Invalid size");
		}
		else {
		this.iWidth=width;
		this.iLength=length;
		}
	}
	public int getWidth() {
		
		return iWidth;
	}
	public void setWidth(int width) {
		this.iWidth= width;
	}
	
	public int getLength() {
		
		return iLength;
	}
	public void setLength(int length) {
		
		this.iLength=length;
	}
	
	public double area() {
		
		return iLength*iWidth;
	}
	
	
	public double perimeter() {
		
		return (2*(iWidth+iLength));
	}
	

}


