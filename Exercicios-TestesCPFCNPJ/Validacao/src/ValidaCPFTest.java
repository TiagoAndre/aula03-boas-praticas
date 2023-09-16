import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidaCPFTest {

	@Test
	void test() {
		ValidaCPF vCPF = new ValidaCPF();
		
		assertFalse(vCPF.isCPF("1111111111"));
	}
	
	@Test
	void test2() {
		ValidaCPF vCPF = new ValidaCPF();
		
		assertFalse(vCPF.isCPF("1"));
	}
	
	@Test
	void test3() {
		ValidaCPF vCPF = new ValidaCPF();
		
		assertTrue(vCPF.isCPF("46780657840"));
	}
	
	@Test
	void test4() {
		ValidaCPF vCPF = new ValidaCPF();
		
		assertFalse(vCPF.isCPF("11111111111"));
	}
	
	@Test
	void test5(){
		ValidaCPF vCPF = new ValidaCPF();
		
		assertEquals("46780657840", "85695741230");
	}
}
