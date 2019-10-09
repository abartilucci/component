package test;


import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;


import component.Complex;
import component.Component;
import component.ItemInt;
import component.ItemStrg;

public class equalityTest {
	private Component complex;
	private Component itemInt;
	private Component itemStrg;
	private Complex cpl;

	@Before
	public void setUp() {
		complex = new Complex();
		itemInt = new ItemInt( (int)Math.random()*100 );
		itemStrg =  new ItemStrg("Test");
		cpl = new Complex();
	}


	@Test
	// Testing Complex to ItemInt
	public void test_ComplexInt() {
		boolean result = complex.equals(itemInt);		
		Assert.assertFalse(result);
	}

	@Test
	// Testing Complex to ItemString
	public void test_ComplexString() {
		boolean result = complex.equals(itemStrg);
		Assert.assertFalse(result);
	}


	@Test
	// Testing ItemString to ItemInt
	public void test_StringInt() {
		boolean result = itemStrg.equals(itemInt);
		Assert.assertFalse(result);
	}
	
	@Test
	// Testing ItemString to Complex
	public void test_StringCompl() {
		boolean result = itemStrg.equals(complex);
		Assert.assertFalse(result);
	}

	@Test
	// Testing ItemInt to ItemString
	public void test_IntString() {
		boolean result = itemInt.equals(itemStrg);
		Assert.assertFalse(result);
	}
	
	@Test
	// Testing ItemInt to ItemString
	public void test_IntComplex() {
		boolean result = itemInt.equals(complex);
		Assert.assertFalse(result);
	}

	@Test
	// Testing two identical objects of type Complex
	public void test_SameComplex() {
		boolean result = complex.equals(complex);
		Assert.assertTrue(result);
	}

	@Test
	// Testing two identical objects of type ItemInt
	public void test_SameInt() {
		boolean result = itemInt.equals(itemInt);
		Assert.assertTrue(result);
	}

	@Test
	// Testing two identical objects of type ItemStrg
	public void test_SameString() {
		boolean result = itemStrg.equals(itemStrg);
		Assert.assertTrue(result);		
	}

	
	@Test
	// Testing adding an element to the LinkedList	
	public void testAddtToList() {
		cpl.add(itemInt);
		Assert.assertEquals(cpl.getList().getFirst(), itemInt);
	}

	@Test( expected = NoSuchElementException.class )
	// Testing removing an element from a LinkedList of a single item
	public void testRemoveFromList() {
		cpl.remove(itemInt);
		cpl.getList().getFirst();
	}


}
