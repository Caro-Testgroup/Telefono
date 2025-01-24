package test.java.carritocompras;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvValidationException;

import main.java.pageEvents.BuscarServicioEvents;
//import main.java.pageEvents.CarritoComprasEvents;
import main.java.pageEvents.IngresarBolsaEvents;
import main.java.pageEvents.ResumenServicioEvents;
import main.java.pageEvents.SeleccionarServicioEvents;
import main.java.utils.OpenCSV;
import main.java.utils.Utils;
import test.java.BaseTest;

public class EjemploMascota_Test extends BaseTest {

	@Test(enabled = true,dataProvider= "carritoComprasData")
	public void QAS12(String args[]) throws InterruptedException {

		Utils.infoTestCase("Ingresar servicio",
				"Validar la generación de un servicio , agregar al carrito, registra usuario");
		
		BuscarServicioEvents.buscarservicio ("Masaje Canino");
							
		SeleccionarServicioEvents.SeleccionarServicio("seleccion") ;
							
		IngresarBolsaEvents.IngresarBolsa("Verificar");
		
	    ResumenServicioEvents.ResumenServicio (args[1],args[2],args[3],args[4],args[5]);
		
	}
	
		
	@DataProvider(name = "carritoComprasData")
	public Object[][] dataBrokerAPAlternative() throws CsvValidationException, InterruptedException, IOException {

	Object[][] data = OpenCSV.getCSVParameters("CSVMasaje.csv", 1,6);
		return data;
	}
}
