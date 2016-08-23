package net.arabic.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sixth_Fayrooz extends Activity {
	String value;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sixth__fayrooz);

		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			value = bundle.getString("value");
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sixth__fayrooz, menu);
		return true;
	}

	public void click(View view) {
		if (view.getId() == R.id.btn_next) {
			nextclass();
		}

	}

	public void nextclass() {

		Toast.makeText(getBaseContext(), value, Toast.LENGTH_SHORT).show();
		Intent i = new Intent(this, Seventh_Malak.class);
		i.putExtra("value", value);
		startActivity(i);

	}

}
