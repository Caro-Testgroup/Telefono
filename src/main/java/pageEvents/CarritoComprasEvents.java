package main.java.pageEvents;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.pageObjects.CarritoComprasElements;
import main.java.utils.ElementFetch;
import main.java.utils.Events;
import main.java.utils.Utils;
import main.java.utils.Validations;
import test.java.carritocompras.Ejemplo_Test;

public class CarritoComprasEvents extends Ejemplo_Test{

	public CarritoComprasEvents(WebDriver driver) {   
		Ejemplo_Test.driver = driver;
	}

	public static void iniciarSesion(String usuario, String contrasena) {

		String currentEvent = new Throwable().getStackTrace()[0].getMethodName();

		try {
			Utils.outputInfo("Ha comenzado el evento: " + currentEvent);

			WebDriverWait wait = new WebDriverWait(driver, 50);
			ElementFetch elementFetch = new ElementFetch();

			WebElement inputNombreUsuarioElement = elementFetch.getWebElement("XPATH",
					CarritoComprasElements.inputUsuario);
			wait.until(ExpectedConditions.visibilityOf(inputNombreUsuarioElement));
			Events.writeOnInput(inputNombreUsuarioElement, usuario);

			WebElement inputContrasenaElement = elementFetch.getWebElement("XPATH",
					CarritoComprasElements.inputContrasena);
			wait.until(ExpectedConditions.visibilityOf(inputContrasenaElement));
			Events.writeOnInput(inputContrasenaElement, contrasena);

			WebElement buttonIniciarSesionElement = elementFetch.getWebElement("XPATH",
					CarritoComprasElements.buttonIniciarSesion);
			wait.until(ExpectedConditions.elementToBeClickable(buttonIniciarSesionElement));
			Events.clickButton(buttonIniciarSesionElement);

			WebElement labelPaginaProductosElement = elementFetch.getWebElement("XPATH",
					CarritoComprasElements.labelPaginaProductos);
			wait.until(ExpectedConditions.visibilityOf(labelPaginaProductosElement));
			String textoPagina = labelPaginaProductosElement.getText();

			Validations.trueBooleanCondition(textoPagina.equalsIgnoreCase("Products"),
					"Se ha ingresado a la página '" + textoPagina + "' correctamente",
					"No se ha ingresado a la página correcta", currentEvent);

		} catch (Exception e) {
			Utils.eventFailed(currentEvent, e.getMessage());
		}
	}

	public static void seleccionarProducto(String producto) {

		String currentEvent = new Throwable().getStackTrace()[0].getMethodName();

		try {
			
			Utils.outputInfo("Ha comenzado el evento: " + currentEvent);

			WebDriverWait wait = new WebDriverWait(driver, 50);
			ElementFetch elementFetch = new ElementFetch();

			List<WebElement> listProductosElement = elementFetch.getListWebElements("XPATH", CarritoComprasElements.listProductos);
			wait.until(ExpectedConditions.visibilityOfAllElements(listProductosElement));
			
			for (int i = 0; i < listProductosElement.size(); i++) {
				String nombreProducto = listProductosElement.get(i).getText();
				if (nombreProducto.equalsIgnoreCase(producto)) {
					WebElement buttonAgregarElement = elementFetch.getWebElement("XPATH", CarritoComprasElements.buttonAgregarCarro.replace("0", String.valueOf(i+1)));
					Events.clickButton(buttonAgregarElement);
				}
			}
			
			WebElement spanCarritoElement = elementFetch.getWebElement("XPATH", CarritoComprasElements.labelNumeroCarrito);
			wait.until(ExpectedConditions.visibilityOf(spanCarritoElement));
			String cantidadCarrito = spanCarritoElement.getText();
			Validations.trueBooleanCondition(cantidadCarrito.contains("1"),
					"Se ha agregado el producto al carrito correctamente",
					"No se ha agregado el producto al carrito correctamente", currentEvent);

		} catch (Exception e) {
			Utils.eventFailed(currentEvent, e.getMessage());
		}
	}
}
