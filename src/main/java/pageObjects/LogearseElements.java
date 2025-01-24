package main.java.pageObjects;

public interface LogearseElements {
	
	// Evento Logearse
	
	String buttonLogin = "//*[@id=\"login2\"]";
		
	String inputName = "//*[@id=\"loginusername\"]";
	String inputPass = "//*[@id=\"loginpassword\"]";
	
	String buttonLog = "//button[text()='Log in']";             //button[@class='btn btn-primary']  ////*[@id=\"logInModal\"]/div/div/div[3]/button[2]
	 
	String labelCategoria = "//a[text()='CATEGORIES']";         //a[text()='CATEGORIES'] //*[@id=\"cat\"]
	
	
	//Evento Seleccion
	
	String buttonLaptos = "//*[text()='Laptops']";                           //*[@id="itemc"]        //a[text()='Laptops']    //*[text()="Laptops"]   
    String buttonMac = "//*[text()='MacBook Pro']";                          //*[@id="tbodyid"]/div[6]/div/div/h4/a            //a[text()='MacBook Pro']
    String labelMacbook = "//*[@id=\"tbodyid\"]/h2";                         //*[@id="tbodyid"]/h2        //*[@id="tbodyid"]/h2
    
    // Evento Carro

    String buttonAddtocart = "//*[@id=\"tbodyid\"]/div[2]/div/a";
    String buttonCart = "//*[@id=\"cartur\"]";
    
    String labelProducto = "//*[@id=\"page-wrapper\"]/div/div[1]/h2";
    
    // Evento Pago
    
    String buttonPlace = "//*[@id=\"page-wrapper\"]/div/div[2]/button";    //*[@id="page-wrapper"]/div/div[2]/button   //button[text()='Place Order']
	
    String inputName2 = "//*[@id=\"name\"] ";          //*[@id="name"]    //*[@id=\"name\"]
    String inputCountry = "//*[@id=\"country\"]";
    String inputCity = "//*[@id=\"city\"]";
    String inputCredit = "//*[@id=\"card\"]";
    String inputMonth = "//*[@id=\"month\"]";
    String inputYear = "//*[@id=\"year\"]";
    
    String buttonPurchase = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]";
    String buttonOk = "/html/body/div[10]/div[7]/div/button";
    
    String labelFinal = "//*[@id=\"nava\"]";
}