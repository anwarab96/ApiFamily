package assertApi;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public void test() {
		public void testConcatenate(){
			MyUnit  myUnit =new MyUnit();
			String result = myUnit.concatenate("one","two");
			assertEquals("onetwo", result);
		}
	}

	private String concatenate(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}
