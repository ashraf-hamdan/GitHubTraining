package net.arabic.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Fourth_Malath extends Activity {
 String value;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth__malath);
		Intent info = this.getIntent();
		value = info.getExtras().getString("value");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fourth__malath, menu);
		return true;
	}
  public void next(View v){
	  Intent intent=new Intent(this,Fifth_Duaa.class);
	  intent.putExtra("value",value);
	  startActivity(intent);
  }
}
