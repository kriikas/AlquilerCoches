package es.ua.jtech.spring.bo;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.ua.jtech.spring.datos.ICocheDAO;
import es.ua.jtech.spring.negocio.ICocheBO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/daos-mock-test.xml", "classpath:config/bos-test.xml"})
public class CocheBOMockTest {
	@Autowired
	ICocheBO cbo;
	//Esto nos dará acceso al mock
	@Autowired
	ICocheDAO cdao;
	
	/*
	@Before
	public void setup() {
		//when(udao.getUsuario("test")).thenReturn(new Usuario("test","test"));
		when(cdao.obtener("1111JKG")).thenReturn(new Coche());
		//when(udao.getUsuario("test2")).thenReturn(new Usuario("test2","test2"));
	}
	//@Test
	public void testLogin() {
		assertEquals(2, cbo.listar().size());
		//este usuario está "grabado" en el mock
		//assertNotNull(ubo.login("test", "test"));
		//pero este no, por tanto el BO debería devolver null
		//assertNull(ubo.login("experto", "experto"));
	}
	*/
}
