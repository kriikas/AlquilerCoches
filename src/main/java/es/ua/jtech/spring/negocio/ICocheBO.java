package es.ua.jtech.spring.negocio;

import java.util.Date;
import java.util.List;

import org.springframework.security.access.prepost.PostFilter;

import es.ua.jtech.spring.modelo.Coche;

/**
 * La capa de negocio no hace gran cosa, se limita a "pasarle la pelota" al DAO
 * no es m‡s que una excusa para poder tener tres capas y poder hacer pruebas de integraci—n
 */
public interface ICocheBO {
	public void crear(Coche coche);
	public void actualizar(Coche coche);
	@PostFilter("filterObject.getKm() > 1000 or hasRole('ROLE_GESTOR')")
	public List<Coche> listar();
	public List<Coche> listarPosterioresA(Date fecha);
	public Coche obtener(String matricula);
}
