package com.example.linkify;

import com.example.getvaluesfromedittext.R;

import android.os.Bundle;
import android.app.Activity;
import android.text.util.Linkify;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity 

{
	//Define Edittext,Textview and Button as et,tv,b respectively
	EditText et;
    TextView tv;
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Refer the edittext, textview , button with their respective id's from XML
		et=(EditText)findViewById(R.id.editText1);
		tv=(TextView)findViewById(R.id.textView1);
		b=(Button)findViewById(R.id.button1);
		
		//Set the listener for Button , we use onclik listener here 
		b.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				
				//Storing the value got from edittext in String "str"
				String str=et.getText().toString();
				//Setting the value got from edittext in Textview 
				tv.setText(str);
				Linkify.addLinks(tv,  Linkify.WEB_URLS|Linkify.EMAIL_ADDRESSES|Linkify.PHONE_NUMBERS);
				
			}
		});
	}

	

}
