package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.ActitimeLogin;

public class TestActitimeLogin extends BaseTest {
	@Test
	public void login() throws IOException {
		ActitimeLogin details = new ActitimeLogin(driver);
		details.loginMethod();
		details.logoutLinkMethod();
	}
}
