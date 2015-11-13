package com.example.text;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.example.text.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings.System;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Yreset extends Activity {

	private Button ybt10;
	private Button ybt11;
	
	private ListView y_xinxi;
	private List<String> list=new ArrayList<String>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yreset_view);
		ybt10=(Button) findViewById(R.id.ybutton10);
		ybt11=(Button) findViewById(R.id.ybutton11);
		
        y_xinxi=(ListView) findViewById(R.id.y_xinxi);
		

       Intent intent = this.getIntent();
		Bundle c = intent.getBundleExtra("data");
		
		list.add(c.getString("yidentity_password"));
		list.add(c.getString("y_xueyuan"));
		list.add(c.getString("yidentity_age"));
		list.add(c.getString("sex"));
		list.add(c.getString("y_email"));
		list.add(c.getString("yphone_number"));
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked, list);
		y_xinxi.setAdapter(adapter);
	
		
		ybt10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(Yreset.this, "个人信息修改成功", 1).show();
				Intent intent=new Intent(Yreset.this,Yidentity.class);
				Yreset.this.startActivity(intent);
			}
		});
		ybt11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Yreset.this,Yidentity.class);
				Yreset.this.startActivity(intent);
			}
		});
	}

	
}
