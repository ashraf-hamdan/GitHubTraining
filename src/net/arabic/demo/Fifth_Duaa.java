package net.arabic.demo;

import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Fifth_Duaa extends Activity {

	EditText ed1;
	Button btn1;
	String st1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fifth__duaa);
		btn1=(Button)findViewById(R.id.btnduaa);
		ed1=(EditText)findViewById(R.id.edduaa);
		Intent getintent1=this.getIntent();
		st1=getintent1.getStringExtra("value");
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent putint1= new Intent(Fifth_Duaa.this,Sixth_Fayrooz.class);
				putint1.putExtra("value",st1);
				startActivity(putint1);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fifth__duaa, menu);
		return true;
	}

}
