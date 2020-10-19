package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import pkgShape.Cuboid.SortByVolume;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pkgShape.Rectangle.SortByArea;

class CuboidTest {

	
	/*
o	Test Construction
o	Test getter / setter methods.
o	Test area()
o	Test perimeter (ensure it’s throwing the right exception, see 
     https://howtodoinjava.com/junit5/expected-exception-example/ for an example)
o	Test SortByVolume
*/
	
	@Test
	// Test Construction
	
	public void isCuboidTest1() {
		Assertions.assertThrows(Exception.class, () -> {
			Cuboid c1= new Cuboid(0,0,0);;
		  });
			
	}
	@Test
	public void isCuboidTest2() {
		Assertions.assertThrows(Exception.class, () -> {
			Cuboid c1= new Cuboid(0,7,3);;
		  });
			
	}
	
	@Test
	public void isCuboidTest3() {
		Assertions.assertThrows(Exception.class, () -> {
			Cuboid c1= new Cuboid(7,7,0);;
		  });
			
	}
	
	@Test
	
		// o	Test getter / setter methods
	
	public void Depth_Test1() {
		
		try{
		Cuboid c1= new Cuboid(2,2,5);
		
		assertTrue(c1.getDepth()==5.0);
		
		c1.setDepth(4);
		assertTrue(c1.getDepth()==4.0);
		}catch(Exception e) {
			//Do nothing because correct stuff is being passed
		}
	}
	@Test
	public void Depth_Test2() {
		try {
		Cuboid c2= new Cuboid(3,6,9);
		assertTrue(c2.getDepth()==9.0);
		
		c2.setDepth(4);
		assertFalse(c2.getDepth()==10.0);
		}catch(Exception e) {
			//Do nothing because correct stuff is being passed
		}
	}
		
	@Test		
		//o	Test area()
	public void areaTest1() {
		try {
		Cuboid c1= new Cuboid(2,2,2);
		assertTrue(c1.area()==24);
		}catch(Exception e) {
			//Do nothing because correct stuff is being passed
		}
	}
	@Test
	public void areaTest2() {
		try {
		Cuboid c1= new Cuboid(5,2,10);
		assertTrue(c1.area()==160);
	    }catch(Exception e) {
		//Do nothing because correct stuff is being passed
	   }
	}
	
	
	@Test	
		//o	Test perimeter
	public void perimeterTest1() {
		try {
		Assertions.assertThrows(UnsupportedOperationException.class, () -> {
			Cuboid c1= new Cuboid(2,2,2);
			c1.perimeter();
		  });
		}catch(Exception e) {
			//Do nothing because correct stuff is being passed
		}
		
	}
	@Test
public void perimeterTest2() {
		try {
		Cuboid c1= new Cuboid(2,10,20);
		Assertions.assertThrows(UnsupportedOperationException.class, () -> {
			
			c1.perimeter();
		  });
		}catch(Exception e) {
			//Do nothing because correct stuff is being passed
		}
		
	}
	
	
	@Test	
		//o	Test compareTo(Object), ensuring rectangles are being sorted correctly (2x2 sorts < 4x6, for example)

	public void CompareToTest1() {
		try {
		Cuboid r1= new Cuboid(2,2,2);
	    Cuboid r2= new Cuboid(5,2,10);
	    
	    assertTrue((r1.compareTo(r2))<0);
		}catch(Exception e) {
			//Do nothing because correct stuff is being passed
		}
	}
	
	@Test
	public void CompareToTest2() {
		try {
		Cuboid r1= new Cuboid(8,8,8);
	    Cuboid r2= new Cuboid(5,2,10);
	    
	    assertFalse((r1.compareTo(r2))<0);
		}catch(Exception e) {
			//Do nothing because correct stuff is being passed
		}
	}
	
	@Test
	//SortByVolume
	public void SortByVolumeTest1() {
		try {
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>(); 
	    Cuboid c1= new Cuboid(2,2,2);
	    Cuboid c2= new Cuboid(2,10,5);
	    Cuboid c3= new Cuboid(5,5,5);
		ar.add(c2); 
	    ar.add(c1);  
	    ar.add(c3); 
	    
	    
	    ArrayList<Cuboid> ExpectedArray = new ArrayList<Cuboid>(); 
	    ExpectedArray.add(c1);
	    ExpectedArray.add(c2);
	    ExpectedArray.add(c3);
	    
	    
	    Collections.sort(ar, new SortByVolume()); 
	          
	    assertTrue(ExpectedArray.equals(ar));
		}catch(Exception e){
			//Do nothing because correct stuff is being passed	
		}
	     }
		
		@Test
		public void SortByVolumeTest2() {
			ArrayList<Cuboid> ar = new ArrayList<Cuboid>(); 
		    try {
			Cuboid c1= new Cuboid(10,10,10);
		    Cuboid c2= new Cuboid(5,5,2);
		    Cuboid c3= new Cuboid(5,5,1);
		    
			ar.add(c2); 
		    ar.add(c1);  
		    ar.add(c3); 
		    
		    
		    ArrayList<Cuboid> ExpectedArray = new ArrayList<Cuboid>(); 
		    ExpectedArray.add(c3);
		    ExpectedArray.add(c2);
		    ExpectedArray.add(c1);
		    
		    
		    Collections.sort(ar, new SortByVolume()); 
		          
		    assertTrue(ExpectedArray.equals(ar));
		    }catch(Exception e) {
		    	//Do nothing because correct stuff is being passed
		    }
		     }
     


}
