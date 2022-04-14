package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver navegador;

    public HomePage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public HomePage informarNomeDoProduto(String produtoNome) {
        navegador.findElement(By.cssSelector("input[name='field-keywords']")).click();
        navegador.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys(produtoNome);

        return this;
    }

    public BuscaPage submeterPesquisa() {
        navegador.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys(Keys.ENTER);

        return new BuscaPage(navegador);
    }
}
