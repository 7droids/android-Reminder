/**
 * 
 */
package org.sevendroids.android.reminder.provider;

import java.util.Random;

/**
 * @author 7droids.de (FA)
 * 
 */
public class RandomIndexProvider {

	private static final int MAX_NUMBER_OF_TRIES = 10;
	private final Random random = new Random();
	private int itemNumber = 0;

	private int lastIndex = -1;

	/**
	 * @param i_itemNumber
	 *            Number of items for which an index need to be created. Must be
	 *            larger then 1
	 */
	public RandomIndexProvider(int i_itemNumber) {
		if (i_itemNumber <= 1)
			throw new IllegalArgumentException(
					"The number of items must be larger then 1");
		this.itemNumber = i_itemNumber;
	}

	/**
	 * @return Provides the next item index.
	 */
	public int getNextIndex() {
		int next = -1;
		int count = 0;
		while (((next = random.nextInt(itemNumber)) == lastIndex)
				&& (count < MAX_NUMBER_OF_TRIES))
			count++;
		lastIndex = next;
		return next;
	}
}
