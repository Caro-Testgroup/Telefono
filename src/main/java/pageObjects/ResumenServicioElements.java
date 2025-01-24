package main.java.pageObjects;

public interface ResumenServicioElements {
	
	// input
	
	String inputNombre = "//*[@id=\"reservation-form\"]/input[1]";
	String inputFecha = "//*[@id=\"reservation-form\"]/input[2]";		
	
	String inputopciondos ="//*[@id=\"reservation-form\"]/select[1]/option[2]";
	String inputNombremascota = "//*[@id=\"reservation-form\"]/input[3]";
	String inputEdadmascota = "//*[@id=\"reservation-form\"]/input[4]";
	String inputRaza = "//*[@id=\"reservation-form\"]/input[5]";
	
	
	// button 
	
	String buttonFinalizar = "//*[@id=\"reservation-form\"]/button";
	String buttonVolver = "//*[@id=\"main-content\"]/button";
	String buttonProfesional = "//*[@id=\"reservation-form\"]/select[1]";
	String buttonProfesionaldos= "//*[@id=\"reservation-form\"]/select[1]/option[2]";
	String buttonTiempo="//*[@id=\"reservation-form\"]/input[4]";
	String buttonTiempodos =  "//*[@id=\"reservation-form\"]/select[2]/option[2]";
	
		
	//label
	
	
	String labelResumen="//*[@id=\"cart-container\"]/h3";
	
	

}

