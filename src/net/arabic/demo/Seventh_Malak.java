package net.arabic.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Seventh_Malak extends Activity {
	String value ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seventh__malak);
		
		Intent info = getIntent();
        value = info.getStringExtra("value");

	}
	public void GoToNext(View view) 
	{
        Intent intent = new Intent(this, Eighth_Bana.class);
        intent.putExtra("value", value);
        startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.seventh__malak, menu);
		return true;
	}

}
