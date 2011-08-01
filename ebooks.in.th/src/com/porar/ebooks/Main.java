package com.porar.ebooks;

import com.porar.ebooks.javascript.IToastListener;
import com.porar.ebooks.javascript.JSInterface;
import com.porar.ebooks.utility.HTMLFile;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class Main extends Activity {
    /** Called when the activity is first created. */
	private WebView webViewDefault;
	private WebSettings webSetting;
	private JSInterface jsInterface;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Prepare WebView
        webViewDefault = (WebView)this.findViewById(R.id.WebView_Default);
        webSetting = webViewDefault.getSettings();
        webSetting.setJavaScriptEnabled(true);
        
        //Load data from file
        webViewDefault.loadUrl(HTMLFile.ReadTemplate("default.html"));
        jsInterface = new JSInterface(webViewDefault);
        jsInterface.setOnCallToastListener(new IToastListener(){
			public void callToast() {
				Toast.makeText(Main.this.getBaseContext(), "Call From JavaScript", Toast.LENGTH_LONG).show();
			}
        });
        
        //Set interface object to webview
        webViewDefault.addJavascriptInterface(jsInterface, "jsinterface");
    }
}