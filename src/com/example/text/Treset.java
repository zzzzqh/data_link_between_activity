package com.example.text;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import com.example.text.Treset;
import android.content.Intent;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Treset extends Activity {

	private Button bt9;
	private Button bt10;
	private ListView t_xinxi;
	private List<String> list=new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.treset_view);
		
		bt9=(Button) findViewById(R.id.button9);
		bt10=(Button) findViewById(R.id.button10);
		t_xinxi=(ListView) findViewById(R.id.t_xinxi);
		
		

		
			Intent intent = this.getIntent();
			Bundle c = intent.getBundleExtra("data");
			list.add(c.getString("tiendtity_password"));
			list.add(c.getString("t_professical_aspect1"));
			list.add(c.getString("tidentity_age"));
			list.add(c.getString("sex"));
			list.add(c.getString("t_email"));
			list.add(c.getString("tphone_number"));
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked, list);
			t_xinxi.setAdapter(adapter);
			bt9.setOnClickListener(new OnClickListener() {

				@SuppressLint("ShowToast")
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toast.makeText(Treset.this, "个人信息修改成功", 1).show();
					Intent intent = new Intent(Treset.this, Tidentity.class);
					Treset.this.startActivity(intent);
				}
			});
			bt10.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(Treset.this, Tidentity.class);
					Treset.this.startActivity(intent);
				}
			});
		} 

	
}
