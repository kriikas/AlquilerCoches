package es.ua.jtech.spring.datos;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import es.ua.jtech.spring.modelo.Coche;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/daos-test.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
@Transactional
public class CocheDAOJDBCTest {
	@Autowired
	private ICocheDAO cocheDAO;
	
	@Test
	public void testListar(){
		List<Coche> coches = cocheDAO.listar();
		assertEquals(2, coches.size());
	}
	
	@Test
	public void testFirtsItem() {
		assertEquals("1111JKG", cocheDAO.listar().iterator().next().getMatricula());		
	}
}
