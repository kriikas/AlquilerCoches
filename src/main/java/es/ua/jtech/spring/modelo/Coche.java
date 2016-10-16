/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package es.ua.jtech.spring.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

/**
 *
 * @author especialista
 */
public class Coche implements Serializable {
	private static final long serialVersionUID = -161534091108046354L;
	
	@Size(min = 7, max = 7)
	private String matricula;
    private String modelo;
    @Past
    @DateTimeFormat(pattern = "dd/MM/yy")
    private Date fechaMatriculacion;
    @Min(0)
    private int km;
    @Min(0)
    @NumberFormat(style=NumberFormat.Style.CURRENCY)
    private BigDecimal precio;


    public Coche() {
    	
    }
    
    public Coche(String mat, String mod, Date fechaMat, int k, BigDecimal prec) {
    	this.matricula = mat;
    	this.modelo = mod;
    	this.fechaMatriculacion = fechaMat;
    	this.km = k;
    	this.precio = prec;
    }
    
    public Date getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(Date fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    
    
}
