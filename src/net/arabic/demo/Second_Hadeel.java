package net.arabic.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class Second_Hadeel extends Activity {

	String value;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second__hadeel);

		Intent information = this.getIntent();
		value = information.getStringExtra("value");
	}

	public void clickNext(View view) {

		Toast.makeText(getBaseContext(), value, Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(this, Third_Hala.class);
		intent.putExtra("value", value);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second__hadeel, menu);
		return true;
	}

}
