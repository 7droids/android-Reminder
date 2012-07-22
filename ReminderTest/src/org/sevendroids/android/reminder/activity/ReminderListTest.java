/**
 * 
 */
package org.sevendroids.android.reminder.activity;

import android.app.ListActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.ListView;

/**
 * @author 7droids.de (FA)
 * 
 */
public class ReminderListTest extends
		ActivityInstrumentationTestCase2<ReminderList> {

	private ListActivity listActivity;
	private ListView listView;

	/**
	 * @param name
	 */
	public ReminderListTest() {
		super("ord.sevendroids.android.reminder.activity", ReminderList.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		listActivity = getActivity();
		listView = listActivity.getListView();
	}

	public final void testContentHasElements() {
		assertEquals(20, listView.getAdapter().getCount());
	}

	@UiThreadTest
	public final void testRestartKeepsSelection() {
		listView.requestFocus();
		listView.setSelection(7);
		listActivity.finish();
		listActivity = getActivity();
		final int selectedRow = listView.getSelectedItemPosition();
		assertEquals("Selektion wird nicht wieder hergestellt", selectedRow, 7);
	}
}
