package com.porar.ebooks;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;

public class Main extends Activity {
    /** Called when the activity is first created. */
	private native String invokeNativeFunction();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blank);
        
        String hello = invokeNativeFunction();
        new AlertDialog.Builder(this).setMessage(hello).show();
    }
    
    static {
		System.loadLibrary("Test");
	}
}