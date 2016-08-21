package net.arabic.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText value;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		connected();
	}

	/**
	 * this method called when
	 * user click on send Data Button
	 * and it called the load Data method
	 * @param view
	 */
	public void click(View view) {
		if (view.getId() == R.id.btn_sendData) {
			loadData();
		}

	}
	
	
	/**
	 * this method to connect any Tools 
	 * in my screen to object in java
	 */
	private void connected(){
		value = (EditText) findViewById(R.id.edValue);
	}

	/**
	 * this method to get Value
	 * from Edit Text and Send
	 * to second Screen .
	 */
	private void loadData(){
		// im getting text from Edit text and save it to string variable 
		String v = value.getText().toString();
		Intent i = new Intent(this,Second_Hadeel.class);
		i.putExtra("value", v);
		startActivity(i);
		
	}
}
