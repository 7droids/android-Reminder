package org.sevendroids.android.reminder.activity;

import org.sevendroids.android.reminder.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * This class implements the dashboard pattern. It is the home screen of the
 * application.
 * 
 * @author 7droids.de (FA)
 */
public class Dashboard extends FragmentActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.dashboard, menu);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onOptionsItemSelected(android.view.MenuItem)
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// app icon in action bar clicked; go home
			Intent intent = new Intent(this, Dashboard.class);
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	public void onHomeClick(View view) {
		Toast.makeText(this, getResources().getText(R.string.app_name),
				Toast.LENGTH_SHORT).show();
	}

	public void onNextItemClick(View view) {
		Toast.makeText(this, getResources().getText(R.string.nextItem),
				Toast.LENGTH_SHORT).show();
	}

	public void onNextRandomItemClick(View view) {
		Toast.makeText(this, getResources().getText(R.string.nextRandomItem),
				Toast.LENGTH_SHORT).show();
	}

	public void onIgnoreItemClick(View view) {
		Toast.makeText(this, getResources().getText(R.string.ignoreItem),
				Toast.LENGTH_SHORT).show();
	}

	public void onAllItemsClick(View view) {
		startActivity(new Intent(this, ReminderList.class));
		Toast.makeText(this, getResources().getText(R.string.allItems),
				Toast.LENGTH_SHORT).show();
	}
}