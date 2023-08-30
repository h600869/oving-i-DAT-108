package generisk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

class GeneriskIntervallTest {

	Intervall<Integer> treTilFem = new LukketIntervall<>(3,5);
	Intervall<Integer> fireTilToBaklengs = new LukketIntervall<>(4,2);
	Intervall<Integer> enTilenLike = new LukketIntervall<>(1,1);
	
	Intervall<Double> piTilToPi = new LukketIntervall<>(3.14,6.28);
	
	@Test void testkonstruktor() {
		assertEquals(3, treTilFem.getMin());
		assertEquals(5, treTilFem.getMax());
		
		assertEquals(4,fireTilToBaklengs.getMax());
		assertEquals(2, fireTilToBaklengs.getMin());
		
		assertEquals(1, enTilenLike.getMin());
		assertEquals(1, enTilenLike.getMax());
		
		assertEquals(3.14, piTilToPi.getMin());
		assertEquals(6.28, piTilToPi.getMax());
	}
	
	@Test void inneholder() {
		assertTrue(treTilFem.inneholder(3));
		assertTrue(treTilFem.inneholder(4));
		assertTrue(treTilFem.inneholder(5));
		
		assertTrue(fireTilToBaklengs.inneholder(4));
		assertTrue(fireTilToBaklengs.inneholder(3));
		assertTrue(fireTilToBaklengs.inneholder(2));
		
		assertTrue(enTilenLike.inneholder(1));
		
		assertTrue(piTilToPi.inneholder(3.14));
		assertTrue(piTilToPi.inneholder(4.21));
		assertTrue(piTilToPi.inneholder(6.28));
	}
	
	@Test void overlapper() {
		assertTrue(treTilFem.overlapper(fireTilToBaklengs));
		assertTrue(fireTilToBaklengs.overlapper(treTilFem));
		
		assertFalse(enTilenLike.overlapper(treTilFem));
		assertFalse(enTilenLike.overlapper(fireTilToBaklengs));
	}
	

}
