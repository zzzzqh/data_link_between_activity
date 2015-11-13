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

public class Yadduser_1 extends Activity{
	
	private Button queren,quxiao;
	private ListView adduser_xinxi;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yadduser_1);
		
		adduser_xinxi =(ListView) findViewById(R.id.adduser_xinxi);
		queren=(Button) findViewById(R.id.adduser_1_button1);
		quxiao=(Button) findViewById(R.id.adduser_1_button2);
		
		Intent intent= this.getIntent();
		Bundle b = intent.getBundleExtra("data");

		List<String> list=new ArrayList<String>();
		list.add(b.getString("yadduser_zhigonghao"));
		list.add(b.getString("yadduser_name"));
		list.add(b.getString("yadduser_password"));
		list.add(b.getString("yadduser_power"));
		list.add(b.getString("yadduser_phone"));
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked,list);
		adduser_xinxi.setAdapter(adapter);
		
		
		
		
		
		queren.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(Yadduser_1.this, "添加成功", 1).show();
				Intent intent=new Intent(Yadduser_1.this,Yadduser.class);//不保留之前输入的信息，重新填写
				Yadduser_1.this.startActivity(intent);
				
			}
		});
		
		
		 quxiao.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent=new Intent(Yadduser_1.this,Yadduser.class);//保留之前输入的信息
					Yadduser_1.this.startActivity(intent);
				}
			});
		
		
	}		
		

	
	

}
