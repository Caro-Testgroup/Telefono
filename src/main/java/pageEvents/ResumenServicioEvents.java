package main.java.pageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.pageObjects.ResumenServicioElements;
import main.java.utils.ElementFetch;
import main.java.utils.Utils;
import main.java.utils.Validations;
import test.java.carritocompras.EjemploMascota_Test;

public class ResumenServicioEvents extends EjemploMascota_Test{

	public ResumenServicioEvents (WebDriver driver) {
		EjemploMascota_Test.driver = driver;
	}

	public static void ResumenServicio (String Nombre, String Fecha , String Nombremascota , String Edad , String Raza) {

		String currentEvent = new Throwable().getStackTrace()[0].getMethodName();

		try {
			Utils.outputInfo("Ha comenzado el evento: " + currentEvent);

			
			WebDriverWait wait = new WebDriverWait(driver, 50);
			ElementFetch elementFetch = new ElementFetch();
			

			WebElement inputNombreElement = elementFetch.getWebElement("XPATH",
					ResumenServicioElements.inputNombre);
			wait.until(ExpectedConditions.visibilityOf(inputNombreElement));
			inputNombreElement.sendKeys(Nombre);
	
			
			WebElement inputFechaElement = elementFetch.getWebElement("XPATH",
					ResumenServicioElements.inputFecha);
			wait.until(ExpectedConditions.visibilityOf(inputFechaElement));
			inputFechaElement.sendKeys(Fecha);
				
			
			WebElement buttonProfesionalElement = elementFetch.getWebElement("XPATH",
					ResumenServicioElements.buttonProfesional);
			wait.until(ExpectedConditions.elementToBeClickable(buttonProfesionalElement));
			buttonProfesionalElement.click();
			Thread.sleep(500);
						
			WebElement buttonProfesionaldosElement = elementFetch.getWebElement("XPATH",
					ResumenServicioElements.buttonProfesionaldos);
			wait.until(ExpectedConditions.elementToBeClickable(buttonProfesionaldosElement));
			buttonProfesionaldosElement.click();
			Thread.sleep(500);
	
						
			WebElement inputNombremascotaElement = elementFetch.getWebElement("XPATH",
					ResumenServicioElements.inputNombremascota);
			wait.until(ExpectedConditions.visibilityOf(inputNombremascotaElement));
			inputNombremascotaElement.sendKeys(Nombremascota);
			
			
			WebElement inputEdadmascotaElement = elementFetch.getWebElement("XPATH",
					ResumenServicioElements.inputEdadmascota);
			wait.until(ExpectedConditions.visibilityOf(inputEdadmascotaElement));
			 inputEdadmascotaElement.sendKeys(Edad);	
			
		
			 WebElement buttonTiempoElement = elementFetch.getWebElement("XPATH",
						ResumenServicioElements.buttonTiempo);
				wait.until(ExpectedConditions.elementToBeClickable(buttonTiempoElement));
				buttonTiempoElement.click();
				Thread.sleep(5000);
							
				WebElement buttonTiempodosElement = elementFetch.getWebElement("XPATH",
						ResumenServicioElements.buttonTiempodos);
				wait.until(ExpectedConditions.elementToBeClickable(buttonTiempodosElement));
				buttonTiempoElement.click();
				Thread.sleep(1000);
			 
			
			WebElement inputRazaElement = elementFetch.getWebElement("XPATH",
					ResumenServicioElements.inputRaza);
			wait.until(ExpectedConditions.visibilityOf(inputRazaElement));
			inputRazaElement.sendKeys(Raza);

			WebElement buttonFinalizarElement = elementFetch.getWebElement("XPATH",
					ResumenServicioElements.buttonFinalizar );
			wait.until(ExpectedConditions.elementToBeClickable(buttonFinalizarElement));
			buttonFinalizarElement.click();
			Thread.sleep(5000);
			
			driver.switchTo().alert().accept();
			
			WebElement labelResumen = elementFetch.getWebElement("XPATH",
					ResumenServicioElements.labelResumen);
			wait.until(ExpectedConditions.visibilityOf(labelResumen));
					String textoPagina = labelResumen.getText();
						
								
			Validations.trueBooleanCondition(textoPagina.equalsIgnoreCase("Resumen Servicios"),
					"Se completaron los datos de usuario y mascota en el formulario'" + textoPagina + "' correctamente",
					"No se ha ingresado a la página correcta", currentEvent); 

						
			
		} catch (Exception e) {
			Utils.eventFailed(currentEvent, e.getMessage());
		}
	}

	
	}

