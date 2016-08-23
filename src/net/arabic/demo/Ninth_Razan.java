package net.arabic.demo;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Ninth_Razan extends Activity {
	String value;

	Button show, get;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ninth__razan);

		Intent info = this.getIntent();
		value = info.getExtras().getString("value");
	}

	public void get(View view) {
		Toast.makeText(getBaseContext(), value, Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ninth__razan, menu);
		return true;
	}

}
