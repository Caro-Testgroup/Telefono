package main.java.pageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import main.java.pageObjects.BuscarServiciosElements;
//import main.java.pageObjects.BuscarServiciosElements;
import main.java.pageObjects.IngresarBolsaElements;
import main.java.utils.ElementFetch;

import main.java.utils.Utils;
import main.java.utils.Validations;
import test.java.carritocompras.EjemploMascota_Test;

public class IngresarBolsaEvents extends EjemploMascota_Test{

	public IngresarBolsaEvents (WebDriver driver) {
		EjemploMascota_Test.driver = driver;
	}

	public static void IngresarBolsa(String Verificar) {

		String currentEvent = new Throwable().getStackTrace()[0].getMethodName();

		try {
			Utils.outputInfo("Ha comenzado el evento: " + currentEvent);

			
			WebDriverWait wait = new WebDriverWait(driver, 50);
			ElementFetch elementFetch = new ElementFetch();

			WebElement labelCompras = elementFetch.getWebElement("XPATH",
					IngresarBolsaElements.labelcompras);
			wait.until(ExpectedConditions.visibilityOf(labelCompras));
			
			
			WebElement buttonAgregarElement = elementFetch.getWebElement("XPATH",
					IngresarBolsaElements.buttonAgregar);
			wait.until(ExpectedConditions.elementToBeClickable(buttonAgregarElement));
			buttonAgregarElement.click();
			Thread.sleep(5000);
						
			
			WebElement buttonFinalizacionElement = elementFetch.getWebElement("XPATH",
					IngresarBolsaElements.buttonFinalizacion);
			wait.until(ExpectedConditions.elementToBeClickable(buttonFinalizacionElement));
			buttonFinalizacionElement.click();
			Thread.sleep(5000);
			
			
			WebElement labelResumen = elementFetch.getWebElement("XPATH",
					IngresarBolsaElements.labelResumen);
			wait.until(ExpectedConditions.visibilityOf(labelResumen));
			String textoPagina = labelResumen.getText();
							
						
			Validations.trueBooleanCondition(textoPagina.equalsIgnoreCase("Resumen Servicios"),
					"Se puede visualizar el producto dentro de'" + textoPagina + "' correctamente",
					"No se ha ingresado a la página correcta", currentEvent);
			
			
		} catch (Exception e) {
			Utils.eventFailed(currentEvent, e.getMessage());
		}
	}

	
	}

