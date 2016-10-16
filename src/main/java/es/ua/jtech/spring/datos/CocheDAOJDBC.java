/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ua.jtech.spring.datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import es.ua.jtech.spring.modelo.Coche;

/**
 *
 * @author especialista
 */
@Repository
public class CocheDAOJDBC implements ICocheDAO {

    JdbcTemplate template;
    DataSource ds;
    private static final String CREAR_SQL = "insert into coches values (?,?,?,?,?)";
    private static final String LISTAR_SQL = "select * from coches ";
    private static final String LISTAR_POSTERIORES_SQL = "select * from coches where fechaMatriculacion>? order by precio";
    private static final String FIND_SQL = "select * from coches where matricula=?";
    private static final String ACTUALIZAR_SQL = "update coches set modelo=?"
            + ", fechaMatriculacion=?, km=?, precio=? where matricula=?";

    @Autowired
    public void setDataSource(DataSource ds) {
        this.ds = ds;
        this.template = new JdbcTemplate(ds);
    }

    public void crear(Coche coche) {
        this.template.update(CREAR_SQL, coche.getMatricula(), coche.getModelo(),
                coche.getFechaMatriculacion(), coche.getKm(), coche.getPrecio());
    }

    public void actualizar(Coche coche) {
        System.out.println(new Date() + ": actualizar");
        this.template.update(ACTUALIZAR_SQL, coche.getModelo(), coche.getFechaMatriculacion(),
                coche.getKm(), coche.getPrecio(), coche.getMatricula());

    }

    public Coche obtener(String matricula) {
        return this.template.queryForObject(FIND_SQL, new CocheMapper(), matricula);
    }

    private class CocheMapper implements RowMapper<Coche> {

        public Coche mapRow(ResultSet rs, int num) throws SQLException {
            Coche c = new Coche();
            c.setMatricula(rs.getString("matricula"));
            c.setModelo(rs.getString("modelo"));
            c.setFechaMatriculacion(rs.getDate("fechaMatriculacion"));
            c.setKm(rs.getInt("km"));
            c.setPrecio(rs.getBigDecimal("precio"));
            return c;
        }
    }

    public List<Coche> listar() {
        return this.template.query(LISTAR_SQL, new CocheMapper());
    }

    public List<Coche> listarPosterioresA(Date fecha) {
        return this.template.query(LISTAR_POSTERIORES_SQL, new CocheMapper(), new java.sql.Date(fecha.getTime()));
    }
}
