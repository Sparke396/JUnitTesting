package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		int res=junit.addnumbers(80,40);
		assertEquals(120,res);
		
	}

}
