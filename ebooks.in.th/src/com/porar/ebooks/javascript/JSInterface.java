package com.porar.ebooks.javascript;

import android.webkit.WebView;

public class JSInterface {
	private WebView webView;
	private IToastListener toastListener;
	
	public JSInterface(WebView webView){
		this.webView = webView;
	}
	
	public String toString(){
		return webView.getOriginalUrl();
	}
	
	public void callToast(){
		toastListener.callToast();
	}
	
	public void setOnCallToastListener(IToastListener toastListener){
		this.toastListener = toastListener;
	}
}