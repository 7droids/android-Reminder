package org.sevendroids.android.reminder.activity;

import org.sevendroids.android.reminder.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * This class implements the dashboard pattern. It is the home screen of the
 * application.
 * 
 * @author 7droids.de (FA)
 */
public class Dashboard extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.dashboard);
    }

    public void onHomeClick(View view) {
	Toast.makeText(this, getResources().getText(R.string.app_name),
		Toast.LENGTH_SHORT).show();
    }

    public void onNextItemClick(View view) {
	Toast.makeText(this, getResources().getText(R.string.nextItem),
		Toast.LENGTH_SHORT).show();
    }

    public void onAllItemsClick(View view) {
	startActivity(new Intent(this, ReminderList.class));
	Toast.makeText(this, getResources().getText(R.string.allItems),
		Toast.LENGTH_SHORT).show();
    }
}