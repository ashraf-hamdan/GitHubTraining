package net.arabic.demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Eighth_Bana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eighth__bana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eighth__bana, menu);
		return true;
	}

}
