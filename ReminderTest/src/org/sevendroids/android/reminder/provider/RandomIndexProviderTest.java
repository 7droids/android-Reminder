/**
 * 
 */
package org.sevendroids.android.reminder.provider;

import junit.framework.TestCase;

/**
 * @author 7droids.de (FA)
 * 
 */
public class RandomIndexProviderTest extends TestCase {

	/**
	 * Test method for
	 * {@link org.sevendroids.android.reminder.provider.RandomIndexProvider#RandomIndexProvider(int)}
	 */
	public final void testRandomIndexProviderWith0() {
		try {
			new RandomIndexProvider(0);
			fail("An IllegalArgumentExeption was expected.");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}

	/**
	 * Test method for
	 * {@link org.sevendroids.android.reminder.provider.RandomIndexProvider#RandomIndexProvider(int)}
	 */
	public final void testRandomIndexProviderWith1() {
		try {
			new RandomIndexProvider(1);
			fail("An IllegalArgumentExeption was expected.");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}

	/**
	 * Test method for
	 * {@link org.sevendroids.android.reminder.provider.RandomIndexProvider#RandomIndexProvider(int)}
	 */
	public final void testRandomIndexProviderWith2() {
		assertNotNull(new RandomIndexProvider(2));
	}

	/**
	 * Test method for
	 * {@link org.sevendroids.android.reminder.provider.RandomIndexProvider#getNextIndex()}
	 */
	public final void testGetNextIndexNotEqualsIndexBefore() {
		RandomIndexProvider provider = new RandomIndexProvider(20);
		int first = provider.getNextIndex();
		// check 4 times
		for (int i = 0; i < 4; i++) {
			int next = provider.getNextIndex();
			assertFalse("First element " + first
					+ " should not equals next element " + next + ".",
					first == next);
			first = next;
		}
	}
}
