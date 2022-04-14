package modulos.pesquisa;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.HomePage;

import java.time.Duration;

@DisplayName("Testes Site Americanas")
public class PesquisaTest {
    private WebDriver navegador;

    @BeforeEach
    public void beforeEach() {
        // Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        this.navegador = new ChromeDriver();

        // Vou maximizar a Tela
        this.navegador.manage().window().maximize();

        // Vou esperar
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Navegar para a página da Americanas Web
        this.navegador.get("https://www.amazon.com.br/");
    }

    @Test
    @DisplayName("Pesquisar um produto")
    public void testPesquisarUmProduto() {
        String nomeProdutoEncontrado = new HomePage(navegador)
                .informarNomeDoProduto("Ovo de Páscoa Kit Kat Nestlé 332g")
                .submeterPesquisa()
                .capturarNomeDoProdutoEncontrado();

        Assertions.assertEquals("Ovo de Páscoa Kit Kat Nestlé 332g", nomeProdutoEncontrado);
    }

    @AfterEach
    public void afterEach() {
        navegador.quit();
    }

}
