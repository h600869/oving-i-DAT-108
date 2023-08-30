package aheltalls;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

class HeltallIntervallTest {

	Intervall treTilFem = new IntervallImpl(3,5);
	Intervall fireTilTo = new IntervallImpl(4,2);
	Intervall syvTilsyv = new IntervallImpl(7,7);
	
	/*her så skal man bestemme hvilken av
	tallene som er min og max i hver av Intervallene
	
	assertEquals er bokstaveligtalt 
	bestemmelsen av sannheten.
	
	// i (7,7) intervallet så skal man gi den ene 7-eren en min verdi, 
	og den andre 7-eren en maks verdi
	*/
	@Test void konstruktor() {
		assertEquals (3, treTilFem.getMin());
		assertEquals (5, treTilFem.getMax());
		
		assertEquals (2, fireTilTo.getMin());
		assertEquals (4, fireTilTo.getMax());
		
		assertEquals (7, syvTilsyv.getMin());
		assertEquals (7, syvTilsyv.getMax());
	}
	
	/*Her så skal man se om et intervall av tall 
	 * inneholder et bestemt tall ved bruk av 
	 * inneholder metoden fra intervall.java
	 * 
	 * P.S. nå skal man bruke
	 * asserTrue og assertFalse
	*/
	@Test void inneholder() {
		assertTrue(treTilFem.inneholder(3));
		assertTrue(treTilFem.inneholder(4));
		assertTrue(treTilFem.inneholder(5));
		
		assertFalse(treTilFem.inneholder(1));
		assertFalse(treTilFem.inneholder(7));
	}
	
	@Test void overlapper() {
		assertTrue(treTilFem.overlapper(fireTilTo));
		assertTrue(fireTilTo.overlapper(treTilFem));
		
		assertFalse(syvTilsyv.overlapper(fireTilTo));
		assertFalse(fireTilTo.overlapper(syvTilsyv));
	}

}
