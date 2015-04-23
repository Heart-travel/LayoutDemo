package com.example.layoutdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
/*import android.widget.ProgressBar;*/

public class MainActivity extends Activity implements OnClickListener{

	private Button button;
/*	private ProgressBar progressBar;*/
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (Button) findViewById(R.id.button);
/*		progressBar = (ProgressBar) findViewById(R.id.progress_bar);*/
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.button:
/*				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				startActivity(intent);*/
				
				// press the button to determine if a progressBar is needed to show
/*				if (progressBar.getVisibility() == View.GONE) {
					progressBar.setVisibility(View.VISIBLE);
				} else {
					progressBar.setVisibility(View.GONE);
				}*/
				
/*				int progress = progressBar.getProgress();
				progress = progress + 10;
				progressBar.setProgress(progress);*/
				
				AlertDialog.Builder dialog = new AlertDialog.Builder (MainActivity.this);
				dialog.setTitle("This is Dialog");
				dialog.setMessage("Something important.");
				dialog.setCancelable(false);
				dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
					}
				});
				
				dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
					}
				});
				dialog.show();
				break;
			default:
				break;
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
