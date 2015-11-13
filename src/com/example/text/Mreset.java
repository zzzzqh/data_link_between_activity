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

public class Mreset extends Activity {

	private Button bt1;
	private Button bt2;
	private ListView m_xinxi;
	private List<String> list=new ArrayList<String>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mreset_view);
		
		bt1=(Button) findViewById(R.id.mrbutton1);
		bt2=(Button) findViewById(R.id.mrbutton2);
		m_xinxi=(ListView) findViewById(R.id.m_xinxi);
		

		Intent intent = this.getIntent();
		Bundle c = intent.getBundleExtra("data");
		list.add(c.getString("miendtity_password"));
		list.add(c.getString("m_professical_aspect1"));
		list.add(c.getString("midentity_age"));
		list.add(c.getString("sex"));
		list.add(c.getString("m_email"));
		list.add(c.getString("mphone_number"));
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked, list);
		m_xinxi.setAdapter(adapter);
		
		
		
		
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(Mreset.this, "个人信息修改成功", 1).show();
				Intent intent=new Intent(Mreset.this,Midentity.class);
	            Mreset.this.startActivity(intent);
			}
		});
         bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Mreset.this,Midentity.class);
	            Mreset.this.startActivity(intent);
			}
         });
	}
	
	
}
