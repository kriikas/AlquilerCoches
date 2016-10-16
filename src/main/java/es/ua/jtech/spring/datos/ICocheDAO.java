/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package es.ua.jtech.spring.datos;

import java.util.Date;
import java.util.List;

import es.ua.jtech.spring.modelo.Coche;

/**
 *
 * @author especialista
 */
public interface ICocheDAO {
    public void crear(Coche coche);
    public void actualizar(Coche coche);
    public List<Coche> listar();
    public List<Coche> listarPosterioresA(Date fecha);
    public Coche obtener(String matricula);
}
