package it.unical.demacs.ProvaIngSw_213571;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	public static MyListUtil m;
	
	@BeforeClass
	public static void prepare() {
		System.out.println("Before Class");
		m = new MyListUtil();
	}

	@Before
	public void stampaOrarioBefore() {
		DateTime d = new DateTime();
		System.out.println(d.toString());
	}
	
	@After
	public void stampaOrarioAfter() {
		DateTime d = new DateTime();
		System.out.println(d.toString());
	}
	
	@Test
	public void sortTestCrescente() {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(30);
		l.add(2);
		l.add(8);
		
		List<Integer> lOrdinata = new ArrayList<Integer>();
		
		lOrdinata.add(2);
		lOrdinata.add(8);
		lOrdinata.add(10);
		lOrdinata.add(30);
				
		assertEquals( lOrdinata  , m.sort(l, 0) );
		
	}
	
	@Test
	public void sortTestDerescente() {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(30);
		l.add(2);
		l.add(8);
		
		List<Integer> lOrdinata = new ArrayList<Integer>();
		
		lOrdinata.add(30);
		lOrdinata.add(10);
		lOrdinata.add(8);
		lOrdinata.add(2);
				
		assertEquals( lOrdinata  , m.sort(l, 1) );
		
	}
	
}
