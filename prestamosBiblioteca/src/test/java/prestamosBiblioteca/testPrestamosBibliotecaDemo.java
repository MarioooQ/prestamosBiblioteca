package prestamosBiblioteca;

import static org.junit.Assert.*;
import org.junit.Test;
import com.uisrael.prestamosBiblioteca.controller.SolicitanteController;
import com.uisrael.prestamosBiblioteca.controller.impl.SolicitanteControllerImpl;
import com.uisrael.prestamosBiblioteca.model.entities.Solicitante;

public class testPrestamosBibliotecaDemo {
	
	private SolicitanteController SolicitanteController;
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		Solicitante nuevoSolicitante=new Solicitante();
		
		nuevoSolicitante.setApellido("Apellido");
		nuevoSolicitante.setNombre("Nombre");
		nuevoSolicitante.setDireccion("Direccion");
		nuevoSolicitante.setDocumentoIdentidad("1721006219");
		nuevoSolicitante.setFono("0995953509");
		nuevoSolicitante.setInstitucion("UIsrael");
		
		SolicitanteController=new SolicitanteControllerImpl();
		SolicitanteController.insertarSolicitante(nuevoSolicitante);
		
	}

}
