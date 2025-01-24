package main.java.pageObjects;

public interface CarritoComprasElements {

	// input
	String inputUsuario = "//*[@id=\"user-name\"]";
	String inputContrasena = "//*[@id=\"password\"]";

	// button
	String buttonIniciarSesion = "//*[@id=\"login-button\"]";
	String buttonAgregarCarro = "//html/body/div/div/div/div[2]/div/div/div/div[0]/div[2]/div[2]/button";
	String buttonCarroCompras = "//*[@id=\"shopping_cart_container\"]/a";
	
	//label
	String labelPaginaProductos = "//*[@id=\"header_container\"]/div[2]/span";
	String labelNumeroCarrito = "//*[@id=\"shopping_cart_container\"]/a/span";
	
	//list
	String listProductos = "//html/body/div/div/div/div[2]/div/div/div/div/div/div/a/div";

}