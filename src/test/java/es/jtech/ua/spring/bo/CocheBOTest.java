package es.jtech.ua.spring.bo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import es.ua.jtech.spring.negocio.ICocheBO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/bos-test.xml", "classpath:config/daos-test.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
@Transactional
public class CocheBOTest {
	@Autowired
	private ICocheBO cocheBO;
	
	@Test
	public void testListarBO(){
		assertEquals(2, cocheBO.listar().size());
	} 
	
}
