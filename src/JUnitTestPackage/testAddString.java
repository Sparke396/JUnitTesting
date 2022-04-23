package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		String res=junit.addstring("Aditi Sheemar,","Software Engineer");
		assertEquals("Aditi Sheemar,Software Engineer",res);
	}

}
