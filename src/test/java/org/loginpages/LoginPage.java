package org.loginpages;

import org.bace.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement userNAme;
	
	@FindBy(name="password")
	private WebElement userPass;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getUserNAme() {
		return userNAme;
	}

	public WebElement getClickLogin() {
		return userPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void page(String text1, String text2) {
		
		sendValues(userNAme, text1);
		sendValues(userPass, text2);
		elementClick(btnLogin);

	}
		
		}
	
	
	


