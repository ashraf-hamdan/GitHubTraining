package net.arabic.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class Third_Hala extends Activity {

	String value;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third__hala);

		Intent info = getIntent();
		value = info.getStringExtra("value");

	}

	public void clickNext(View view) {
		Toast.makeText(getBaseContext(), value, Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(this, Fourth_Malath.class);
		intent.putExtra("value", value);
		startActivity(intent);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third__hala, menu);
		return true;
	}

}
