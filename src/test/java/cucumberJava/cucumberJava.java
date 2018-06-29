package cucumberJava; /**
 * Created by Ibermatica on 05/05/2017.
 */

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
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
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class cucumberJava {

    private WebDriver driver;

   //AppiumDriverLocalService appiumService;
   //  String appiumServiceUrl;


    @Dado("que me conecte a la aplicacion$")

    public void openDevices(){

        String appiumServiceUrl = "http://172.17.0.2:32768/wd/hub";

     //   appiumService = AppiumDriverLocalService.buildDefaultService();
     //   appiumService.start();
      //  appiumServiceUrl = appiumService.getUrl().toString();
      //  System.out.println("Appium Service Address : - "+ appiumServiceUrl);




        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","Xperia M2");
        capabilities.setCapability("platformVersion","5.1.1");
        //capabilities.setCapability("deviceName","Aquaris E5");
        //capabilities.setCapability("platformVersion","6.0.1");
        capabilities.setCapability("browser_Name","Android");
        //capabilities.setCapability("app","src/apk/app-pre-debug.apk");
        //capabilities.setCapability("app","C:/Appium_Demo/src/apk/AppiumDemo.apk");
        capabilities.setCapability("app","C:/jenkins2/data/jobs/Appium_Demo/workspace/src/apk/AppiumDemo.apk");
        //capabilities.setCapability("session-override","True");
        try{
          driver = new AndroidDriver(new URL(appiumServiceUrl), capabilities);
       //  driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
          driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    };




    @Cuando("^introduzco el Usuario \"([^\"]*)\" y la Contrasena \"([^\"]*)\"$")
    public void I_enter_Usuario_as_and_Contrasena_as(String arg1, String arg2) throws AWTException {

          //driver.findElement(By.id("etUser")).sendKeys(arg1);

          //driver.findElement(By.id("etCustomerName")).sendKeys(arg2);

          //driver.findElement(By.id("btn_enter")).click();

        driver.findElement(By.id("user")).sendKeys(arg1);

        driver.findElement(By.id("pass")).sendKeys(arg2);

        driver.findElement(By.id("btnLogin")).click();

    }




    @Entonces("saldra mensaje de error y no podremos entrar$")
    public void login_no_ok() {


        //Assert.assertTrue(isElementPresent(By.id("message")));

        Assert.assertTrue(isElementPresent(By.id("alertMessage")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        //driver.findElement(By.id("button1")).click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

      //  driver.quit();

        System.out.println("Stop driver");
        System.out.println("Compruebo que cambio de version en GitHub3");
        driver.quit();
        System.out.println("Stop appium service");
    //    appiumService.stop();


    }

    @Entonces("entraremos en la aplicacion$")
    public void login_ok() {

   //appium-demo     Assert.assertFalse(isElementPresent(By.id("alertMessage")));

        //Assert.assertFalse(isElementPresent(By.id("message")));

        Assert.assertFalse(isElementPresent(By.id("alertMessage")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        //driver.quit();

        System.out.println("Stop driver");
        driver.quit();
        System.out.println("Stop appium service");
    //    appiumService.stop();

    }

    @Y("^pulso en cuenta$")

    public void pulso_cuenta(){

        java.util.List<WebElement> elems = driver.findElements(By.id("lblListHeader"));

        elems.get(0).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }


    }


    @Y("^pulso en tarjetas$")

    public void pulso_tarjetas(){

        //Dimension size = driver.findElement(By.id("lblListHeader")).getSize();
        //System.out.println("================");
        //System.out.println("Size = " + size);
        //System.out.println("================");

        //driver.findElement(By.id("lblListHeader")).click();
        //String text = driver.findElement(By.id("lblListHeader")).getText();
        //System.out.println("Text = " + text);

        int contador=0;

        List<WebElement> elems = driver.findElements(By.id("lblListHeader"));

        elems.get(1).click();
        //elems.get(1).sendKeys(arg2);


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

    }


    @Y("^pulso en prestamos$")

    public void pulso_prestamos(){

        //Dimension size = driver.findElement(By.id("lblListHeader")).getSize();
        //System.out.println("================");
        //System.out.println("Size = " + size);
        //System.out.println("================");

        //driver.findElement(By.id("lblListHeader")).click();
        //String text = driver.findElement(By.id("lblListHeader")).getText();
        //System.out.println("Text = " + text);

        int contador=0;

        List<WebElement> elems = driver.findElements(By.id("lblListHeader"));

        elems.get(2).click();
        //elems.get(1).sendKeys(arg2);


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

    }

    @Entonces("veremos el saldo$")
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
    //    appiumService.stop();

    }

    @Entonces("veremos el saldo de la tarjeta")
    public void consulta_saldo_tarjeta() {

        Assert.assertTrue(isElementPresent(By.id("lblListItem")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        //driver.quit();



        System.out.println("Stop driver");
        driver.quit();
        System.out.println("Stop appium service");
    //    appiumService.stop();


    }

    @Entonces("veremos el saldo de los prestamos")
    public void consulta_saldo_prestamos() {

        Assert.assertTrue(isElementPresent(By.id("lblListItem")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        //driver.quit();



        System.out.println("Stop driver");
        driver.quit();
        System.out.println("Stop appium service");
    //    appiumService.stop();


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
