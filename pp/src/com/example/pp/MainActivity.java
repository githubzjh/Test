package com.example.pp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.ImageView;

public class MainActivity extends Activity 
{
	
	private ImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
//
		setContentView(R.layout.activity_main);
		iv=(ImageView)findViewById(R.id.imageView1);
		Bitmap bt=BitmapFactory.decodeFile(Environment.getExternalStorageDirectory().getAbsolutePath()+"/DCIM/Screenshots/IMG_20150608_144008.jpg");
		
		iv.setImageBitmap(bt);
			
		
	}

}
