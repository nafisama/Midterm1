package pkgShape;

import static org.junit.jupiter.api.Assertions.*;
import pkgShape.Rectangle.*;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectTest {

	
	
	@Test
	// Test Construction
	
	public void isRecctangleTest1() {
		Assertions.assertThrows(Exception.class, () -> {
			Rectangle r1= new Rectangle(0,0);
		  });
	}

	@Test
	// Test Construction
	
	public void isRecctangleTest2() {
		Assertions.assertThrows(Exception.class, () -> {
			Rectangle r1= new Rectangle(0,5);
		  });
		
	}	
	@Test
	
		// o	Test getter / setter methods
	
	public void Length_Test1() {
		try {
		Rectangle r1= new Rectangle(2,2);
		assertTrue(r1.getLength()==2.0);
		
		r1.setLength(4);
		assertTrue(r1.getLength()==4.0);
		}catch(Exception e) {
			// relax, everything is fine
		}
	}
	
	public void Width_Test1() {
		try {
		Rectangle r1= new Rectangle(2,2);
		assertTrue(r1.getWidth()==2.0);
		
		r1.setLength(4);
		assertFalse(r1.getWidth()==4.0);
		}catch(Exception e) {
			// relax, everything is fine
		}
	}
		
	@Test		
		//o	Test area()
	public void areaTest1() {
		try {
		Rectangle r1= new Rectangle(2,2);
		assertTrue(r1.area()==4);
		}catch(Exception e) {
			// relax, everything is fine
		}
	}
	public void areaTest2() {
		try {
		Rectangle r1= new Rectangle(5,2);
		assertTrue(r1.area()==10);
		}catch(Exception e) {
			// relax, everything is fine
		}
	}
	
	
	@Test	
		//o	Test perimeter
	public void perimeterTest1() {
		try {
		Rectangle r1= new Rectangle(2,2);
		assertTrue(r1.perimeter()==8);
		}catch(Exception e) {
			// relax, everything is fine
		}
	}
	public void peremiterTest2() {
		try {
		Rectangle r1= new Rectangle(5,2);
		assertTrue(r1.perimeter()==14);
		}catch(Exception e) {
			// relax, everything is fine
		}
	}
	
	@Test	
		//o	Test compareTo(Object), ensuring rectangles are being sorted correctly (2x2 sorts < 4x6, for example)
	
	public void CompareToTest1() {
		try {
		Rectangle r1= new Rectangle(2,2);
	    Rectangle r2= new Rectangle(2,10);
	    
	    assertTrue((r1.compareTo(r2))<0);
		}catch(Exception e) {
			// relax, everything is fine
		}
	}
	@Test
	public void CompareToTest2() {
		try {
		Rectangle r1= new Rectangle(10,10);
	    Rectangle r2= new Rectangle(2,10);
	    
	    assertFalse((r1.compareTo(r2))<0);
		}catch(Exception e) {
			// relax, everything is fine
		}
	    
	}
	
	
	@Test 
	//SortByArea 
	
	public void SortByAreaTest1() {
		try {
	ArrayList<Rectangle> ar = new ArrayList<Rectangle>(); 
    Rectangle r1= new Rectangle(2,2);
    Rectangle r2= new Rectangle(2,10);
    Rectangle r3= new Rectangle(6,5);
	ar.add(r2); 
    ar.add(r1);  
    ar.add(r3); 
    
    
    ArrayList<Rectangle> ExpectedArray = new ArrayList<Rectangle>(); 
    ExpectedArray.add(r1);
    ExpectedArray.add(r2);
    ExpectedArray.add(r3);
    
    
    Collections.sort(ar, new SortByArea()); 
          
    assertTrue(ExpectedArray.equals(ar));
		}catch(Exception e) {
			// relax, everything is fine
		}
     }
	
	@Test
	public void SortByAreaTest2() {
		try {
		ArrayList<Rectangle> ar = new ArrayList<Rectangle>(); 
	    Rectangle r1= new Rectangle(3,10);
	    Rectangle r2= new Rectangle(1,10);
	    Rectangle r3= new Rectangle(2,10);
		ar.add(r1); 
	    ar.add(r2);  
	    ar.add(r3); 
	    
	    
	    ArrayList<Rectangle> ExpectedArray = new ArrayList<Rectangle>(); 
	    ExpectedArray.add(r2);
	    ExpectedArray.add(r3);
	    ExpectedArray.add(r1);
	    
	    Collections.sort(ar, new SortByArea()); 
	          
	  
	    
	    assertTrue(ExpectedArray.equals(ar));
		}catch(Exception e) {
			// relax, everything is fine
		}

	     }
	
	
}  

