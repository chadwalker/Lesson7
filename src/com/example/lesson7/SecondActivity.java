package com.example.lesson7;

import android.app.Activity;
import android.os.Bundle;

public class SecondActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstance)
	{
		super.onCreate(savedInstance);
		setContentView(new CustomView(this));
		
	}
	
}
