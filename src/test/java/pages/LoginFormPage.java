package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginFormPage extends BasePage{

    public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginFormPage digitarLogin(String login){
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("Julio0001");

        return this;
    }

    public LoginFormPage digitarSenha(String password){
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(password);

        return this;
    }

    public SecretaPage clicarSignIn(){
        //Clicar no link com o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        return new SecretaPage(navegador);
    }

    public SecretaPage fazerLogin(String login, String senha){
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("Julio0001");
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(senha);
        navegador.findElement(By.linkText("SIGN IN")).click();

        return new SecretaPage(navegador);
    }
}
