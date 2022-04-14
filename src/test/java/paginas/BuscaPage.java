package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaPage {
    private WebDriver navegador;

    public BuscaPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public String capturarNomeDoProdutoEncontrado() {
        return navegador.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div[2]/div[1]/h2/a/span")).getText();
    }
}
