package org.runner;

import java.io.IOException;

import org.bace.LibGlobal;
import org.loginpages.LoginPage;

public class Launch extends LibGlobal{
	public static void main(String[] args) throws IOException {
		LibGlobal global=new LibGlobal();
		global.launchBrowser();
		global.loadUrl("http://adactinhotelapp.com/");
		global.maximize();
		
		LoginPage login=new LoginPage();
		login.page("abeesh1996", "Abeesh@12");
		
	}

	
	
	private void t1() {
		System.out.println("t1");

	}
	private void t2() {
System.out.println("t2");
	}
	private void t3() {
System.out.println("t3");
	}
}
