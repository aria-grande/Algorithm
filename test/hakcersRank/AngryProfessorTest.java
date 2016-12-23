package hakcersRank;

import static org.junit.Assert.*;
import hackersRank.AngryProfessor;

import org.junit.Test;

public class AngryProfessorTest {
	AngryProfessor ap = new AngryProfessor();
	
	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void NnoEqualATimes() {
		int[] aTimes = {1, 2};
		assertNull(ap.isCancelled(3, 2, aTimes));
	}
	
	@Test
	public void KisBiggerThanN() {
		int[] aTimes = {1, 2};
		assertNull(ap.isCancelled(2, 3, aTimes));
	}
	
	@Test
	public void nobodyCanAttend() {
		int[] aTimes = {0, 1, 2};
		assertEquals("YES", ap.isCancelled(3, 2, aTimes));
	}
	
	@Test
	public void everyoneCanAttend() {
		int[] aTimes = {-1, 0};
		assertEquals("NO", ap.isCancelled(2, 2, aTimes));
		assertEquals("NO", ap.isCancelled(2, 1, aTimes));
	}
	
	@Test
	public void someoneCanAttend() {
		int[] aTimes = {1, 2, -2, -4};
		assertEquals("YES", ap.isCancelled(aTimes.length, 3, aTimes));
		assertEquals("YES", ap.isCancelled(aTimes.length, 4, aTimes));
		assertEquals("NO", ap.isCancelled(aTimes.length, 2, aTimes));
		assertEquals("NO", ap.isCancelled(aTimes.length, 1, aTimes));
		assertNull(ap.isCancelled(aTimes.length, 5, aTimes));
		
	}
}
