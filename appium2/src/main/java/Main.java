import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws MalformedURLException, InterruptedException  {
        Scanner scan = new Scanner(System.in);
        // Configurar las capacidades deseadas
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "MyDevice"); // Cambiar por el nombre de tu dispositivo/emulador
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity"); // Esta actividad puede variar según la versión o la personalización del fabricante
        capabilities.setCapability("automationName", "uiautomator2");
        // Crear una instancia del driver
        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), capabilities);


        System.out.println("App launched");


        // presionando boton inferior de login
        System.out.println("Buscando pestaña inferior de login");
        System.out.println("Press enter to continue");
        scan.nextLine();
        MobileElement pestlogin = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView");
        pestlogin.click();


        // presionando boton de sign up
        System.out.println("Buscando pestaña superior de sign up");
        System.out.println("Press enter to continue");
        scan.nextLine();


        MobileElement pestSignUp = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
        pestSignUp.click();




        // Ingresar email a registrar
        System.out.println("Ingresando un email en el campo de email");
        System.out.println("Press enter to continue");
        scan.nextLine();


        MobileElement email = driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input-email\"]");
        email.sendKeys("test@apiumSucks.com");




        // Ingresar password (opcional)
        System.out.println("Ingresando un password en el campo de password");
        System.out.println("Press enter to continue");
        scan.nextLine();


        MobileElement pass = driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input-password\"]");
        pass.sendKeys("12345678");




        // input confirmar pass
        System.out.println("Ingresando un password en el campo de confirmar password");
        System.out.println("Press enter to continue");
        scan.nextLine();


        MobileElement pass2 = driver.findElementByXPath("//android.widget.EditText[@content-desc=\"input-repeat-password\"]");
        pass2.sendKeys("12345678");




        // Presionar el botón de sign up
        System.out.println("Presionando el boton de sign up");
        System.out.println("Press enter to continue");
        scan.nextLine();


        MobileElement botonSignUp = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup/android.widget.TextView\n");
        botonSignUp.click();


        // Esperar un poco para visualizar la acción
        Thread.sleep(15000);
        // Finalizar la sesión
        driver.quit();
    }
}
