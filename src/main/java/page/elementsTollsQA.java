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

public class elementsTollsQA {

    private WebDriver driver;

    public elementsTollsQA() {
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }



    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")
    private WebElement botonTextBox;

    @FindBy(id = "userName")
    private WebElement txtFullName;

    @FindBy(id = "userEmail")
    private WebElement txtEmailTB;

    @FindBy(id = "currentAddress")
    private WebElement txtDireccion;

    @FindBy(id = "permanentAddress")
    private WebElement txtDireccionPerm;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    private WebElement botonSumit;



    public void textBox() throws InterruptedException {

        boolean textBox = metodosGenericos.visualizarObjeto(botonTextBox, 10);
        if (textBox) {
            Thread.sleep(400);
            botonTextBox.click();
            addWebReportImage("text Box ", "text box", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar Click en Page ToolsQA");
            Assert.assertTrue(false);
        }

    }

    public void formularioTextbox() throws InterruptedException {

        boolean name = metodosGenericos.visualizarObjeto(txtFullName, 10);
        if (name) {
            Thread.sleep(200);
            txtFullName.sendKeys("Rodrigo Espinoza Maltez");
            System.out.println("Se realiza Ingreso de Full Name");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar Ingreso de Full Name");
            Assert.assertTrue(false);
        }


        boolean email = metodosGenericos.visualizarObjeto(txtEmailTB, 10);
        if (email) {
            Thread.sleep(200);
            txtEmailTB.sendKeys("rodrigo.espinoza.maltez@ciisa.cl");
            System.out.println("Se realiza Ingreso de Email");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar Ingreso de Email");
            Assert.assertTrue(false);
        }


        boolean direccion = metodosGenericos.visualizarObjeto(txtDireccion, 10);
        if (direccion) {
            Thread.sleep(200);
            txtDireccion.sendKeys("Plaza de la dignidad sin numeroo");
            System.out.println("Se realiza Ingreso de Direccion");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar Ingreso de Direccion");
            Assert.assertTrue(false);
        }

        boolean direccionperm = metodosGenericos.visualizarObjeto(txtDireccionPerm, 10);
        if (direccionperm) {
            Thread.sleep(200);
            txtDireccionPerm.sendKeys("Plaza de la dignidad sin numero ex plaza italia o plaza Baquedano");
            System.out.println("Se realiza Ingreso de Direccion Permanente");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.FAIL, false);
            System.out.println("No es  Posible realizar Ingreso de Direccion Permanente");
            Assert.assertTrue(false);
        }

       boolean submit = metodosGenericos.visualizarObjeto(botonSumit, 10);
        if (submit) {
            Thread.sleep(400);
            botonSumit.click();
            Thread.sleep(400);
            System.out.println("Se realiza click en boton Sumit");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(true);
        } else {
            System.out.println("No es  Posible realizar click en boton Sumit ");
            addWebReportImage("Agregar Instituciones", "Ingresar datos de acceso", Status.PASS, false);
            Assert.assertTrue(false);
        }

    }

}
