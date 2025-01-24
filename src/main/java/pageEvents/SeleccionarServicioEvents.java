package main.java.pageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.pageObjects.SeleccionarServicioElements;
import main.java.utils.ElementFetch;
//import main.java.utils.Events;
import main.java.utils.Utils;
import main.java.utils.Validations;
import test.java.carritocompras.EjemploMascota_Test;

public class SeleccionarServicioEvents extends EjemploMascota_Test{

	public SeleccionarServicioEvents (WebDriver driver) {
		EjemploMascota_Test.driver = driver;
	}

	public static <Alert> void SeleccionarServicio(String seleccion) {

		String currentEvent = new Throwable().getStackTrace()[0].getMethodName();

		try {
			Utils.outputInfo("Ha comenzado el evento: " + currentEvent);

			
			WebDriverWait wait = new WebDriverWait(driver, 50);
			ElementFetch elementFetch = new ElementFetch();  

			
			WebElement buttonAgregarElement = elementFetch.getWebElement("XPATH",
					SeleccionarServicioElements.buttonAgregar);
			wait.until(ExpectedConditions.elementToBeClickable(buttonAgregarElement));
			buttonAgregarElement.click();
			Thread.sleep(2000);
			
			
			WebElement buttonCarritoElement = elementFetch.getWebElement("XPATH",
					SeleccionarServicioElements.buttonCarrito);
			wait.until(ExpectedConditions.elementToBeClickable(buttonCarritoElement));
			buttonCarritoElement.click();
								
			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
			
			Thread.sleep(2000);
			           
			
			WebElement buttonIrBolsaElement = elementFetch.getWebElement("XPATH",
					SeleccionarServicioElements.buttonIrBolsa);
			wait.until(ExpectedConditions.elementToBeClickable(buttonIrBolsaElement));
			buttonIrBolsaElement.click();
			Thread.sleep(5000);
			
			
			WebElement labelCatalogoServicio = elementFetch.getWebElement("XPATH",
					SeleccionarServicioElements.labelCatalogoServicio);
			wait.until(ExpectedConditions.visibilityOf(labelCatalogoServicio));
			String textoPagina = labelCatalogoServicio.getText();
				
			
				Validations.trueBooleanCondition(textoPagina.equalsIgnoreCase("Carro de compras"),
				   "Se ha ingresado un producto a '" + textoPagina + "' correctamente",
					"No se ha ingresado a la página correcta", currentEvent);

								
						
		} catch (Exception e) {
			Utils.eventFailed(currentEvent, e.getMessage());
		}
	 }
}