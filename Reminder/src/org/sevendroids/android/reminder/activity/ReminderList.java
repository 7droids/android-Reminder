package org.sevendroids.android.reminder.activity;

import org.sevendroids.android.reminder.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * With this activity all items managed by the reminder are displayed.
 * 
 * @author 7droids.de (FA)
 * 
 */
public class ReminderList extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	setListAdapter(new ArrayAdapter<String>(this, R.layout.itemlist,
		getResources().getStringArray(R.array.reminder_items)));
    }
}