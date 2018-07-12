import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Fixtures {
	
	//cambios
	
	@Before
	public void setUp() {
		System.out.println("Antes de cada test");
	}
		
	@After
	public void tearDown() {
		System.out.println("Despues de cada test \n");
	}
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Al cargar la clase antes de todos los tests - abrir BBDD \n");
	}	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Al finalizar todos los tests - cerrar BBDD \n");
	}	
	@Test
	public void primerTest() {
		System.out.println("Primer Test");
	}
	@Test
	public void segundoTest() {
		System.out.println("Segundo Test");
	}

}
