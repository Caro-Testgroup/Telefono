package test.java.carritocompras;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvValidationException;
import main.java.pageEvents.LogearseEvents;
import main.java.utils.OpenCSV;
import main.java.utils.Utils;
import test.java.BaseTest;

public class EjemploTelefono_Test extends BaseTest {

	@Test(enabled = true,dataProvider= "carritoComprasData")
	public void QAS12(String args[]) throws InterruptedException {
		
		
		Utils.infoTestCase("Comprar un telefono movil",
				"Logearse en pag  e ir a la categoria telefono y elegir un equipo, agregar al carro y entrar a carro, a ir a products y generar orden,completar datos y registrarse dando ok ");
		
		
		LogearseEvents.logearse (args[0],args[1]);
		
		LogearseEvents.seleccion ();
		
		LogearseEvents.carro ();
				
		LogearseEvents.pago (args[2],args[3],args[4],args[5],args[6],args[7]);		
			
	}
	
		
	@DataProvider(name = "carritoComprasData")
	public Object[][] dataBrokerAPAlternative() throws CsvValidationException, InterruptedException, IOException {

	Object[][] data = OpenCSV.getCSVParameters("CSVTelefono.csv", 1,8);
		return data;
	}
}