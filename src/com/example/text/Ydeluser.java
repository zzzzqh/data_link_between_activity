package com.example.text;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Ydeluser extends Activity {

	private Button del;
	private Button back;
	


	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ydeluser_view);
		del=(Button) findViewById(R.id.ybutton19);
		back=(Button) findViewById(R.id.ybutton20);
		del.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(Ydeluser.this, "删除用户成功", 1).show();
				Intent intent=new Intent(Ydeluser.this,Ymanageruser.class);
				Ydeluser.this.startActivity(intent);
			}
		});
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Ydeluser.this,Ymanageruser.class);
				Ydeluser.this.startActivity(intent);
			}
		});
	}

	
}
