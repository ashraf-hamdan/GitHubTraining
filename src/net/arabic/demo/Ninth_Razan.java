package net.arabic.demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Ninth_Razan extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ninth__razan);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ninth__razan, menu);
		return true;
	}

}
