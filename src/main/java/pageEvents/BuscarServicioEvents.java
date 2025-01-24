package main.java.pageEvents;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.pageObjects.BuscarServiciosElements;
import main.java.utils.ElementFetch;
import main.java.utils.Events;
import main.java.utils.Utils;
import main.java.utils.Validations;
import test.java.carritocompras.EjemploMascota_Test;

public class BuscarServicioEvents extends EjemploMascota_Test{

	public BuscarServicioEvents(WebDriver driver) {
		EjemploMascota_Test.driver = driver;
	}

	public static void buscarservicio(String producto) {

		String currentEvent = new Throwable().getStackTrace()[0].getMethodName();

		try {
			Utils.outputInfo("Ha comenzado el evento: " + currentEvent);

		
			WebDriverWait wait = new WebDriverWait(driver, 50);
			ElementFetch elementFetch = new ElementFetch();

			WebElement inputBuscarserviciosElement = elementFetch.getWebElement("XPATH",
					BuscarServiciosElements.inputServicio);
			wait.until(ExpectedConditions.visibilityOf(inputBuscarserviciosElement));
			Events.writeOnInput(inputBuscarserviciosElement, producto);
			

			WebElement buttonBusquedaElement = elementFetch.getWebElement("XPATH",
					BuscarServiciosElements.buttonBusqueda);
			wait.until(ExpectedConditions.elementToBeClickable(buttonBusquedaElement));
			buttonBusquedaElement.click();
			Thread.sleep(500);
			
			WebElement labelCatalogoProductos = elementFetch.getWebElement("XPATH",
					BuscarServiciosElements.labelCatalogoProductos );
			wait.until(ExpectedConditions.visibilityOf(labelCatalogoProductos));
			String textoPagina = labelCatalogoProductos.getText();
				
			
				Validations.trueBooleanCondition(textoPagina.equalsIgnoreCase("Masaje Canino"),
				   "Se ha ingresado a la página '" + textoPagina + "' correctamente",
					"No se ha ingresado a la página correcta", currentEvent);
			

				
							
		} catch (Exception e) {
			Utils.eventFailed(currentEvent, e.getMessage());
		}
	}
}	


