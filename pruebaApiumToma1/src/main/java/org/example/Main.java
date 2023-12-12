package org.example;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import java.net.MalformedURLException;
import java.net.URL;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) throws MalformedURLException, InterruptedException  {
        // Configurar las capacidades deseadas
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel"); // Cambiar por el nombre de tu dispositivo/emulador
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity"); // Esta actividad puede variar según la versión o la personalización del fabricante
        capabilities.setCapability("automationName", "uiautomator2");
        // Crear una instancia del driver
        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), capabilities);

//        MobileElement pestlogin = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView");
//        pestlogin.click();
//
//        MobileElement pestSignUp = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
//        pestSignUp.click();
//
//        // Ingresar email a registrar
//        MobileElement email = driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input-email\"]");
//        email.sendKeys("santi@apiumSucks.com");
//
//        // Ingresar password (opcional)
//        MobileElement pass = driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input-password\"]");
//        pass.sendKeys("12345678");
//        //confirmar pass
//        MobileElement pass2 = driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input-repeat-password\"]");
//        pass.sendKeys("12345678");
//
//        // Guardar el contacto
//        MobileElement botonSignUp = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup/android.widget.TextView\n");
//        botonSignUp.click();
//
//        // Esperar un poco para visualizar la acción
//        Thread.sleep(15000);
//        // Finalizar la sesión
//        driver.quit();

        TouchAction action = new TouchAction(androidDriver);
        action.press(0, 500)
                .waitAction(200)
                .moveTo(0, 200)
                .release()
                .perform();

    }


}