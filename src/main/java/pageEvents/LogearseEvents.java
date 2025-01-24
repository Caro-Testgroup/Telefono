package main.java.pageEvents;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import main.java.pageObjects.LogearseElements;



import main.java.utils.ElementFetch;

import main.java.utils.Utils;
import main.java.utils.Validations;

import test.java.carritocompras.EjemploTelefono_Test;

public class LogearseEvents extends EjemploTelefono_Test{

	public LogearseEvents(WebDriver driver) {
		EjemploTelefono_Test.driver = driver;
	}

	public static void logearse (String username, String password) {

		String currentEvent = new Throwable().getStackTrace()[0].getMethodName();

		try {
			Utils.outputInfo("Ha comenzado el evento: " + currentEvent);

		
			WebDriverWait wait = new WebDriverWait(driver, 50);
			ElementFetch elementFetch = new ElementFetch();
						

			WebElement buttonLogin = elementFetch.getWebElement("XPATH",
					LogearseElements.buttonLogin);
			wait.until(ExpectedConditions.elementToBeClickable(buttonLogin));
			buttonLogin.click();
			Thread.sleep(1000);
						
			WebElement inputName = elementFetch.getWebElement("XPATH",
					LogearseElements.inputName);
			wait.until(ExpectedConditions.visibilityOf(inputName));
			inputName.sendKeys(username);
			Thread.sleep(1000);
				
						
			WebElement inputPass = elementFetch.getWebElement("XPATH",
					LogearseElements.inputPass);
			wait.until(ExpectedConditions.visibilityOf(inputPass));
			inputPass.sendKeys(password);
			Thread.sleep(1000);
		

			WebElement buttonLog = elementFetch.getWebElement("XPATH",
					LogearseElements.buttonLog);
			wait.until(ExpectedConditions.elementToBeClickable(buttonLog));
			buttonLog.click();
			Thread.sleep(1000);
														
			
			WebElement labelCategoria = elementFetch.getWebElement("XPATH",
			LogearseElements.labelCategoria);
	        wait.until(ExpectedConditions.visibilityOf(labelCategoria));
	        String textoPagina = labelCategoria.getText();
			
							
			
				Validations.trueBooleanCondition(textoPagina.equalsIgnoreCase("CATEGORIES"),
				   "Se ha ingresado a la página '" + textoPagina + "' correctamente",
					"No se ha ingresado a la página correcta", currentEvent);
						
							
		} catch (Exception e) {
			Utils.eventFailed(currentEvent, e.getMessage());
		}
	}
		
	
	public static void seleccion () {

		String currentEvent = new Throwable().getStackTrace()[0].getMethodName();

		try {
			Utils.outputInfo("Ha comenzado el evento: " + currentEvent);

		
			WebDriverWait wait = new WebDriverWait(driver, 50);
			ElementFetch elementFetch = new ElementFetch();
						
					
			WebElement buttonLaptos = elementFetch.getWebElement("XPATH",
					LogearseElements.buttonLaptos);
			wait.until(ExpectedConditions.elementToBeClickable(buttonLaptos));
			buttonLaptos.click();
			Thread.sleep(1500);
						
			WebElement buttonMac = elementFetch.getWebElement("XPATH",
					LogearseElements.buttonMac);
			wait.until(ExpectedConditions.elementToBeClickable(buttonMac));
			buttonMac.click();
			Thread.sleep(1500);
						
																
			
			WebElement labelMacbook = elementFetch.getWebElement("XPATH",
			LogearseElements.labelMacbook);
	        wait.until(ExpectedConditions.visibilityOf(labelMacbook));
	        String textoPagina = labelMacbook.getText();
			
			
				
			
				Validations.trueBooleanCondition(textoPagina.equalsIgnoreCase("MacBook Pro"), //MacBook Pro
				   "Se ha ingresado a la página '" + textoPagina + "' correctamente",
					"No se ha ingresado a la página correcta", currentEvent);
						
							
		} catch (Exception e) {
			Utils.eventFailed(currentEvent, e.getMessage());
		}
	}
		
	
	public static void carro () {

		String currentEvent = new Throwable().getStackTrace()[0].getMethodName();

		try {
			Utils.outputInfo("Ha comenzado el evento: " + currentEvent);

		
			WebDriverWait wait = new WebDriverWait(driver, 50);
			ElementFetch elementFetch = new ElementFetch();

						

			WebElement buttonAddtocart = elementFetch.getWebElement("XPATH",
					LogearseElements.buttonAddtocart);
			wait.until(ExpectedConditions.elementToBeClickable(buttonAddtocart));
			buttonAddtocart.click();
			Thread.sleep(1000);
			
            Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
			
			Thread.sleep(2000);
			           
					
			WebElement buttonCart = elementFetch.getWebElement("XPATH",
					LogearseElements.buttonCart);
			wait.until(ExpectedConditions.elementToBeClickable(buttonCart));
			buttonCart.click();
			Thread.sleep(1000);
			
														
			
			WebElement labelProducts1 = elementFetch.getWebElement("XPATH",
			LogearseElements.labelProducto);
	        wait.until(ExpectedConditions.visibilityOf(labelProducts1));
	        String textoPagina = labelProducts1.getText();
	        
	        
	        Validations.trueBooleanCondition(textoPagina.equalsIgnoreCase("Products"),
					   "Se ha ingresado a la página '" + textoPagina + "' correctamente",
						"No se ha ingresado a la página correcta", currentEvent);
				

					
								
			} catch (Exception e) {
				Utils.eventFailed(currentEvent, e.getMessage());
			}
		}
		

	public static void pago (String Name, String Country , String City , String Credit , String Month, String Year) {

		String currentEvent = new Throwable().getStackTrace()[0].getMethodName();

		try {
			Utils.outputInfo("Ha comenzado el evento: " + currentEvent);

			
			WebDriverWait wait = new WebDriverWait(driver, 50);
			ElementFetch elementFetch = new ElementFetch();
			
				
					
			WebElement buttonPlace = elementFetch.getWebElement("XPATH",
					LogearseElements.buttonPlace);
			wait.until(ExpectedConditions.elementToBeClickable(buttonPlace));
			buttonPlace.click();
			Thread.sleep(1000);
			
			WebElement inputName2 = elementFetch.getWebElement("XPATH",
					LogearseElements.inputName2);
			wait.until(ExpectedConditions.visibilityOf(inputName2));
			inputName2.sendKeys(Name);
			Thread.sleep(1000);
	
			WebElement inputCountry = elementFetch.getWebElement("XPATH",
					LogearseElements.inputCountry);
			wait.until(ExpectedConditions.visibilityOf(inputCountry));
			inputCountry.sendKeys(Country);
			Thread.sleep(1000);
			
			WebElement inputCity = elementFetch.getWebElement("XPATH",
					LogearseElements.inputCity);
			wait.until(ExpectedConditions.visibilityOf(inputCity));
			inputCity.sendKeys(City);
			Thread.sleep(1000);
			
			WebElement inputCredit = elementFetch.getWebElement("XPATH",
					LogearseElements.inputCredit);
			wait.until(ExpectedConditions.visibilityOf(inputCredit));
			inputCredit.sendKeys(Credit);
			Thread.sleep(1000);
			
			WebElement inputMonth = elementFetch.getWebElement("XPATH",
					LogearseElements.inputMonth);
			wait.until(ExpectedConditions.visibilityOf(inputMonth));
			inputMonth.sendKeys(Month);
			Thread.sleep(1000);
			
			WebElement inputYear = elementFetch.getWebElement("XPATH",
					LogearseElements.inputYear);
			wait.until(ExpectedConditions.visibilityOf(inputYear));
			inputYear.sendKeys(Year);
			Thread.sleep(1000);
			
			WebElement buttonPurchase = elementFetch.getWebElement("XPATH",
					LogearseElements.buttonPurchase);
			wait.until(ExpectedConditions.elementToBeClickable(buttonPurchase));
			buttonPurchase.click();
			Thread.sleep(1000);
			
			WebElement buttonOk = elementFetch.getWebElement("XPATH",
					LogearseElements.buttonOk);
			wait.until(ExpectedConditions.elementToBeClickable(buttonOk));
			buttonOk.click();
			Thread.sleep(1000);
							
			
			WebElement labelFinal = elementFetch.getWebElement("XPATH",
					LogearseElements.labelFinal);
			wait.until(ExpectedConditions.visibilityOf(labelFinal));
					String textoPagina = labelFinal.getText();
						
								
			Validations.trueBooleanCondition(textoPagina.equalsIgnoreCase("PRODUCT STORE"),
					"Se completaron los datos de usuario y mascota en el formulario'" + textoPagina + "' correctamente",
					"No se ha ingresado a la página correcta", currentEvent); 

						
			
		} catch (Exception e) {
			Utils.eventFailed(currentEvent, e.getMessage());
		}
	

	
	}

	
		
}	

