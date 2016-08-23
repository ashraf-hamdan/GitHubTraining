package net.arabic.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class Fourth_Malath extends Activity {
	String value;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth__malath);
		Intent info = this.getIntent();
		value = info.getExtras().getString("value");

	}

	public void next(View v) {
		Toast.makeText(getBaseContext(), value, Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(this, Fifth_Duaa.class);
		intent.putExtra("value", value);
		startActivity(intent);
	}
}
