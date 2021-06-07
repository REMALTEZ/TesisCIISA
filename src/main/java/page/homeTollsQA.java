package page;

import com.aventstack.extentreports.Status;
import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.metodosGenericos;

import static utils.HtmlReport.addWebReportImage;

public class homeTollsQA {

    private WebDriver driver;

    public homeTollsQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }



    @FindBy(xpath = "//body[1]/div[1]/header[1]/a[1]/img[1]")
    private WebElement imgToolsQA;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement botonElements;



    /** Entro a la Pagina y recorro***********************************************************************************************/
    public void paginaToolsqa() throws InterruptedException {
        boolean imgtoolsqa = metodosGenericos.visualizarObjeto(imgToolsQA, 10);
        if (imgtoolsqa) {
            Thread.sleep(400);
            imgToolsQA.click();
            addWebReportImage("Se realiza el login de Tools QA", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Se realiza el login de Tools QA", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }
    }

    public void ElementsToolsQA() throws InterruptedException {

        boolean elements = metodosGenericos.visualizarObjeto(botonElements, 10);
        if (elements) {
            Thread.sleep(400);
            botonElements.click();
            addWebReportImage("Agregar Elementos", "Agregar Elementos", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Agregar Elementos", "NO se Agregar Elementos", Status.FAIL, false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }


    }

}
