package com.example.text;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Yresetuser_1 extends Activity{
	
	private Button queren,quxiao;
	private ListView yresetuser_xinxi;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yresetuser_1);
		
		yresetuser_xinxi =(ListView) findViewById(R.id.yresetuser_xinxi);
		queren=(Button) findViewById(R.id.yresetuser_1_button1);
		quxiao=(Button) findViewById(R.id.yresetuser_1_button2);
		
		Intent intent= this.getIntent();
		Bundle b = intent.getBundleExtra("data");

		List<String> list=new ArrayList<String>();
		list.add(b.getString("yresetuser_zhigonghao"));
		list.add(b.getString("yresetuser_name"));
		list.add(b.getString("yresetuser_password"));
		list.add(b.getString("yresetuser_power"));
		list.add(b.getString("yresetuser_phone"));
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked,list);
		yresetuser_xinxi.setAdapter(adapter);
		
		
		
		
		
		queren.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(Yresetuser_1.this, "ÐÞ¸Ä³É¹¦", 1).show();
				Intent intent=new Intent(Yresetuser_1.this,Yresetuser.class);
				Yresetuser_1.this.startActivity(intent);
				
			}
		});
		
		
		 quxiao.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent=new Intent(Yresetuser_1.this,Yresetuser.class);
					Yresetuser_1.this.startActivity(intent);
				}
			});
		
		
	}	
}
		

