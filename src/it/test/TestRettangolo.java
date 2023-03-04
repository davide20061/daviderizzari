package it.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRettangolo {

	@Test
	void test() {
		Rettangolo r = new Rettangolo();
		
		assertEquals(r.calcoloArea(3, 3), 9);
		assertEquals(r.calcoloPerimetro(3, 3), 12);
		fail("Not yet implemented");
	}

}
