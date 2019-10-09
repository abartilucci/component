package test;

import org.junit.Assert;
import org.junit.Test;

import component.Complex;
import component.Component;
import component.ItemInt;
import component.ItemStrg;
import component.SumInt;

public class visitTest {


	@Test
	// Test Visitor on a Complex list with mixed items
	public void sumInt() {

		Component c1 = new Complex();
		Component c2 = new Complex();
		Component c3 = new Complex();

		c1.add( new ItemInt(5) );
		c1.add( new ItemInt(100) );
		c1.add( new ItemStrg("test") );
		c1.add(c2);
		c2.add(new ItemInt(15));
		c2.add(new ItemStrg("test2"));
		
		c3.add( new ItemInt(20) );
		c3.add( new ItemInt(30) );
		c3.add(new ItemStrg("test3"));


		SumInt s = new SumInt();
		c1.accept(s);	
		int result = s.getSum();
		Assert.assertEquals(result,120);
		
	
	}
	
	@Test
	// Test Visitor on a Complex list with only ItemStrg items
	public void noItemIntList() {
		Component c1 = new Complex();
		
		c1.add( new ItemStrg("test") );
		c1.add( new ItemStrg("test1") );
		c1.add( new ItemStrg("test2") );
		
		SumInt s = new SumInt();
		c1.accept( s );
		
		int result = s.getSum();
		
		Assert.assertEquals(result,0);

		
	}


}
