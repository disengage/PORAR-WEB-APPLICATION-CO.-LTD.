package com.porar.ebooks.utility;

public class HTMLFile {
	
	/*
	public static String ReadTemplate(Context context,String fileName){
		InputStreamReader is = null;
		BufferedReader input = null;
		StringBuilder content = new StringBuilder();
		//String separator = System.getProperty("line.separator");
		try {
			InputStream ins = context.getAssets().open("html_template/" + fileName);
			is = new InputStreamReader(ins);
			input =  new BufferedReader(is, 1024*8);
			String inLine = null;
			while((inLine = input.readLine()) != null){
				content.append(inLine);
				//content.append(separator);
			}
			input.close();
			return content.toString();
		} catch (FileNotFoundException e) {
			return "{\"exception\":\""+e.getMessage()+"\"}";
		} catch (IOException e) {
			return "{\"exception\":\""+e.getMessage()+"\"}";
		}
	}
	*/
	
	public static String ReadTemplate(String fileName){
		return "file:///android_asset/html_template/" + fileName;
	}
}