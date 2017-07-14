package cucumberJava; /**
 * Created by Ibermatica on 05/05/2017.
 */

import cucumber.annotation.es.Cuando;
import cucumber.annotation.es.Dado;
import cucumber.annotation.es.Entonces;
import cucumber.annotation.es.Y;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class cucumberJava {

    private WebDriver driver;

    AppiumDriverLocalService appiumService;
    String appiumServiceUrl;


    @Dado("que me conecto a la aplicacion$")

    public void openDevices(){

        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
        appiumServiceUrl = appiumService.getUrl().toString();
        System.out.println("Appium Service Address : - "+ appiumServiceUrl);


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","Xperia M2");
        capabilities.setCapability("platformVersion","5.1.1");
        capabilities.setCapability("browser_Name","Android");
        capabilities.setCapability("app","src/apk/AppiumDemo.apk");
        try{
          driver = new AndroidDriver(new URL(appiumServiceUrl), capabilities);
      //      driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    };




    @Cuando("^introduzco el Usuario \"([^\"]*)\" y la Contraseña \"([^\"]*)\"$")
    public void I_enter_Usuario_as_and_Contrasena_as(String arg1, String arg2) throws AWTException {

        driver.findElement(By.id("user")).sendKeys(arg1);

        driver.findElement(By.id("pass")).sendKeys(arg2);

        driver.findElement(By.id("btnLogin")).click();

    }


    @Y("^para consultar saldo introduzco el Usuario \"([^\"]*)\" y la Contraseña \"([^\"]*)\"$")

    public void consulta_saldo(String arg1, String arg2) throws AWTException {

        driver.findElement(By.id("user")).sendKeys(arg1);

        driver.findElement(By.id("pass")).sendKeys(arg2);

        driver.findElement(By.id("btnLogin")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

    }

    @Cuando("^pulso en cuenta$")

    public void pulso_cuenta(){

        driver.findElement(By.id("lblListHeader")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

    }

    @Entonces("sale mensaje de error y no podemos entrar$")
    public void login_no_ok() {


        Assert.assertTrue(isElementPresent(By.id("alertMessage")));


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

      //  driver.quit();

        System.out.println("Stop driver");
        System.out.println("Compruebo que cambio de version en GitHub3");
        driver.quit();
        System.out.println("Stop appium service");
        appiumService.stop();


    }

    @Entonces("entramos en la aplicacion$")
    public void login_ok() {

        Assert.assertFalse(isElementPresent(By.id("alertMessage")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        //driver.quit();

        System.out.println("Stop driver");
        driver.quit();
        System.out.println("Stop appium service");
        appiumService.stop();

    }

    @Entonces("vemos el saldo$")
    public void consulta_saldo() {

        Assert.assertTrue(isElementPresent(By.id("listaCuentas")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        //driver.quit();

        System.out.println("Stop driver");
        driver.quit();
        System.out.println("Stop appium service");
        appiumService.stop();

    }



    public boolean isElementPresent(By by){
        try {
            driver.findElement(by);
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }


}
