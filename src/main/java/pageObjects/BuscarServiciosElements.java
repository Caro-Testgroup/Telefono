package main.java.pageObjects;

public interface BuscarServiciosElements {
	
	// input: agrega un texto
	
	String inputServicio = "//*[@id='search-input']";
			

	// button: botones clicables 
	
	String buttonBusqueda = "//*[@id=\"main-content\"]/button[1]";
	
	
	
	//label: etiquetas que te llevan a la siguente pagina
	
	String labelCatalogoProductos ="//*[@id='catalog-container']//h3";

}

