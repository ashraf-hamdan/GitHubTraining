<<<<<<< HEAD
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
=======
package net.arabic.demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Fourth_Malath extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth__malath);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fourth__malath, menu);
		return true;
	}

}
>>>>>>> 782f8809378415f521716547f678de30d774302c
