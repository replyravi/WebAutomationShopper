package stepDefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Capab extends Base {

	public WebDriver driver =capabilities();

	public Capab() throws MalformedURLException {}
}
