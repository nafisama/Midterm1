package pkgShape;
import java.util.Comparator;
import pkgShape.Cuboid;
import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class Cuboid extends Rectangle{
	
	 public static class SortByVolume implements Comparator<Cuboid>{
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
				
				return c1.compareTo(c2);
			}
				
		}


	 public int compareTo(Object c2) {
		
		return (int)(this.volume()-((Cuboid) c2).volume());
	}
	
	
	private int iDepth;

	public Cuboid(int length, int width, int depth) throws Exception{

		super(length,width);
		if(depth <=0) {
			throw new Exception("Invalid size");
		}else {
		
		this.iDepth=depth;
		}
	}
	
	public int getDepth() {
		
		return iDepth;
	}
	
	public void setDepth(int depth) {
		
		this.iDepth=depth;
	}
	
	public double volume() {
		
		return (super.area()*iDepth);
	}
	
	public double area() {
		return (2*(super.area()+(super.getLength() * iDepth)+(iDepth*super.getWidth())));
		
	}

	public double perimeter() throws UnsupportedOperationException{
	
		throw new UnsupportedOperationException("Perimeter() not supported with Cuboid");
		
	}
	
	
	
    
	
	
}








