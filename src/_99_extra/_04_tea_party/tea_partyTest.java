package _99_extra._04_tea_party;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class tea_partyTest {
	/**
	 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
	 * George Orwell is a man, so say “Hello Mr. Orwell”. 
	 * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
	 **/

	@Test
	public void testIsWomanNotKnighted() {
		tea_party teaParty = new tea_party();
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
	}

	@Test
	public void testIsManNotKnighted() {
		tea_party teaParty = new tea_party();
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
	}

	@Test
	public void testIsManKnighted() {
		tea_party teaParty = new tea_party();
		assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
	}
	
	@Test
	public void testIsWomanKnighted() {
		tea_party teaParty = new tea_party();
		assertEquals("Hello Lady Laura", teaParty.welcome("Laura", true, true));
	}

}