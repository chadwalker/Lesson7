package com.example.lesson7;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;


public class MainActivity extends Activity {

   @Override
   protected void onCreate(Bundle savedInstanceStatus)
   {
	   super.onCreate(savedInstanceStatus);
	   setContentView(R.layout.activity_main);
	   
	   Button button1 = (Button) findViewById(R.id.button1);
	   button1.setOnClickListener(new OnClickListener() {
		   
		   @Override
		   public void onClick(View v)
		   {
			   Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			   startActivity(intent);
		   }
	   });
   }
   
   
}
