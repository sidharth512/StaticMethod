
package Readconfilt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconflitdata {

	public static String readmethod() throws IOException  {
		FileInputStream file=new FileInputStream("C:\\Users\\User 1\\Desktop\\ecplics\\StaticMethod\\confilgt");
		Properties  pro=new Properties();
		pro.load(file);
		
		String loginuser=pro.getProperty("user");
		return loginuser;
	}
	public static String readpwd() throws IOException  {
		FileInputStream data=new FileInputStream("C:\\Users\\User 1\\Desktop\\ecplics\\StaticMethod\\confilgt");
		Properties pro=new Properties();
		pro.load(data);
		
	
		String pwd=pro.getProperty("password");
		return pwd;
		
	}
	public static String div() throws IOException {
		FileInputStream driv=new FileInputStream("C:\\Users\\User 1\\Desktop\\ecplics\\StaticMethod\\confilgt");
		Properties pro=new Properties();
		pro.load(driv);
	String	Div=pro.getProperty("driver");
	return Div;
		
	}
	public static String readurl() throws IOException{
		FileInputStream file=new FileInputStream("C:\\Users\\User 1\\Desktop\\ecplics\\StaticMethod\\confilgt");
		Properties pro=new Properties();
		pro.load(file);
		String URL=pro.getProperty("url");
		return URL;
		
	}

}
