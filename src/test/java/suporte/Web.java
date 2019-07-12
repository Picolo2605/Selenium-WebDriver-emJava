package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Matheus\\Desktop\\SELENIUM - AUTOMAÇÃO\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando na pagina do taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

        return navegador;
    }
}
