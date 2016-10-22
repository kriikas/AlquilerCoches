package es.ua.jtech.spring.negocio;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.stereotype.Service;

import es.ua.jtech.spring.datos.ICocheDAO;
import es.ua.jtech.spring.modelo.Coche;


/**
 * La capa de negocio no hace gran cosa, se limita a "pasarle la pelota" al DAO
 * no es m‡s que una excusa para poder tener tres capas y poder hacer pruebas de integraci—n
 */
@Service
public class CocheBO implements ICocheBO {

	@Autowired
	private ICocheDAO cdao;
	
	@Override
	public List<Coche> listar() {
		return cdao.listar();
	}

	@Override
	public void crear(Coche coche) {
		cdao.crear(coche);
	}

	@Override
	public void actualizar(Coche coche) {
		cdao.actualizar(coche);
	}

	@Override
	public List<Coche> listarPosterioresA(Date fecha) {
		return cdao.listarPosterioresA(fecha);
	}

	@Override
	public Coche obtener(String matricula) {
		return cdao.obtener(matricula);
	}

}
